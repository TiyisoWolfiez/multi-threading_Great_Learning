public class NameThread extends Thread{
    
    public void run() {
        System.out.println("Name change has already shown.");
    }

    public static void main(String[] args) {
        
        NameThread obj = new NameThread();

        NameThread obj1 = new NameThread();

        System.out.println("Default name for the first thread: "+obj.getName());

        System.out.println("Default name for the second thread: "+obj1.getName());

        obj.start();
        obj1.start();

        obj1.setName("Peaky Blinders");
        System.out.println("Default name for the first thread: "+obj.getName());

        System.out.println("Default name for the second thread: "+obj1.getName());
        
    }
}
