package streamApi;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=Arrays.asList("Ravi","Pritam","rahul","Monu");
		ArrayList<String> list=new ArrayList<>();
		
		list.addAll(name);
		System.out.println(name);
		List<String>grace5=name.stream().map(mark->mark.toUpperCase()).toList();
		System.out.println(grace5);
		
	}

}
