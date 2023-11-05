public class DemoSleep extends Thread{
    
    public void run() {
        System.out.println("Let's start using sleep method!");

        for(int k = 1; k <= 10;k++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        
        DemoSleep obj = new DemoSleep();
        obj.start();

    }
}
