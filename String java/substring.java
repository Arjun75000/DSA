public class substring{
    public static void  sub(String str , int si , int ei){
        String substr=" ";
        for(int i=si; i<=ei; i++){
            substr+=str.charAt(i);
        } System.out.println(substr);
    }
    public static void main(String [] args){
        String str = "hello world";
        sub(str ,0,4);



    }
}