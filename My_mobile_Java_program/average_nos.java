import java.util.Scanner;
public class average_nos {
	public static void main(String[] args) {
	    int h,e,m,gs,s,sum,percentage;
    System.out.print("Enter subject number");
    	Scanner r=new Scanner(System.in);
    	    System.out.println("Enter no. h sub");
	    h=r.nextInt();
	    	System.out.println("Enter no. e sub");
	    e=r.nextInt();
	    	System.out.println("Enter no. m sub");
	    m=r.nextInt();
	    	System.out.println("Enter no. gs sub");
	    gs=r.nextInt();
	    	System.out.println("Enter no. s sub");   
	    s=r.nextInt();
	sum = h + e + m + s + gs;
     percentage = sum/5;
    System.out.println("The average of Nos. " +percentage);
	}
}