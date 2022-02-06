package day23encapsulationInheritance_V34.inheritance;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Enver", "nk@gma","2343");
        // Calisan sinifi kalitim yapilmaksizin islem yapildi
        System.out.println(c1.getAdSoyad());
        c1.giris();
        //Akademisyen sinfi calisan sinifindan bilgileri alacak
        Akademisyen a1 = new Akademisyen("Bera","nd@gmail.com","34342","physics","dr");
        a1.cikis();// Akademisyen cikis yapti
        a1.derseGir();
        //Different data type and constructor, sadece ust siniftakilerine ulasabilir????
        Calisan m1 = new Memur("a","b","3","dd","df");
        //Ust siniflarin hepsinin bilgilerini alir
        OgretimGorevlisi o1 = new OgretimGorevlisi("a","2","3","2","23","323");
        o1.cikis();
        System.out.println(o1.getAdSoyad());

    }
}
