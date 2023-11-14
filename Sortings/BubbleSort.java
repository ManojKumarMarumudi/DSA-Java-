public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,23,13,46,22,20};
		int temp = 0;
		System.out.println("Before Sorting :");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println("While Sorting");
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int j: arr) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("After Sorting");
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}

}
