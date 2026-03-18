package streamApi;
import java.util.*;
public class EvenNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,15,20,25,30,11,17,16);
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(numbers);
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n+" "));
		
	}

}
