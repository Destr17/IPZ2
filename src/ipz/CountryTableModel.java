/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.Country;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class CountryTableModel extends AbstractTableModel {
    private ArrayList<Country> countries = new ArrayList<Country>();

    public CountryTableModel(ArrayList<Country> countries) {
        super();
        this.countries=countries;
    }

    
    @Override
    public int getRowCount() {
        return countries.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return countries.get(row).getNameCountry();
        case 1:
            return countries.get(row).getLvlPopularity();
        default:
            return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NameCountry";
            case 1:
                return "LvlPopularity";
            default:
                return "Other Column";
        }
    }
}
