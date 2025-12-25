package Arrays;


import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {


        String[] fruits = {"apple", "orange","kiwi"};

        //fruits[0] = "pine";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        Arrays.fill(fruits,"watermeolo");
        for(int i=0;i < fruits.length;i++) {

            System.out.println(fruits[i]);
        }
        /*for(String fruit :fruits){
        sout(fruit)
         */
    }
}
