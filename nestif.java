import java.util.Scanner;
public class nestif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int number = scan.nextInt();
        // if(number>35 && number<60){
        //     System.out.println("Videogame");
        // }
        // else if(number>60 && number <90){
        //     System.out.println("Iphone");
        // }
        // else if(number >90){
        //     System.out.println("macbook pro");
        // }
        // scan.close();
        boolean kfc=true;
        boolean Chicken=true;
        boolean pepsi=false;

        if(kfc){
            System.out.println("Enter to kFC");
            if(Chicken){
                System.out.println("chicken paties");
                if(pepsi){
                    System.out.println("must have pepsi");
                }
            }
        }

    }
}
