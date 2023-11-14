public class QuickSort {
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high) {
		int i=low-1,temp;
		int pivot = arr[high];
		for(int j=low;j<arr.length;j++) {
			if(arr[j]<pivot) {
				i++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,4,5,3,32,2,9,6};
		quickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
