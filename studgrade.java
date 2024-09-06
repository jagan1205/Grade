import java.io.*;
import java.util.Scanner;
class studgrade {  

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	n=input.nextInt();
	if (n>=90){
		System.out.println("Grade A");
	}
	else if (n>=80 && n<90){
		System.out.println("Grade B");
	}
	else if (n>=70 && n<80){
		System.out.println("Grade C");
	}
	else if (n>=60 && n<70){
		System.out.println("Grade D");
	} 
	else{
		System.out.println("Fail");
	}
    }  
}