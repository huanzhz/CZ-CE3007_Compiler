@Test
	public void testArrayExpression(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		//test array expression 
		runtest("module Test{ public int function_name() { []; } }",false);
		runtest("module Test{ public int function_name() { [a=1]; } }");
		runtest("module Test{ public int function_name() { [a=1,b=2]; } }");
		runtest("module Test{ public int function_name() { [a]; } }");
		runtest("module Test{ public int function_name() { [a,b]; } }");
		runtest("module Test{ public int function_name() { [1]; } }");
		runtest("module Test{ public int function_name() { [1,2]; } }");
	}