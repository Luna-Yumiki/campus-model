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
public class Floor {

    int number;
    public ArrayList<Classroom> rooms;
    // Building building;

    // public Floor(int n, Building b) {
    public Floor(int n) {
        number = n;
        // building = b;
        rooms = new ArrayList<Classroom>();
    }

    public void addNewRoom(Classroom r) {
        // Classroom r = new Classroom(n, this); // pass the floor object for reference
        // if (rooms == null){
        // rooms = new ArrayList<Classroom>();
        // }
        rooms.add(r);
    }

    public Boolean isFloorSafe() {

        // check each classroom. If all classrooms are safe then floor is safe
        boolean isSafe = true;
        for (Classroom c : rooms) {
            if (c.isRoomSafe() == false)
                isSafe = false;
        }
        return isSafe;

    }
}
