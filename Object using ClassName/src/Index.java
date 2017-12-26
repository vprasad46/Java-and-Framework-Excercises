import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Index {
	public static void main(String args[]){
		
		try {
			Class claz = Class.forName("Student");
			Constructor[] consr = claz.getDeclaredConstructors();
			Field[] field = claz.getDeclaredFields();
			
			System.out.println(consr.length);
			System.out.println(field.length);
			Object s = claz.newInstance();
			Method[] methods = claz.getDeclaredMethods();
			System.out.println(methods[4].invoke(s));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
