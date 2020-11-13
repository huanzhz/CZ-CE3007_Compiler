@Test
	public void testModuleFieldDeclaration() {
		runtest("module Test {"
				+ "public boolean booleanfield;"
				+ "int intfield;"
				+ "}");
	}