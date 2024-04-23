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
}
