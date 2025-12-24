package AdvancedJava;

public class InterfaceImplement {
    public static void main(String[] args) {


        String myName = "jane";
        char symbol = '!';


        MyInterface myInterface = (x,y)-> {
            System.out.println("Hello world");
            System.out.println("It is a nice day" + x+ y);
        };

        MyInterface myInterface2 = (x,y)-> {
            System.out.println("hello "+x+y);
        };

        myInterface2.message(myName,symbol);
    }
}
