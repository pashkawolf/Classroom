import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Rafael","Silva",30,'M');
	@Test
	public void testConstructor() {
		Person p = new Person("Rafael","Silva",30,'M');
		p.setFirstName("Julian");
		assertEquals(p.getFirstName().equals("Julian"),true);
		assertTrue(p.getFirstName().equals("Julian"));
		assertEquals(p.getFirstName(), "Julian");
		
	}
	
	@Test
	public void testAge() {
		p.setAge(10);
		assertEquals(p.getAge(),10);
		
	}
	
}
