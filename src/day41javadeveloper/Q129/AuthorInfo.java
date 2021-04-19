package Q129;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME )



public @interface AuthorInfo {
    String author() default "";
    String date();
    String [] comments() default {};
}


/*Which two are correct? (Choose two.)

A.
@AuthorInfo(date="1-1-2020. comments={null})
public class Hello{
public void func() {}
}

B.
public class Hello{
@AuthorInfo(date="1-1-2020. comments="Hello")
public void func() {}
}
C.
public class Hello{
@AuthorInfo
public void func() {}
}

D.

@AuthorInfo(date="1-1-2020")
public class Hello{
public void func() {}
}

E.
public class Hello{
@AuthorInfo(date="1-1-2020,author="Gandhi", comments={"world"})
public void func() {}
}

A. Option A
B. Option B
C. Option C
D. Option D
Answer: CD


 */


