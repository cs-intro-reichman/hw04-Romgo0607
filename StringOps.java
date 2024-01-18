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
        //String str = "One two tHRee world";
        printArray(allIndexOf("Hello world",' '));
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
        //???
        return null;
        }
        
    

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for( int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == chr) {
                count++;
            }
        }
        int [] arr = new int[count]; //"MMMM", 'M'
        for( int i = 0; i < arr.length; i++) { //i=1 < 4
            int repeat = 0;
            for(int j = i; j < string.length(); j++) { //j=1 < 4
                if((string.charAt(j) == chr) && (repeat < 1)) {
                arr[i] = j; //{0, }
                repeat++; //re = 0
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