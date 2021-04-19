package day41javadeveloper;

import java.util.function.BiFunction;

public class Q010Exception {
}

class Pair<T> {
    final BiFunction<T, T, Boolean> validator;
    T left = null;
    T right = null;

    Pair() {
        validator = null;
    }

    Pair(BiFunction<T, T, Boolean> v, T x, T y) {
        validator = v;
        set(x, y);
    }

    void set(T x, T y) {
        if (!validator.apply(x, y)) throw new IllegalArgumentException();

        setLeft(x);
        setLeft(y);

    }

    void setLeft(T x) {
        left = x;
    }

    void setRight(T y) {
        right = y;
    }

    final boolean isValid() {
        return validator.apply(right, left);
    }
}



