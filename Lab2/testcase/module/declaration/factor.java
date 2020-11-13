@Test
	public void testFactor(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		runtest("module Test{ public int function_name() { -123; } }");
		runtest("module Test{ public int function_name() { -\"abc\"; } }");
		runtest("module Test{ public int function_name() { -true; } }");
		runtest("module Test{ public int function_name() { -a[1]; } }");
		runtest("module Test{ public int function_name() { -abc(a=1); } }");
		runtest("module Test{ public int function_name() { a=-3; } }");	
	}