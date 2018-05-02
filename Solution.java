import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Solution {

	public static void main (String args[]){
		countWords("This is a statement, and so is this");
	}

	public static void countWords(String sentence) {
		List <String> list = Stream.of(sentence).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());

		Map <String, Integer > wordCounter = list.stream()
				.collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum,LinkedHashMap::new));

		System.out.println(wordCounter);
	}

}
