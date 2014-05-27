/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataBase;
import dataType.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Destr
 */
public class DataBase {
    private Statement statement = null;
    private Connection connection = null;
    
    public DataBase() {
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:PersonDB.sqlite");
            statement = connection.createStatement();
        }
        catch (SQLException e){
            System.out.println("DataBase() SQLException: " + e.getMessage());
        }  
        catch (ClassNotFoundException e){
            System.out.println("JDBS Driver Error" + e.getMessage());
        }
    }
    
    public boolean recordInsert(String query){
        try{
            //JOptionPane.showMessageDialog(null, query);
            statement.execute(query);
            return true;
        }
        catch(SQLException e){
            System.out.println("Data Insert SQLException: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Person> personsSelect(){
        try{           
            String query = "SELECT * FROM PERSON";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Person> persons = new ArrayList<>();
            while(result.next()){
                Person person = new Person();
                person.setName(result.getString("Name"));
                person.setSurName(result.getString("SurName"));
                person.setMail(result.getString("Mail"));
                person.setActive(result.getString("Active"));
                person.setPassword(result.getString("Password"));
                person.setCardNumber(result.getInt("CardNumber"));
                persons.add(person);
            }
            return persons;
        } 
        catch (SQLException e){
            System.out.println("personsSelect() SQLException: " + e.getMessage());
            return null;
        }  
     }
    public ArrayList<Country> countrySelect(){
        try{
            String query = "SELECT * FROM COUNTRY";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Country> countries = new ArrayList<>();
            while(result.next()){
                Country country = new Country();
                country.setNameCountry(result.getString("NameCountry"));
                country.setLvlPopularity(result.getByte("lvlPopularity"));
                countries.add(country);
            }
            return countries;
        }
        catch(SQLException e){
            System.out.println("countrysSelect() SQLException: " + e.getMessage());
            return null;
        }
    }
    public ArrayList<City> citySelect(){
        try{
            String query = "SELECT * FROM CITY";
            ResultSet result = statement.executeQuery(query);
            ArrayList<City> citys = new ArrayList<>();
            while(result.next()){
                City city = new City();
                city.setNameCity(result.getString("NameCity"));
                city.setCountHotel(result.getByte("CountHotel"));
                city.setNameRegion(result.getString("NameRegion"));
                city.setNameCountry(result.getString("NameCountry"));
                citys.add(city);
            }
            return citys;
        }
        catch(SQLException e){
            System.out.println("citysSelect() SQLException: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Hotel> hotelSelect(){
        try{
            String query = "SELECT * FROM HOTEL";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Hotel> hotels = new ArrayList<>();
            while(result.next()){
                Hotel hotel = new Room();
                hotel.setNameHotel(result.getString("NameHotel"));
                hotel.setCountRoom(result.getInt("CountRoom"));
                hotel.setVacantRoom(result.getInt("VacantRoom"));
                hotels.add(hotel);
            }
            return hotels;
        }
        catch(SQLException e){
            System.out.println("roomsSelect() SQLException: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Room> roomSelect(String str){
        try{
            String query = "SELECT * FROM ROOM WHERE NameHotel Like \""+str+"\"";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Room> rooms = new ArrayList<>();
            while(result.next()){
                Room room = new Room();
                room.setId(result.getByte("Id"));
                room.setFloor(result.getByte("Floor"));
                room.setWiFi(result.getString("WiFi"));
                room.setCountBed(result.getByte("CountBed"));
                room.setCost(result.getFloat("Cost"));
                room.setNumberStars(result.getByte("NumberStars"));
                room.setNameHotel(result.getString("NameHotel"));
                rooms.add(room);
            }
            return rooms;
        }
        catch(SQLException e){
            System.out.println("roomsSelect() SQLException: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Order> orderSelect(){
        try{
            String query = "SELECT * FROM ORDER1";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Order> orders = new ArrayList<>();
            while(result.next()){
                Order order = new Order();
                order.setName(result.getString("Name"));
                order.setSurName(result.getString("SurName"));
                order.setMail(result.getString("Mail"));
                order.setCardNumber(result.getInt("CardNumber"));
                order.setNameCountry(result.getString("NameCountry"));
                order.setNameCity(result.getString("NameCity"));
                order.setNameHotel(result.getString("NameHotel"));
                order.setId(result.getInt("Id"));
                orders.add(order);
            }
            return orders;
        }
        catch(SQLException e){
            System.out.println("roomsSelect() SQLException: " + e.getMessage());
            return null;
        }
    }
    
    
    public boolean dataInsert(){
        try{            
            String []query=new String[17];
            query[0]= "REPLACE INTO PERSON(Name, SurName, Mail, Active, Password, CardNumber) values(\"Anton\",\"Baton\",\"anton@mail.ru\",\"true\",\"54321\",42353)";
            query[1]= "REPLACE INTO PERSON(Name, SurName, Mail, Active, Password, CardNumber) values(\"admin\",\"admin1\",\"admin1@mail.ru\",\"true\",\"12345\",44354)";
            query[2]="REPLACE INTO COUNTRY(NameCountry, lvlPopularity) values( \"Ukraine\",2)";
            query[3]="REPLACE INTO CITY(NameCity, CountHotel, NameRegion, NameCountry) values(\"Kyev\", 368, \"Kyev\", \"Ukraine\")";
            query[4]="REPLACE INTO CITY(NameCity, CountHotel, NameRegion, NameCountry) values(\"Nikolaev\", 19, \"Nikolaev\", \"Ukraine\")";
            query[5]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Premier Palace\", 302, 32, \"Kyev\", \"Ukraine\")";
            query[6]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Opera Hotel\",248, 90, \"Kyev\", \"Ukraine\")";
            query[7]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Park Hotel Goloseevo\",220, 120, \"Kyev\", \"Ukraine\")";
            query[8]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Zolotoy Fazan\",120, 30, \"Nikolaev\", \"Ukraine\")";
            query[9]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Atrium Apartment\",135, 55, \"Nikolaev\", \"Ukraine\")";
            query[10]="REPLACE INTO HOTEL(NameHotel, CountRoom, VacantRoom, NameCity, NameRegion) values(\"Hotele Palace Ukraine\",200, 78, \"Nikolaev\", \"Ukraine\")";
            query[11]="REPLACE INTO ROOM(Id, Floor, WiFi, CountBed, Cost, NumberStars, NameHotel) values(32,3, \"yes\", 1, 230, 4, \"Premier Palace\")";
            query[12]="REPLACE INTO ROOM(Id, Floor, WiFi, CountBed, Cost, NumberStars, NameHotel) values(35,2, \"no\", 2, 250, 4, \"Premier Palace\")";
            query[13]="REPLACE INTO ROOM(Id, Floor, WiFi, CountBed, Cost, NumberStars, NameHotel) values(44,4, \"no\", 3, 240, 5, \"Premier Palace\")";
            query[14]="REPLACE INTO ROOM(Id, Floor, WiFi, CountBed, Cost, NumberStars, NameHotel) values(122,2, \"yes\", 2, 210, 3, \"Zolotoy Fazan\")";
            query[15]="REPLACE INTO ROOM(Id, Floor, WiFi, CountBed, Cost, NumberStars, NameHotel) values(122,2, \"yes\", 4, 305, 5, \"Zolotoy Fazan\")";
            query[16]="REPLACE INTO ORDER1(Name, SurName, Mail, CardNumber, NameCountry, NameCity, NameHotel, Id) values(\"denis\", \"Pupkin\", \"denis@mail.ru\",2345 , \"Ukraine\", \"Nikolaev\",\"Boroda\", 22)";
            for(int i=0;i<query.length;i++){
                statement.execute(query[i]);
            }            
            return true;
        }
        catch (SQLException e) {
            System.out.println("dataInsert() SQLException: " + e.getMessage());
            return false;
        }  
    }
    
    public void resetDateBase() {   
        try{
            String query = "DROP TABLE IF EXISTS PERSON";
            statement.execute(query);
            query = "DROP TABLE IF EXISTS COUNTRY";
            statement.execute(query);
            query = "DROP TABLE IF EXISTS CITY";
            statement.execute(query);
            query = "DROP TABLE IF EXISTS HOTEL";
            statement.execute(query);
            query = "DROP TABLE IF EXISTS ROOM";
            statement.execute(query);
            query = "DROP TABLE IF EXISTS ORDER1";
            statement.execute(query);
            query = "CREATE TABLE PERSON(Name CHAR(50), SurName CHAR(50), Mail CHAR(50), Active CHAR(50),Password CHAR(50), CardNumber INT)";
            statement.execute(query);
            query ="CREATE TABLE COUNTRY(NameCountry CHAR(50), lvlPopularity INT)";
            statement.execute(query);
            query="CREATE TABLE CITY(NameCity CHAR(50),CountHotel INT, NameRegion CHAR(50),NameCountry CHAR(50))";
            statement.execute(query);
            query="CREATE TABLE HOTEL(NameHotel CHAR(50),CountRoom INT, VacantRoom INT, NameCity CHAR(50), NameRegion CHAR(50))";
            statement.execute(query);
            query="CREATE TABLE ROOM(Id INT, Floor INT, WiFi CHAR(50), CountBed INT, Cost FLOAT, NumberStars INT, NameHotel CHAR(50))";
            statement.execute(query);
            query="CREATE TABLE ORDER1(Name CHAR(50),SurName CHAR(50), Mail CHAR(50), CardNumber INT, NameCountry CHAR(50),NameCity CHAR(50),NameHotel CHAR(50),Id INT)";
            statement.execute(query);
        }
        catch (SQLException e){
            System.out.println("resetDataBase() SQLException: " + e.getMessage());
        }
    }
}
