    /**
     * Example unit test.
     */
    @Test
    public void testKWs() {
        // first argument to runtest is the string to lex; the remaining arguments
        // are the expected tokens
        runtest("module false return while",
                new Token(MODULE, 0, 0, "module"),
                new Token(FALSE, 0, 7, "false"),
                new Token(RETURN, 0, 13, "return"),
                new Token(WHILE, 0, 20, "while"),
                new Token(EOF, 0, 25, ""));
    }