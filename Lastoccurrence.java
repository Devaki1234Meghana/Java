// You are using Java
import java.util.*;
class Lastoccurrence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int last=-1;
        for(int i=0;i<n;i++){
            if(tar==ar[i]){
                last=i;
            }
        }
        if(last!=-1){
        System.out.println("Last occurrence is at index: "+last);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}