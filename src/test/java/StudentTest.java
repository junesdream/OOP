import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
@Test
void studentsAreEqual() {
    //GIVEN
    Student student1 = new Student("Jane", "Music", 1234567);
    Student student2 = new Student("Jane", "Music", 1234567);

    //WHEN
    //THEN
    assertEquals(student1, student2);
}
@Test
    void studentsAreNotEqual(){
    //GIVEN
    Student student1 = new Student("Jane", "Music", 1234567);
    Student student2 = new Student("John", "Sport", 7654321);

    //WHEN
    //THEN

    assertNotEquals(student1, student2);
}
}