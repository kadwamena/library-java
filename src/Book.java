public class Book {
        String title;
        boolean borrowed;
        // Creates a new Book
        public Book(String bookTitle) {
                title = bookTitle;
// Implement this method
        }
        // Marks the book as rented
        public void rented() {
                this.borrowed = true;
// Implement this method
        }
        // Marks the book as not rented
        public void returned() {
                this.borrowed = false;
// Implement this method
        }
        // Returns true if the book is rented, false otherwise
        public boolean isBorrowed() {
// Implement this method
            return this.borrowed;
        }
        // Returns the title of the book
        public String getTitle() {
// Implement this method
            return title;
        }
}
