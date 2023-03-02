import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(224);
        list.add(941);
        list.add(111);

        list.add(44448);
        list.add(55552);

        System.out.println(findMinMax(list));
printEvenIntFromList(list);

    }

    public static ArrayList<Object> findMinMax(ArrayList<Integer> e) {
        Optional<Integer> max = e.stream().max(Integer::compare);
        Optional<Integer> min = e.stream().min((Integer::compare));
        ArrayList<Object> newList = new ArrayList<>();
        newList.add(min);
        newList.add(max);
        return newList;


    }

    public static void printEvenIntFromList(ArrayList<Integer> list) {
        System.out.println(list.stream()
                .filter(num -> num % 2 == 0)
                .count());
    }
}
