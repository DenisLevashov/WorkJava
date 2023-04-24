package HomeWork1;

import java.util.Random;
import java.util.Arrays;

  

public class work1 {
    public static void main(String[] args){
        //Выбросить случайное целое число в диапазоне от 0 до 200 и сохранить в i
        int i;
        Random random = new Random();
        i = random.nextInt(200);
        System.out.println("i="+i);

        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = high_bit(i);
        System.out.println(n);
        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int m1[] = new int[(Short.MAX_VALUE/n)];

        int count = 0;  
        while (i <  Short.MAX_VALUE ) {
            if (i % n == 0){
                m1[count] = i;
                count ++;
                i += n;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(m1)); 
         //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
         int m2[] = new int[((-Short.MIN_VALUE) + i) - ((-Short.MIN_VALUE) + i)/n];
         int j = Short.MIN_VALUE;
  
         count = 0;
         while (j <= i){
             if (j%n != 0){
                 m2[count] = j;
                 count ++;
                 j++;
             }
             else{
                 j ++;
             }
         }
         System.out.println(Arrays.toString(m2));

        
    }
    public static int high_bit(int x) {
        int t = 1;
        if (x >= t << 8) t <<= 8; 
        if (x >= t << 4) t <<= 4;
        if (x >= t << 2) t <<= 2;
        if (x >= t << 1) t <<= 1;
        return t;
     }
    
}
