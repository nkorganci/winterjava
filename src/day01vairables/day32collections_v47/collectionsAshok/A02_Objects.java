package day01vairables.day32collections_v47.collectionsAshok;

public class A02_Objects {
    public static void main(String[] args) {
        // =========================================OBJECT ARRAY ============================================

        // 1 Object array can have more than one data types
        Object [] obj = {1,2,"hi",null};
        for(Object objPrint:obj){
            System.out.println(objPrint);
        }

        // 2 New Objects , size is fixed again, but we can add more than one data types
        Object[] obj3 = new Object[2];
        obj3[0]= 1;

        //Object can contain all type of data
        Object obj1 = 2;
        obj1="hi";
        System.out.println(obj1);

    }
}
