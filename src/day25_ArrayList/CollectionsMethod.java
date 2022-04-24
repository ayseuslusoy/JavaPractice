package day25_ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class CollectionsMethod {//Collection metotlari Collections.sort() sayilari asagidan yukariya

    //siralamak icin kullanilir, Collections.reverse(), Collections.max(), Collections.min(),
    // Collections.frequency(arraylist name, data), Collections.replaceAll(arraylistname, old value, new value),
    //Collections.swap(arraylist name, yerlerini degistirecegim index number, index number) kullanilir
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40,10,20));
        Collections.swap(list1,3,2);
        System.out.println(list1);
        Collections.replaceAll(list1,10,100);
        System.out.println(list1);


    }
}