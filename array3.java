import java.util.Scanner;
public class array3 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int arr[]= new int[11];
        for (int i=1;i<=10;i=i+1){
            arr[i]=scan.nextInt();

        }
        for (int i=1;i<=10;i++){
            System.out.println(i+"*2"+"="+2*arr[i]);

        }

        
    }
    
}
