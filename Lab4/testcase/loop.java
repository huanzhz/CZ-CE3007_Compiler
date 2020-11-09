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