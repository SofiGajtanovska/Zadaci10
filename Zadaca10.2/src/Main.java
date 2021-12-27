import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x;
        String s = "";
        try {
            System.out.println("Внеси текст:");
            while ((x = System.in.read()) != 13)
                s += (char) x;
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
