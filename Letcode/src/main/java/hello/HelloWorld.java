package hello;

//import hello.Practice_1; 


public class HelloWorld {
   public static void main(String[] args) {     //Hello World          
	System.out.println("HelloWorld");
	
	// Declaring variables Datatype
	String name = "Saranya";
	byte age = 26;
	float weight = 35.7f;
	double height = 141.36;
	long phonenumber = 7888888888956l;
	short salary =10000;
	int num = 546;	
	char initial = 'E';
	boolean code_pass = true;
	// Printing variables on single lines
	System.out.println(name + age+weight+height+phonenumber+salary+num+initial+code_pass);
    // Printing variables on multiple lines using a single println statement
	System.out.println(name+'\n'+ age+'\n'+weight+'\n'+height+'\n'+phonenumber+'\n'+salary+'\n'+num+'\n'+initial+'\n'+code_pass);
   }

}
