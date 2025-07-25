import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// change the vowel characters in a string to its opposite case
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
		        sb.append(Character.toUpperCase(ch));
		        
		    }
		    else if(ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U'){
		        sb.append(Character.toLowerCase(ch));
		        
		    }
		    else{
		        sb.append(ch);
		    }
		}
		System.out.println(sb.toString());
	}
}
