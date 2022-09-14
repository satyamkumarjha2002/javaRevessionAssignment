import javafx.scene.Parent;

// Problem 1:
// Can super class reference variable can hold an object of sub class? Give Examples.

/*Ans:-
 * Yes we can store a child class object in the super class refrence varable
 */

class Parrent{

}

class Child extends Parent{

}

class Main{
        public static void main(String[] args) {
                Parrent p = new Child();
        }
}

//Problem 2 : Answer the following :

//a) Which of the line will give error and Why ?

interface ExampleInterface1 {
		int value1 = 10; // Line 1
		public int value2 = 15; // Line 2
		public static int value3 = 20; // Line 3
		public static final int value4 = 25; // Line 4
		private int value5 = 10; // Line 5
}

//Hrere line number five will give the error becaseu we can't make private variable
//inside an interface.

//b) Below code will give error or not ? If Yes, Then give reason

interface ExampleInterface1 {
		void method1();

		default void method5() {
				System.out .println("Method5");
		}
}

//This code will note give any type of error we can define a default function 
//inside interface from JDK 1.8;


//Problem 4 : What will be the output of below code 
//a)
class Test {
        int a, b;
    
            Test(){
                    this(2, 4);
            }
    
            Test(int a, int b){
                    this();
            }
        public static void main(String[] args) {
           Test a = new Test();
        }
}

//This code will give an error of stack overflow because we are call
//of construcotr become rescurssive. and it will give an stack overflow error

//b)

class Animal{

	String name;

	Animal(){
		this.name = "Lion"; 
	}

	public Animal(String name){
		this.name = name;
	}
        
}


Animal a = new Animal("tiger");
System.out.println(a.name); 


Animal b = new Animal(); 
System.out.println(b.name); 

//