public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = "yellow";
        System.out.println(capVowelsLowRest(str));
    }

    public static String capVowelsLowRest (String string) { //recives a string and: capital letters to small, {a,e,i,o,u} to capital, small stays small
        String str = "";
        for(int i = 0; i < string.length(); i++) {
            if((string.charAt(i) <= 'Z') && (string.charAt(i) >= 'A')) {
                str += (char)(string.charAt(i) + 32);
            } else if((string.charAt(i) == 'a') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'o') || (string.charAt(i) == 'u')) {
                str += (char)(string.charAt(i) - 32);
            } else {
                str += (char)(string.charAt(i));
            }
        }
        return str;
    }

    public static String camelCase (String string) {
        //???
        return null;
        }
        
    

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    public static String lowerCase(String s) {
        String s1 = s; 
        String s2 = "";
        for(int i = 0; i < s1.length(); i++) {
            char letter = s1.charAt(i); 
            if((letter <= 'Z') && (letter >= 'A')) {
                s2 = s2 + (char)(s1.charAt(i) + 32); 
            } else {
                s2 = s2 + letter;
            }
        }
        return s2;
    }
    public static String subs(String str, int start, int end ) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
            }
        return res;
    }
}