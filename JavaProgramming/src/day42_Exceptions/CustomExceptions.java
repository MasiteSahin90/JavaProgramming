package day42_Exceptions;

import java.util.NoSuchElementException;

class FadyException extends RuntimeException{
    public FadyException(String message){
        super(message);
    }
class NoBreakException extends Exception{

}

}
public class CustomExceptions {

    public static void main(String[] args) {
        throw new FadyException("its time for lunch break");
        //throw new NoBreakException();
    }

}
