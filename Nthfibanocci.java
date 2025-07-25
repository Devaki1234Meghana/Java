public class Nthfibanocci {
    public static int Nthfibanoccinum(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        int fib1=0,fib2=1,fib3;
        int count=2;
        for(int i=3;i<=n;i++){
            
            fib3=fib1+fib2;
            count++;
            if(count==n){
                return fib3;
            } 
            else{
                fib1=fib2;
                fib2=fib3;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=6;
        int A=Nthfibanoccinum(n);
        System.out.println(A);
    }
}
