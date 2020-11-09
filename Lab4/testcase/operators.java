@Test public void testString() {
	runtest("module Test {" +
			"public type string = \"java.lang.String\";  " +
			"  public string f() {" +
			"    string x;" +
			"    x = \"Hello World\";   " +
			"    return x;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			"Hello World");
}

@Test public void testPrecedence() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return 2+42/2;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			23);
}

@Test public void testParentheses() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return (2+42)/2;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			22);
}

@Test public void testNegation() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return -42;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			-42);
}
	
@Test public void testAddition() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return 23+19;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			42);
}

@Test public void testSubtraction() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return 42-19;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			23);
}

@Test public void testMultiplication() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return 2*21;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			42);
}

@Test public void testDivision() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return 42/2;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			21);
}