import java.util.Scanner;
public class fortest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b = scan.nextInt();
        for (int i=a;i<=b;i=i+1){
            if(i%3==0 && i%5==0){
                System.out.println(i+" is divisible by noth 3 and 5");
            }
        }
        scan.close();
    }
    
}
