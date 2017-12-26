// Merge Sort
public class Index {
	public static void main(String args[]){
		int arr[] = {-1,0,42,2,-20,-90,12};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void mergeSort(int arr[]){
		if(arr.length>=2){
			int mid = (arr.length-1)/2;
			int left[] = new int[mid+1];
			int right[] = new int[arr.length-mid-1];
			int k=0;
			for(int i=0;i<=mid;i++)
				left[i] = arr[i];
			for(int i=mid+1;i<arr.length;i++)
				right[k++] = arr[i];
			mergeSort(left);
			mergeSort(right);
			merge(left,right,arr);
		}
	}
	public static void merge(int left[], int right[], int arr[]){
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length){
			if(left[i]<=right[j]){
				arr[k] = left[i];
				i++;
				k++;
			}
			else{
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<left.length){
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length){
			arr[k] = right[j];
			k++;
			j++;
		}
	}
}
