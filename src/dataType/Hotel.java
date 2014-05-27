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
public class Hotel extends City{
    protected String nameHotel;
    protected int countRoom;
    protected int vacantRoom;

    public Hotel() {
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public int getCountRoom() {
        return countRoom;
    }

    public int getVacantRoom() {
        return vacantRoom;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public void setCountRoom(int countRoon) {
        this.countRoom = countRoon;
    }

    public void setVacantRoom(int vacantRoom) {
        this.vacantRoom = vacantRoom;
    }
}
