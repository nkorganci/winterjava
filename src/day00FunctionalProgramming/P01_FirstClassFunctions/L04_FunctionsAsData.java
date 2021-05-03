package day00FunctionalProgramming.P01_FirstClassFunctions;

public class L04_FunctionsAsData {

    protected static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age){
            this.name=name;
            this.age=age;
        }
    }

    protected static class DataLoader{
        public final NoArgFunction<Person> loadPerson;
        public DataLoader(Boolean isDevelopment){
            this.loadPerson=isDevelopment?this::loadPersonReal:this::getLoadPersonFake;
        }
        private Person loadPersonReal(){
            System.out.println("loading person");
            return new Person("Adam",22);

        }

        private Person getLoadPersonFake(){
            System.out.println("Returning fake");
            return new Person("fake", 100);

        }
    }
    public static void main(String[] args) {

        final Boolean IS_DEVELOPMENT=true;
        DataLoader dataLoader= new DataLoader(IS_DEVELOPMENT);

    }
}
