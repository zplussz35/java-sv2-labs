package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s:billItems) {
            String[] data =s.split(";");
            sb.append(data[0]);
            sb.append("; darabszám: ");
            sb.append(data[2]);
            sb.append(", egységár: ");
            sb.append(data[1]);
            sb.append(", összesen: ");
            sb.append(Integer.parseInt(data[1])*Integer.parseInt(data[2]));
            sb.append(" Ft\n");
        }
        return sb.toString();
    }
}
