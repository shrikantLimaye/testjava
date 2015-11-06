public interface A {
	public  void f();
}

public abstract class  B implements A {
	private int x;
	public B(int x) { this.x = x; }
}

public class C extends B {
	public C(int x) { 
		super(x);
	}
	public void f() {
		System.out.println("hello");
	}
}
// class D IS_A C (is a kind of C)
public class D extends C {
	public D() { //
		super(0);
	}
	public void g() { System.out.println("yo!"); }
}


A a1;
A a1 = new A(); // ILLEGAL. A is an interface
B b1;
B b2 = new B(); // ILLEGAL B is ABSTRACT
C c1;
C c2 = new C(4); // legal
C c3 = new C(); // illegal NO SUCH CONSTRUCTOR
D d1;
D d2 = new D();
D d3 = new D(4); // ILLEGAL no such constructor

Object obj = d2;
C c4 = new D();
c4.f();
D d4 = new C();
d4.g();

public class X { //  extends Object
  public String toString() {
}

	
