import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution01 {

    public static void main(String[] args) {

        String filePath = "C:/Users/satya/Desktop/data.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                // split by comma
                String[] values = line.split(",");
                for (String v : values) {
                    System.out.print(v + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
