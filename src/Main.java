import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int lstr = scanner.nextInt();
        StrGen strGen =new StrGen();
        strGen.gen(lstr);
    }
}