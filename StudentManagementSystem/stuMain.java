package studentProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stuMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int ch,usr;
		char p;
		
		store ob = new store();
		
		try {
            
            File obj = new File("Registration.txt");
             
            if (obj.createNewFile()) 
            {
              System.out.println("File is created");
            } 
             
          } 
          catch (Exception e) 
          {
            System.out.println("An error occurred.");
            e.printStackTrace();
             
          }
      
      System.out.println("1. Registration. ");
      System.out.println("2. Login. ");
       
      System.out.println("Enter your Choice");
      ch=scan.nextInt();
      scan.nextLine();
       
      if(ch==1)
      {
          LoginAndRegistration user = new LoginAndRegistration();
          user.register();
      }
      else if(ch==2)
      {
          LoginAndRegistration user = new LoginAndRegistration();
          user.login();
      }
      else
      {
          System.out.println("Choose Proper Option");
      }
     // scan.close();
		
		do
		{
			
			System.out.println("#### WELCOME ####");
            
            System.out.println("1) ENTER 1 FOR ADDING DETAIL");
            System.out.println("2) ENTER 2 FOR SEARCHING");
            System.out.println("3) ENTER 3 FOR DELETION");
            System.out.println("4) ENTER 4 FOR UPDATION");
             System.out.println("5) ENTER 5 TO EXIT");
             
             System.out.println(" Enter your choice ");
             ch = scan.nextInt();
             
             switch (ch) 
             {
			     case 1 :
	                    ob.add();
				     break;

			     case 2 :
			    	 ob.search();
			    	 break;
			    	 
			     case 3 :
			    	 ob.delete();
			    	 break;
			    	 
			     case 4 :
			    	 ob.update();
			    	 break;
			    	 
			     case 5 : 
			    	 System.exit(0);
			    	 break; 
			    	 
		        default:
				     System.out.println("Enter correct choice");
				     break;
			}
        
             System.out.println("Do you want to continue y/n");
 	        p = scan.next().charAt(0);
 		}while(p=='y');	
	}

}
