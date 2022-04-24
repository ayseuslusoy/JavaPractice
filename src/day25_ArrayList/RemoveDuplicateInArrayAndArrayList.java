package day25_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicateInArrayAndArrayList {//ArrayList de remove duplicate yapilirken iki tane
    //arraylist olusturulmalidir. Ikincisinden sonra for each loop olustur icine datatype each:ilk
    // array variable name yaz. Daha sonra baska bir if olustur ve ikinci arrayList ismi.contains(each)
    //continue de ve sonra her bir elementi ekle
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,41,41));
        ArrayList<Integer> removeDuplicate=new ArrayList<>();
        for(Integer each:numbers){
            if(removeDuplicate.contains(each)){
                continue;
            }
            removeDuplicate.add(each);
            System.out.println(removeDuplicate);
        }

    }
}
