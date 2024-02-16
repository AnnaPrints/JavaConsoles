import io.javaoperatorsdk.operator.api.config.ExecutorServiceManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;

public class Main2 {
    public static void main(String[] args) throws InterruptedException, IOException {
//        printLines();
        bar(foo());
        throwExceptionLater();

        var buf = new BufferedReader(new InputStreamReader(System.in));
//        var socket = new ServerSocket(1234);
        while (true) {
            System.out.println("Enter your line:");
            var line = buf.readLine();
            System.out.println("Got the line: " + line);
            if (line == null || line.isBlank()) break;
        }
//        socket.close();
    }

    private static int foo() {
        return 1;
    }

    private static void bar(int x) {
        System.out.println(x);
    }

    private static void printLines() throws InterruptedException {
        var counter = 0;
        while (true) {
            System.out.println("Line " + counter);
            counter++;
            Thread.sleep(1000);
        }
    }

    private static void throwExceptionLater() {
        ExecutorServiceManager.instance().executorService().submit(() -> {
            new RuntimeException("Wow, such exception").printStackTrace();
        });
    }
}
