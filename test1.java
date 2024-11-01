import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int score = scan.nextInt();
        if (score<50 && score<70){
            System.out.print("improve");
            if(score<50 && score<70){
                System.out.println("Good job!");
                if(score>70){
                    System.out.println("Excellent performance!");
                }
            }
        }
    }
}
