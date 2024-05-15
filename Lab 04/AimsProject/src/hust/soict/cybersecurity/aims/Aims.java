package hust.soict.cybersecurity.aims;

import java.util.Collections;
import java.util.Scanner;

import hust.soict.cybersecurity.aims.store.Store;
import hust.soict.cybersecurity.aims.cart.Cart;
import hust.soict.cybersecurity.aims.media.*;


public class Aims {
	private static Store store = new Store();
	private static Cart cart = new Cart();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		store.addMedia(dvd3);
		
		showMenu();
		
	}
		
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			storeMenu();
		} else if (opt == 2) {
			updateStore();
		} else if (opt == 3) {
			cartMenu();
		} else if (opt == 0) {
			System.out.println("Successfully exit");
		} else {
			System.out.println("Option not exist");
		}
		
	}
	
	public static void storeMenuOpt1() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: store.getItemsInStore()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				media.toString();
				mediaDetailsMenu(media);
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in store");
			storeMenu();
		}
	}
	
	public static void storeMenuOpt2() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: store.getItemsInStore()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				cart.addMedia(media);
				System.out.println("Number of mediae in current cart: " + cart.getItemsOrdered().size());
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in store");
		}
		storeMenu();
	}
	
	public static void storeMenuOpt3() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: store.getItemsInStore()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				if (media instanceof CompactDisc){
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				} else if (media instanceof DigitalVideoDisc){
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				} else if (media instanceof Book) {
					System.out.println("Cannot play this media as it is a book");
				}
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in store");
		}
		storeMenu();
	}
	
	public static void storeMenu() {
		store.print();
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			storeMenuOpt1();
		} else if (opt == 2) {
			storeMenuOpt2();
		} else if (opt == 3) {
			storeMenuOpt3();
		} else if (opt == 4) {
			cartMenu();
		} else if (opt == 0) {
			showMenu();
		} else {
			System.out.println("Option not exist");
			showMenu();
		}
	}
	
	
	public static void mediaDetailsMenu(Media media) {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			cart.addMedia(media);
			storeMenu();
		} else if (opt == 2) {
			if (media instanceof CompactDisc){
				CompactDisc cd = (CompactDisc) media;
				cd.play();
			} else if (media instanceof DigitalVideoDisc){
				DigitalVideoDisc dvd = (DigitalVideoDisc) media;
				dvd.play();
			} else if (media instanceof Book) {
				System.out.println("Cannot play this media as it is a book");
			}
			storeMenu();
		} else if (opt == 0) {
			storeMenu();
		}
	}
	
	public static void cartMenuOpt1() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by id");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			cart.searchId(id);
			cartMenu();
		} else if (opt == 2) {
			System.out.println("Enter title: ");
			String title = sc.nextLine();
			title = sc.nextLine();
			cart.searchTitle(title);
			cartMenu();
		} else if (opt == 0) {
			cartMenu();
		}
	}
	
	public static void cartMenuOpt2() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("0. Back");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
			cart.print();
			cartMenu();
		} else if (opt == 2) {
			Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
			cart.print();
			cartMenu();
		} else if (opt == 0) {
			cartMenu();
		}
	}
	
	public static void cartMenuOpt3() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: cart.getItemsOrdered()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				cart.removeMedia(media);
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in cart");
		}
		cartMenu();
	}
	
	public static void cartMenuOpt4() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: store.getItemsInStore()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				if (media instanceof CompactDisc){
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				} else if (media instanceof DigitalVideoDisc){
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				} else if (media instanceof Book) {
					System.out.println("Cannot play this media as it is a book");
				}
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in cart");
		}
		cartMenu();
	}
	
	public static void cartMenu() {
		cart.print();
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			cartMenuOpt1();
		} else if (opt == 2) {
			cartMenuOpt2();
		} else if (opt == 3) {
			cartMenuOpt3();
		} else if (opt == 4) {
			cartMenuOpt4();
		} else if (opt == 5) {
			System.out.println("An order is created");
			cart.getItemsOrdered().clear();
		} else if (opt == 0) {
			storeMenu();
		}
	}
	
	public static void updateStoreOpt1() {
		System.out.println("Enter the title of the media: ");
		String title = sc.nextLine();
		title = sc.nextLine();
		System.out.println("Enter the cost of the media: ");
		float cost = sc.nextFloat();

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Book");
		System.out.println("2. DigitalVideoDisc");
		System.out.println("3. CompactDisc");
		System.out.println("0. Back");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			Book newBook =  new Book(title, cost);
			store.addMedia(newBook);
		} else if (opt == 2) {
			DigitalVideoDisc newDVD = new DigitalVideoDisc(title, cost);
			store.addMedia(newDVD);
		} else if (opt == 3) {
			CompactDisc newCD = new CompactDisc(title, cost);
			store.addMedia(newCD);
		}
		updateStore();
	}
	
	public static void updateStoreOpt2() {
		System.out.println("Enter the title of the media: ");
		String mediaName = sc.nextLine();
		mediaName = sc.nextLine();
		int findingRes = -1;
		for (Media media: store.getItemsInStore()) {
			if (media.getTitle().equals(mediaName)) {
				findingRes = 0;
				store.removeMedia(media);
			}
		}
		if (findingRes == -1) {
			System.out.println("This media is not in store");
		}
		updateStore();
	}
	
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media to store");
		System.out.println("2. Remove a media from store");
		System.out.println("0. Back");
		
		int opt = sc.nextInt();
		if (opt == 1) {
			updateStoreOpt1();
		} else if (opt == 2) {
			updateStoreOpt2();
		} else {
			showMenu();
		}
	}
	
}