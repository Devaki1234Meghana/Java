import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        int target=43;
        int ar[]={1,2,3,43,15,4};
        Arrays.sort(ar);
        int index=binarysearch(ar,target);
        System.out.println("the element is found at "+index);
    }
    public static int binarysearch(int ar[],int target){
        
        int low=0;
        int high=ar.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ar[mid]==target){
                return mid;
            }
            else if(ar[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
 
    }
}
