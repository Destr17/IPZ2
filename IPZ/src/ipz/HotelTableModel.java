/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.Hotel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class HotelTableModel extends AbstractTableModel{
    ArrayList<Hotel> hotels=new ArrayList<>();

    public HotelTableModel(ArrayList<Hotel> hotels) {
        super();
        this.hotels=hotels;
    }
        
    
    
    @Override
    public int getRowCount() {
        return hotels.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return hotels.get(row).getNameHotel();
        case 1:
            return hotels.get(row).getCountRoom();
        case 2:
            return hotels.get(row).getVacantRoom();
        default:
            return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NameHotel";
            case 1:
                return "CountRoom";
            case 2:
                return "VacantRoom";
            default:
                return "Other Column";
        }
    }
}
