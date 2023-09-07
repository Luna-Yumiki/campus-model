/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campus;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Building {
    int number;
    ArrayList<Floor> floors;
    Address address;

    public Building(int n, Address ad) {
        number = n;
        address = ad;
        floors = new ArrayList<Floor>();
    }

    public void addNewFloor(Floor f) {
        // Floor f = new Floor(n, this); // reference back to building;
        // if (floors == null){
        // floors = new ArrayList<Floor>();
        // }
        floors.add(f);
    }

    public Boolean isBuildingSafe() {

        // Building is safe if all floors are safe
        boolean isSafe = true;
        for (Floor f : floors) {
            if (f.isFloorSafe() == false)
                isSafe = false;
        }
        return isSafe;

    }

}
