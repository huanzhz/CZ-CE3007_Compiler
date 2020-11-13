@Test
	public void testBooleanLiteral(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		//start test
		runtest("module Test{ public int function_name() { true; } }");
		runtest("module Test{ public int function_name() { false; } }");
	}