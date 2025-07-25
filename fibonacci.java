//sum of n fibannocci series.
public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        int fib1=0,fib2=1,fib3;
        int sum=0;
        System.out.print(fib1+","+fib2);
        sum+=fib1;
        sum+=fib2;
        for(int i=3;i<=n;i++){
            fib3=fib1+fib2;
            sum+=fib3;
            System.out.print(","+fib3);
            fib1=fib2;
            fib2=fib3;
        }
        System.out.println();
        System.out.println(sum);
    }
}
