package streamApi;

import java.util.Arrays;
import java.util.List;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=Arrays.asList("A","B","C");
		System.out.println(list);
		List<String> s=list.stream().map(n->"item"+n).toList();
		System.out.println(s);
		
	}

}
