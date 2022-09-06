
package sales_invoice_model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Inv_Table_Model extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    private ArrayList<Inv_project> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public Inv_Table_Model(ArrayList<Inv_project> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inv_project invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}
