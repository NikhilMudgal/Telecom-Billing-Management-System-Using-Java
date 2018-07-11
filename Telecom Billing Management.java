package project;
import java.util.Scanner;
public class Final {
  String name;
  String phonenumber;
  long amount;
  void Add(){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the name of the customer");
  name = scan.next();
  System.out.println("Enter the contact number of the customer");
  phonenumber = scan.next();
  System.out.println("Enter the amount deposited by the customer");
  amount = scan.nextInt();
  System.out.println("Record Successfully Added");
  System.out.println();
	 }

static void Display(Final f[],int N){
   for(int i=0;i<N;i++){
	  System.out.println("The name of the person is "+f[i].name);
   System.out.println("The contact number of the person is "+f[i].phonenumber);
   System.out.println("The amount in the account of the person is "+f[i].amount);
   }
  }
