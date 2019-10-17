package mergesort;

import java.util.Arrays;

public class MergesortTest {
	public static void main(String[] args) {
		int[] arr = {3,4,5,23,56,78,75,23,45,2,34,2,45,45,65,76,83,15,44,81,553,637,48,84,3,37,626};
		int[] temp = new int[arr.length];
		mergeSort(arr,0,arr.length-1,temp);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr,int left,int right,int[] temp) {
		if (left<right) {
			int mid = (left+right)/2;
			mergeSort(arr,left,mid,temp);
			mergeSort(arr,mid+1,right,temp);
			merge(arr, left, mid, right, temp);
			
		}
	}
	
	public static void merge(int[] arr,int left,int mid,int right,int[] temp) {
		int i = left;
		int j = mid+1;
		int t= 0;//temp���鵱ǰ����
		//�Ƚ�����
		while (i<=mid && j<=right) {
			if (arr[i]<arr[j]) {
				temp[t] = arr[i];
				i++;
				t++;
			}else {
				temp[t] = arr[j];
				j++;
				t++;
			}	
		}
		//�����ʣ��
		while (i<=mid) {
			temp[t]=arr[i];
			i++;
			t++;
		}
		//�ұ���ʣ��
		while (j<=right) {
			temp[t]=arr[j];
			j++;
			t++;
		}
		
		//��temp���鿽����ԭʼ����arr
		t=0;
		int templeft = left;
		while (templeft<=right) {
			arr[templeft] = temp[t];
			t++;
			templeft++;
			
		}
		
	}
	
	

}





