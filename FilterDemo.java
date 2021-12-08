package java8;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String args[]) {
	List<String> ls=Arrays.asList("Abc","","","abcde");
	long count =ls.stream().filter(s->s.isEmpty()).count();
	System.out.println(count);
	}
}
