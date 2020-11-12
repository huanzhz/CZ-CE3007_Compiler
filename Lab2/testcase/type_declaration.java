@Test
	public void testModuleTypeDeclaration() {
		runtest("module Test {"
				+ "public type float = \"FLOAT\";"
				+ "type enum = \"ENUM\";"
				+ "}");
	}