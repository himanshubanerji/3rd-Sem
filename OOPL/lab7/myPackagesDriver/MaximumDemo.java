package myPackagesDriver;

import myPackages.p1.Maximum;

class MaximumDemo {
	public static void main(String[] agrs) {

		Maximum obj = new Maximum();

		System.out.println(obj.max(2,17,30));
		System.out.println(obj.max(2.8f,2.86f,2.98f));
		int[] array = {10,45,32,87};
		System.out.println(obj.max(array));
		int[][] array2d = {{10,45,21}, {2,98,3}, {100,2,3}};
		System.out.println(obj.max(array2d));

	}
}