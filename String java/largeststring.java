public class largeststring {
    public static void largest(String str []){
        String large = str[0];
        for(int i =1; i<str.length; i++){
            if(large.compareTo(str[i])<0){
                large = str[i];
            }

        } System.out.println( large);

    }
    public static void main(String[] args) {
        String str [] = { "apple" , "mango" , "banana"};

        largest(str);
    }
    
}
