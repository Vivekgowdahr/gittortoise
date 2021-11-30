package com.TE.String;

public class ObjectHashToStringetc 
{
	int id;

public ObjectHashToStringetc(int id) {
	
	this.id = id;
}

@Override
public String toString() {
	return "Get ready for mock";
}
public static void main(String[] args) 
{
	ObjectHashToStringetc A= new ObjectHashToStringetc(2);
	ObjectHashToStringetc B = new ObjectHashToStringetc(3);
	System.out.println(A);
	System.out.println("**********");
	System.out.println(A.getClass());//gives fully qualified class name 
	System.out.println("**********");
	System.out.println(A.hashCode());
	System.out.println("***********");
	System.out.println(B.hashCode());
	


}
}
