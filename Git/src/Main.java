import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//Exercitiul 1

        //Runnable runnable = () -> System.out.println("Hello, World!");
       // runnable.run();
//Exercitiu 2

        //Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

//Exercitiul 3

        //Function<String, Integer> function = s -> s.length();

//Exercitiu 4

        //BiPredicate<String, String> biPredicate = (s1, s2) -> s1.length() > s2.length();

//Exercitiu 5

       // UnaryOperator<Integer> unaryOperator = x -> x * x;

//Exercitiu 6

      //  BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

//Exercitiu 7

        //List<String> list = Arrays.asList("apple", "banana", "cherry");
        //list.sort((s1, s2) -> s2.compareTo(s1));

        //Exercitiu 1

        //List<String> list = Arrays.asList("apple", "banana", "cherry");
        //List<String> upperCaseList = list.stream()
          //      .map(String::toUpperCase)
            //    .collect(Collectors.toList());

        //Exercitiu 2

       // List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //List<Integer> squaredOdds = integers.stream()
          //      .filter(x -> x % 2 != 0)
            //    .map(x -> x * x)
              //  .collect(Collectors.toList());

//Exercitiu 3

       // List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //Optional<Integer> max = integers.stream()
          //      .max(Integer::compareTo);

//Exercitiu 4

        //List<Integer> integers = Arrays.asList(1, 2, 3, 4, 6);
        //int sum = integers.stream()
          //      .mapToInt(Integer::intValue)
            //    .sum();

//Exercitiu 5

       // List<Integer> integers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        //List<Integer> uniqueIntegers = integers.stream()
          //      .distinct()
            //    .collect(Collectors.toList());
        
    }
}