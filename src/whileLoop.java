import java.util.Scanner;
import java.util.logging.SocketHandler;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
/*
        String response = "";
        while (!response.equals("Q")){
            System.out.println("u are playing a game ");
            System.out.println("Press q to to quit ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("u have quit the game ");


 */


        int age = 0;
        System.out.println("enter your age : ");

        do{
            System.out.println("your age cannot be 0 ");
            System.out.println("enter your age : ");
            age =scanner.nextInt();
        }while (age<0);
        System.out.println("you are " + age + "years old ");


        //DO while
        int num = 0;
        while(num < 1||num >10){
            System.out.println("Entera number between 1 to 10 ");
            num = scanner.nextInt();

        }
        System.out.println("you have picked " + num );




    }
}
