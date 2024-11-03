import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] number = new int[5];
        
        for(int i =0;i<5;i=i+1){
            number[i] = scan.nextInt();
            
        }
        // System.out.println(number[i]);

        int average = number[1]+number[2]+number[3]+number[4];
        System.out.println(average);
    }
    
}
