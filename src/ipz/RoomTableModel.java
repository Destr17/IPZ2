/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.Room;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class RoomTableModel extends AbstractTableModel{
    private ArrayList<Room> rooms=new ArrayList<Room>();

    public RoomTableModel(ArrayList<Room> rooms) {
        super();
        this.rooms=rooms;
    } 
    
    
    @Override
    public int getRowCount() {
        return rooms.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return rooms.get(row).getId();
        case 1:
            return rooms.get(row).getFloor();
        case 2:
            return rooms.get(row).getWiFi();
        case 3:
            return rooms.get(row).getCountBed();
        case 4:
            return rooms.get(row).getCost();
        case 5:
            return rooms.get(row).getNumberStars();
        default:
            return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Floor";
            case 2:
                return "WiFi";
            case 3:
                return "CountBed";
            case 4:
                return "Cost";
            case 5:
                return "NumberStars";
            default:
                return "Other Column";
        }
    }
    
}
