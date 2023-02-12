import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int num1, num2, choice;
	    float result;
	    System.out.println("Enter 2 numbers:");
	    Scanner scan = new Scanner(System.in);
	    num1 = scan.nextInt();
	    num2 = scan.nextInt();
	    System.out.println("1 for addition 2 for subtraction 3 for multiplication 4 for dividion:");
	    choice = scan.nextInt();
	    switch(choice){
	    case 1:
	        result=num1+num2;
	        System.out.println("result=" + result);
	        break;
	    case 2:
	        result=num1-num2;
	        System.out.println("result=" + result);
	        break;
	    case 3:
	        result=num1*num2;
	        System.out.println("result=" + result);
	        break;
	    case 4:
	        result=num1/num2;
	        System.out.println("result=" + result);
	        break;
	    default:
	        System.out.println("Noting for you!");

	}

}
}
