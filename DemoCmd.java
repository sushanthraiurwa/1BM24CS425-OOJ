public class DemoCmd {
    public static void main(String[] args) {
         int a=args.length;
         int b=10;

         try{
            int c=b/a;

            try{
               int x[]={1,2,3};
               x[10]=100;
               
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

         }catch(ArithmeticException e){
            System.out.println("Zero can be divisible");
         }


    }
    
}
