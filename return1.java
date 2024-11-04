public class return1 {
    int sum(int a , int b){
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        return1 obj = new return1();
        obj.sum(10,20);
        int balance= obj.sum(10,20);
        System.out.println(balance);
    }
    
}
