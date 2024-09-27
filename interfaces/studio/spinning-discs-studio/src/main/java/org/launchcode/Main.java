package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Greatest Hits", 700, "Music", "CD-R");
        DVD myDvd = new DVD("Inception", 4700, "Movie", "DVD-R");

        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.reportInfo();
        myDvd.reportInfo();

    }
}




