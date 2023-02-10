import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = " Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.";

        final int sub = s.length()/2;
        String [] parts = { s.substring(0, sub), s.substring(sub)};
            System.out.println(parts[0]);
            System.out.println(parts[1]);
        }
    }