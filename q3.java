import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double age=scan.nextDouble();
        scan.nextLine();
        String department = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age/10);
        System.out.println("My department is "+department);




    }
    
}
