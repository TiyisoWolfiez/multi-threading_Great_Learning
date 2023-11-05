public class JoinDemo extends Thread{

    public void run() {
        for(int k = 0; k < 10;k++){
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e);
            }
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        
        JoinDemo obj = new JoinDemo();
        JoinDemo obj1 = new JoinDemo();
        JoinDemo obj2 = new JoinDemo();

        obj.start();
        try {
            obj.join();
        } catch(Exception e){
            System.out.println(e);
        }

        obj1.start();
        obj2.start();
    }
    
}
