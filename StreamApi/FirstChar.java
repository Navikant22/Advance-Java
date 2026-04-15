package streamApi;

import java.util.Arrays;
import java.util.List;

public class FirstChar_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Java","Python","c");
		System.out.println(list);
		List<Character>first=list.stream().map(n->n.charAt(0)).toList();
		System.out.println(first);
	}

}
