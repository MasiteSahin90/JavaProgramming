package Oscar.inheritance;

public class Ebook extends Book{
    int sizeAtMemory;
    int pages;

    public Ebook(String title, String type, String auther, double price, int sizeAtMemory, int pages) {
        super(title, type, auther, price);
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }

    public Ebook(int sizeAtMemory, int pages) {
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }
}
