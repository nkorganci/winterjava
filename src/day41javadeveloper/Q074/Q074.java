package day41javadeveloper.Q074;

import java.util.Collection;

public class Q074 {
    public class X {
        private Collection collection;

        public void set(Collection collection) {
            this.collection = collection;
        }
    }

    //    and
    public class Y extends X {
        public static void main(String[] args) {
        super.set(map); //line 1
        }
    }
}

/*
        A. map.forEach((k, v) -> set(v)));
        B. set(map.values());
        C. super.set(List<String> map)
        D. super.set(map.values());
        E. set(map)
        answer : B,D
 */