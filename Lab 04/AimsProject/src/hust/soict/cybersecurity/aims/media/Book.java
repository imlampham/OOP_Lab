package hust.soict.cybersecurity.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
   private List<String> authors = new ArrayList<String>();

   public Book() {}
   
   public Book(String title) {
      super(title);
   }

   public Book(String title, float cost) {
      super(title, cost);
   }

   public Book(String title, String category, float cost) {
      super(title, category, cost);
   }

   public Book(String title, int id, String category, float cost, List<String> authors) {
      super(title, category, cost);
      this.authors = authors;
   }

   public List<String> getAuthors() {
      return authors;
   }
   
   public void addAuthor(String authorName) {
      if (authors.contains(authorName)) {
         System.out.println("Author already exists");
      } else {
         authors.add(authorName);
      }
   }

   public void removeAuthor(String authorName) {
      if (authors.contains(authorName)) {
         authors.remove(authorName);
      } else {
         System.out.println("Author not found");
      }
   } 
}