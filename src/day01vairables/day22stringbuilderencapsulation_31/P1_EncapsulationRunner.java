package day01vairables.day22stringbuilderencapsulation_31;

public class P1_EncapsulationRunner {
    public static void main(String[] args) {


        /*
            // Public class variable
            // Age can not be less than zero, I wrote it in constructor but I can assign age in runner which is a problem.
            P1_EncapsulationA obj = new P1_EncapsulationA("Hamza",-22);
            System.out.println(obj.age);// age
            obj.age=-2; //I can reassign the value
            System.out.println(obj.age);
         */

        //2 - private class variable
        P1_EncapsulationA obj = new P1_EncapsulationA("Hamza",-22);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(44);// has no return
        System.out.println(obj.getAge());
        obj.setAge(-22);// age can not be less than 0;
        System.out.println(obj.getAge());


    }
}
