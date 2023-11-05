public class pattern extends Thread{

    public void run() {

        int n = 10;
        for(int k = 0; k < n; k++){
            try{
                Thread.sleep(500);
            } catch(Exception e){
                System.out.println(e);
            }
            for(int j = 0; j < k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
        pattern p = new pattern();
        p.start();
    }
}
