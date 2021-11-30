package com.TechNo.HasARelation;

public class Battery 
{
double mAh;
String brand;
double volt;
public  Battery(double mAh,String brand,double volt)
{
	super();
	this.brand=brand;
	this.mAh=mAh;
	this.volt=volt;
}
@Override
public String toString() {
	return "Battery [mAh=" + mAh + ", brand=" + brand + ", volt=" + volt + "]";
}

}
