package day29abstractclass_V42;

public class L04_Main {

    public static void main(String[] args) {

        L04_AbstractDatabase abstractDatabase1 = new L04_MysqlDatabase();
        L04_AbstractDatabase abstractDatabase2 = new L04_Mongodatabase();
        L04_Mongodatabase abstractDatabase3 = new L04_Mongodatabase();// Did not chage the print

        abstractDatabase1.add();
        abstractDatabase2.add();
        abstractDatabase3.add();

        abstractDatabase1.update();
        abstractDatabase2.update();
        abstractDatabase3.update();



    }
}
