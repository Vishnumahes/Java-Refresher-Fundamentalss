public class Garden {
    int apple_price=20;
    int apple_count=5;

    void total_money(){
        System.out.println(apple_count*apple_price);
    }
    public static void main(String[] args) {
        Garden obj1= new Garden();
        obj1.total_money();

        
    }
    
}
