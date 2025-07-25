public class NthprimeNum {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int getNthprime(int n){
        int count=0;
        int num=2;
        while(true)
        {
           if(isPrime(num))
           {
            count++;
            if(count==n){
                return num;
            } 
           }
           num++;
        }
    }
    public static void main(String args[]){
        int x=5;
        int y=1;
        int A=getNthprime(x);
        int B=getNthprime(y);
        System.out.println(A);
        System.out.println(B);

    }
}
