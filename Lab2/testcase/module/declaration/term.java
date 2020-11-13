@Test
	public void testTerm(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		runtest("module Test{ public int function_name() { -123*-\"abc\"; } }");
		runtest("module Test{ public int function_name() { -true*-a[1]; } }");
		runtest("module Test{ public int function_name() { -abc(a=1)*-3; } }");
		runtest("module Test{ public int function_name() { -abc(a=1)*def(); } }");
	}