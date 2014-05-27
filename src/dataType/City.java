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
public class City extends Country{
    protected String nameCity;
    protected byte countHotel;
    protected String nameRegion;

    public City() {
    }

    public String getNameCity() {
        return nameCity;
    }

    public byte getCountHotel() {
        return countHotel;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public void setCountHotel(byte countHotel) {
        this.countHotel = countHotel;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }
    
    
}
