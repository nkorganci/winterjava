package Q145;

public class Test {//Answer: B

        public static void main(String[] args) {
            Super s = new Sub();
            System.out. println(s.greeting()+","+s.name());
        }

//        What is the result?
//A. Good Morning, Potter
//B. Good Night, Potter
//C. Good Morning, Harry
//D. Good Night, Harry

}
