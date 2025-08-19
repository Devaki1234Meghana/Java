
import java.util.*;
class Subarray1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Length of longest subarray with sum divisible by a num
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int div=sc.nextInt();
        int maxlen=0;
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=ar[j];
                if(sum%3==0){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        System.out.println("Length of longest subarray with sum divisible by "+div+" is: "+maxlen);
    }
}