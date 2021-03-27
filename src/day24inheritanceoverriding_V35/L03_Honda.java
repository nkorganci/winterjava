package day24inheritanceoverriding_V35;

public class L03_Honda extends L02_Car {

    public void factory() {
	System.out.println("Factory is in Japan");

    }

    @Override // method name and parameter dont change in overriding.

    public void move() {// if you delete "public" to make it default or private.
			// Cannot reduce the visibility of the inherited method from L01_Vehicle

	System.out.println("Honda reaches to 100 mile per hour");// Updated method body
	// super.move();
    }

    @Override // This is called override annotation

    public void engine() {// Overriding: you can not change "primitive" and "void" return types to another ones.
	System.out.println("Honda has eco engine in every model");
	// super.engine();
    }

    @Override
    public int spend() {// Return type is "int" you can not change it to "byte",it will complain.

	// return super.spend();
	return 22;
    }

    @Override
    public Object speak() {// Changing Object to String will not complain, because String is child of Object.
	return "Honda can speak in Japan";
	// return super.speak();
    }
}
