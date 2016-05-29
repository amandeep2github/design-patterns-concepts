package learn.design.design_patterns.chainofresponsibility.ex1;

public class PersonFirstNameComparator extends AbstractPersonComparator {

	public int compare(Person p1, Person p2) {
		int fnDiff = p1.getFirstName().compareTo(p2.getFirstName());
		
		return checkAndCallNext(p1, p2, fnDiff);
	
	}
}
