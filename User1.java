package mahaboob.com23CipherbyteTechnologies;

class User1 {
	private Library library;

	public User1(Library library) {
		this.library = library;
	}

	public void browseBooks() {
		// Browse and display available books in the library
		Book[] books = library.getBooks();
		System.out.println("Available Books:");
		for (Book book : books) {
			if (book != null) {
				System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
			}
		}
	}
}







