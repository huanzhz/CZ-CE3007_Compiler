	@Test
	public void testEmptyModule() {
		runtest("module Test { "
				+ "}");
	}
	
	@Test
	public void testModuleImports() {
		runtest("module Test {"
				+ "import module1;"
				+ "import module2;"
				+ "}");
	}