public class Armstrong {
    public static int noofdigits(int n){
        int noofdigits=0;
        while(n>0){
            n=n/10;
            noofdigits++;
        }
        return noofdigits;
    }
    public static void armstrongOrNot(int n){
        int temp=n;
        int sum=0;
        int powerval=noofdigits(n);
        
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,powerval);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("armstrong num");
        }else{
            System.out.println("not armstrong");
        }
    }
    public static void main(String[] args) {
        int n=153;
        armstrongOrNot(n);
    }
}
