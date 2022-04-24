package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class MethodsInArrayAndArrayList {
    public static void main(String[] args) {
        //arraylist lerde arraylistvariablename.add(), set(),get(),removeIf(),indexOf(data),lasIndexOf(),
        // contains(),size(),clear(), remove(loop icinde kullanilmaz) metotlari vardir.
        //add(data) ya da add(index,data)seklinde olur ve get(index) returns the element at given
        // index with the new element.This method is similar to charAt() in String
        //set(index,data): It replaces the element at given index with the new element. This method is
        //similar to replace method in String
        //remove da parantez icinde ya index number ya da data yazilir. Ayni data dan birden fazla ise
        //sadece ilkini cikarir ve clear() removes everything, so you dont have to write anyhing inside
        // paranthesis ve contains() method checks whether the specific character includes in ArrayList
        //contains method return boolean
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);
            
        }
        System.out.println(numbers);

        }
        //Every time when the new keyword is used, it creates a new object in heap.
    // Yani iki tane new yazan arraylist olusturdugumda == isaretine kullandigimda ayni verilerde olsa
    // birbirine esit olmaz cunku her new demek her defasinda heap java memory de yeni bir nesne
    // olustur demektir. Ama equals yazarsam new ile olusturulsa da birbirine esit olur.
    //isEmpty() Method: This method checks whether the size is zero. If the size is zero,
    // this method returns you true
    //•	Bulk Operations are only for collection types and any collection types can have bulk operations which
    // allows multiple elements to add or remove.•	containsAll Method, addAll() Method, removesAll() Method and
    // retainsAll() Method are bulk operations. toArray() arraylisti Arraye cevirmek icin kullanilir
    //Array Method: Arrays.sort(variable name) seklinde kullanilir ve it sorts the array in ascending
    //order meaning smallest to largest,equals() method: In equals method, there are two arguments
    // which are first and second array in parenthesis This method compares the element of those
    //elements index by indexes. If all elements match, it is going to return you true
    //•	Equal() method always returns boolean
    //Array de println icine variable name yazarsam konsolda goremem o yuzden println icine
    // Arrays.toString(variable name) yazmaliyim and this is to print the whole array.Eger sadece
    // ozel bir data yazmak istersem println icine arrayvariablename[ozel olarak istenen data]
    // yazmaliyim.This is to print the element of array.toString converts the single dimensional array
    //object to String
    //copyOf() method: It is used for copying of one element into another array. If you want to copy
    // the element from the beginning till the specific element, it is used this method. Verilen array
    // degerlerinden  en bastan baslayip hangi degere kadar yazmak istersem onun sayisini verdigimde
    // bu metot kullanilir. copyOf(arrayvariable name, hangi degere kadar ifade etmek istiyorsam o
    // sayi )seklinde kullanilir.
    //copyOfRange() Method: Verilen array de en bastan degilde istedigim degerden baslamak istersem
    // bu metotu kullanirim.
    // Arrays.copyOfRange(variable name, beginning index, endingindex) Degerler saymaya sifirdan
    // baslar ve son yazdigim sayiya karsilik gelen ifade exclude dahil edilmez bu acidan substring
    // metoduna benzer.copyOfRange() method copies the element starting index till the end index and
    // ending index is always excluded, so this method is similar to substring




        }



