package learn.design.design_patterns.chainofresponsibility.ex1;

import java.util.Comparator;

public abstract class AbstractPersonComparator implements Comparator<Person> {
private Comparator<Person> nextComparator;
	
	public void setNextComparator(Comparator<Person> nextComparator) {
		this.nextComparator = nextComparator;
	}

	public Comparator<Person> getNextComparator() {
		return nextComparator;
	}

	protected int checkAndCallNext(Person p1, Person p2, int compareDiff) {
		if (compareDiff != 0)
			return compareDiff;
	
		if (getNextComparator() != null)
			return getNextComparator().compare(p1, p2);
	
		return compareDiff;
	}

	
	
	
}
