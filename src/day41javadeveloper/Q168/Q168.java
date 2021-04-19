package Q168;

public class Q168 {
    enum QUALITY {
        A(100), B(75), C(50);
        int percent;

        private QUALITY(int percent) {
            this.percent = percent;
        }
    }

    /*AND*/
    checkQuality(QUALITY.A);
    /*AND*/


    void checkQuality(QUALITY q) {
        switch (q) {
            case/*Insert code here*/:
                System.out.println("Best");
                break;
            default:
                System.out.println("Not Best");
                break;
        }
    }
}

/*
            Which code fragment can be inserted into the switch statement to print Best?
            A. QUALITY.A.ValueOf()
            B. A
            C. A.toString()
            D. QUALITY.A

            Answer : B
 */