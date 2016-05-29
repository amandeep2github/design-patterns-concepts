package learn.design.design_patterns.chainofresponsibility.ex1;

public class PersonLastNameComparator extends AbstractPersonComparator {

	public int compare(Person p1, Person p2) {
		int lnDiff = p1.getLastName().compareTo(p2.getLastName()); 
		return checkAndCallNext(p1, p2, lnDiff);
	}

}
