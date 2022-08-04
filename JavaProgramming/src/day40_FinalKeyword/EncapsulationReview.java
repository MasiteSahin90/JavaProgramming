package day40_FinalKeyword;

import day38_Inheritance.shapes.Circle;
import day38_Inheritance.shapes.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        if (square.getSide() <= 0 ){
            return;
        }
        this.square = square;
    }

    public Circle getCircle(){
        return circle;
    }


    public void setCircle(Circle circle){
        if (circle.getRadius() <= 0 ){
            return;
        }
        this.circle= circle;
    }





}
