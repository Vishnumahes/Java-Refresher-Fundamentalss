import java.util.Scanner;
public class terinaryq1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        String result = a>b?"Greater number a":"Greater number b";
        System.out.print(result);
    }
    
}
