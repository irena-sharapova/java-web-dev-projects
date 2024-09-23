public class Program {
    public static void main(String[] args) {
       Laptop myLaptop = new Laptop("lcd", "white", "Bill");
       myLaptop.powerOn();
       myLaptop.foldOrNot(true);
        System.out.println("weight of Laptop" + myLaptop.getWeight());   // prints true
        myLaptop.powerOff();

        System.out.println();
    }
}
