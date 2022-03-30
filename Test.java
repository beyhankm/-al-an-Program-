import java.util.Scanner;

public class Test {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar pragramına hoşgeldiniz..");
        String islemler = "İşlemler\n"
                +"1. Yazılımcı İşlemleri\n"
                +"2. Yönetici İşlemleri\n"
                +"Çıkış için q'ya basınız.";
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");

        while (true){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Yazılımcı Programına Hoşgeldiniz.");
                Yazilimci yazilimci =new Yazilimci("Beyhan","Küçükmustafa","4563","İngilizce,Rusça");
                String yazilimci_is="Yazılımcı işlemleri\n" +
                        "1. Format At\n" +
                        "2. Bilgileri Göster\n" +
                        "Çıkış için q'ya basın.";
                System.out.println("*************");
                System.out.println(yazilimci_is);
                System.out.println("*************");
                while (true){
                    System.out.println("Lütfen yapmak istediğiniz yazılımcı işlemini seçiniz:");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı programından çıkılıyor.");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("İşletim sistemi: ");
                        String isletim_sis = scanner.nextLine();
                        yazilimci.formatAt(isletim_sis);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi");
                    }
                }

            }
            else if (islem.equals("2")){
                System.out.println("Yönetici Programına Hoşgeldiniz..");
                Yonetici yonetici = new Yonetici("Ahmet","Mehmet","55556",5);
                String yonetici_is = "Yönetici işlemleri\n" +
                        "1. Bilgileri Göster\n" +
                        "2. Zam Yap\n" +
                        "Çıkış için q'ya basınız.";
                System.out.println("*************");
                System.out.println(yonetici_is);
                System.out.println("*************");

                while (true){
                    System.out.println("Lütfen yapmak istediğiniz yönetici işlemi seçiniz: ");
                    String yon_islem = scanner.nextLine();
                    if (yon_islem.equals("q")){
                        System.out.println("Yönetici Programından Çıkılıyor.");
                        break;
                    }
                    else if (yon_islem.equals("1")){
                        yonetici.bilgileriGoster();
                    }
                    else if (yon_islem.equals("2")){
                        System.out.println("Yapmak istediğiniz zam miktarını giriniz: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zam_yap(zam_miktari);
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi");
                    }
                }
            }
        }

    }
}
