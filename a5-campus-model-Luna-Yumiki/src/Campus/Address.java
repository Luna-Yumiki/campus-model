/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campus;

/**
 *
 * @author kal bugrara
 */
public class Address {

    int number;
    String street;
    String city;
    String zipcode;
    String state;
    String gps;

    public Address(int number, String street, String city, String zipcode, String state, String gps) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
        this.gps = gps;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    
}
