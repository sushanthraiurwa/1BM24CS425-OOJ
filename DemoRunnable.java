 class  A implements Runnable {
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Heello");
                Thread.sleep(2000);
            }
           
           
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    
}


class B implements Runnable{

    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Hiiii");
                Thread.sleep(1000);
            }
        
         
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class DemoRunnable {

    public static void main(String[] args) {
        Runnable r1= new A();
        Runnable r2= new B();

        Thread t1= new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

    }
    
}
