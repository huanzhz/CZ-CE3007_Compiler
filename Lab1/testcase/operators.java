@Test
	public void testOperators() {
		runtest("/ ==  = >= > <= < - != + *",
				new Token(DIV, 0, 0, "/"),
				new Token(EQEQ, 0, 2, "=="),
				new Token(EQL, 0, 6, "="),
				new Token(GEQ, 0, 8, ">="),
				new Token(GT, 0, 11, ">"),
				new Token(LEQ, 0, 13, "<="),
				new Token(LT, 0, 16, "<"),
				new Token(MINUS, 0, 18, "-"),
				new Token(NEQ, 0, 20, "!="),
				new Token(PLUS, 0, 23, "+"),
				new Token(TIMES, 0, 25, "*"),
				new Token(EOF, 0, 26, ""));
	}