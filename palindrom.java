public class palindrom {
    public static void main(String[] args) {
        String n="abcdercba";
        int len=n.length();
        int start=0;
        int end=len-1;
        boolean ispalindrom=true;
        while(start<=end){
            if(n.charAt(start)!=n.charAt(end)){
                ispalindrom=false;
                break;
            }
            start++;
            end--;
        }
        if(ispalindrom==true){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
