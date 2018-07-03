class MyInteger{
	private int value;
	MyInteger(int v){
		value=v;
	}
	int getValue(){
		return value;
	}
	static boolean isOdd(MyInteger obj){
		if(obj.getValue()%2!=0)
			return true;
		return false;

	}
	static boolean isEven(MyInteger obj){
		if(obj.getValue()%2==0)
			return true;
		return false;
	}
	static boolean isPrime(MyInteger obj)
    {
    	int 	n=obj.getValue();
        // Corner cases
        if (n <= 1) return false;
        if (n <= 3) return true;
     
        // This is checked so that we can skip 
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) return false;
     
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
            return false;
     
        return true;
    }
    boolean equals(int n){
    	if(n==value)
    		return true;
    	return false;
    }
    boolean equals(MyInteger obj){
    	if(value==obj.getValue())
    		return true;
    	return false;
    }
    static int parseInt(char[] a){
    int result=0;
    int base=10;
    for(int i=0;i<a.length;i++){
        result=result+base*Character.getNumericValue(a[i]);
    }
    return result;
   	}
   	static int parseInt(String val){
       int num = 0;
       for(int i=0; i<val.length(); i++)
           num = 10*num + (int)(val.charAt(i)-'0');
       return num;
   }
  public static void main(String[] args) {
  	MyInteger obj=new MyInteger(5);
  	char[] a={'a','b','c','d','e'};
  	System.out.println(obj.getValue());
  	System.out.println(isPrime(obj));
  	System.out.println(isEven(obj));
  	System.out.println(isOdd(obj));
  	MyInteger obj1=new MyInteger(6);
  	System.out.println(obj.equals(5));
  	System.out.println(obj1.equals(obj));
  	System.out.println(parseInt(a));
  	System.out.println(parseInt("abcde"));

  }
}