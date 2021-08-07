
package model;

public class Pelanggan {
    private int id;
    private String nama;
    private String umur;
    private String tanggal_masuk;
    private String tanggal_keluar;

    public Pelanggan(int id, String nama, String umur, String tanggal_masuk, String tanggal_keluar) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.tanggal_masuk = tanggal_masuk;
        this.tanggal_keluar = tanggal_keluar;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public String getTanggal_keluar() {
        return tanggal_keluar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public void setTanggal_keluar(String tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }
    
    
    
}
