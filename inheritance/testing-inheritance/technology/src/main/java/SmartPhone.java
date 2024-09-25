public class SmartPhone extends Computer {
    private String weight = "0.5lbs";

    public SmartPhone (String screen,  String color,   String owner) {
        super(screen, color,owner);
        this.weight =  "0.5lbs";
    }

    public void haveNumber(){
       String phoneNumber = "223-333-333-666";
        System.out.println(phoneNumber);
    }


    public String getWeight() {
        return weight;
    }
}
