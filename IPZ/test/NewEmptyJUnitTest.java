/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ipz.visualInterface;
import dataBase.DataBase;
import dataType.Person;
import ipz.registration;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Destr
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkPass1() {
        String str="boroda";
        char[] ch={'b','o','r','o','d','a'};
        assertTrue(visualInterface.checkPass(str, ch));
    }
    
    @Test(timeout = 30)
    public void checkPassTime(){
        String str="boroda";
        char[] ch={'b','o','r','o','d','a'};
        visualInterface.checkPass(str, ch);
        //assertTrue(visualInterface.checkPass(str, ch));
    }
    @Test
    public void selectPerson() {
        DataBase db=new DataBase();
        assertNotNull(db.personsSelect());
    }
    @Test
    public void checkData() {
        //ArrayList<Person> p,String name, String surName, String mail, String password, int cardNumber
        DataBase db=new DataBase();
        registration reg=new registration();
        ArrayList<Person> p=db.personsSelect();
        String name="Dima";
        String surName="Barbosov";
        String mail="NaGiBaToR98@mail.ru";
        String password="bomj";
        int cardNumber =22134;
        String result=registration.checkData(p, name, surName, mail, password, cardNumber);
        assertEquals("", result);
    }
    /*
    @Test(expected = SQLSyntaxErrorException.class)
    public void recordInsert() {
        DataBase db=new DataBase();
        db.recordInsert("REPLACE INTO PERSON(Name, SurName, Mail, Active, Password, CardNumber) values(\"admin\",\"admin1\",\"admin1@mail.ru\",\"true\",\"12345\",44354)");
    }*/
    
    @Test
    public void checkPass2() {
        String str="boroda";
        char[] ch={'b','o','r','o','d'};
        assertFalse(visualInterface.checkPass(str, ch));
    }
    
    
}
