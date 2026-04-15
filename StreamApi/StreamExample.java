package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10,15,20,25,30,11,17,16);
		//List data=List.of(23,34,56,79,89)
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(data);
//		list.addAll(list);
		System.out.println("Even Number");
		data.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
	}

}
