package generic_tasks;


class A{

}

class B extends A{

}

interface I {

}

interface J {

}

class C extends A implements I {

}

class D extends A implements I,J{

}

class E {

}

public class MultiExtendGenenric {
    public static void main(String[] args) {

      A  objA = new A();
      B objB = new B();
      C objC = new C();
      D objD = new D();
      E objE = new E();

       // testMultiBound(new A()); error, requires to be the subtype of both A and I
       // testMultiBound(new B());error, requires to be the subtype of both A and I
        testMultiBound(new C());
        testMultiBound(new D());
       // testMultiBound(new E());error, requires to be the subtype of both A and I

    }
    public static <T extends A&I> void testMultiBound(T t){
        System.out.println(t);
    }
}
