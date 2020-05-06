//Left rotation of array
//Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
//Output=3 4 5 6 7 1 2 
//Time complexity : O(n)
//Auxiliary Space : O(d)

package array.codes;

import java.util.Arrays;

public class LeftRotationArray {
	public int[] leftRotateArray(int[] arr,int d) {
		int size = arr.length;
		int[] rotate_arr = new int[size];
		int i=0,rotate_index = d;
		
		while(rotate_index <size) {
			rotate_arr[i] = arr[rotate_index];
			i++;
			rotate_index++;
		}
		rotate_index = 0;
		
		while(rotate_index < d) {
			rotate_arr[i] = arr[rotate_index];
			i++;
			rotate_index++;
		}
		return rotate_arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {1, 2, 3, 4, 5, 6, 7};
     int d =2;
     int[] out_arr = new int[arr.length];
     LeftRotationArray l = new LeftRotationArray();
     out_arr = l.leftRotateArray(arr, d);
     System.out.println(Arrays.toString(out_arr));
     
	}

}
