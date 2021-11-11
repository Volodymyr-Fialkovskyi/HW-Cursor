package HW13;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Cursor_HW11/src/HW11/HWIO.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("Cursor_HW11/src/HW11/HWIOC.txt"));

        String string;
        while ((string = input.readLine()) != null) output.write(string + "\n");

        input.close();
        output.close();
    }
}