package hust.soict.cybersecurity.aims.media;

import java.util.Comparator;

public class Media {
   private int id;
   private String title;
   private String category;
   private float cost;

   public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public float getCost() {
      return cost;
   }

   public void setCost(float cost) {
      this.cost = cost;
   }

   public Media() {
   }

   public Media(String title) {
      this.title = title;
   }

   public Media(String title, float cost) {
      this.title = title;
      this.cost = cost;
   }

   public Media(String title, String category, float cost) {
      this.title = title;
      this.cost = cost;
      this.category = category;
   }

   @Override
   public boolean equals(Object obj) {
		if (obj instanceof Media) {
			Media media = (Media) obj;
			if (this.title == media.getTitle()) {
				return true;
			}
		}
		return false;
		
	}
}
