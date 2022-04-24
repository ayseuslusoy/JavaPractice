package day25_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class UniqueCharacters {
    public static void main(String[] args) {
        String str="ABCDAESFGH";//String verilen bir degeri Arrayliste cevirirken
        // once diamond icine Arrays.asList sonra da parantez icine variablename.split metot kullan
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(str.split("")));
        System.out.println(list);
        String unique="";
        for(String each:list){
            int frequency=Collections.frequency(list, each);
            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println(unique);



    }
}
