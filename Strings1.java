import java.util.Scanner;
public class Strings1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Mark = scan.nextInt();
        if (Mark > 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();


    }
}
