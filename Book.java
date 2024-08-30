 
class Book {
 String book;
 public static void main(String[] arguments) {
 
 System.out.println("Title (should be The Da Vinci Code): "
 + book.getTitle());
 System.out.println("Available? (should be true): "
 + book.isAvailable());
 book.borrowed();
 System.out.println("Available? (should be false): "
 + book.isAvailable());
 book.returned();
 System.out.println("Available? (should be true): "
 + book.isAvailable());
 }
}


