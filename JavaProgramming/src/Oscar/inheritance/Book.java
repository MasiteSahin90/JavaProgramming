package Oscar.inheritance;

public class Book {

    public String title,type,auther;
    public double price;

    public Book(String title, String type, String auther, double price) {
        this.title = title;
        this.type = type;
        this.auther = auther;
        this.price = price;
    }

    public Book(){

    }

    public void buy(String store){
        System.out.println("buying it from " + store);
    }

    public void borrow(String source){
        System.out.println("borrowing it from " + source);
    }

    public void lend(String user){
        System.out.println("lending it from " + user );
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }


}
