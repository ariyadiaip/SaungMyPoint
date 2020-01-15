package id.sch.bdg.smkn4.pkk.saung_mypoint;

public class HomeFeed {
    String content;
    String status;
    String dukungan;
    String namaPengirim;
    String daerah;
    String tanggal;
    int gambarProfile;
    int gambarContent;

    public HomeFeed(String content, String status, String dukungan, String namaPengirim, String daerah, String tanggal, int gambarProfile, int gambarContent) {
        this.content = content;
        this.status = status;
        this.dukungan = dukungan;
        this.namaPengirim = namaPengirim;
        this.daerah = daerah;
        this.tanggal = tanggal;
        this.gambarProfile = gambarProfile;
        this.gambarContent = gambarContent;
    }

    public HomeFeed(){}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDukungan() {
        return dukungan;
    }

    public void setDukungan(String dukungan) {
        this.dukungan = dukungan;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getGambarProfile() {
        return gambarProfile;
    }

    public void setGambarProfile(int gambarProfile) {
        this.gambarProfile = gambarProfile;
    }

    public int getGambarContent() {
        return gambarContent;
    }

    public void setGambarContent(int gambarContent) {
        this.gambarContent = gambarContent;
    }
}
