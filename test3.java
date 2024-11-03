import java.util.Scanner;
public class test3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();
       
        if(salary >=20000 || age<25){
            System.out.print("Enter your Salary");
            int amount = scan.nextInt();
            if (amount <= 50000){
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("Maximum loan amount is 50000");
            }
        }
        else{
            System.out.println("You are not eligible for loan");
        }
        
       
    }
    
}
