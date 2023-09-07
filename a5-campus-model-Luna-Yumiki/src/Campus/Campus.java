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
public class Campus {

    Address address;
    ArrayList<Building> buildings;

    public Campus(Address address, ArrayList<Building> buildings) {
        this.address = address;
        this.buildings = buildings;
    }

    public void addNewBuilding(Building b) {
        // Building b = new Building(n, this.address); // reference back to building;
        if (buildings == null) {
            buildings = new ArrayList<Building>();
        }
        buildings.add(b);
    }

    public boolean isCampusSafe() {
        boolean isSafe = true;

        for (Building b : buildings) {
            if (b.isBuildingSafe() == false)
                isSafe = false;
        }
        return isSafe;
    }

    public void printIsCampusSafe() {
        // need to check if every building is safe!

        if (isCampusSafe())
            System.out.println("This campus is safe!");
        else
            System.out.println("This campus is NOT safe!");

    }

}
