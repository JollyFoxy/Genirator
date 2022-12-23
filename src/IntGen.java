public class IntGen {
    public void gena(int s){
        for (int i = s; i >= 0; i-=1){
            int ch = (int) (Math.random()*9);
            System.out.print(ch);
        }
    }
}
