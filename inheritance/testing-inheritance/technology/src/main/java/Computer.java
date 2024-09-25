public class Computer {
    private String screen;
    private String color;
    private String owner;


    //Constructor
    public Computer(String screen, String color, String owner) {
        this.screen = screen;
        this.color = color;
        this.owner = owner;
    }

    public void powerOn() {
        System.out.println(("is Power ON"));
    }

    public void powerOff() {
        System.out.println(("is Power OFF"));
    }

    public String getScreen() {
        return screen;
    }

    public String getColor() {
        return color;
    }

    public String GetOwner() {
        return owner;
    }


}
