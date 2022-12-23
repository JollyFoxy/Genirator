import static java.lang.Math.random;

public class StrGen {
    public void gen (int lstr){

        String abc ="ABCDEFGHIJKLMNOPQRTUVWXYZabcdefghijklmnopqrtuvwxyz";
        for (int i= lstr; i>=0; i-=1) {
            int index = (int) (random() * abc.length());
            System.out.print(abc.charAt(index));
        }
    }
}
