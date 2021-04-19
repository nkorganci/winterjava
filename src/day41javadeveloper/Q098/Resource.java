package day41javadeveloper.Q098;


// ANSWER D C


//Examine this code fragment:
// /*Loc1*/ class ProcessOrders{...}
//Which two annotations may be applied at Loc1 in the code fragment? (Choose two.)


//A. @Resource(priority=100)
//B. @Resource(priority=0)
//C. @Resource(name=“Customer1”, priority=100) D. @Resource(name=“Customer1”)
//D. @Resource(name=“Customer1”)
//E. @Resource



@interface Resource {
	
	String name();
	
	int priority() default 0;

}
