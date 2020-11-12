@Test
	public void testEmptyModule() {
		runtest("module Test { }");
	}
	
	@Test
	public void test1() {
		runtest("module Test { import TensorFlow; }");
	}
	
	@Test
	public void test2() {
		runtest("module Test { import TensorFlow; int a; }");
	}
	
	@Test
	public void test3() {
		runtest("module Test { import TensorFlow; int a; public boolean foo(int b, int c){a = 2+3; return 35; break;} }");
	}
	
	
	@Test
	public void test4() {
		runtest("module Test { import TensorFlow; int a; public boolean foo(int b, int c){ if(a > 20){return b[23]==c;} } }");
	}
	
	@Test
	public void test5() {
		runtest("module Test { import TensorFlow; int a; public boolean foo(int b, int c){a; b = 3;  hello = dunno(c, d, 2018%99) + (25 / c*d); not_happy = \"NOT HAPPY\"; } }");
	}