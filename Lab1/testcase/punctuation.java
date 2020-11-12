@Test
	public void testPunctuation() {
		runtest("[]{}()", 
				new Token(LBRACKET, 0, 0, "["),
				new Token(RBRACKET, 0, 1, "]"),
				new Token(LCURLY, 0, 2, "{"),
				new Token(RCURLY, 0, 3, "}"),
				new Token(LPAREN, 0, 4, "("),
				new Token(RPAREN, 0, 5, ")"),
				new Token(EOF, 0, 6, ""));

	}