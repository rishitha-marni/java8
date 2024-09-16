package bookAuthorLibraryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainC {
   public static void main(String[] args) {
	   
	   Author au=new Author("rishi",new ArrayList<>());
	   Author au1=new Author("ria",new ArrayList<>());
	   Book bb= new Book("life", au, "com ");
	   Book bb1= new Book("life", au1, "com ");
	  
	   List<Book> ll=new ArrayList<>();
	   ll.add(bb1);
	   ll.add(bb);
	   System.out.println(ll);
	   Library ne= new Library(ll);
	  ne.addBook(new Book("happy", au1, "dare"));
	  
	   List<Book> we=ne.findBookByGenre("com");
	   for(Book b:we) {
		   System.out.println(b);
	   }
	   ne.findBooksByAuthor("rishi");
	  
   }
}
