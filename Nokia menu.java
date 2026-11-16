import java.util.Scanner;
public class Nokia5510{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("------MENU FUNCTIONS------\n 1.Phone Book\n 2.Messages\n 3.Chat\n 4.Call Register\n 5.Tones\n 6.Settings\n 7.Call Divert\n 8.Music\n 9.Games\n 10.Calculator\n 11.Reminder\n 12.Clock\n 13.Profile\n 14.Services\n 15.Sim Services\n");
System.out.println("Enter Your Choice");
int choice = input.nextInt();
switch(choice){
  case 1: 
          System.out.println("---Phone Book Options---\n 1.Search\n 2.Services Nos\n 3.Add Names\n 4.Erase\n5.Edit\n 6.Copy\n 7.Assign tone\n 8.Send b'card\n 9.Options\n 10.Speed Dial\n 11.Voice tags\n");
          System.out.println("Enter your Choice");
          int phonechoice = input.nextInt();
    switch(phonechoice){
    case 1:System.out.println("Searched"); 
    break;
    case 2: System.out.println("07025319560"); 
    break;
    case 3: System.out.println("Name added"); 
    break;
    case 4: System.out.println("Erased");
    break;
    case 5: System.out.println("Edited"); 
    break;
    case 6: System.out.println("Copied"); 
    break;
    case 7: System.out.println("Tone Assigned"); 
    break;
    case 8: System.out.println("card sent"); 
    break;
    case 9: 
      System.out.println("---Options Menu---\n 1.Memory in use\n 2.Type of View\n 3.Memory Status\n");
      System.out.println("Enter your choice");
      int optionchoice = input.nextInt();
        switch(optionchoice){
          case 1: System.out.print("Memory in use"); 
          break;
          case 2: System.out.print("Type of view"); 
          break;
          case 3: System.out.print("Memory Status"); 
          break;
          
          default:
          System.out.print("Invalid Option choice");
          break;  
        }
        break;
    case 10: System.out.println("Speed Dial Successfully"); 
    break;
    case 11: System.out.println("Voice tags successfully"); 
    break;
  
    default:
      System.out.println("Invalid Phone Book Choice");
      break;
  }
  break;
  
case 2:
System.out.println("---Messages Menu---\n 1.Write Messages\n 2.Inbox\n 3.Outbox\n 4.Pictures Messages\n 5.Templates\n 6.Smiley\n 7.Message Settings\n 8.Info Services\n 9.Voice Mailbox number\n 10.Service Command Editor");
System.out.println("Enter your choice");
int messageschoice = input.nextInt();
  switch(messageschoice){
    case 1: System.out.print("Messages Written"); 
    break;
    case 2: System.out.print("Inbox Messages");
    break;
    case 3: System.out.print("Outbox Empty");
    break;
    case 4: System.out.print("Pictures Messages");
    break;
    case 5: System.out.print("Templates Saved");
    break;
    case 6: System.out.print("Smiley Sent");
    break;
    
    case 7:
    System.out.println("---Messages Settings---\n1.Set 1\n2.Common Setting");
    System.out.println("Enter your choice");

    int settingschoice = input.nextInt();

    switch(settingschoice) {

        case 1:
            System.out.println("---Set 1 Settings---\n1.Message Center Number\n2.Message Sent as\n3.Message Validity");
            System.out.println("Enter your choice");

            int set1choice = input.nextInt();

            switch(set1choice) {
                case 1:
                    System.out.println("7025319560");
                    break;

                case 2:
                    System.out.println("Text Messages");
                    break;

                case 3:
                    System.out.println("Message Valid");
                    break;

                default:
                    System.out.println("Invalid Message Choice");
                    break;
            }
            break;

        case 2:
            System.out.println("---Common Settings---\n1.Delivery Report\n2.Reply via the same centre\n3.Character support");
            System.out.println("Enter your choice");

            int commonsettingschoice = input.nextInt();

            switch(commonsettingschoice) {
                case 1:
                    System.out.println("Delivery Successful");
                    break;

                case 2:
                    System.out.println("ON");
                    break;

                case 3:
                    System.out.println("ON");
                    break;

                default:
                    System.out.println("Invalid Common Setting Choice");
                    break;
            }
            break;

        default:
            System.out.println("Invalid Setting Choice");
            break;
    }
    break;
    
    case 8:
      System.out.println("Info Services");
        break;

    case 9:
      System.out.println("Voice Mailbox Number");
        break;

    case 10:
      System.out.println("Service Command Editor");
        break;
    }
    break;

    default:
        System.out.println("Invalid Messages Choice");
        break;
    }
    break;
      
    default:
      System.out.println("Invalid Main Menu Choice");
      break;
  

    }

}
}




   
