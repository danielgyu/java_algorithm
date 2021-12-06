import java.util.ArrayList;

public class RemoveEven {

    public static ArrayList<Integer> removeEven(int[] array) {
	int length = array.length;
	ArrayList<Integer> result =  new ArrayList<>();

	for (int i = 0; i < length; i++) {
	    if (array[i] % 2 == 0) {
		result.add(array[i]);
	    }
	}

	return result;
    }
    public static void main(String[] argv) {
	int[] array = {1, 2, 4, 5, 10, 6, 3};

	ArrayList<Integer> output = removeEven(array);
	System.out.println("output:" + output.toString());
    }
}
