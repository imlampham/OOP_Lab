package hust.soict.cybersecurity.aims.media;

import java.util.ArrayList;

public class PolymorphismTest {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Media> mediae = new ArrayList<Media>();
		
		Book book = new Book("Cyber Security");
		CompactDisc cd = new CompactDisc("Cyber Security");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars");
		
		mediae.add(book);
		mediae.add(cd);
		mediae.add(dvd);
		
		for (Media element: mediae) {
			System.out.println(element.toString());
		}
		
	}
}
