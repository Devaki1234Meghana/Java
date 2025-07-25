public class perfectNum {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
                System.out.println(i);     
            }
        }
        if(sum==n){
            System.out.println("perfect num");
        }else{
            System.out.println("not perfect num");
        }
    }
}
