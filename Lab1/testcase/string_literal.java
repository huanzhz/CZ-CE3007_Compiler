	@Test
    public void testStringLiteralWithDoubleQuote() {
        runtest("\"\"\"",
                new Token(STRING_LITERAL, 0, 0, ""),
                (Token) null,
                new Token(EOF, 0, 3, ""));
    }

    @Test
    public void testStringLiteral() {
        runtest("\"\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\n"),
                new Token(EOF, 0, 4, ""));
    }
	
	@Test
	public void testStringLiteralWithDoubleQuote() {
		runtest("\"\"\"",
				new Token(STRING_LITERAL, 0, 0, ""),
				(Token)null,
				new Token(EOF, 0, 3, ""));
	}
	
	@Test
	public void testStringLiteral() {
		runtest("\"\\n\"", 
				new Token(STRING_LITERAL, 0, 0, "\\n"),
				new Token(EOF, 0, 4, ""));
	}
	
	/** Extra unit tests */
	@Test
	public void testStringLiteralFail() {
		runtest("\"a\"\"", 
				new Token(STRING_LITERAL, 0, 0, "a"),
				(Token)null,
				new Token(EOF, 0, 4, ""));
	}

	@Test
	public void testStringLiteralSimpel() {
		runtest("\"asf\"", 
				new Token(STRING_LITERAL, 0, 0, "asf"),
				new Token(EOF, 0, 5, ""));

	}
	
	