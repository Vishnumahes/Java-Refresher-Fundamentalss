import java.util.Scanner;
public class ifq3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number % 3 ==0&& number %5==0){
            System.out.println("the number is divisible by 3 and 5");
        }
        else{
            System.out.println("Not divisible");
        }
        scan.close();
    }
    
}
