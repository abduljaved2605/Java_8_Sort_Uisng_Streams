
import java.util.stream.Collector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_sort {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("9", "A", "C");
		list.stream().sorted().collect(Collectors.toList());
		list.forEach(System.out :: println);
		
		
		
	}

}
