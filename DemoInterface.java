 interface  Stack {
void push(int value);
int pop();
void dispaly();
    
}

 class  StackImple implements Stack {
 int stack[]=new int[100];
 int top;

 StackImple(){
top=-1;
 }

 public void push(int a){
     stack[++top]=a;
  }

  public int  pop(){


int nu=stack[top--];
return nu;
  }

  public void dispaly(){
    int n=stack.length;
    System.out.println(n);
    for(int i=top;i>=0;i--){
        System.out.println(stack[i]);
    }
  }




    
}

public class DemoInterface {
    public static void main(String[] args) {
        StackImple imple=new StackImple();

        imple.push(10);
        imple.push(20);
        int n=imple.pop();
        System.out.println("the value of n is "+n);
        imple.dispaly();
    }


    
}
