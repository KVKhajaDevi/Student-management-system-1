package studentProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class LoginAndRegistration 
{

	public void register() throws FileNotFoundException
	{
		 Scanner sc = new Scanner(System.in); 
		
            System.out.println(" Enter User Name => ");
            String Uname = sc.nextLine();
            System.out.println(Uname);

            System.out.println(" Enter Password => ");
            String pass = sc.nextLine();
            System.out.println(pass);

            System.out.println(" Enter Confirm Password => ");
            String conPass = sc.nextLine();
            System.out.println(conPass);
            
            Uname= Uname.trim();
            pass = pass.trim();
            conPass = conPass.trim();
            
            String x= Uname+" "+pass;
            if(pass.equals(conPass))
            {         
             
            File f = new File("Registration.txt");
            	Scanner content = new Scanner(f);
            	
            	int flag=0;
                while (content.hasNextLine()) {
                  String data = content.nextLine();
                  if(data.equals(x))
                  {
                      System.out.println("Already Registered");
                      flag=1;
                      System.out.println("1. Registration. ");
                      System.out.println("2. Login. ");
                       
                      System.out.println("Enter your Choice");
                      int choice=sc.nextInt();
                      if(choice==1)
                      {
                          this.register();
                      }
                      else if(choice==2)
                      {
                          this.login();
                      }
                      else
                      {
                          System.out.println("Choose Proper Option");
                      }
                      break;
                  }
                  //content.close();
                }
                
                if(flag==0)
                {
                    try {
                    	BufferedWriter out = new BufferedWriter(new FileWriter("Registration.txt", true)); 
                        out.write(Uname+" "+pass+"\n");
                        out.close();
                    }
                    catch (Exception e) {
                        System.out.println("exception occoured" + e);
                    }
                     
                    System.out.println("Successfully Registered");
                    System.out.println("Please login");
                    this.login();
                }
        }
        else
        {
            System.out.println("Recheck");
            System.out.println("1. Registration. ");
            System.out.println("2. Login. ");
             
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            if(choice==1)
            {
                this.register();
            }
            else if(choice==2)
            {
                this.login();
            }
            else
            {
                System.out.println("Choose Proper Option");
            }
        }
       // sc.close();
    
	}
		public void login()
		{
	       	String Uname, pass;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter username:");
	        Uname = sc.nextLine();
	        System.out.println(Uname);
	        
	        System.out.print("Enter password:");
	        pass = sc.nextLine();
	        System.out.println(pass);
	        
	        Uname=Uname.trim();
	        pass=pass.trim();
	        String x= Uname+" "+pass;

	        try {
	             
	              File f = new File("Registration.txt");
	              Scanner content = new Scanner(f);
	        	
	              int flag=0;
	              while (content.hasNextLine()) {
	                String data = content.nextLine();
	                if(data.equals(x))
	                {
	                    System.out.println("Login Successful");
	                    System.out.println("Welcome to the Application.");
	                    flag=1;
	                    break;
	                }
	              }
	                if(flag==0)
	                {
	                    System.out.println("Login Failed");
	                    System.out.println("1. Registration. ");
	                    System.out.println("2. Login. ");
	                     
	                    System.out.println("Enter your Choice");
	                    int choice=sc.nextInt();
	                    if(choice==1)
	                    {
	                        this.register();
	                    }
	                    else if(choice==2)
	                    {
	                        this.login();
	                    }
	                    else
	                    {
	                        System.out.println("Choose Proper Option");
	                    }
	                }
	               
	     //         content.close();
	            } 
	            catch (Exception e) {            
	              System.out.println("Error.");
	              e.printStackTrace();
	            }
	         
	       // sc.close();
	    }
}                   


