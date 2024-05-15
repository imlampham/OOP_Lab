package hust.soict.cybersecurity.aims.cart;

import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import hust.soict.cybersecurity.aims.media.Media;
import hust.soict.cybersecurity.aims.media.Book;
import hust.soict.cybersecurity.aims.media.CompactDisc;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public static int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}
	
	public ArrayList<Media> getItemsOrdered(){
		return this.itemsOrdered;
	}
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			if (itemsOrdered.contains(media)) {
				System.out.println("The media " + media.getTitle() + " is already in cart");
			} else {
				itemsOrdered.add(media);
				System.out.println("Successfully added " + media.getTitle() + " to cart");
			}
		} else {
			System.out.println("Cart is already full");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Successfully removed " + media.getTitle() + " from cart");
		} else {
			System.out.println("The media " + media.getTitle() + " is not in cart");
		}
	}

	public float totalcost() {
		float cost = 0;
		for (Media element: itemsOrdered) {
			cost += element.getCost();
		}
		return cost;
	}
	
	public void searchId(int id) {
		for (Media media: itemsOrdered) {
			if (media.getId() == id) {
				if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					System.out.println(dvd.toString());
					return;
				} else if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					System.out.println(cd.toString());
					return;
				} else if (media instanceof Book) {
					Book b = (Book) media;
					System.out.println(b.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}
	
	public void searchTitle(String title) {
		for (Media media: itemsOrdered) {
			if (media.getTitle().equals(title)) {
				if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					System.out.println(dvd.toString());
					return;
				} else if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					System.out.println(cd.toString());
					return;
				} else if (media instanceof Book) {
					Book b = (Book) media;
					System.out.println(b.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}
	
	public void print() {
		System.out.println("*************CART*************");
		System.out.println("Ordered Items:");
		for (Media media: itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total cost: " + this.totalcost());
		System.out.println("******************************");
	}
	
}
