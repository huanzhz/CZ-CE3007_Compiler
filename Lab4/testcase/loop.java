@Test public void testBoolean() {
	runtest("module Test {" +
			"  public boolean f() {" +
			"    boolean x;" +
			"    x = false;" +
			"    return x;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			false);
}

@Test public void testWhile() {
	runtest("module Test {" +
			"  public int f() {" +
			"    int x;" +
			"    x = 0;   " +
			"	 while(x<5){" + 
			"       x = x + 1;}" +
			"    return x;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			5);
}

@Test public void testWhile1() {
	runtest("module Test {public int f() {int x; x = 0; while(x<3) x=4; return x;}}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			4);
}

@Test public void testWhileWithLoop() {
		runtest("module Test {"
				+ "public int a;"
				+ "  public int f() {"
				+ "a = 0;"
				+ "while (a < 10) {"
				+ "a = a + 3;"
				+ "}"
				+ "return a;"
			    + "  }"
				+ "}",
				"Test",
				"f",
				new Class<?>[0],
				new Object[0],
				12);
	}
	
@Test public void testWhileWithoutLoop() {
	runtest("module Test {"
			+ "public int a;"
			+ "  public int f() {"
			+ "a = 10;"
			+ "while (a < 10) {"
			+ "a = a + 3;"
			+ "}"
			+ "return a;"
			+ "  }"
			+ "}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			10);
}

@Test public void testBreak() {
	runtest("module Test {" +
			"  public int f() {" +
			"  		int x;" +
			"  		x = 5;" +
			"    	while(x < 15){" +
			"			x = 10; break;" +
			"		} return x;" +
			"}}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			10);
}

@Test public void testIf() {
	runtest("module Test {public int f() {if(0)return 1;else return 2;}}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			2);
}


@Test public void testIntConstant(){
	runtest("module Test {" +
			"  public int f() {" +
			"    return 42;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			42);
}