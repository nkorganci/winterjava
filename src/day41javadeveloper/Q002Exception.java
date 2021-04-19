//package day41javadeveloper;
//
//class Q002 {
//}
//
//interface class  API {
//    public  void chekcedValue(Object value);
//
//    public boolean isValueNumber(Object val) {
//        if(val instanceof Number) {
//            return true;
//        }else {
//            try {
//                Double.parseDouble(val.toString());
//                return true;
//            }catch (NumberFormatException ex) {
//                return false;
//            }
//        }
//    }
//}
///*
//A. Change Line 1 to an abstract class:public abstract class API {
//B. Change Line 2 access modifier to protected:protected void checkValue(Object value)throws IllegalArgumentException;
//C. Change Line 1 to a class:public class API {
//D. Change Line 1 to extend java.lang.AutoCloseable:public interface API extends AutoCloseable {
//E. Change Line 2 to an abstract method:public abstract void checkValue(Object value)throws IllegalArgumentException;
//
//*Cevap A ve E
//*/
