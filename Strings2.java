import java.util.Scanner;
public class Strings2 {
    public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    int income = scan.nextInt();
    int a = scan.nextInt();
    if (income >a){
        System.out.println("scholarship is available");
    }
    else{
        System.out.println("Not eligible for scholarship");
    }
}
}
