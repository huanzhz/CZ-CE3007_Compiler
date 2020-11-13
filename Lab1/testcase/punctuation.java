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
	
	@Test
	public void testPunctuations() {
		runtest("() [] {}",
				new Token(LPAREN, 0, 0, "("),
				new Token(RPAREN, 0, 1, ")"),
				new Token(LBRACKET, 0, 3, "["),
				new Token(RBRACKET, 0, 4, "]"),
				new Token(LCURLY, 0, 6, "{"),
				new Token(RCURLY, 0, 7, "}"),
				new Token(EOF, 0, 8, ""));
	}