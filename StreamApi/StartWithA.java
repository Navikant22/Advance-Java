package streamApi;
import java.util.*;
public class PrintStartWithA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers=Arrays.asList("Amit","Ravi","Anil","Vikas","Rahul");
		ArrayList<String> list=new ArrayList<>();
		list.addAll(numbers);
		list.stream().filter(n->n.startsWith("A")).forEach(n->System.out.println(n+" "));
		
	}
}
