package ru.lesson.lessons;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractRunner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calc = new Calculator();
        String stop = "no";
        try {
            while (!stop.equalsIgnoreCase(  "yes")) {
                System.out.println("Please, enter the first parameter:");
                int param1 = Integer.parseInt(reader.readLine());
                System.out.println("Please, enter the first parameter:");
                int param2 = Integer.parseInt(reader.readLine());
                calc.summ(param1, param2);
                System.out.println("Summ is :" + calc.getResult() );
                System.out.println("Do you want to exit? Yes/No");
                stop = reader.readLine();
            }
        }
        finally {
            reader.close();
        }

    }




}
