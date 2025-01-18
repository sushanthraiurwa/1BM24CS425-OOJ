class Gen<T, U>{
  public T obj1;
  public U obj2;

  Gen(T obj1,U obj2){
    this.obj1=obj1;
    this.obj2=obj2;

  }

  T getT(){
    return obj1;
  }
  U getU(){
    return obj2;
  }

}

public class DemoGen {

     public static void main(String[] args) {

        Gen<Integer,String> gen1=new Gen<>(100, "sushanth");

        int i1= gen1.getT();

        String s1=gen1.getU();

        System.out.println("the values are "+i1+"and the "+s1);

        Gen<String,Integer> gen2=new Gen<>("chuchu",150);

        int i2= gen2.getU();

        String s2=gen2.getT();

        System.out.println("the values are "+i2+"and the "+s2);
        
        
     }
}