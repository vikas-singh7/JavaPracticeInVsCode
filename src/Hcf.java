public class Hcf {
    static public int hcf(int a,int b){
        return b==0?a:hcf(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(hcf(10,15));
    }
}
