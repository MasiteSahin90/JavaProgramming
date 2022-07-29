package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping,numberOfPeperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPeperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPeperoniTopping = numberOfPeperoniTopping;
    }

    public double calcCost(){

        double startingPrice = (size=='S')? 10 :(size=='M')? 12 : 14;
        double totalPrice = startingPrice + (2*numberOfCheeseTopping)+(2*numberOfPeperoniTopping);

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                ", total price = $" + calcCost() +
                '}';
    }
}
