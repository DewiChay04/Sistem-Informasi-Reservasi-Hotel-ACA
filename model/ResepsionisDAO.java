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
public class ResepsionisDAO {
Connection koneksi;

    public ResepsionisDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost/hotel",
                    "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public List<Resepsionis> SelectAllResepsionis() {
        List<Resepsionis> listResepsionis = new ArrayList<>();

        try {
            String sql_select = "SELECT * FROM rece";
            PreparedStatement statement = koneksi.prepareStatement(sql_select);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                listResepsionis.add(new Resepsionis(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listResepsionis;
    }
     
     
}
