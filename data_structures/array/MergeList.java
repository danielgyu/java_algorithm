import java.util.ArrayList;


public class MergeList {

    public static ArrayList<Integer> mergeList(int[] a1, int[] a2) {
	int a1_idx = 0;
	int a2_idx = 0;
	ArrayList<Integer> result = new ArrayList<>();

	while (a1_idx < a1.length && a2_idx < a2.length) {
	    if (a1[a1_idx] < a2[a2_idx]) {
		result.add(a1[a1_idx++]);
	    } else {
		result.add(a2[a2_idx++]);
	    }
	}

	while (a1_idx < a1.length) {
	    result.add(a1[a1_idx++]);
	}

	while (a2_idx < a2.length) {
	    result.add(a2[a2_idx++]);
	}

	return result;

    }

    public static void main(String[] argv) {
	int[] arr1 = {1, 3, 4, 5};
	int[] arr2 = {2, 6, 7, 8};

	ArrayList<Integer> result = mergeList(arr1, arr2);
	System.out.println("result: " + result.toString());
    }
}
