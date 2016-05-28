package learn.design.design_patterns.decorator.ex1;

import java.util.Comparator;

public class PersonComparatorDecorator implements Comparator<Person>{
	
	private Comparator<Person> comparator;
	private PersonComparatorDecorator nextComparator;

	public PersonComparatorDecorator(Comparator<Person> comparator, PersonComparatorDecorator nextComparator) {
		super();
		this.comparator = comparator;
		this.nextComparator = nextComparator;
	}

	public int compare(Person p1, Person p2) {
		int compareResult = comparator.compare(p1, p2); 
		
		if(compareResult != 0)
			return compareResult; 
	
		if(nextComparator != null)
			return nextComparator.compare(p1, p2);
		
		return compareResult;
	}
	
}
