class JavaArray {
    public static void main(String[] argv) {
	/* Two ways to declare an array in Java */
	
	// 1 - just like String[] argv
	int[] myInts1;
	// 2
	int myInts2[];

	/* Initalize the arary - default 0 */
	myInts1 = new int[4];
	myInts2 = new int[1];
	System.out.println(myInts1[0]);
	System.out.println(myInts2[0]);

	/* Initalize and declare in one step */
	int[] myInts3 = new int[3];
	System.out.println(myInts3[2]);

	/* Use Array Literal */
	int[] myInts4 = { 1, 2, 3, 4 };
	System.out.println(myInts4[3]);
    }
}
