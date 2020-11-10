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

@Test public void testComparison(){
	runtest("module Test {" +
			"  public boolean f() {" +
			"    return  5 <= 4;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			false);
}

@Test public void testAssignment(){
	runtest("module Test {" +
			"  public int f() {" +
			"    int a;" +
			"    a = 3;" +
			"    return a;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			3);
}

@Test public void testNegationAndAddition() {
	runtest("module Test {" +
			"  public int f() {" +
			"    return -42 + 3;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			-39);
}

