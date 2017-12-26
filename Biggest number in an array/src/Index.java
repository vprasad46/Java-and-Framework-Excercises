// Printing out biggest number in an array
public class Index {
	
	public static void main(String args[]){
		int a[] = {100,200,-1000,2000,1};
		max_number(a);
	}
	
	public static void max_number(int a[]){
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max)
				max = a[i];
		}
		System.out.println(max);
	}
}

