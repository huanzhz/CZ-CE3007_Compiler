	@Test
	public void testModuleEmptyFunctionDeclaration() {
		runtest("module Test {"
				+ "public void fun() {}"
				+ "}");
	}
	
	@Test
	public void testModuleParameterFunctionDeclaration() {
		runtest("module Test {"
				+ "public void fun(int param) {}"
				+ "}");
	}
	
	@Test
	public void testModuleParameterListFunctionDeclaration() {
		runtest("module Test {"
				+ "public void fun(int param1, boolean param2) {}"
				+ "}");
	}
	
	@Test
	public void testModuleIfWhileFunctionDeclaration() {
		runtest("module Test {"
				+ "public void fun() {"
				+ "  int x;"
				+ "  if(x < 10) {return 10;}"
				+ "  else {return;}"
				+ ""
				+ "  while(x < 15) {x = 10; break; }"
				+ "}"
				+ "}");
	}
	
	@Test
	public void testModuleFunctionDeclaration() {
		runtest("module Test {"
				+ "public void fun() {"
				+ "  a[5+7 / 3] = [2,3,4];"
				+ "  fun(4,5,6);"
				+ "}"
				+ "}");
	}
	
	
	@Test
	public void testFunctionCall(){
		//test precondition
		runtest("module Test{ public int function_name() {  } }");
		
		//test function call 
		runtest("module Test{ public int function_name() { abc(); } }");
		runtest("module Test{ public int function_name() { abc(a=1); } }");
		runtest("module Test{ public int function_name() { abc(a=1,b=2); } }");		runtest("module Test{ public int function_name() { abc(a=1); } }");
		runtest("module Test{ public int function_name() { abc(a,b); } }");
		runtest("module Test{ public int function_name() { abc(1,2); } }");
	}