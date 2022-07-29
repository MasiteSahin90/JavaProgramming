package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza p1 = new Pizza('S',2,3);
            Pizza p2 = new Pizza('M',3,4);
            Pizza p3 = new Pizza('L',4,5);

        pizzas.addAll(Arrays.asList(p1,p2,p3));
        }

        System.out.println("total number pizza " + pizzas.size());
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice+= pizza.calcCost();
        }
        System.out.println(totalPrice);





    }
}
