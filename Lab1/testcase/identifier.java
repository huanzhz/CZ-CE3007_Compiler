@Test
	public void testIdentifier1() {
		runtest("hello_123_world", 
				new Token(ID, 0, 0, "hello_123_world"),
				new Token(EOF, 0, 15, ""));
	}
	
	@Test
	public void testIdentifier2() {
		runtest("a1b2c3_d4e5f6", 
				new Token(ID, 0, 0, "a1b2c3_d4e5f6"),
				new Token(EOF, 0, 13, ""));
	}
	
	@Test
	public void testIdentifier3() {
		runtest("a____c", 
				new Token(ID, 0, 0, "a____c"),
				new Token(EOF, 0, 6, ""));
	}