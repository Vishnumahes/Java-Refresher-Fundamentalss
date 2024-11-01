import java.util.Scanner;
public class logicaloperator {
    public static void main(String[] args){
        Scanner scan =new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int q = scan.nextInt();
        int e = scan.nextInt();

        int average =a+b+c+q+e/5;

        if(average <35){
            System.out.println("Addiationl class required");

        }
        

        else{
            System.out.println("You are good to go");
        }
        scan.close();

    }
    
}
