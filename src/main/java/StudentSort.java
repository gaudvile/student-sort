import services.FileReader;

import java.io.IOException;

import static model.Algorithm.isValidAlgorithm;
import static services.Sorter.sort;

public class StudentSort {
    public static void main(final String[] args) {

        FileReader reader = new FileReader();
        if (isValidAlgorithm(args[1])) {
            try {
                sort(reader.readFile(args[0]), args[1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("invalid sorting algorithm name");
        }
    }
}
