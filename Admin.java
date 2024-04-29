package mahaboob.com23CipherbyteTechnologies;

class Admin {
	@SuppressWarnings("unused")
	private Library library;

	public Admin(Library library) {
		this.library = library;
	}

	public void addBook(int bookId, String title, String author) {
		// Add a new book to the library
		// For simplicity, just print the details here
		System.out.println("Book added: " + title + " by " + author);
	}
}






