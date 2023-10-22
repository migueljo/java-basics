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

		List list3 = new ArrayList<Date>();
		List<Date> ld3 = list;

		Collection<Date> cd1 = new ArrayList<Date>();
		List<Date> ld1 = (List<Date>) cd;

		Collection<Date> cd2 = new TreeSet<Date>();
		List<Date> ld4 = (List<Date>) cd;
		ld.add(new Date());

		Object o = new ArrayList<String>();
		List<Date> ld5 = (List<Date>) o;
		// Date d = ld5.add(0); // This will throw error
	}

	public static void collectionsToArrays() {

	}
}

class Employee {
	String name = "Employee name";
}

// Generics can be bound to a specific Class and its subtypes
class Bounded<E extends Date> {
	public void addElement(Date element) {}
}
