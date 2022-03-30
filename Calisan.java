public class Calisan {
    private String Ad;
    private String Soyad;
    private String ID;

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Calisan(String ad, String soyad, String ID) {
        Ad = ad;
        Soyad = soyad;
        this.ID = ID;
    }
    public void bilgileriGoster(){
        System.out.println("Ad: " + Ad);
        System.out.println("Soyadı: " + Soyad);
        System.out.println("ID: " + ID);
    }
}
