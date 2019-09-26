/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author TANKISO
 */
public class LineCounter {

    public static void main(String[] args) throws IOException {
        //printing the results from the method
        System.out.println("Total number of lines in a source file: " + getLines());

    }

    //method to count lines of code
    public static int getLines() throws IOException {

        //counting lines from Test2 source file
        FileReader fr = new FileReader("C:\\Users\\RESHOKETSE\\Documents\\T\\Test2.txt");
        BufferedReader br = new BufferedReader(fr);

        //Creating local variable and initializing i
        int i = 0;
        boolean isSouceCode = false;

        do {
            String t = br.readLine();
            if (t != null) {
                isSouceCode = true;
                t = t.replaceAll("//|/*|\\t|\\s", "");

                if ((!t.equals("")) && (!t.startsWith("//"))) {
                    //incrementing i by 1
                    i = i + 1;
                }
            } else {
                isSouceCode = false;
            }
        } while (isSouceCode);
        //closing FileReader and BufferedReader
        br.close();
        fr.close();
        return i;
    }

}
