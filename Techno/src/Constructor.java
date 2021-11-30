class Constructor {
	int a,b,c,d;
	Constructor(int a)
	{
		this.a=a;
	}
	Constructor (int a,int b)
	{
		this(a);
		this.b=b;
		this.a=a;
		
	}
	Constructor (double a,int d)
	{
		this(d);
		this.d=d;
		
	}
	

	
	
	public static void main(String[] args) {
		        Constructor d1=new Constructor(1);
		        System.out.println(d1.a);
		        Constructor d2=new Constructor(2,4);
                System.out.println(d2.a);
                System.out.println(d2.b);
                System.out.println(d1.a);
                Constructor d3=new Constructor(2,4);
                System.out.println(d2.a);
                System.out.println(d3.d);
                System.out.println(d3.a);
	}

}