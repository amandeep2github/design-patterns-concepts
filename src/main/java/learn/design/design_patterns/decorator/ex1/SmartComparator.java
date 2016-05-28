package learn.design.design_patterns.decorator.ex1;

import java.util.Comparator;

public class SmartComparator implements Comparator<Person> {
	
	private Comparator<Person> comparator;
	
	

	public SmartComparator(Comparator<Person> comparator) {
		super();
		this.comparator = comparator;
	}



	public int compare(Person p1, Person p2) {
		if(p1 == p2)
			return 0;
		return comparator.compare(p1, p2);
	}

}
