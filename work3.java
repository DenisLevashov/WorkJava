package HomeWork1;
import java.util.*;

public class work3 {
    public static void main(String[] args){
        //1 Реализовать алгоритм обратной сортировки списков компаратором.
                System.out.println("1. Реализовать алгоритм обратной сортировки списков компаратором.");        
                ArrayList<Integer> list_to_sort = new ArrayList<>();
                for (int i=0;i<30;i++) {
                    list_to_sort.add(new Random().nextInt(25)); 
                }
                System.out.println("before sort = " + list_to_sort);
        
                list_to_sort.sort(Comparator.reverseOrder());
                // list_to_sort.sort(new Comparator<Integer>() {
                //     @Override
                //     public int compare(Integer o1, Integer o2) {
                //         //if (o1%2 != 0) return 1;
                //         //if (o2%2 != 0) return 0;
                //         return -1;  // o2 - o1
                //     }
                // });
                System.out.println("after sort = " + list_to_sort);
        
        
        //2   Пусть дан произвольный список целых чисел, удалить из него чётные числа
                System.out.println("\n" + "2 Пусть дан произвольный список целых чисел, удалить из него чётные числа");
                ArrayList<Integer> list2 = new ArrayList<>();
                // generate rand list of integers 
                for (int i=0;i<30;i++) {
                    list2.add(new Random().nextInt(25)); 
                //list2.add(1);
                }
                System.out.println(list2);
        
                // remove even numbers using iterator
                Iterator<Integer> iterator = list2.iterator();
                while (iterator.hasNext()){
                    int n = iterator.next();
                    if (n % 2 == 0){
                        iterator.remove();
                    }
                }
                System.out.println("without evens: " + list2);
        
        //3 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
                System.out.println("\n" + "3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.");
                int min = list2.get(0);
                int max = min;
                double arifm_mean = .0;
                int sum = 0;
                System.out.println("our list is = " + list2);
                for (int n: list2) {
                        sum = sum + n;
                        if (n > max) max =n;
                        if (n<min) min =n;
                     }
                arifm_mean = (double)sum / list2.size();
                System.out.println("min= " + min + ", max = " + max);
                System.out.println("arifmetic mean = " +  arifm_mean);
        
        //4 Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
                System.out.println("\n" + "4 Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.");
                ArrayList<Integer> list3 = new ArrayList<>();
                List<Integer> list_intersection = new ArrayList<Integer>(list2);
        // generate rand list of integers 
                for (int i=0;i<5;i++) {
                    list3.add(new Random().nextInt(25)); 
                //list2.add(1);
                }
                System.out.println("first list = " + list2);
                System.out.println("second list = " + list3);
                list_intersection.retainAll(list3);
                //System.out.println("intersection1 = " + list_intersection);
                list2.removeAll(list_intersection);
                list3.removeAll(list_intersection);
                list2.addAll(list3);
                System.out.println("union of lists without intersection: " + list2);
                
        
        //5 Создать ArrayList <Integer> и добавить нулевым эллементом ноль 10000 раз.                 
                System.out.println("\n" + "5 Создать ArrayList <Integer> и добавить нулевым эллементом ноль 10000 раз.");
        //make 10000 zeros. 
                long begin =  System.currentTimeMillis();
                for (int i=0;i<10000;i++) {
                    list2.add(0, 0);
                }
                long end =  System.currentTimeMillis();
                //System.out.println("list + 10000 zeros in the begin! = " + list2); 
        
        //6 Повторить пятый пункт но с LinkedList.
                
                LinkedList<Integer> linked_array = new LinkedList<>();
                linked_array.add(1);
                long begin_linked =  System.currentTimeMillis();
                for (int i=0;i<10000;i++) {
                    linked_array.add(0,0);
                }
                long end_linked =  System.currentTimeMillis();
                //System.out.println("list + 10000 zeros in the begin! = " + linked_array); 
                
        //7 Сравнить время работы пятого и шестого пунктов.
                System.out.println("\n 7. Сравнить время работы пятого и шестого пунктов.");
                System.out.println("point 5 (add 10000 zeros) takes " + (end-begin) + " millisec");
                System.out.println("point 6 with same as 5 with linked_lists takes " + (end_linked-begin_linked) + " millisec");
            }
}
