package hust.soict.cybersecurity.aims.media;

public class Track implements Playable{
   private String title;
   private int length;

   public String getTitle() {
      return title;
   }
   
   public int getLength() {
      return length;
   }

   public Track() {
   }

   public Track(String title){
      this.title = title;
   }

   public Track(String title, int length) {
      this.title = title;
      this.length = length;
   }

   public void play() {
		if (length > 0) {
			System.out.println("Playing track: " + title);
			System.out.println("Track length: " + length);
		} else {
			System.out.println("The track " + title +  " cannot be played");
		}
	}

   @Override
   public boolean equals(Object obj) {
		if (obj instanceof Track) {
			Track track = (Track) obj;
			if ((title == track.getTitle()) && (length == track.getLength())) {
				return true;
			}
		}
		return false;
	}
}
