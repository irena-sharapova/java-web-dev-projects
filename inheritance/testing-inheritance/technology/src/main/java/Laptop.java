public class Laptop extends Computer {
    private String weight = "1.6lbs";

    public Laptop (String screen,  String color,  String owner) {
        super(screen, color,owner);
        this.weight =  "1.6lbs";
    }

    public void foldOrNot(Boolean folded ){
       if (folded) {
        System.out.println("Laptop is folded ");
    } else {
            System.out.println("Laptop is Not folded ");
       }
    }

    public String getWeight() {
        return weight;
    }
}