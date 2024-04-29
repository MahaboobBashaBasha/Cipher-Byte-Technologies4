package mahaboob.com23CipherbyteTechnologies;

class Library {
	private Book[] books;

	public Library() {
		books = new Book[10];
		// Initialize some dummy books
		books[0] = new Book(1, "Java Programming", "John Doe");
		books[1] = new Book(2, "Data Structures and Algorithms", "Jane Smith");
	}

	public Book[] getBooks() {
		return books;
	}
}






