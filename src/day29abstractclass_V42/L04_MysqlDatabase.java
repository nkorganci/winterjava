package day29abstractclass_V42;

public class L04_MysqlDatabase extends L04_AbstractDatabase {

    @Override
    void update() {
        System.out.println("sql Updated");
    }

    @Override
    void get() {
        System.out.println("sql I got it");

    }
}

