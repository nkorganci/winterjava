package day23encapsulationInheritance_V34.inheritance;

public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    // Super is used only in constructors
    //There is no multiinheritance in java
    //Java çoklu kalıtımı desteklemez. (Interface kullanılır)
    public Akademisyen(String adSoyad,String eposta, String telefon,String bolum, String unvan){
        super(adSoyad,eposta,telefon);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad() + " Akademisyeni derse girdi");
    }
}
