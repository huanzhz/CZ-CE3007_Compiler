@Test
	public void testArithmeticExpression(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		runtest("module Test{ public int function_name() { -123*-\"abc\"--true*-a[1]; } }");
		runtest("module Test{ public int function_name() { -abc(a=1)*-3+-abc(a=1)*def(); } }");
	}