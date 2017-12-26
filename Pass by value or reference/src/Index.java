/* Pass by Value: Basic Data Types, String and Custom Objects
 * Pass by Reference: Arrays*/
public class Index {
	public static void main(String args[]){
		int a = 1;
		char b = 'a';
		float c = 1;
		double d = 1.0;
		int e[] = {1,2,3,4,5};
		String f[] = {"asd","123","trw"};
		String g = "asdw";
		Human h1 = new Human(22,"Vishwa","Male");
		
		basic_data_type_manipulation(a);
		System.out.println("a = "+ a);
		basic_data_type_manipulation(b);
		System.out.println("b = "+ b);
		basic_data_type_manipulation(c);
		System.out.println("c = "+ c);
		basic_data_type_manipulation(d);
		System.out.println("d = "+ d);
		array_manipulation(e);
		for(int i=0;i<e.length;i++)
			System.out.print(e[i]+" ");
		System.out.println();
		array_manipulation(f);
		for(int i=0;i<f.length;i++)
			System.out.print(f[i]+" ");
		System.out.println();
		System.out.println(h1.name+"\t"+h1.age+"\t"+h1.gender);
		System.out.println(g);
		
	}
	public static void basic_data_type_manipulation(int a){
		a++;
	}
	public static void basic_data_type_manipulation(char a){
		a = 'z';
	}
	public static void basic_data_type_manipulation(float a){
		a++;
	}
	public static void basic_data_type_manipulation(double a){
		a++;
	}
	public static void basic_data_type_manipulation(String a){
		a+=" manipulated";
	}
	public static void array_manipulation(int a[]){
		for(int i=0;i<a.length;i++)
			a[i]++;
	}
	public static void array_manipulation(String a[]){
		for(int i=0;i<a.length;i++)
			a[i]+=" manipulated";
	}
	public static void custom_obj_manipulation(Human h1){
		h1.age = 55;
		h1.gender = "Female";
		h1.name = "Manjula";
	}
}
