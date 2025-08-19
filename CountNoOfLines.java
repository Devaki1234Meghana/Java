
import java.util.*;

public class CountNoOfLines
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		while(sc.hasNextLine()){
		    String s=sc.nextLine();
		    if(s.isEmpty()){
		        break;
		    }
		    count++;
		}
		
		System.out.println(count);
		
	}
}