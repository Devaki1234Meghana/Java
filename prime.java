public class prime {
    public static void main(String args[])
    {
        int n=9;
        boolean primeornot=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
            {
                primeornot=false;
            }
        }
        if(primeornot==true)
        {
           System.out.println("prime num");
        }else{
            System.out.println("not prime");
        }
    }
}
