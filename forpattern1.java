import java.util.Scanner;
public class forpattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // for (int i =1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // } 

        for (int i=1;i<=3;i=i+1){
            for(int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
