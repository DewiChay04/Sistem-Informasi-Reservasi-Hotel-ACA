/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arslanth
 */
public class ServiceDAO {
   Connection koneksi;

    public ServiceDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost/hotel",
                    "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void InsertService(Service srv) {
        try {
            String sql_insert = "INSERT INTO `service`"
                    + "(`id_recep`, `id_pelanggan`, `type_service`, 'biaya_service')"
                    + "VALUES (?,?,?,?,)";
            PreparedStatement statement = koneksi.prepareStatement(sql_insert);
            statement.setInt(1, srv.getId_recep());
            statement.setInt(2, srv.getId_pelanggan());
            statement.setString(3, srv.getType_service());
            statement.setString(4, srv.getBiaya_service());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Service> SelectAllService() {
        List<Service> listService = new ArrayList<>();

        try {
            String sql_select = "SELECT * FROM service";
            PreparedStatement statement = koneksi.prepareStatement(sql_select);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                listService.add(new Service(
                        result.getInt(1),
                        result.getInt(2),
                        result.getString(3),
                        result.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listService;
    }
 
}
