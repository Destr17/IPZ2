/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.City;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class CityTableModel extends AbstractTableModel {
    ArrayList<City> cities=new ArrayList<>();

    public CityTableModel() {
    }
    public CityTableModel(ArrayList<City> cities) {
        super();
        this.cities=cities;
    }
    
    
    @Override
    public int getRowCount() {
        return cities.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return cities.get(row).getNameCity();
        case 1:
            return cities.get(row).getCountHotel();
        case 2:
            return cities.get(row).getNameRegion();
        default:
            return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NameCity";
            case 1:
                return "CountHotel";
            case 2:
                return "NameRegion";
            default:
                return "Other Column";
        }
    }
}
