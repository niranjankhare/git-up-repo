package org.gradle;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
@Test
public class PersonTest1 {
   
	@Test (priority = 2)
    public void canConstructAPersonWithAName1() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
        assertEquals("Boolean test", true, false);
        System.out.println("Test complete!!");
    }
	@Test (priority = 1)
    public void canConstructAPersonWithAName2() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
//        assertEquals("Boolean test", true, false);
        System.out.println("Test complete!!");
    }
}
