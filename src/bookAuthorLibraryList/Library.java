package bookAuthorLibraryList;

import java.util.ArrayList;
import java.util.List;

public class Library {
   
	private List<Book> booksList;

	public Library(List<Book> booksList) {
		super();
		this.booksList = booksList;
	}

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	
	public void addBook(Book book) {
		booksList.add(book);
	}
	
	public List<Book> findBooksByAuthor(String authorName){
		List<Book> bb= new ArrayList<>();
		for(Book book: booksList) {
		  if(book.getAuthor().getAuthorName().equalsIgnoreCase(authorName)) {
			  bb.add(book);
		  }
		}
		return bb;
	}
	
	public List<Book> findBookByGenre(String Genre){
		List<Book> bb=new ArrayList<>();
		for(Book bbok: booksList) {
			if(bbok.getGenre().equalsIgnoreCase(Genre)){
				bb.add(bbok);
			}
		}return bb;
	}
		
	}

