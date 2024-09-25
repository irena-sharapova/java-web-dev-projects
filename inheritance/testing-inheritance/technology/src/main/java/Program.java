public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("lcd", "white", "Bill");
        myLaptop.powerOn();
        myLaptop.foldOrNot(true);
        System.out.println("weight of Laptop" + myLaptop.getWeight());   // prints true
        myLaptop.powerOff();

        System.out.println();


        SmartPhone mySmartPhone = new SmartPhone("lcd", "pink", "Jill");
        mySmartPhone.haveNumber();
        mySmartPhone.powerOn();
        mySmartPhone.powerOff();
        System.out.println("weight of SmartPhone" + mySmartPhone.getWeight());   // prints true

        System.out.println();
    }
}

