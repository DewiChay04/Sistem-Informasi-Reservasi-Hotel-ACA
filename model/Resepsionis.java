
package model;


public class Resepsionis {
  private int id; 
  private String nama;
  private String jk_rec;
  private String notelp;
  private String password;

    public Resepsionis(int id, String nama, String jk_rec, String notelp, String password) {
        this.id = id;
        this.nama = nama;
        this.jk_rec = jk_rec;
        this.notelp = notelp;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJk_rec() {
        return jk_rec;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJk_rec(String jk_rec) {
        this.jk_rec = jk_rec;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
  
    
}
