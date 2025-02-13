package SpringBootTutorial.Tutorial_CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMethodBufferReader
{
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.println("Enter a Number ");
        int num = Integer.parseInt(input.readLine());
        System.out.println(num);

    }
}
