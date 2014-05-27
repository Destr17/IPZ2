/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.Order;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class OrderTableModel extends AbstractTableModel {
    ArrayList<Order> orders=new ArrayList<>();

    public OrderTableModel(ArrayList<Order> orders) {
        this.orders=orders;
    }

    
    @Override
    public int getRowCount() {
        return orders.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return orders.get(row).getName();
        case 1:
            return orders.get(row).getSurName();
        case 2:
            return orders.get(row).getMail();
        case 3:
            return orders.get(row).getCardNumber();
        case 4:
            return orders.get(row).getNameCountry();
        case 5:
            return orders.get(row).getNameCity();
        case 6:
            return orders.get(row).getNameHotel();
        case 7:
            return orders.get(row).getId();
        default:
            return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Name";
            case 1:
                return "SurName";
            case 2:
                return "Mail";
            case 3:
                return "CardNumber";
            case 4:
                return "NameCountry";
            case 5:
                return "NameCity";
            case 6:
                return "NameHotel";
            case 7:
                return "IdRoom";
            default:
                return "Other Column";
        }
    }
    
}
