package hust.soict.cybersecurity.aims.store;

import hust.soict.cybersecurity.aims.media.Media;

import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private int numMedia;
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public int getNumMedia() {
		return numMedia;
	}

	public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("The media " + media.getTitle() +  " is already in store");
		} else {
			itemsInStore.add(media);
			numMedia++;
			System.out.println("Successfully added " + media.getTitle() + " to store");
		}
	}
	
		
	public void removeMedia(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Successfully removed " + media.getTitle() + " from store");
		} else {
			System.out.println("The media " + media.getTitle() + " is not in store");
		}
	}
	
	public void print() {
		System.out.println("*****************STORE*****************");
		System.out.println("Items In Store:");
		for (Media media: itemsInStore) {
			System.out.println(media.toString());
		}
		System.out.println("***************************************");
	}
	
}
