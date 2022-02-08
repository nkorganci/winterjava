package day23encapsulationInheritance_V34.inheritance;

public class OgretimGorevlisi extends Akademisyen {
    //There is no default constructor available in 'day23encapsulationInheritance_V34.inheritance.Akademisyen
    private String kapiNo;
    public OgretimGorevlisi(String adSoyad, String eposta, String telefon, String bolum, String unvan, String kapiNo) {
        super(adSoyad, eposta, telefon, bolum, unvan);
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
}
