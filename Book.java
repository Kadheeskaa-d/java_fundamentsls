class Book {
    String title;
    float price; 

    Book() {
        title = "Java Programming";
        price = 100.0f;

        System.out.println("Book Title: " + title); 
        System.out.println("Book Price: " + price); 
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book(); 
        b.display(); 
    }
}

