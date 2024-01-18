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
        String str = "Intro to coMPUter sCIEncE";
        //printArray(allIndexOf("Hello worLd", 'l'));
        System.out.println(camelCase(str));
    }

    public static String capVowelsLowRest (String string) { //recives a string and: capital letters to small, {a,e,i,o,u} to capital, small stays small
        String str = "";
        for(int i = 0; i < string.length(); i++) {
            if((string.charAt(i) <= 'Z') && (string.charAt(i) >= 'A') && (string.charAt(i) != 'A') && (string.charAt(i) != 'E')
             && (string.charAt(i) != 'I') && (string.charAt(i) != 'O') && (string.charAt(i) != 'U')) {
                str += (char)(string.charAt(i) + 32);
            } else if((string.charAt(i) == 'a') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'o')
             || (string.charAt(i) == 'u')) {
                str += (char)(string.charAt(i) - 32);
            } else {
                str += (char)(string.charAt(i));
            }
        }
        return str;
    }

    public static String camelCase (String string) {
        String str = "";
        String strTemp = "";
        int [] arr = allIndexOf(string, ' ');
        str += lowerCase(subs(string, 0, arr[0]));
        for( int i = arr[0]; i < string.length(); i++) {
            if(string.charAt(i) == ' ') {
                i++;
            }
            if(((char)string.charAt(i) >= 'a') && ((char)string.charAt(i) <= 'z') && ((char)string.charAt(i-1) == ' ')) {
                    strTemp += (char)(string.charAt(i) - 32);
                } else if(((char)string.charAt(i) >= 'A') && ((char)string.charAt(i) <= 'Z')) {
                    strTemp += (char)(string.charAt(i) + 32);
                    } else {
                        strTemp += (char)string.charAt(i);
                        }
        }  
        lowerCase(strTemp);
        str += strTemp;
        return str;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for( int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == chr) {
                count++;
            }
        }
        int [] arr = new int[count]; 
        for( int i = 0; i < arr.length; i++) { 
            for(int j = i; j < string.length(); j++) { 
                if((string.charAt(j) == chr)) {
                arr[i] = j; 
                i++; 
                }
            }
        }
        return arr;
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

    public static void printArray(int[] array) {
            System.out.print('{');
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                char c = i != array.length - 1 ? ',' : '}';
                System.out.print(c);
                }
            System.out.println();
        }
}