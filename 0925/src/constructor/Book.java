package constructor;

public class Book {
	
	public Book() {
		System.out.println('■');
	}
	
	public Book(Book b) {
		System.out.println('★');
	}
	
	
	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book(book);
	}
}
