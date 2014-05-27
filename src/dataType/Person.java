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
public class Person {
    private String name;
    private String surName;
    private String mail;
    private String active;
    private String password;
    private int cardNumber;

    public Person() {
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

    public String getActive() {
        return active;
    }

    public String getPassword() {
        return password;
    }

    public int getCardNumber() {
        return cardNumber;
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

    public void setActive(String active) {
        this.active = active;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surName=" + surName + ", mail=" + mail + ", active=" + active + ", password=" + password + ", cardNumber=" + cardNumber + '}';
    }
    
    
}
