//			x[5]
//			b[4][7]
//			a[i+1]
@Test public void testArray1() {
	runtest("module Test {" +
			"  public int f() {" +
			"    int[] a; " +
			"    a = [1,2,3];  " +
			"    return a[2];" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			3);
}
	
@Test public void testArray2() {
	runtest("module Test {" +
			"  public int f() {" +
			"    int[][] a; " +
			"    a = [[1,2,3],[4,5]];  " +
			"    return a[1][0];" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			4);
}
	
@Test public void testArray3() {
	runtest("module Test {" +
			"  public int f() {" +
			"    int[] a; " +
			"    a = [1,2,3];  " +
			"    return a[1+1];" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			3);
}

@Test public void testArrayIndex(){
	runtest("module Test {" +
			"  public int f() {" +
			"    int[] arr;" +
			"    arr = [7, 2, 3];" +
			"    return arr[0];" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			7);
}


@Test public void testArray4(){
	runtest("module Test {" +
			"  public int f() {" +
			"    int[] arr;" +
			"    arr = [1, 2, 3];" +
			"    return 4;" +
			"  }" +
			"}",
			"Test",
			"f",
			new Class<?>[0],
			new Object[0],
			4);
}