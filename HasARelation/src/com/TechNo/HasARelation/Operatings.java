package com.TechNo.HasARelation;

public class Operatings 
{
double version;
int core;
String brand;
public  Operatings(double version,int core,String brand) 
{
	super();
	this.brand=brand;
	this.core=core;
	this.version=version;
}
@Override
public String toString() {
	return "Operatings [version=" + version + ", core=" + core + ", brand=" + brand + "]";
}

}
