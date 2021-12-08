package java8;

import java.util.Arrays;
import java.util.List;

public class myMain {
public static void main(final String[] args) {
List<String> list = Arrays.asList("Ross", "Lilly", "lotus");
System.out.print("List = "+list);
System.out.print("\nUppercase strings = ");
list.stream().map(Flowers -> Flowers.toUpperCase()) .forEach(Flowers -> System.out.print(Flowers + " "));
}
}



