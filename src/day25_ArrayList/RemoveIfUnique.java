package day25_ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class RemoveIfUnique {
    public static void main(String[] args) {
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,1,2));
        ArrayList<Integer> unique=new ArrayList<>(numbers);
        unique.removeIf(p-> Collections.frequency(numbers,p)>1);
        System.out.println(unique);
    }
}
