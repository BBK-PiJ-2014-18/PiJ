package mondayLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
//import java.util.function.Consumer;

public class Friends {
	
	public static void main(String[] args) {
		
		final List<String> friends = Arrays.asList("John", "Kevin", "Barry", "Brian");
		
//		for (String s : friends)
//			System.out.println(s);
		
//		Consumer c = new MyConsumer();
//
//		friends.forEach(new Consumer() {
//			@Override
//			public void accept(Object o) {
//				System.out.println(o);
//			}
//		});
	
//		friends.forEach(s -> System.out.println(s));
//		friends.forEach(System.out::println);
		
		List<String> uc = new ArrayList<>();
//		for (String name :friends) {
//			uc.add(name.toUpperCase());
//		}
		
//		friends.forEach(name -> uc.add(name.toUpperCase()));
		

//		
//		uc = friends.stream()
//			.map(name -> name.toUpperCase())
//			.collect(Collectors.toList());

		
//		Function<String, String> f = x -> (x.toUpperCase());  //	String::toUpperCase
//		
//		BiFunction<Integer, Integer, Integer> add = (a,b) -> a + b;
//		
//		System.out.println(f);
//		uc = friends.stream()
//				.map(f)
//				.collect(Collectors.toList());
//	
//		System.out.println(friends);
//		System.out.println(uc);
		
//		List<String> b = 
//				friends.stream()
//					.filter(x -> x.startsWith("B"))
//				.collect(Collectors.toList());
//		
//		System.out.println(b);

		Optional<String> firstItem = 
				friends.stream()
					.filter(x -> x.startsWith("Z"))
				.findFirst();
		
		System.out.println(firstItem.orElse("not present"));

		
		
		
	}

}
/*
class MyConsumer implements Consumer {
	
	@Override
	public void accept(Object o) {
		System.out.println(o);
	}
}
*/