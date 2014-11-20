package org.gradle;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
@Test
public class PersonTest {
   
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
        assertEquals("Boolean test", true, false);
        System.out.println("Test complete!!");
    }
}
