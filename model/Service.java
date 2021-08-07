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
public class Service {
    private int id_recep;
    private int id_pelanggan;
    private String type_service;
    private String biaya_service;

    public Service(int id_recep, int id_pelanggan, String type_service, String biaya_service) {
        this.id_recep = id_recep;
        this.id_pelanggan = id_pelanggan;
        this.type_service = type_service;
        this.biaya_service = biaya_service;
    }

    public int getId_recep() {
        return id_recep;
    }

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public String getType_service() {
        return type_service;
    }

    public String getBiaya_service() {
        return biaya_service;
    }

    public void setId_recep(int id_recep) {
        this.id_recep = id_recep;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public void setType_service(String type_service) {
        this.type_service = type_service;
    }

    public void setBiaya_service(String biaya_service) {
        this.biaya_service = biaya_service;
    }
    
    
    
}
