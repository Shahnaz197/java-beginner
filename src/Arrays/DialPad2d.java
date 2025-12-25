package Arrays;

public class DialPad2d {
    public static void main(String[] args) {

        char [][] telephone ={{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                             {'*','0','#'}
                             };
        for(char[]row :telephone){
            for(char numer:row){
                System.out.print(numer+" ");
            }
            System.out.println();

        }
    }
}
