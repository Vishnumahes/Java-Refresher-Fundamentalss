public class Laptop {
        String name ="";
        String proc ="";
        int ram =0;
        int price =0;

        public static void main(String[] args) {
            Laptop lap1 = new Laptop();
            lap1.name="hpp";
            lap1.proc="i5";
            lap1.ram=6;
            lap1.price =40000;

            Laptop lap2 = new Laptop();
            lap2.name="dell";
            lap2.proc="i7";
            lap2.ram=9;
            lap2.price =50000;

            System.out.println(lap2.price);
            System.out.println(lap1.price);
            

        }
    
}
