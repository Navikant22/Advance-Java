package streamApi;
import java.util.*;
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,15,20,25,30,11,17,16,55,54,67);
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(numbers);
		list.stream().filter(n->n>=50&&n<=60).forEach(n->System.out.println(n+" "));
		
	}

}
