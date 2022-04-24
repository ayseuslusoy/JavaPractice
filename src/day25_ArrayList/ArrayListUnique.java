package day25_ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUnique {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ayse","Sait","Kizimiz","Sait"));

        ArrayList<String> unique=new ArrayList<>();
        for(String each:names){
            int frequency=Collections.frequency(names,each);
            if(frequency==1){
               unique.add(each);
            }

        }
        System.out.println(unique);

    }
}