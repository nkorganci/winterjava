package day23encapsulationInheritance_V34.inheritance;

public class Memur extends Calisan {
    private String department;
    private String mesai;

    public Memur(String adSoyad, String eposta, String telefon, String department, String mesai) {
        super(adSoyad, eposta, telefon);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
    public void calis(){
        System.out.println(this.getAdSoyad() + " memur gorevde");
    }
}
