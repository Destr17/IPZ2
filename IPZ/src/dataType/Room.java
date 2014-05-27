/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataType;

/**
 *
 * @author Destr
 */
public class Room extends Hotel {
    private int Id;
    private int floor;
    private String WiFi;
    private int countBed;
    private float cost;
    private int numberStars;

    public Room() {
    }

    public int getId() {
        return Id;
    }

    public int getFloor() {
        return floor;
    }

    public String getWiFi() {
        return WiFi;
    }

    public int getCountBed() {
        return countBed;
    }

    public float getCost() {
        return cost;
    }

    public int getNumberStars() {
        return numberStars;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setWiFi(String WiFi) {
        this.WiFi = WiFi;
    }

    public void setCountBed(int countBed) {
        this.countBed = countBed;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setNumberStars(int numberStars) {
        this.numberStars = numberStars;
    }
    
    public void initR(Country c,City ci,Hotel h){
        this.nameCountry=c.getNameCountry();
        this.lvlPopularity=c.getLvlPopularity();
        this.nameCity=ci.getNameCity();
        this.countHotel=ci.getCountHotel();
        this.nameRegion=ci.getNameRegion();
        this.nameHotel=h.getNameHotel();
        this.countRoom=h.getCountRoom();
        this.vacantRoom=h.getVacantRoom();
    }
}
