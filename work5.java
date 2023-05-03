package HomeWork1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.text.html.HTMLDocument.Iterator;

public class work5 {
    public static void main(String[] args){
        // Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения. 
                HashMap<String, String> map = new HashMap<>();
                map.put("один","one");
                map.put("два","two");
                map.put("три","three");
                map.put("четыре","four");
                map.put("пять","five");
                map.put("шесть","six");
                System.out.println("created dict: " + map);
        //Добавить ко всем значениям символ "!".
            for(String key: map.keySet()){ 
                map.compute(key, (k,v) -> v+"!"); // ко всем значения добавляем ~ в начале
            }
            System.out.println("add '!' to every value: " + map);
        
        //Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
            HashMap<String, String> map2 = new HashMap<>(); // Franch language
            map2.put("четыре","quatre");
            map2.put("пять","cinq");
            map2.put("шесть","six");
            map2.put("семь","sept");
            map2.put("восемь","huit");
            map2.put("девять","neuf");    
            System.out.println("second dict: " + map2);
        
        // Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.
        // Как я понял:
        //1. Создаем третье множество, в котором есть только ключи присутствующие в 1м и 2м множестве.
        // А значения по этим ключам - конкатенация строк 1го и второго значения 
        // сделал чуть вольную конкатенацию - в скобках второе значение добавил 
            HashMap<String, String> map_map2 = new HashMap<>();
            //map_map2.putAll(map);
            //System.out.println("combined_map: " + map_map2);
            for(String key: map.keySet()){
                if (map2.containsKey(key)){
                    //System.out.println("Есть ключ!:" + key + map2.get(key));
                    map_map2.put(key,map.get(key));
                    map_map2.merge(key, "(" + map2.get(key) +")", String::concat); //добавляем "." к уже имеющиммся значениям.
                }
            }
            System.out.println("combined_map: " + map_map2);
            }
}
