package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() < cone2.getCost()) {
            return -1; // cone1 is less than cone2
        } else if (cone1.getCost() > cone2.getCost()) {
            return 1;  // cone1 is greater than cone2
        } else {
            return 0;  // both are equal
        }
    }
}