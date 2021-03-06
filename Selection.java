public class Selection {
	public static void main(String[] args) {
		int[] array = {3,5,2,1,6};
		int[] fixed = work(array);
		if(isSorted(fixed)) {
			print(fixed);
		}
	}

	public static int[] work(int[] a) {
		int[] nums = a;
		int holder = 0;
		int minPlace = 0;
		for (int i=0; i<nums.length; i++) {
			int min = nums[i];
			minPlace = i;
			for (int x=i; x<nums.length; x++) {
				if(nums[x] < min) {
					min = nums[x];
					minPlace = x;
				}
			}
			holder = nums[minPlace];
			nums[minPlace] = nums[i];
			nums[i] = holder;
		}
		return nums;
	}

	public static void print(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
	public static boolean isSorted(int[] a) {
		for (int i=1; i<a.length; i++) {
			if (a[i] < a[i-1]) {
				return false;
			}
		}
		return true;
	}
}