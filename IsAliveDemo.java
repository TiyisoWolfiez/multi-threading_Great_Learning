public class IsAliveDemo extends Thread{

    public void run() {
        try{
            Thread.sleep(500);
            System.out.println("Show me the state of my current thread: "+Thread.currentThread().isAlive());
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        IsAliveDemo obj = new IsAliveDemo();
        System.out.println("Before starting the thread: "+obj.isAlive());

        obj.start();

        System.out.println("Before starting the thread: "+obj.isAlive());
    }
    
}
