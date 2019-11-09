class Parent 
{ 
    int  show() { System.out.println("Parent's show()"); return 0;} 
} 
  
// Inherited class 
class Child extends Parent 
{ 
    // This method overrides show() of Parent 
   // @Override
    int show() { System.out.println("Child's show()"); 
    return 0;} 
} 
  
// Driver class 
class Test 
{ 
    public static void main(String[] args) 
    { 
        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
       // Parent obj1 = new Parent(); 
        //obj1.show(); 
  
        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Child obj2 = new Child(); 
       int a= obj2.show(); 
    } 
} 