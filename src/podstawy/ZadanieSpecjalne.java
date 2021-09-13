package podstawy;

import java.nio.ByteBuffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZadanieSpecjalne {

    public static void main(String[] args) {
        int i = 3;
        int n = 4;
        wyswietlLiczbe(i);
        wyswietlLiczbe(n);
        int result = i ^ n;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }

    private List<Integer> findNumber(int[] array){
        Set<Integer> arraySet = Arrays.stream(array).boxed().collect(Collectors.toSet());
        int max = arraySet.stream().max(Integer::compare).get();
        List<Integer> foundNumbers = IntStream.range(1, max)
                .boxed()
                .filter(number -> !arraySet.contains(number))
                .collect(Collectors.toList());
        return foundNumbers.isEmpty() ? Collections.singletonList(-1) : foundNumbers;
    }

    private List<Integer> findMissingNumber(int[] array){
        List<Integer> foundNumbers = new ArrayList<>();
        for(int number=0; number < maxInArray(array); number++){
            if(isNotExist(number, array)){
                foundNumbers.add(number);
            }
        }
        return foundNumbers.isEmpty() ? Collections.singletonList(-1) : foundNumbers;
    }

    private int maxInArray(int[] array){
        int max = 1;
        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private boolean isNotExist(int number, int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] != number){
                return true;
            }
        }
        return false;
    }

    private static void wyswietlLiczbe(Integer liczba){
        String hex = Integer.toBinaryString(liczba);
        System.out.println(hex);
    }
}
