public class reversestring {
    public static void main(String[] args) {
        String str = "hello world";
        String s = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
           if(str.charAt(i) != ' '){
            s+= str.charAt(i);
           }else {
            s+=str.charAt(i);
           }

        } System.out.println("reverse string " +s);
    }
}
