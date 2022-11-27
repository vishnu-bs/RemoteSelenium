public interface TesInt {
    public void speak();

    void eat();
}
 abstract class A implements TesInt{

     @Override
     public void speak() {
         System.out.println("Speaking in class A");
     }
}
 class B extends A{
     public void speak() {
         System.out.println("Speaking in class B");
     }
     public void eat() {
         System.out.println("Eating in class B");
     }
 }
class C extends B {
    public void speak() {
        System.out.println("Speaking in class C");
    }
    public void eat() {
        System.out.println("Eating in class C");
    }
}
  class D extends C{
      public void speak() {
          System.out.println("Speaking in class D");
      }
      public void eat() {
          System.out.println("Eating in class D");
      }
      public static void main(String[] args) {

        /*   A a = new B();
          a.speak();


          B b = new B();
          b.speak();
          b.eat();
          A b1 = (A) b;
         b1.eat();
          b1.speak();*/


          C c = new C();
          c.speak();
          c.eat();
          A c1 = (B) c;
          c1.speak();
          c1.eat();

          D d = new D();
          d.speak();
          d.eat();
      }
 }
