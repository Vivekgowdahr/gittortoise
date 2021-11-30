package com.techno.inheritance;

class HL
{
  public static void main(String args[])
  {
     HL2 obj1 = new HL2();
     HL3 obj2 = new HL3();
     HL4 obj3 = new HL4();
     //All classes can access the method of class A
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}

