
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Pelanggan;
import model.PelangganDAO;
import model.Resepsionis;
import model.ResepsionisDAO;
import model.Service;
import model.ServiceDAO;
import model.Kamar;
import model.KamarDAO;

public class MainFrameControl {
    
    PelangganDAO plgDAO;
    ResepsionisDAO reseDAO;
    ServiceDAO srvDAO;
    KamarDAO kmrDAO;
    
    public MainFrameControl(){
        plgDAO = new PelangganDAO();
        reseDAO = new ResepsionisDAO();
        srvDAO = new ServiceDAO();
        kmrDAO = new KamarDAO();
    }
    
    
}
