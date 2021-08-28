package A01codingbat;

public class CodingBat {
    public static void main(String[] args) {

    }

    public int countYZ(String str) {

        int length = str.length();
        int count = 0;
        str=str.toLowerCase();

        for (int i=0;i<length;i++){
            if(str.charAt(i)=='y' || str.charAt(i)=='z'){
                if(i<length-1 &&!Character.isLetter(str.charAt(i+1))){
                    count++;
                }else if(i==length-1){
                    count++;
                }
            }
        }


        return count;

    }


}
