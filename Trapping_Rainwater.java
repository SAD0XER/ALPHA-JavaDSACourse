/* Problem statement: Given array is non-negative integer of array,
* representing an elevation (height) map, the width of each bar is (given),
* compute how much water  it can trap after the raining.
* PS: In the problem, if width is given then the formula will be TW=(WL - Bar level) * width */

public class Trapping_Rainwater {
	public static int trappedWater(int[] height) {
		int l = height.length; /*length of the given array*/

//		find left max array
		int[] leftmax = new int[l];
		leftmax[0] = height[0];
		for (int i = 1; i < l; i++) {
			leftmax[i] = Math.max(leftmax[i-1], height[i]);
		}

//      find right max array
		int[] rightmax = new int[l];
		rightmax[l-1] = height[l-1];
		for (int i = l-2; i >= 0; i--) {
			rightmax[i] = Math.max(height[i], rightmax[i+1]);
		}

//		for loop
		int trappedWater = 0;
		for (int i = 0; i < l; i++) {
//		find water level
			int waterLevel = Math.min(leftmax[i], rightmax[i]);

//		find trapped water
			trappedWater += waterLevel - height[i];
		}
		return trappedWater;
	}

	public static void main(String[] args) {
		int[] height = {4, 2, 0, 6, 3, 2, 5};

		System.out.println("Volume of Trapped water is: " + trappedWater(height));
	}
}
