//package day41javadeveloper.Q064;
//
//import java.nio.file.Path;
//import java.util.Collection;
//
//public interface A {
//    public Iterable a();
//}
//
// interface B extends A{
//    public Collection a();
//}
//interface C extends A{
//    public Path a();
//}
//
//interface D extends B,C {
//
//}



/*
Why does D cause a compilation error?
A. D inherits a() only from C.
B. D inherits a() from B and C but the return types are incompatible.
C. D extends more than one interface.
D. D does not define any method.
Answer: B

 */