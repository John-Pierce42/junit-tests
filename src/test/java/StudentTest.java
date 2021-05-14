
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    public void testIfStudentClassIsCreated() {
        Students john = new Students(1L, "john");
    assertEquals(1L,john.getId());
    assertEquals("john", john.getName());
    }


//    @Test
//    public void testGetId(){
//      long actualId = 1;
//      long expected = 1;
//    assertEquals(expected, actualId);
//
//    }
//
//    @Test
//    public void testGetName(){
//        String expected = "John";
//        String actual = "John";
//
//        assertEquals(expected,actual);
//
//    }
//
    @Test
    public void TestAddGrade(){
        Students john = new Students(1L, "john");
        john.addGrade(100);
        john.addGrade(90);
    }

    @Test
    public void testIfGradesWork(){
        Students john = new Students(1L, "john");
        john.addGrade(100);
        john.addGrade(90);
        assertSame(90, john.getGrades().get(0));
        assertSame(90, john.getGrades().get(1));
    }

}
