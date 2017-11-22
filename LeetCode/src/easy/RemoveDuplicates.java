package easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4 ,5};
		int[] out = remove(nums);

		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}

	}

	static int[] remove(int[] arr) {

		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				count++;
			}

		}
		int[] tmp = new int[count];
		int pointer = 0;
		System.out.println("count:"+count);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				tmp[pointer] = arr[i];
				tmp[pointer + 1] = arr[i + 1];
				System.out.println("i:" + arr[i] + "i+1: " + arr[i + 1]);
				pointer += 1;
			} else {
				i++;
			}

		}

		return tmp;
	}

}
