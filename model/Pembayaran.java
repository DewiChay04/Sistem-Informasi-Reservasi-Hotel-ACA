/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arslanth
 */
public class Pembayaran {
    private int no_kamar;
    private int id_pelanggan;
    private int id_recep;
    private String harga_kamar;
    private String lama_menginap;
    private int jumlah_pembayaran;

    public Pembayaran(int no_kamar, int id_pelanggan, int id_recep, String harga_kamar, String lama_menginap, int jumlah_pembayaran) {
        this.no_kamar = no_kamar;
        this.id_pelanggan = id_pelanggan;
        this.id_recep = id_recep;
        this.harga_kamar = harga_kamar;
        this.lama_menginap = lama_menginap;
        this.jumlah_pembayaran = jumlah_pembayaran;
    }

    public int getNo_kamar() {
        return no_kamar;
    }

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public int getId_recep() {
        return id_recep;
    }

    public String getHarga_kamar() {
        return harga_kamar;
    }

    public String getLama_menginap() {
        return lama_menginap;
    }

    public int getJumlah_pembayaran() {
        return jumlah_pembayaran;
    }

    public void setNo_kamar(int no_kamar) {
        this.no_kamar = no_kamar;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public void setId_recep(int id_recep) {
        this.id_recep = id_recep;
    }

    public void setHarga_kamar(String harga_kamar) {
        this.harga_kamar = harga_kamar;
    }

    public void setLama_menginap(String lama_menginap) {
        this.lama_menginap = lama_menginap;
    }

    public void setJumlah_pembayaran(int jumlah_pembayaran) {
        this.jumlah_pembayaran = jumlah_pembayaran;
    }
    
    
    
}
