package streamApi;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int empid;
	String name;
	String dptp;
	public Employee(int empid, String name, String dptp) {
		super();
		this.empid = empid;
		this.name = name;
		this.dptp = dptp;
	}
}
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Ankit","CSE"));
		list.add(new Employee(1,"Rahul","MCA"));
		System.out.println(list);
		List<String> empName=list.stream().map(map->map.name).toList();
		System.out.println(empName);

	}

}
