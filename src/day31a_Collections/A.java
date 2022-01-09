package day31a_Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class A {

    public static void main(String[] args) {

    }
}

class B {
    public static void main(String[] args) {


    }
}


class Base {
    private static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }

    class Derived extends Base {
        private static void display() {
            System.out.println("Static or class method from Derived");
        }

        public void print() {
            System.out.println("Non-static or instance method from Derived");
        }

        public class test {
            public static void main(String args[]) {
                Base obj = new Derived();
                obj1.display();
                obj1.print();
            }
        }
