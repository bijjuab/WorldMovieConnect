package emailapp;

import java.util.Scanner;

public class email {
  private String firstname;
  private String Lastname;
  private String Password;
  private String department;
  private int Mailboxcapacity;
  private String Alternamteemail;
  private int defaultPasswordLength = 9;
  //constructor  to receive first name and last name
  //adding more comments
  public email(String firstname, String Lastname){
	  this.firstname = firstname;
	  this.Lastname = Lastname;
	  System.out.println("Email created for " + this.firstname + " " + this.Lastname);
	  //call method which asks the department
	  this.department = Department();
	  System.out.println("Department entered is " + this.department);
	  this.Password = password(defaultPasswordLength);
	  System.out.println("Your new password is " + this.Password);
  }
  
  //ask for the department
  private String Department(){
	  System.out.println("Enter the department\n 1 for sales\n 2 for development\n 3 for Accounting\n 0 for none");
	  Scanner in = new Scanner(System.in);
	  int depchoice = in.nextInt();
	  if (depchoice == 1){ return "sales";}
	  else if (depchoice == 2){ return "development";}
	  else if (depchoice == 3){ return "Accounting";}
	  else { return ""; }
  }
  //generate random password
  private String password(int length){
	  String passwordset = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvXxYyZz1!2@3#4$5%6^7&8*9(0)";
	  char[] password = new char[length];
	  for (int i=0; i<length; i++){
		  int rand = (int) ( Math.random() * passwordset.length());
		  password[i] = passwordset.charAt(rand);
	  }
		  return new String(password);
	  
  }
  //set the  mailbox capacity

public int getMailboxcapacity() {
	return Mailboxcapacity;
}

public void setMailboxcapacity(int mailboxcapacity) {
	this.Mailboxcapacity = mailboxcapacity;
}
  
  //set the alternative email
  
  //change the password
  
}
