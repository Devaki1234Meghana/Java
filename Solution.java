import java.util.*;
class Solution {
    public static int missingNumber(int[] nums, int n) {
        if(nums.length==1 && nums[0]==1){
            return 0;
        }
        Arrays.sort(nums);  
        int sum=((n)*(n+1))/2;
        int orsum=0;
        for(int i=0;i<n;i++){
            orsum+=nums[i];
        }
        if(sum-orsum==0 && nums[0]==0){
            return  (nums[n-1]+1);
            
        }else if(sum-orsum==0 && nums[0]!=0){
            return 0;
        }
        else{
        return sum-orsum;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(missingNumber(ar,n));
    }
}