public class ArrayOps {
    public static void main(String[] args) {
        int[] x = {2,2,3,7,8,3,2}; //for testing
        int[] y = {8,2,7,7,3};
        //System.out.println(findMissingInt(x));
        System.out.println(secondMaxValue(x));
        //System.out.println(isSorted(x));
        //printArray(Sorted(x));
    }
    public static boolean isSorted(int [] array) { //checks if the arr is sorted from big to small or small to big
         boolean check = true;
         if(array[0] < array[array.length - 1]) {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    check = false;
                }
            }
         } else if(array[0] > array[array.length - 1]) {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]) {
                    check = false;
                }
            }
         } else if(array[0] == array[array.length - 1]) {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] != array[i + 1]) {
                    check = false;
                }
            }
         }
        return check;
    }

    public static int findMissingInt (int [] array) { //returns a missing integer in array 
        int sumArr = 0;
        int sumPerfect = 0;
        for(int i = 0; i < array.length; i++) {
            sumArr += array[i];
        }
        for(int j = 1; j <= array.length; j++) {
            sumPerfect += j;
        }
        int check = sumPerfect - sumArr;
        return check;
    }

    public static int secondMaxValue(int [] array) { //returns the second biggest int
        int[] newArr = new int[array.length];
        newArr = fillArray(array);
        Sorted(newArr);
        int secondMax = newArr[newArr.length - 2];
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) { 
        boolean hasSameInt = false;
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) { 
                if(array1[i] != array2[j]) {  
                    hasSameInt = false;
                }
                else {
                    hasSameInt = true;
                    break;
                }
            }
            if(hasSameInt == false) {
                break;
            }
        }
        return isSameEle;
    }

        public static int[] Sorted(int [] array) { //returns the arr by order from small to big
            int index = 0; 
            while(index < array.length) {
                for(int i = index + 1; i < array.length; i++) {
                    int temp = 0;
                    if( array[index] > array[i]) {
                        temp = array[index];
                        array[index] = array[i];
                        array[i] = temp;
                    }
                } 
                index++;
            }
            return array;
        }
            
        public static int[] fillArray(int [] array) { 
            int[] newArr = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            return newArr;
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


