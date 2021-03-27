package day29abstractclass_V42;

class L03_Interface_Example2R implements L03_InterfaceExample02 {// Could not understand
    //https://www.youtube.com/watch?v=KHAAXQBE0Ug&list=PLIHume2cwmHctrHFHADb0slNyn95x2M4I&index=34
    public static void main(String[] args) {
        L03_Interface_Example2R obj = new L03_Interface_Example2R();
        obj.add();
        obj.delete();
        obj.get();
        obj.update();

       DatabaseManager obj1 = new DatabaseManager();
       obj1.AddDatabase(new mongoDatabase());


           }

    @Override
    public void add() {
        System.out.println("Mysql addition");
    }

    @Override
    public void delete() {
        System.out.println("Mysql delete");
    }

    @Override
    public void get() {
        System.out.println("Mysql get");
    }

    @Override
    public void update() {
        System.out.println("Mysql update");
    }
}

class mongoDatabase implements L03_InterfaceExample02 {

    @Override
    public void add() {
        System.out.println("mongoDatabase update");
    }

    @Override
    public void delete() {
        System.out.println("mongoDatabase update");
    }

    @Override
    public void get() {
        System.out.println("mongoDatabase update");
    }

    @Override
    public void update() {
        System.out.println("mongoDatabase update");
    }
}

class DatabaseManager {
    public void AddDatabase(L03_InterfaceExample02 example02){
        example02.add();
    }
    public void GetDatabase(L03_InterfaceExample02 example02){
        example02.get();
    }
    public void DeleteDatabase(L03_InterfaceExample02 example02){
        example02.delete();
    }
    public void UpdateDatabase(L03_InterfaceExample02 example02){
        example02.update();
    }

}



