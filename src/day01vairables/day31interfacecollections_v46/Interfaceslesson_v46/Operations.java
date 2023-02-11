package day01vairables.day31interfacecollections_v46.Interfaceslesson_v46;

public class Operations extends parent implements I03 {
    public static void main(String[] args) {

        /*
        1- Add() method is default method in I03 because of that I can not access to add() method by using interface name
        2- multiply() method is static method we can access to it just by using interface name.
         */
        I03.multiply(2,4);

        /*
        add() method is a default method because of that I have to create object to add() method
         */

        I03 obj = new Operations();
        obj.add(23, 4); // add is default so it need object.
        I03.multiply(2,5);// multiply is static so it need class name.

        /*
        1-When we use classes, accessing static methods is allowed by using objects
        2- However, in Interfaces, when you create static methods you can access them just by using interface names
        3- Accessing by using object is not allowed.
         */
    }
}
