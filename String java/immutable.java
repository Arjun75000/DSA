public class immutable {
    public static void main(String[] args) {
        String str = "hello";
       // str.charAt[2] = 'q';
       // System.out.println(s);
       str = str.substring(0, 2)+ "y"+str.substring(3); 
        System.out.println(str);
    }
    
}
