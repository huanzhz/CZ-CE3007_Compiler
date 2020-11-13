@Test
	public void testRHSAssignment(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		runtest("module Test{ public int function_name() { a()==true; } }");
		runtest("module Test{ public int function_name() { a()!=1; } }");
		runtest("module Test{ public int function_name() { a()<\"abc\"; } }");
		runtest("module Test{ public int function_name() { a()>a(); } }");
		runtest("module Test{ public int function_name() { a()<=a(); } }");
		runtest("module Test{ public int function_name() { a()>=true; } }");
		runtest("module Test{ public int function_name() { -123*-\"abc\"--true*-a[1]==-abc(a=1)*-3+-abc(a=1)*def(); } }");
	}
	
	@Test
	public void testAssignment(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		runtest("module Test{ public int function_name() { a=1; } }");
		runtest("module Test{ public int function_name() { a=b=c=3; } }");
		runtest("module Test{ public int function_name() { a=a()==true==false==123==-3; } }",false);
	}