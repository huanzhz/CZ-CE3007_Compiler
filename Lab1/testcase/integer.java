@Test
	public void testInt() {
		runtest("1234", 
				new Token(INT_LITERAL, 0, 0, "1234"),
				new Token(EOF, 0, 4, ""));
	}
	
	@Test
	public void testIntWithLeadingZeros() {
		runtest("030", 
				new Token(INT_LITERAL, 0, 0, "030"),
				new Token(EOF, 0, 3, ""));
	}
	
	@Test
	public void testSignedInt() {
		runtest("-123", 
				new Token(MINUS, 0, 0, "-"),
				new Token(INT_LITERAL, 0, 1, "123"),
				new Token(EOF, 0, 4, ""));
	}