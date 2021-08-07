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
public class KamarDAO {
    Connection koneksi;
    
    public KamarDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost/hotel",
                    "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void InsertKamar(Kamar kmr) {
        try {
            String sql_insert = "INSERT INTO `mahasiswa`"
                    + "(`id`, `tipe`, `biaya`) "
                    + "VALUES (?,?,?)";
            PreparedStatement statement = koneksi.prepareStatement(sql_insert);
            statement.setInt(1, kmr.getId());
            statement.setString(2, kmr.getTipe());
            statement.setString(3, kmr.getBiaya());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
