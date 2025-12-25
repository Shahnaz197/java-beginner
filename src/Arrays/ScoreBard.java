package Arrays;

import java.util.Scanner;

public class ScoreBard {
    public static void main(String[] args) {
      //question Array[]
        String[] questions= {
                            "what is the main func of router",
                            "Which part of computer is considered brain",
                            "what year fb launched",
                            "father of computer",
                            "first pro lang",
                             };
        //Option 2D
        String [][] options= {

                             {"1. Storing files","2. Encrypting data","3. Direct internt","4. use"},
                             {"1. CPU","2. Hard Drive","3. RAM ","4. GPU "},
                             {"1. 2000 ","2. 2004 ","3. 2003","4. 2008"},
                             {"1. Steve Job ","2. Alan ","3. Bill","4. Charls "},
                             {"1. COBOL ","2. Assemply ","3. Fortran ","4. C "}

                              };
        //Declare variable
        int[]answers ={3,1,2,4,3};
        int score = 0;
        int guess;
        Scanner scanner=new Scanner(System.in);


        //welcome message
        System.out.println("welcome to the game");
        System.out.println("----------------------------");

        //question
        for(int i=0;i <questions.length;i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            //get guess from user

            System.out.println("Enter ur guess : ");
            guess =scanner.nextInt();

            //check your guess
            if(guess==answers[i]){
                System.out.println("-------------------------");
                System.out.println("correct");
                score++;
            }else{
                System.out.println("incorrect");
            }
        }
        //display the final score
        System.out.println("your final socre is "+ score+" out of" + questions.length);

    }
}
