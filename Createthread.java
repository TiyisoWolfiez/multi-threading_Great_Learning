public class Createthread extends Thread {

    public void run() {
        System.out.println("Here's The First Thread");
    }

    public static void main(String[] args) {

        Createthread obj = new Createthread();
        obj.start();
    }
    
}
