/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ipz;
import dataType.Person;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Destr
 */
public class PersonTableModel extends AbstractTableModel{
    private ArrayList<Person> persons=null;
    
    public PersonTableModel(ArrayList<Person> persons) {
        super();
        this.persons=persons;
    }

    @Override
    public int getRowCount() {
        return persons.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
        case 0:
            return persons.get(row).getName();
        case 1:
            return persons.get(row).getSurName();
        case 2:
            return persons.get(row).getMail();
        case 3:
            return persons.get(row).getActive();
        case 4:
            return persons.get(row).getPassword();
        case 5:
            return persons.get(row).getCardNumber();
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
                return "Active";
            case 4:
                return "Password";
            case 5:
                return "CardNumber";
            default:
                return "Other Column";
        }
    }
}
