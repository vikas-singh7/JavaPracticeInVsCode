import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthanes {
    static void printAll(int n){
        boolean arr[]= new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j+=i){
                arr[j]=false;
            }
        }
        for(int i=0;i<n;i++)
            if(arr[i])
                System.out.println(i);
    }
    public static void main(String[] args) {
        printAll(100);
    }
}