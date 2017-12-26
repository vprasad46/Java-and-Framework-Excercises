// Merge Sort for String arrays
public class Index {
	public static void main(String args[]){
		String arr[] = {"vijay Surya","Vishwa","Maruthi","Sai Varun"};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void mergeSort(String arr[]){
		if(arr.length>=2){
			int mid = (arr.length-1)/2;
			String left[] = new String[mid+1];
			String right[] = new String[arr.length-mid-1];
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
	public static void merge(String left[], String right[], String arr[]){
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length){
			if(isLesser(left[i],right[j])){
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
	public static boolean isLesser(String a,String b){
		int i=0, j=0;
		while(i<a.length() && j<b.length()){
			if(a.charAt(i)<b.charAt(j))
				return true;
			else if(a.charAt(i) == b.charAt(j)){
				i++;
				j++;
			}
			else {
				return false;
			}
		}
		if(i==a.length())
			return true;
		else
			return false;
	}
}
