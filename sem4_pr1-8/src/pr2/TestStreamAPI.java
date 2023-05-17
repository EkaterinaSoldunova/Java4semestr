package pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// Фильтр по возрасту > 20
// Сортировка по последней букве имени
// Увеличение возраста каждого на 3
// Вычисление среднего возраста всех элементов

public class TestStreamAPI {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(25, "Mark", "T", LocalDate.of(1998,12,3), 45));
        list.add(new Human(18, "Kate", "B", LocalDate.of(2005,8, 28), 60));
        list.add(new Human(22, "Marta", "R", LocalDate.of(2001,1,18), 70));
        list.add(new Human(17, "Olga", "K", LocalDate.of(2006,10,20), 54));
        System.out.println(list);

        System.out.println();
        System.out.println("Фильтр по возрасту > 20");
        Stream<Human> stream = list.stream();
        stream.filter(i -> i.age > 20).forEach(System.out::println);

        System.out.println();
        System.out.println("Сортировка по последней букве имени");
        Stream<Human> stream1 = list.stream();
        stream1.sorted(Comparator.comparing(i->i.firstName.charAt(i.firstName.length()-1))).forEach(System.out::println);

        System.out.println();
        System.out.println("Увеличение возраста каждого на 3");
        Stream<Human> stream2 = list.stream();
        stream2.map(i->i.age+3).forEach(System.out::println);

        System.out.println();
        System.out.println("Вычисление среднего возраста всех элементов");
        Stream<Human> stream3 = list.stream();
        int s = stream3.mapToInt(i -> i.age).sum()/list.size();
        System.out.println(s);

    }
}
