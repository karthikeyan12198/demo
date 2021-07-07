package test;

import java.util.*;

import org.openqa.grid.web.servlet.TestSessionStatusServlet;

public class testtwo extends newtest{
	public static void methodtwo(int a, int b) {
		int c=a+b;
		System.out.println(c);
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");
	    System.out.println("karthi");
	    int userName = myObj.nextInt();
	    //String w=myObj.next();
//	    float f=2.2f;
//	    double fe=2.20d;
//	    		
	    int e=userName + c;
	    System.out.println(e);
	    
	}

	

	public static void main(String[] args) {
		//testtwo.methodtwo(10, 30);
		testtwo.methodtwo(30, 40);
		testtwo t=new testtwo();
		newtest.one();
		t.methodOne();
	}

	
	

}
