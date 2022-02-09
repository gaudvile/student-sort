package services;

import model.Student;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Test
    public void readFileTest() throws IOException {

        FileReader reader = new FileReader();

        List<Student> students = reader.readFile("src/test/resources/input.txt");
        assertEquals("Student3", students.get(2).getName());
        assertEquals(6.5, students.get(1).getScore(), 0.09);
    }

}
