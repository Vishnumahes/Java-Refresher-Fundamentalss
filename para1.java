public class para1 {
    void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    void sub(int a, int b){
        int sub= a-b;
        System.out.println(sub);
    }
    void mul(int a, int b){
        int mul = a*b;
        System.out.println(mul);
    }
    void divide(int a, int b){
        int divide = a/b;
        System.out.println(divide);
    }
    public static void main(String[] args) {
        para1 obj= new para1();
        obj.sum(10,20);
        obj.sub(40,90);
        obj.mul(35,35);
        obj.divide(200,4);
    }

    
}
