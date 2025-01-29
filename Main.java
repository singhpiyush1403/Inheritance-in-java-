 class A {
    void showA(){
        System.out.println(" A class method ");
    }
}
 public class B extends A {
    void showB(){
        System.out.println("B  class method ");
    }
    public static void main(String args[]){
        B obj1 = new B();
        obj1.showA();
        obj1.showB();
    }
  }


