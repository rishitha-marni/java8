package bookAuthorLibraryList;

import java.util.List;

public class Author {

	public String authorName;
	private List<Book> bookList;

	public Author(String authorName, List<Book> bookList) {
		super();
		this.authorName = authorName;
		this.bookList = bookList;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", bookList=" + bookList + "]";
	}
	
	

}
