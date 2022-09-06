
package sales_invoice_model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Lines_Table_Model extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    private ArrayList<Line_project> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public Lines_Table_Model(ArrayList<Line_project> lines) {
        this.lines = lines;
    }

    public ArrayList<Line_project> getLines() {
        return lines;
    }
    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line_project line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNum();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLineTotal();
            default : return "";
        }
    }
    
}
