package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
        // TODO: Implement your custom interface.

        // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
        //  need to be declared separately.


    }

    @Override
    public void spinDisc() {
        System.out.println("CD Spinning");
    }

    @Override
    public void storeData(String data) {
        System.out.println("CD can store 700MB");
    }

    @Override
    public void readData() {
        System.out.println("Reading audio from CD");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing to CD");
    }

    @Override
    public void reportInfo() {
        System.out.println("Name: " + getName() + "Capacity: " + getCapacity() + "Content: " + getContent() + "Disc Type: " + getDiscType());
    }
}
