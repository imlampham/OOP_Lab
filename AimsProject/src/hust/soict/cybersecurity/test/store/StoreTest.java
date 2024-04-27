public class StoreTest {
   public class StoreTest {
      public static void main(String[] args) {
         Store store = new Store();
         
         DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 85, 19.95f);
         store.addDvd(dvd1);
         
         DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
         store.addDvd(dvd2);
         
         DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
         store.addDvd(dvd3);
         
         
         System.out.println(store.getDvdAtIndex(0).toString());
         System.out.println(store.getDvdAtIndex(1).toString());
         System.out.println(store.getDvdAtIndex(2).toString());
         
         store.removeDvd(dvd2);
         
         System.out.println(store.getDvdAtIndex(0).toString());
         System.out.println(store.getDvdAtIndex(1).toString());
      }
   }
}
