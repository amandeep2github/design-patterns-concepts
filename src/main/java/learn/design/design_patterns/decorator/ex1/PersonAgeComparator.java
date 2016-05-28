package learn.design.design_patterns.decorator.ex1;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}

}
