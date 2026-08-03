import java.util.Scanner;

public class inputstring{
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String name ;
    System.out.println("enter the first name ");
    name = sc.next();
    System.out.println(name);
    String fullname ;
    System.out.println(" enter your full name ");
    
    fullname = sc.nextLine();
    System.out.println(fullname);



    }
}