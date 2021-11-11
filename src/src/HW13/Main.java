package HW13;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("HW-Cursor/blob/main/src/HW13/HWIO.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("HW-Cursor/blob/main/src/HW13/HWIOCOPY.txt"));

        String string;
        while ((string = input.readLine()) != null) {
            output.write(string + "\n");
        }

        input.close();
        output.close();
    }
}