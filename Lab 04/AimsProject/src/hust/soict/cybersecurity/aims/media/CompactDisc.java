package hust.soict.cybersecurity.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
   private String artist;
   private ArrayList<Track> tracks = new ArrayList<Track>();

   public String getArtist() {
      return artist;
   }

   public CompactDisc(){}

   public CompactDisc(String title) {
      super(title);
   }

   public CompactDisc(String title, float cost) {
      super(title, cost);
   }

   public CompactDisc(String title, String category, float cost) {
      super(title, category, cost);
   }

   public CompactDisc(String title, String category, String director, float cost) {
      super(title, category, director, cost);
   }

   public CompactDisc(String title, String category, String director, float cost, int length) {
      super(title, category, director, length, cost);
   }
   
   public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
      super(title, category, director, length, cost);
      this.artist = artist;
   }
   
   public void addTrack(Track track) {
      if (tracks.contains(track)) {
         System.out.println("Track already exists");
      } else {
         tracks.add(track);
      }
   }

   public void removeTrack(Track track) {
      if (tracks.contains(track)) {
         tracks.remove(track);
      } else {
         System.out.println("Track not found");
      }
   }

   public int getLength() {
      int res = 0;
      for (Track track : tracks) {
         res += track.getLength();
      }
      return res;
   }

   public void play() {
		System.out.println("CD artist: " + this.artist);
		System.out.println("Total length: " + this.getLength());
		for (Track element: tracks) {
			System.out.println("Playing track: " + element.getTitle());
			System.out.println("Track length: " + element.getLength());
		}
	}
   
}
