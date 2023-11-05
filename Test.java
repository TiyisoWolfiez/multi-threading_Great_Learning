import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello "+name);
        scan.close();



        // If & if-else statements
        int x = 20;
        int y = 21;

        if(x > y){
            System.out.println(x+" is greater than "+y);
        } else {
            System.out.println(y+" is greater than "+x);
        }

        //Looping statements
        for(int k = 0; k < 10; k += 4){
            System.out.println(k);
        }
    }
}