
import java.util.*;

public class Main1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(i==2 || j==2 )
		        sum+=ar[i][j];
		    }
		}
		System.out.println(sum);
	}
}
