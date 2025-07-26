import java.util.*;
public class LinearSearch {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    linerSearch(ar,target);
}
public static void linerSearch(int ar[],int target){
    boolean isFound=false;
    for(int i=0;i<ar.length;i++){
        if(ar[i]==target){
            isFound=true;
            System.out.println("The target element is found at index: "+i);
            break;   
        }
    }
    if(isFound==false){
        System.out.println("The target element is not found.");
    }

}
}
