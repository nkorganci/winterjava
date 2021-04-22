package day42codingbat.Warmup_1;

public class DelDel {

    /*

    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.


    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */
    public static void main(String[] args) {

    }

    public static String delDel(String str) {

        if (str.contains("del")&&(str.indexOf("del") == 1)) {

                return str.substring(0, 1).concat(str.substring(4));

        }
        return str;


    }
    public String delDel1(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }}
