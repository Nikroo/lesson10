package by.itacademy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Конвеерные операторы

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
    int[] ints = {1,2,3,4,5,6,7,8,9,10,11};

    //Терминальные операторы

    IntStream stream = Arrays.stream(ints);
        OptionalInt opt = stream.findAny(); //Возвращает любое значение из колеекции, для Int возвращает первое значение.

        if(opt.isPresent()){
            System.out.println(opt.getAsInt()); //Проверяем объект на null
        }









    }


}
