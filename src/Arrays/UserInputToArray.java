package Arrays;

import java.util.Scanner;

public class UserInputToArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String []foods;
        int size;

        System.out.println("what number of food do u want");
         size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];
        
       // String [] foods ={"pizzs","pie","tart"};
       // String [] foods =new String[3];
        for(int i=0;i<foods.length;i++){
            System.out.println("Enter a food : ");
            foods[i] = scanner.nextLine();

        }
        /*
         *   foods[0] = "taco";
            foods[1]="bun";
            foods[2]="puff";
        */
        for(String eats:foods){
            System.out.println(eats);
        }


        System.out.println(foods.length);


    }
}
