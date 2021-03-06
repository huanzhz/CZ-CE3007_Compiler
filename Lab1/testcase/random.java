    @Test
    public void test01() {
        runtest("\\\\\\\n",
                (Token) null,
                new Token(EOF, 0, 4, ""));
    }

    @Test
    public void test02() {
        runtest("\"\\\\\\\n\"",
                (Token) null,
                new Token(EOF, 0, 6, ""));
    }

    @Test
    public void test03() {
        runtest("\"\\\\\\\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\\\\\\\n"),
                new Token(EOF, 0, 7, ""));
    }


    @Test
    public void test04() {
        runtest("\"\"\\\\\\n\"",
                new Token(STRING_LITERAL, 0, 0, ""),
                (Token) null,
                new Token(EOF, 0, 7, ""));
    }

    @Test
    public void test05() {
        runtest("\"\\\"\\\"\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\\"\\\"\\n"),
                new Token(EOF, 0, 8, ""));
    }

    @Test
    public void test06() {
        runtest("\"\\\"\\\"\\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\"),
                (Token) null,
                new Token(EOF, 0, 8, ""));
    }

    @Test
    public void test07() {
        runtest("\"\\\">=\n00/\"\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\"),
                new Token(GEQ, 0, 3, ">="),
                new Token(INT_LITERAL, 1, 0, "00"),
                new Token(DIV, 1, 2, "/"),
                new Token(STRING_LITERAL, 1, 3, "\\n"),
                new Token(EOF, 1, 7, ""));
    }

    @Test
    public void test071() {
        runtest("\"\\\">=00/\"\\n\"",
                new Token(STRING_LITERAL, 0, 0, "\\"),
                new Token(GEQ, 0, 3, ">="),
                new Token(INT_LITERAL, 0, 5, "00"),
                new Token(DIV, 0, 7, "/"),
                new Token(STRING_LITERAL, 0, 8, "\\n"),
                new Token(EOF, 0, 12, ""));
    }

    @Test
    public void test08() {
        runtest("-25+0030",
                new Token(MINUS, 0, 0, "-"),
                new Token(INT_LITERAL, 0, 1, "25"),
                new Token(PLUS, 0, 3, "+"),
                new Token(INT_LITERAL, 0, 4, "0030"),
                new Token(EOF, 0, 8, ""));
    }

    @Test
    public void test09() {
        runtest("25.8",
                new Token(INT_LITERAL, 0, 0, "25"),
                (Token) null,
                new Token(EOF, 0, 4, ""));
    }

    @Test
    public void test10() {
        runtest("\"module\"module\"+25\"+25",
                new Token(STRING_LITERAL, 0, 0, "module"),
                new Token(MODULE, 0, 8, "module"),
                new Token(STRING_LITERAL, 0, 14, "+25"),
                new Token(PLUS, 0, 19, "+"),
                new Token(INT_LITERAL, 0, 20, "25"),
                new Token(EOF, 0, 22, ""));
    }

    @Test
    public void test11() {
        runtest("S123_4567a",
                new Token(ID, 0, 0, "S123_4567a"),
                new Token(EOF, 0, 10, ""));
    }

    @Test
    public void test12() {
        runtest("S123-4567a",
                new Token(ID, 0, 0, "S123"),
                new Token(MINUS, 0, 4, "-"),
                new Token(INT_LITERAL, 0, 5, "4567"),
                new Token(ID, 0, 9, "a"),
                new Token(EOF, 0, 10, ""));
    }

    @Test
    public void test13() {
        runtest("123321",
                new Token(INT_LITERAL, 0, 0, "123321"),
                new Token(EOF, 0, 6, ""));
    }

    @Test
    public void test14() {
        runtest("0000321",
                new Token(INT_LITERAL, 0, 0, "0000321"),
                new Token(EOF, 0, 7, ""));
    }

    @Test
    public void test15() {
        runtest("a1d___",
                new Token(ID, 0, 0, "a1d___"),
                new Token(EOF, 0, 6, ""));
    }


    @Test
    public void test16() {
        runtest("1awhiled___",
                new Token(INT_LITERAL, 0, 0, "1"),
                new Token(ID, 0, 1, "awhiled___"),
                new Token(EOF, 0, 11, ""));
    }

    @Test
    public void test16() {
        runtest("1ad_\"__\"",
                new Token(INT_LITERAL, 0, 0, "1"),
                new Token(ID, 0, 1, "ad_"),
                new Token(STRING_LITERAL, 0, 4, "__"),
                new Token(EOF, 0, 8, ""));
    }