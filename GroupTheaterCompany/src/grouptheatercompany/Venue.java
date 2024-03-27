/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;

/**
 *
 * @author JOY SAHA
 */
public class Venue implements Serializable {
    private String location,venueManagerName;
    private int capacity;
    private String parkingAccessibility;
    private float budget;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVenueManagerName() {
        return venueManagerName;
    }

    public void setVenueManagerName(String venueManagerName) {
        this.venueManagerName = venueManagerName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String isParkingAccessibility() {
        return parkingAccessibility;
    }

    public void setParkingAccessibility(String parkingAccessibility) {
        this.parkingAccessibility = parkingAccessibility;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public Venue(String location, int capacity, String parkingAccessibility, String venueManagerName, float budget) {
        this.location = location;
        this.capacity = capacity;
        this.parkingAccessibility = parkingAccessibility;
        this.venueManagerName = venueManagerName;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Venue{" + "location=" + location + ", venueManagerName=" + venueManagerName + ", capacity=" + capacity + ", parkingAccessibility=" + parkingAccessibility + ", budget=" + budget + '}';
    }
    public String toViewShortListVenue() {
        return  "Location: " + location + ", Venue Manager Name: " + venueManagerName + ", Capacity: " + capacity + ", Parking Accessibility: " + parkingAccessibility + ", Budget: " + budget + "\n";
    }
    
    
}
