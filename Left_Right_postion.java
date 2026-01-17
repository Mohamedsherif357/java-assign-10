package array;

public class Left_Right_postion {
	 static int[] leftRotate(int[] arr, int k)
	{

        int n = arr.length;
        k = k % n;

        int[] result = new int[n];
        int index = 0;

        for (int i = k; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            result[index++] = arr[i];
        }

        return result;
    }

	public static void main(String[] args) {
		    int n = arr.length;
        k = k % n;

        int[] result = new int[n];
        int index = 0;

        for (int i = n - k; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            result[index++] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int k = 2;

        int[] left = leftRotate(arr, k);
        int[] right = rightRotate(arr, k);

        System.out.print("Left Rotate: ");
        for (int i : left) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Right Rotate: ");
        for (int i : right) {
            System.out.print(i + " ");
        }


	}

}

