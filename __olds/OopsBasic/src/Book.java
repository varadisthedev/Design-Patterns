abstract class Book {
    String title;
    double price;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}

class Fiction extends Book {
    Fiction(String title) {
        super(title);
        setPrice();
    }
    public void setPrice() {
        price = 24.99;
    }
}

class NonFiction extends Book {
    NonFiction(String title) {
        super(title);
        setPrice();
    }
    public void setPrice() {
        price = 37.99;
    }
}