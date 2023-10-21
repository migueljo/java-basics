package learningjavabook.chapter7;

import java.util.*;

public class Generics {
	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hello");
		String number1 = listOfStrings.get(0);

		//////////////////////
		Map<Integer, Employee> employeesMap = new HashMap<>();
		Employee bob = new Employee();
		Integer bobsId = 314; // This is autoboxing :o
		employeesMap.put(bobsId, bob);

		System.out.println(employeesMap);
		Employee employee = employeesMap.get(bobsId);
		System.out.println(employee);

		List<Date> dateList = new ArrayList<>();
		System.out.println(dateList instanceof List);
		dateList.add(new Date());
		System.out.println(dateList instanceof List<Date>);

		List list = new ArrayList();
		list.add("Foo");
		list.add(200);
		String first = (String) list.get(1);
		// first.trim(); // This will throw
	}
}

class Employee {
	String name = "Employee name";
}