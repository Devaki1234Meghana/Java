import java.util.*;
public class SelectionSort{
    public static void main(String args[]){
        int ar[]={1,23,4,10,187};
        selectionsort(ar);

    }
    public static void selectionsort(int ar[]){
        int n=ar.length;
        for(int i=0;i<=n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(ar[j]<ar[minindex]){
                    int temp=ar[minindex];
                    ar[minindex]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}

