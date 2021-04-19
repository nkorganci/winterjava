//package day41javadeveloper.Q102;
//
//public interface TestInterface {
//
//    default void samplingProbeProcedure(){
//        probeProcedure();
//        System.out.println("Collect Sample");
//        System.out.println("Leace Asteroid");
//        System.out.println("Dock with Main Craft");
//
//    }
//
//    default void explosionProbeProcedure (){
//        probeProcedure();
//        System.out.println("Explode");
//    }
//}
// /*
// Examine these requirements:
//Eliminate code duplication.
//Keep constant the number of methods other classes may implement from this interface.
//Which method can be added to meet these requirements?
//  */
//
///*
//A.
//private default void probeProcedure(){
//        System.out.println("Launch Probe");
//        System.out.println("Land on Asteroid");
//        }
//
//B.
//static void probeProcedure(){
//        System.out.println("Launch Probe");
//        System.out.println("Land on Asteroid");
//        }
//
//C.
//private  void probeProcedure(){
//        System.out.println("Launch Probe");
//        System.out.println("Land on Asteroid");
//        }
//
//D.
//default void probeProcedure(){
//        System.out.println("Launch Probe");
//        System.out.println("Land on Asteroid");
//        }
//
// */
///*
//A. Option A
//B. Option B
//C. Option C
//D. Option D
//Answer: B
// */