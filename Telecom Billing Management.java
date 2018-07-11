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
