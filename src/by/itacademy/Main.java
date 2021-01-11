package by.itacademy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

      /*  List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> list2 = list.stream()
                .sorted()//Сортируем примитивные если объект то используем Comparator
                .skip(2)//пропускаем два элемента
                .limit(6)//Показывает до указанного элемента
                .distinct()//Вернется набор элементов без дубликатов
                .peek(e -> System.out.println("Значение: " + e))//Выполняем промежуточную операцию
                .map(n -> n+1)// каждый элемент увеличиваем на единицу
                .filter(n -> n%2 == 0)//Оставляем четные
                .collect(Collectors.toList());
*/
    int[] ints = {1,2,3,4};
    List<Integer> x = Arrays.stream(ints)
            .filter(n -> n%2 ==0)
            .boxed()
            .collect(Collectors.toList());
    
        System.out.println(x);





    }


}
