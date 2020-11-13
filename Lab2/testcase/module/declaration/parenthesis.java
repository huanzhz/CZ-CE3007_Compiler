@Test
	public void testParenthesisExpression(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		//start test
		runtest("module Test{ public int function_name() { (); } }",false);
		runtest("module Test{ public int function_name() { (1+1); } }");
		runtest("module Test{ public int function_name() { (true+true); } }");
		runtest("module Test{ public int function_name() { (a[1]+b[c=2]); } }");
	}