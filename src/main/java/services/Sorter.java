package services;

import model.Algorithm;
import model.Student;

import java.util.List;

public class Sorter {

    private static long start;

    public static void sort(List<Student> students, String algorithm) {

        switch (Algorithm.valueOf(algorithm)) {
            case BUBBLE:
                bubbleSort(students);
                break;
            case HEAP:
                heapSort(students);
                break;
            case MERGE:
                mergeSort(students);
                break;
        }

        //ask if want to print to file
    }

    private static void mergeSort(List<Student> students) {
        start = System.nanoTime();

        printTime(start, System.nanoTime());
    }

    private static void heapSort(List<Student> students) {
        start = System.nanoTime();

        printTime(start, System.nanoTime());
    }

    private static void bubbleSort(List<Student> students) {
        start = System.nanoTime();
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getScore() > students.get(j + 1).getScore()) {
                    String tempName = students.get(j).getName();
                    float tempScore = students.get(j).getScore();
                    students.get(j).changeTo(students.get(j + 1).getName(), students.get(j + 1).getScore());
                    students.get(j + 1).changeTo(tempName, tempScore);
                }
            }
        }
        printTime(start, System.nanoTime());
        for (Student s : students) {
            System.out.printf("%s\t%.2f\n", s.getName(), s.getScore());
        }
    }

    private static void printTime(long start, long now) {
        System.out.printf("Elapsed time: %d nanoseconds \n", (now - start));
    }
}
