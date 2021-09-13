package zadaniapodstawy.day2;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -4};
        int lengthOfNegativeArray = countNegativeValuesInArray(inputs);
        if(lengthOfNegativeArray > 0) {
            int[] result = createArrayWithNegativeValues(inputs, lengthOfNegativeArray);
            String str = "test";
            Arrays.stream(result).forEach(System.out::println);
        }
    }

    private static int[] createArrayWithNegativeValues(int[] inputs, int lengthOfNegativeArray) {
        int[] result = new int[lengthOfNegativeArray];
        for(int i =0, j = 0; i <inputs.length; i++) {
            if(inputs[i] < 0) {
                result[j++] = inputs[i];
            }
        }
//        int j = 0;
//        for (int i : inputs) {
//            if(i < 0) {
//                result[j] = i;
//                j++;
//            }
//        }
        return result;
    }

    private static int countNegativeValuesInArray(int[] inputs) {
        int counter = 0;
        for(int i : inputs) {
            if(i < 0) {
                counter++;
            }
        }
        return counter;
    }

}

//public class Task14 {
//    public static void main(String[] args) {
//        int[] arrays = {12, -7, 19, -5};
//        int lengthNewArray = countNegativeValues(arrays);
//        int[] negativeDigits = createArrayWithNegativeValues(lengthNewArray, arrays);
//
//        if(lengthNewArray > 0) {
//            for (int element : negativeDigits) {
//                System.out.print(element + " ");
//            }
//        }
//    }
//
//    private static int countNegativeValues(int[] arrays) {
//        int counter = 0;
//        for(int element : arrays) {
//            if(element < 0) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    private static int[] createArrayWithNegativeValues(int length, int[] arrays) {
//        int[] newArray = new int[length];
//        for (int i = 0, j = 0; i < arrays.length; i++) {
//            if(arrays[i] < 0) {
//                newArray[j] = arrays[i];
//                j++;
//            }
//        }
//        return newArray;
//    }
//}