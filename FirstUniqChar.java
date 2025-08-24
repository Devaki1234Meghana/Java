import java.util.*;
class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int freqar[]=new int[26];
        for(int i=0;i<s.length();i++){
            freqar[s.charAt(i)-'a']++;
 
        }
        for(int i=0;i<s.length();i++){
            if(freqar[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("first unique character is "+firstUniqChar(s));
    }
}