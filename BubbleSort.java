import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int ar[]={1,53,28,7,2,4};
        bubblesort(ar);

    }
    public static void bubblesort(int ar[]){
        int n=ar.length;
        for(int i=n-1;i>1;i--){
            for(int j=0;j<n-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
