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
public class Country {
    protected String nameCountry;
    protected byte lvlPopularity;

    public Country() {
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public byte getLvlPopularity() {
        return lvlPopularity;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setLvlPopularity(byte lvlPopularity) {
        this.lvlPopularity = lvlPopularity;
    }

    @Override
    public String toString() {
        return "Country{" + "nameCountry=" + nameCountry + ", lvlPopularity=" + lvlPopularity + '}';
    }
    
    
}
