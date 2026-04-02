class Publication {

    String title;
    double price;
    int copies;

    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    void saleCopy() {
        System.out.println("Total sale: $" + (price * copies));
    }
}

class Book extends Publication {

    String author;

    Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    void orderCopies(int qty) {
        copies += qty;
        System.out.println(qty + " copies of book ordered.");
    }
}

class Magazine extends Publication {

    int orderQty;
    int currentIssue;

    Magazine(String title, double price, int copies, int orderQty, int currentIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    void receiveIssue() {
        copies += orderQty;
        System.out.println("Received " + orderQty + " copies of issue " + currentIssue);
    }
}

public class exp3 {

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", 50.0, 10, "John Doe");
        Magazine m1 = new Magazine("Tech Today", 10.0, 20, 15, 5);

        // Ordering and receiving copies
        b1.orderCopies(5);
        m1.receiveIssue();

        // Display sales
        b1.saleCopy();
        m1.saleCopy();
    }
}