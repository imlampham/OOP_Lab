import java.util.ArrayList;
public class Store {
   private ArrayList<DigitalVideoDisc> itemsInStore;
	
	public Store() {
		itemsInStore  = new ArrayList<DigitalVideoDisc>();
	}

	public DigitalVideoDisc getDvdAtIndex(int i){
		return itemsInStore.get(i);
	}

	public void addDvd(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
	}

	public void removeDvd(DigitalVideoDisc dvd) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).isMatch(dvd.getTitle())) {
				itemsInStore.remove(i);
				return;
			}
		}
	}
}
