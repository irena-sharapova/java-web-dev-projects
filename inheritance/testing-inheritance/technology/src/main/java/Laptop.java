public class Laptop extends Computer {
    private String weight = "1.6lbs";

    public Laptop (String screen,  String color,  String owner) {
        super(screen, color,owner);
        this.weight =  "1.6lbs";
    }

    public void foldOrNot(Boolean folded ){
        folded = true;
        System.out.println("Laptop is folded ");
    }

    public String getWeight() {
        return weight;
    }
}