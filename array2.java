import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        
        for(int i=0;i<5;i=i+1){
            arr[i]= scan.nextInt();
        }
        System.out.println(arr[0]);
    }
    
}
