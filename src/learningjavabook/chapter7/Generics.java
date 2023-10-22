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

		List list1 = new ArrayList<Date>();
		List<Date> list2 = new ArrayList<>();

		Collection<Date> cd;
		List<Date> ld = new ArrayList<>();
		cd = ld;

		List<Object> lo;
		List<Date> ld2 = new ArrayList<Date>();
		// lo = ld2; // This will throw an error

		Collection<Number> cn;
		List<Integer> li = new ArrayList<>();
		// cn = li; // This will throw - incompatible types
	}
}

class Employee {
	String name = "Employee name";
}

// Generics can be bound to a specific Class and its subtypes
class Bounded<E extends Date> {
	public void addElement(Date element) {}
}
