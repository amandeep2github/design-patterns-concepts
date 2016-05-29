package learn.design.design_patterns.chainofresponsibility.ex1;

public class PersonAgeComparator extends AbstractPersonComparator {

	public int compare(Person p1, Person p2) {
		int ageDiff = p1.getAge() - p2.getAge();
		return checkAndCallNext(p1, p2, ageDiff);
		
	}

}
