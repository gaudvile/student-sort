package services;

import model.Student;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<Student> readFile(String filename) throws IOException {
        List<Student> students = new ArrayList<Student>();
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        while ((line = reader.readLine()) != null) {
            String[] student = line.split(",");
            students.add(new Student(student[0], Float.parseFloat(student[1])));
        }
        reader.close();
        return students;
    }
}
