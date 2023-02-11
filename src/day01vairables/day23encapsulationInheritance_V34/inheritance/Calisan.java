package day01vairables.day23encapsulationInheritance_V34.inheritance;

public class Calisan {
    private String adSoyad;
    private String eposta;
    private String telefon;

    public Calisan(String adSoyad, String eposta, String telefon) {
        //super() , bu ister yazar istersek yazmayiz
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void giris(){
        System.out.println(this.adSoyad + " giris yapti");
    }
    public void cikis(){
        System.out.println(this.adSoyad + " sistemden cikti");
    }
}
