public class Createthread2 implements Runnable{

    public void run(){
        System.out.println("I have created my first thread");
    }
    public static void main(String[] args) {
        Createthread2 obj = new Createthread2();


        Thread a new Thread(obj);
    }
    
}
