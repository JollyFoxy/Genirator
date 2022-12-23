import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("чего изволите???\nбукавы аль циферы???");
        String wg = scanner.nextLine();

        switch (wg){
            case ("букавы"):
                System.out.println("Склоько буков изволите");
                int lstr = scanner.nextInt();
                StrGen strGen =new StrGen();
                strGen.gen(lstr);
                break;
            case ("циферы"):
                System.out.println("Склоько цивер изволите");
                int s = scanner.nextInt();
                IntGen intGen = new IntGen();
                intGen.gena(s);
                break;
        }
    }
}