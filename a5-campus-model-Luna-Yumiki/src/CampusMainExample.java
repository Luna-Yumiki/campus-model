/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.BatchUpdateException;
import java.util.ArrayList;

import Campus.*;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    private static Address campusAddress;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * 0. Create Address object
         * 1. create campus object
         * 2. Create and add buildings
         * 3. Create and floors
         * 4. Create and add rooms
         * 5. Assign sprinkers.
         * 6. Write methods to determine is campus safe => are builinds safe etc.
         */

        Address campusAddress = new Address(360, "Hung", "Boston", "02115", "MA", "");
        Address snellAddress = new Address(111, "Hung", "Boston", "02115", "MA", "");
        ArrayList<Building> buildingInCampus = new ArrayList<Building>();

        Campus nuCampus = new Campus(campusAddress, buildingInCampus);
        Building snellEngineering = new Building(1, snellAddress);
        nuCampus.addNewBuilding(snellEngineering); // add new building to campus

        // Floor snellFloor1 = new Floor(1, snellEngineering);
        // Floor snellFloor2 = new Floor(2, snellEngineering);
        // Floor snellFloor3 = new Floor(3, snellEngineering);

        Floor snellFloor1 = new Floor(1);
        Floor snellFloor2 = new Floor(2);
        Floor snellFloor3 = new Floor(3);

        snellEngineering.addNewFloor(snellFloor1); // add new floor to building
        snellEngineering.addNewFloor(snellFloor2);
        snellEngineering.addNewFloor(snellFloor3);

        Classroom sn101 = new Classroom(101, snellFloor1);
        Classroom sn102 = new Classroom(102, snellFloor1);

        snellFloor1.addNewRoom(sn101); // add new room to floor
        snellFloor1.addNewRoom(sn102);

        Sprinkler sp1 = new Sprinkler("model1", "0001");
        Sprinkler sp2 = new Sprinkler("model2", "0002");
        sn101.setSprinkler(sp1); // add new sprinkler to room
        sn102.setSprinkler(sp2);

        // sp2.disable(); // disable sprinkler sp2
        // sp2.reset(); // reset sprinkler sp2

        nuCampus.printIsCampusSafe();// this should print: "This campus is safe!" or "Warning"

    }

}
