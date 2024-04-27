package hust.soict.cybersecurity.aims.cart;

import hust.soict.cybersecurity.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for (int i = 0; i < dvdList.length; i++){
            this.addDigitalVideoDisc(dvdList[i]);
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].equals(disc)){
                for (int j = i; j < qtyOrdered - 1; j++){
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("The disc cannot be found in the cart");
    }

    public float totalCost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public String print(){
        String res = "Ordered items: \n";
        for (int i = 0; i < qtyOrdered; i++){
            res += itemOrdered[i].toString();
        }
        res += "Total cost: " + Float.toString(this.totalCost());
        return res;
    }

    public void searchId(int id){
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].getId() == id){
                System.out.println("The item has been found");
                System.out.println(itemOrdered[i].toString());
                return;
            }
        }
        System.out.println("The item cannot be found");
    }

    public void searchTitle(String title){
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].isMatch(title)){
                System.out.println("The item has been found");
                System.out.println(itemOrdered[i].toString());
                return;
            }
        }
        System.out.println("The item cannot be found");
    }
}
