package Q162;

public class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    void setACount(int cCount){
        cCount = cCount;
    }
    void setCount(){
        this.tCount = tCount;
    }
    int setCCount(){
        return cCount;
    }
    int setGCount(int g){
        gCount = g;
        return gCount;
    }
    void setAllCounts(int x){
        aCount = tCount = this.cCount = setGCount(x);
    }
}
/*

Which two methods modify field values? (Choose two.)
A. setAllCounts
B. setACount
C. setGCount
D. setCCount
E. setTCount
Answer: A C

 */
