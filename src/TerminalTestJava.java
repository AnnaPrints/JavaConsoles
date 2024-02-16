import java.io.IOException;

public class TerminalTestJava {
    public static void main(String[] args) throws IOException {
        // Sending ESC [ 6 n
        System.out.print("\033[6n");

        // Reading the response
        while(true){
            int b = System.in.read();
            // Break the loop if the response ends with 'R'
            if(b == 'R'){
                break;
            }
            System.out.print((char)b);
        }
    }
}
