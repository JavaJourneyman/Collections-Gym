import java.util.*;

/**
 * Created by yusufjones on 2/3/16.
 */
public class Collections {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();//Stores a collection of items. Add or delete and change size.
        stringList.add("Item 1");
        stringList.add("Item 2");
        for (int i = 0; i < stringList.size(); i++) {//Access items in List with get
            System.out.println(stringList.get(i));
            }

        //**** Sets are like lists, except they can only have unique values and you access, and iterate oer them differently
        Set<String> stringSet = new HashSet<String>();//HashSet is one concrete implementation of Set that can only contain uniqie calues and is iterated differently.
        stringSet.add("Item 1");
        stringSet.add("Item 2");

        TreeSet<String> treeSet = new TreeSet<String>();/*Tree will sort according to natural order and can only hae
        //https://docs.oracle.com/javase/7/docs/api/java/util/Map.html*/
        treeSet.add("Value 2");
        treeSet.add("Value 1");
        for (String s : stringSet) {//There is no index in a Set
            System.out.println(s);
        }

        //****** Maps store key value pairs, like associateive arrays i nJavascript
        HashMap<Integer, String> map = new HashMap<Integer, String>();/*Stores key/value pairs with no sorting.
        //https://docs.oracle.com/javase/7/docs/api/java/util/Map.html*/
        map.put(2, "Value 2");//May return the order or may not when iterated.
        map.put(1, "Value 1");


        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();/*Maintains the order of data as entered.*/
        map2.put(2, "Value 2");
        map2.put(1, "Value 1");


        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();/*TreeMap will sort based on the key.
        //https://docs.oracle.com/javase/7/docs/api/java/util/Map.html*/
        map3.put(2, "Value 2");
        map3.put(1, "Value 1");

        printMap(map);
        printMap(map2);
        printMap(map3);
    }
        public static void printMap(Map<Integer, String>  map){//< Polymorphism because as long as the parameter extend Map > map

            for(Integer i : map.keySet()){
                System.out.println(map.get(i));
         }
    }
}
