public class Bubble {
	public static void main(String[] args) {
		int[] array = {8,5,2,1,6};
		int[] fixed = work(array);
		if(isSorted(fixed)) {
			print(fixed);
		}
	}
	public static int[] work(int[] a) {
		int[] nums = a;
		int end = 0;
		int holder = 0;
		int minPlace = 0;
		for (int i=0; i<nums.length - end; i++) {
			for (int x=i+1; x<nums.length; x++) {
				if (nums[i] > nums[x]) {
					holder = nums[i];
					nums[i] = nums[x];
					nums[x] = holder;
					print(nums);
				}
				i++;
			}
			end++;
			i=-1;
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