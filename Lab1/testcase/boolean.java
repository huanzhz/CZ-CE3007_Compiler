	@Test
	public void testBooleanExpression() {
		runtest("true == false", 
				new Token(TRUE, 0, 0, "true"),
				new Token(EQEQ, 0, 5, "=="),
				new Token(FALSE, 0, 8, "false"),
				new Token(EOF, 0, 13, ""));
	}
	
	@Test
	public void testRandomBooleanExpression() {
		runtest("\"true\" >= +", 
				new Token(STRING_LITERAL, 0, 0, "true"),
				new Token(GEQ, 0, 7, ">="),
				new Token(PLUS, 0, 10, "+"),
				new Token(EOF, 0, 11, ""));
	}
	
	@Test
	public void testEquals() {
		runtest("===", 
				new Token(EQEQ, 0, 0, "=="),
				new Token(EQL, 0, 2, "="),
				new Token(EOF, 0, 3, ""));
	}