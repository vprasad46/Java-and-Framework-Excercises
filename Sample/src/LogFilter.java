class LogFilter {
	public static void main(String[] args) {
        System.out.println("asd");
		callMethodOne();
    }
    public static void callMethodOne() {
    	System.out.println("asd1");
    	callMethodTwo();
    }
    public static void callMethodTwo() {
    	System.out.println("asd2");
    	callMethodThree();
    }
    public static void callMethodThree() {
    	System.out.println("asd3");
    	try{
    		int result = 19/0;
    	}
    	catch(Exception e){
    		System.out.println("Exception Handled");
    	}
    	callMethodFour();
    }
    public static void callMethodFour(){
    	System.out.println("Method Four is Executed");
    }
}