package object06.hide.package2_2;

import object06.hide.package1_2.A;

	

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; //default
//		a.field3 = 1; //private

		a.method1();
//		a.method2(); //default
//		a.method3(); //private
	}
}
