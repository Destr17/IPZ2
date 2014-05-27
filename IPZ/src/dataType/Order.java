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
public class Order {
    private String name;
    private String surName;
    private String mail;
    private int cardNumber;
    private String nameCountry;
    private String nameCity;
    private String nameHotel;
    private int Id;

    public Order() {
    }
    
    
    
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMail() {
        return mail;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getNameCity() {
        return nameCity;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
        
    
}
