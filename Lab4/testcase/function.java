@Test public void testFibo() {
	runtest("module Test {" +
			"  public int f(int x) {" +
			"    if(x<=2) {return 1;} " +
			"    else {return f(x-1) + f(x-2); }" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[] { int.class },
			new Object [] {6},
			8);
}