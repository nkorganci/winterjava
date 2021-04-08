package day35mapslambda;

import java.util.HashMap;

public class L03_HashMap0HowDoesItWorkInternally {

    /*
    How HashMap works internally in Java
    1- When you create a HashMap, java creates 16 buckets.
    2- HashMap use hashing techniques, unique codes.
    3- Hashcode will be converted to 0 to 15
    4- Name and Ali puts into 3rd bucket as linked list
    5- If you sent 12 elements (%75) , java creates another 16 buckets whichi is called load factor.
    6- New element might go to 3rd bucket which is called Hash Collision
    7- Java creates "HashCode" by using "Key"
    8- Java uses "LinkList" for every bucket, if there there are hash collision, java can add multi list
    9-
    10-
    11-
    12-


     */

    public static void main(String[] args) {


        HashMap<String,String> hm = new HashMap<>();

        hm.put("Name", "Ali");

    }
}
