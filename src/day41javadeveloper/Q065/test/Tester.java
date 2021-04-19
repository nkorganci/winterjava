package day41javadeveloper.Q065.test;


public class Tester {
    public static void main(String[] args) {
        Diary d=new Diary();
        System.out.println(d.getDate());
    }
}


/*
Which statement is true?
A. Class Tester does not need to import java.time.LocalDate because it is already visible to members
of the package test.
B. All classes from the package java.time. are loaded for the class Diary.
C. Only LocalDate class from java.time package is loaded.
D. Tester must import java.time.LocalDate in order to compile.
Answer: A
 */