package hust.soict.cybersecurity.aims;

import hust.soict.cybersecurity.aims.cart.Cart;
import hust.soict.cybersecurity.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 85, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.println("---------------------------");
		
		// Display all items
		System.out.println(anOrder.toString());
		
		// Remove some dvd
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("---------------------------");
		System.out.println(anOrder.toString());
	}

}