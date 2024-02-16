import kotlin.text.Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!");
        var ccc = Main2.class;
        var theInt = 123;
        var theString = "abcedf";
        // Some comment here

        new ArrayList<Integer>().stream().filter(x -> x > 0);

        printValue(fibonacci(1));




        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");

        var a = 1;
        var b = 2;
        var c = 3;

        var threads = new ArrayList<Thread>();
        for (int i = 1; i <= 5; i++) {
            threads.add(new Thread(worker(i)));
            threads.get(threads.size() - 1).start();
        }
        var tt = threads.get(0);
        for (var thread : threads) {
            thread.join();
            var d = "";
        }

        System.out.println("Bye bye!");
    }

    public static Runnable worker(int i) {
        return () -> {
            System.out.println(fibonacci(5 + i));
            try {
                while (true) {
                    Thread.sleep(1000);
                    System.out.println("Thread: " + i + ", time: " + System.currentTimeMillis());
                }
            } catch (Exception e) {

            }
        };
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    

    


    public static void printValue(int n) {
        System.out.println("Value: " + n);
    }
}