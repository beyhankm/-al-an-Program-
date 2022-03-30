public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, String ID,int sorumlu_kisi_sayisi) {
        super(ad, soyad, ID);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    public void zam_yap(int zam_miktari){
        System.out.println(getAd()+" çalışanlara " + zam_miktari +" kadar zam yapıyor.");
    }
}
