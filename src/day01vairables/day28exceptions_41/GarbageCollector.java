package day01vairables.day28exceptions_41;

public class GarbageCollector  {

    /*
    1-Garbage collector destroys the "finalized" objects.
    2-To finalize an object Java uses "finalize" method.
    3-If you want you can call "finalize()" method among your code but
    Java decides when and how to use finalize(); method.
     */
    /*
    Explain "final", "finally", and "finalize"
    1-"final" is a keyword, "finally" is a code block, "finalize()" is a method
    2-"final" ==> a) final variables:
                    i)Final variables must be initialized
                    ii) Final variable values can not be modified
                    iii) Final variable should be named by using uppercases
                   b) final methods;
                    i)final methods cannot be overriden but can be overloaded
                   c) final classes:
                    i)final classes can not have child classes, no inheritance, no extends
     3-"finally"==> a) It is used with try block or try-catch block
                    b) It is executed when the exception is thrown or the exception is not thrown
                    c) It is used to end connections with database, or cloud or it is used to close a file.
     4- "finalize"==> a) It is executed before Garbage Collector destroys the objects.
     */
}
