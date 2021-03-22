package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException{

        reversString();
    }

    public static void reversString() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] arr = s.split("");
        MyStack<String> list = new MyStack<>();

        for (int i = 0; i < arr.length; i++) {
            list.push(arr[i]);
        }
        System.out.println(list);
    }
}
