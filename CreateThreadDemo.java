

public class CreateThreadDemo implements Runnable{

        public void run() {
                System.out.println("I have created my 2nd Thread!");
        }
        public static void main(String[] args) {
            
                CreateThreadDemo obj = new CreateThreadDemo();
                Thread obj1 = new Thread(obj);
                obj1.start();
        }
}
