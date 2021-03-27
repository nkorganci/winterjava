package day29abstractclass_V42;

class L02_InterfaceExampleImplementation implements L02_InterfaceExample01 {

    public static void main(String[] args) {
        L02_InterfaceExampleImplementation obj1 = new L02_InterfaceExampleImplementation();
        Customer obj2 = new Customer();
        obj1.log();
        obj2.log();

        L02_InterfaceExample01 obj3 = new L02_InterfaceExampleImplementation();//first one is from interface
        obj3.log();
    }

    @Override
    public void log() {
        System.out.println("Students....");
    }
}

class Customer implements L02_InterfaceExample01{

    @Override
    public void log() {
        System.out.println("Customer....");

    }
}
