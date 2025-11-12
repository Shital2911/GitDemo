
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream_c {
//	@Test
	public void regular() {
//	count the number of names starting with alphabet A in the list.
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abheejit");
		names.add("Apsara");
		names.add("Don");
		names.add("Shital");
		names.add("vyas");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;

			}
		}
		System.out.println(count);
	}

//	@Test
	public void filterStream() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abheejit");
		names.add("Apsara");
		names.add("Don");
		names.add("Shital");
		names.add("vyas");

		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
//		there is no life of intermediate operation if there is no terminal operation
//		Terminal operation will only execute if intermediate option (only filter) return true
//		We can create stream
//		How to use filter in stream API
		long d = Stream.of("Abheejit", "Apsara", "Don", "Shital", "Vyas").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

//	@Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Man");
		names.add("Woman");
		names.add("Don");
//	print the name which have last letter "a" with upper case
		Stream.of("Abheejit", "Apsara", "Don", "Shital", "Vyas", "Ankita").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//		print the name which have first letter "a" and sorted

		List<String> names1 = Arrays.asList("Abheejit", "Apsara", "Don", "Shital", "Vyas", "Ankita");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		newStream.sorted().forEach(s -> System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Don"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Abheejit", "Apsara", "Don", "Shital", "Vyas", "Ankita")
				.filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));

		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
//	print unique no from this array
//		sort the array
//		values.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}
}
