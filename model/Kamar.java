
package model;

public class Kamar {
    private int id;
    private String tipe;
    private String biaya;

    public Kamar(int id, String tipe, String biaya) {
        this.id = id;
        this.tipe = tipe;
        this.biaya = biaya;
    }

    public int getId() {
        return id;
    }

    public String getTipe() {
        return tipe;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
   
    
}
