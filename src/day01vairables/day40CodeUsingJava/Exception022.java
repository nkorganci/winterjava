//package day40CodeUsingJava;
//
//public class Exception022 {
//}
//
///*
//Explanation -
//Hello1 - the read method throws a checked exception. It is fine even if that exception is never thrown
//
//Hello2 - Both the instance variable and the method have the name same as the class. This is allowed but is a bad practice
//
//Hello3 - Local variables can only be declared as final and not private. So this will be compiler error
// */
//    //Hello1 .java                                                                                                                          public class Hello1 {
//    public void read() throws Exception {}
//}
//
////Hello2.java
//
//
//class Hello2 {
//    String Hello2;
//    public void Hello2() {}
//}
//
//
//
////Hello3.java
//public class Hello3 {
//    private void print() {
//        private String var = "HELLO";
//        System.out.println(var);
//    }
//}
