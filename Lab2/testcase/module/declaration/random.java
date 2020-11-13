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
	
	
	@Test
	public void testLocalVariableDeclaration() {
		runtest("module Test { int a; int[] b; String c;}");
	}
	
	@Test
	public void testBlockStatement() {
		runtest("module Test { int a; int b; boolean c; public void testFunction() { if(a-b<1) {} while(c == true) {} while(c == true) {break;} if(c == true) {return;}} }");
	}
	
	@Test
	public void testIfStatement() {
		runtest("module Test { int a; int b; boolean c; public void testFunction() { if(a-b<1) {} } }");
	}
	
	
	@Test
	public void testWhileStatement() {
		runtest("module Test { int a; int b; boolean c; public void testFunction() { while(c == true) {} } }");
	}
	
	@Test
	public void testBreakStatement() {
		runtest("module Test { int a; int b; boolean c; public void testFunction() { while(c == true) {break;} } }");
	}
	
	@Test
	public void testReturnStatement() {
		runtest("module Test { int a; int b; boolean c; public int testFunction() { if(c == true) {return;} } }");
	}
	
	@Test
	public void testExpressionStatement() {
		runtest("module Test { int a; int b; boolean c; public int testFunction() { a == b; } }");
	}