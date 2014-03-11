public class Insertion {
	public static void main(String[] args) {
		int[] array = {3,1,6,7,1,2};
		int[] fixed = work(array);
		if (isSorted(fixed)) {
			print(fixed);
		}
	}
	public static int[] work(int[] a) {
		int[] nums = a;
		int end = 0;
		int holder = 0;
		for (int i=1; i<nums.length; i++) {
			end = i;
			for (int x=i-1; x>=0; x--) {
				if (nums[i] < nums[x]) {
					holder = nums[x];
					nums[x] = nums[i];
					nums[i] = holder;
				}
				i--;
			}
			i = end;
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