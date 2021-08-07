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
public class PelangganDAO {
    Connection koneksi;
    
     public PelangganDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(
                    "jdbc:mysql://localhost/hotel",
                    "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void InsertPelanggan(Pelanggan plg) {
        try {
            String sql_insert = "INSERT INTO `pelanggan`"
                    + "(`id`, `nama`, `umur`, 'tanggal_masuk', 'tanggal_keluar') "
                    + "VALUES (?,?,?)";
            PreparedStatement statement = koneksi.prepareStatement(sql_insert);
            statement.setInt(1, plg.getId());
            statement.setString(2, plg.getNama());
            statement.setString(3, plg.getUmur());
            statement.setString(4, plg.getTanggal_masuk());
            statement.setString(5, plg.getTanggal_keluar());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
     }   
        public List<Pelanggan> SelectAllPelanggan() {
        List<Pelanggan> listPelanggan = new ArrayList<>();

        try {
            String sql_select = "SELECT * FROM pelanggan";
            PreparedStatement statement = koneksi.prepareStatement(sql_select);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                listPelanggan.add(new Pelanggan(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPelanggan;
    }
        
         public List<Pelanggan> SelectPelangganByNama(String nama) {
        List<Pelanggan> listPelanggan = new ArrayList<>();
        try {
            String sql_select = "SELECT * FROM pelanggan WHERE nama LIKE ?";
            PreparedStatement statement = koneksi.prepareStatement(sql_select);
            statement.setString(1, "%" + nama + "%");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                listPelanggan.add(new Pelanggan(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5)));
            }
        } catch (Exception e) {
        }
        return listPelanggan;
    }
    }

