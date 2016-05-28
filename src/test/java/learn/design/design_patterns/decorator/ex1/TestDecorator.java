package learn.design.design_patterns.decorator.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class TestDecorator {

	@Test
	public void testComparator() {
		Person p1 = new Person("First1", "Last1", 1);
		Person p2 = new Person("First2", "Last2", 1);
		Person p3 = new Person("First1", "Last1", 2);
		Person p4 = new Person("First1", "Last2", 1);
		PersonComparatorDecorator comparatorLastName = new PersonComparatorDecorator(new PersonLastNameComparator(), null);
		PersonComparatorDecorator comparatorFirstName = new PersonComparatorDecorator(new PersonFirstNameComparator(), comparatorLastName);
		PersonComparatorDecorator comparatorAge = new PersonComparatorDecorator(new PersonAgeComparator(), comparatorFirstName);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Collections.sort(list, comparatorAge);
		Assert.assertEquals(p1, list.get(0));
		Assert.assertEquals(p4, list.get(1));
	}

}
