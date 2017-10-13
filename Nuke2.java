package Rui;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Rui on 10/12/2017.
 */
public class Nuke2 {
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputString;

        keyboard = new BufferedReader(new InputStreamReader(System.in));
        inputString = keyboard.readLine();

        String outString;

        outString = inputString.substring(0,1)+inputString.substring(2);
        System.out.println(outString);
    }
}
