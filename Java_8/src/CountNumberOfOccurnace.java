import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CountNumberOfOccurnace {

	public static void main(String[] args) {
		
		List<String> wordsCount = Arrays.asList("Apple", "Banna", "Mango", "Apple");
		ConcurrentMap<String, Integer> wordMap = wordsCount.stream()
				
				.collect(Collectors.toConcurrentMap(w->w,w->1, Integer:: sum));
		System.out.println(wordMap);
		
		
		
	}
}
