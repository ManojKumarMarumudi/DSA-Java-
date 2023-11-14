public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,8,3,5,7,6};
		for(int i=0;i<arr.length-1;i++) {
			int min_id = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]< arr[min_id]) {
					min_id=j;
				}
			}
			int temp = arr[min_id];
			arr[min_id]=arr[i];
			arr[i]=temp;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}	
	}
}
