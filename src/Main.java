import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 8, 11, 10, 4,12));
        List<Integer> i = integers.stream().filter(x -> (x % 2) == 0).collect(Collectors.toList());
        System.out.println(i);
        System.out.println(i.stream().map(x -> x * x).collect(Collectors.toList()));
        System.out.println(i.stream().map(x -> x * x).max(Integer::compareTo));

    }}