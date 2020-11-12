@Test
	public void testDeclaration() {
		runtest("int x_1 = \"hello world\"", 
				new Token(INT, 0, 0, "int"),
				new Token(ID, 0, 4, "x_1"),
				new Token(EQL, 0, 8, "="),
				new Token(STRING_LITERAL, 0, 10, "hello world"),
				new Token(EOF, 0, 23, ""));
	}