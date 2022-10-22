package myPackages.p1;

public class Maximum {

	public int max(int a, int b, int c) {
		return (Math.max(Math.max(a,b),c));
	}

	public float max(float a, float b, float c) {

		return (Math.max(Math.max(a,b),c));
	}

	public int max(int arr[]) {

		int largest = Integer.MIN_VALUE;
		for (int x : arr) {
			largest = largest>x ? largest : x;
		}

		return largest;
	}

	public int max(int arr[][]) {

		int largest = Integer.MIN_VALUE;
		for (int x[] : arr) {
			for (int ele: x) {
				largest = largest>ele ? largest : ele;
			}
		}

		return largest;
	}

} // end of Maximum class