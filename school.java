import java.util.Scanner;

public class school{
    String passorfail(int score){
        if(score>35){
            return "pass";
        }
        else{
            return"fail";
        }
        
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         int totalmark = scan.nextInt();
         school obj = new school();
        String result=obj.passorfail(totalmark);
        System.out.println(result);
    }
}
    