package Q144;

import java.io.Serializable;

enum Color implements Serializable {//Answer: A
    R(1), G(2),B(3);
    int c;
 //   public
    private Color(int c){
        this.c=c;

//        What action ensures successful compilation?
//A. Replace public Color(int c) with private Color(int c).
// B. Replace int c; with private int c;.
// C. Replace int c; with private final int c;.
// D. Replace enum Color implements Serializable with public enum Color.
// E. Replace enum Color with public enum Color
    }
}
