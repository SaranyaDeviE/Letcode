package hello;

public class Practice_1 {

	/*	public static void main(String[] args) {
		System.out.println("public class");	
		Practice_2.displayMessage();
	}

}

class Practice_2 {
	public static void displayMessage() {
        System.out.println("Non public class");
    }
	
} 
/*
 
 
	/* *********************************************************************************************** */

	
/* public class Practice_1 {
public static void main(String[] args) {
	System.out.println("public class");	
     Practice_2.main();
}

}

class Practice_2 {
public static void main() {
    System.out.println("Non public class");
}

}  */

	
/* *********************************************************************************************** */

	
	public  static void createvideo() {
    	System.out.println("video created");
    }
    private static boolean uploadvideo() {
    	System.out.println("video uploaded");
    	return true;
    }
     public static void main(String[] args) {
		Practice_1 yt = new Practice_1();
		yt.createvideo();
    	
//    	createvideo();
//    	uploadvideo();
		
	}
    }
