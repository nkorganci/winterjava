package p01_W3resource;

public class Q19_DecimalToBinary {

    public static void main(String[] args) {

        //1st Way
        System.out.println("Binary representation of 124: ");
        System.out.println(Integer.toBinaryString(2));



    }
}

//2nd Way
class DecimalToBinaryExample2{
    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }
    public static void main(String args[]){
        System.out.println("Decimal of 10 is: ");
        toBinary(10);
        System.out.println("Decimal of 21 is: ");
        toBinary(21);
        System.out.println("Decimal of 31 is: ");
        toBinary(31);
    }}
