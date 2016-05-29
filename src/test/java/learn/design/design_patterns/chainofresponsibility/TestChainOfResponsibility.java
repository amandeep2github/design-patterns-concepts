package learn.design.design_patterns.chainofresponsibility;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import learn.design.design_patterns.chainofresponsibility.ex1.Person;
import learn.design.design_patterns.chainofresponsibility.ex1.PersonAgeComparator;
import learn.design.design_patterns.chainofresponsibility.ex1.PersonFirstNameComparator;
import learn.design.design_patterns.chainofresponsibility.ex1.PersonLastNameComparator;


public class TestChainOfResponsibility {

	@Test
	public void testComparator() {
		Person p1 = new Person("First1", "Last1", 1);
		Person p2 = new Person("First2", "Last2", 1);
		Person p3 = new Person("First1", "Last1", 2);
		Person p4 = new Person("First1", "Last2", 1);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		PersonAgeComparator pAgeComp = new PersonAgeComparator();
		PersonFirstNameComparator pFNComp = new PersonFirstNameComparator();
		PersonLastNameComparator pLNComp = new PersonLastNameComparator();
		pAgeComp.setNextComparator(pFNComp);
		pFNComp.setNextComparator(pLNComp);
		Collections.sort(list, pAgeComp);
		System.out.println(list);
		Assert.assertEquals(p1, list.get(0));
		Assert.assertEquals(p4, list.get(1));
	}

}
