package Q174;

public class Q174 {
    /*
        Given:
        jdeps -jdkinternals C:\workspace4\SimpleSecurity\jar\classes.jar
        Which describes the expected output?
        A. jdeps lists the module dependencies and the package names of all referenced JDK internal APIs. If
        any are found, the suggested replacements are output in the console.
        B. jdeps outputs an error message that the -jdkinternals option requires either the -summary or the -
        verbose options to output to the console.
        C. The -jdkinternals option analyzes all classes in the .jar and prints all class-level dependencies.
        D. The -jdkinternals option analyzes all classes in the .jar for class-level dependencies on JDK internal
        APIs. If any are found, the results with suggested replacements are output in the console.
        Answer: A

                Explanation:
        -jdkinternals option analyzes all classes in the .jar for class-level dependencies on JDK internal APIs. If
        any are found, the results with suggested replacements are output in the console.
     */
}
