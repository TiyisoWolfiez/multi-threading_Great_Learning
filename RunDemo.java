public class RunDemo extends Thread{
    
    public void run() {
        System.out.println("Experiment run Method");
    }
    public static void main(String[] args) {
        RunDemo obj = new RunDemo();
        obj.run();
    }
}
