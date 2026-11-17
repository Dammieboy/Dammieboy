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
    System.out.println("---Messages Menu---\n 1.Write Messages\n 2.Inbox\n 3.Outbox\n 4.Pictures Messages\n 5.Templates\n 6.Smiley\n 7.Message Settings\n 8.Info Services\n        9.Voice Mailbox number\n 10.Service Command Editor");
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
                  System.out.println("Invalid Messages Choice");
                  break;

                }
                
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
      
      default:
        System.out.println("Invalid Messages Choice");
        break;
      }  
    
}

case 3:
    System.out.println("Chat Done");
    break;
    
case 4:
				System.out.println("\n-----CALL REGISTER MENU---\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n");
				System.out.println("Enter your choice here: ");
				int callmenu = input.nextInt();
				switch(callmenu){
					case 1: System.out.println("\n 7 Missed calls"); break;
					case 2: System.out.println("\n 5 Received calls"); break;
					case 3: System.out.println("\n 07025319560\n 08056461194\n 08134567781"); break;
					case 4: System.out.println("\n Call list Erased Successfully"); break;
					case 5:
						System.out.println("\n---CALL DURATION OPTIONS---\n1.Last call duration\n2.All calls' duration\n3.Received calls' duration\n4.Dialled calls' duration\n5.Clear timers\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n 7 mins"); 
							break;
							case 2: System.out.println("\n 5 mins"); 
							break;
							case 3: System.out.println("\n  5mins"); 
							break;
							case 4: System.out.println("\nDialled calls duration"); 
							break;
							case 5: System.out.println("\n Timers cleared successfully"); 
							break;
						}
						break;
						  
						        default:
                    System.out.println("Invalid Call Register Choice");
                    break;
}
break;

case 5:
				System.out.println("\n--------TONES MENU------\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Message alert tone\n5. Keypad tones\n6. Warning tones\n7. Vibrating alert\n8. Screen saver\n");
				System.out.println("Enter your choice here: ");
				int tonesmenu = input.nextInt();
				switch(tonesmenu){
					case 1: System.out.println("\n Elixir"); 
					break;
					case 2: System.out.println("\n 8"); 
					break;
					case 3: System.out.println("\n Incoming call answered"); 
					break;
					case 4: System.out.println("\n Default tone"); 
					break;
					case 5: System.out.println("\n Default tone"); 
					break;
					case 6: System.out.println("\n Default tone"); 
					break;
					case 7: System.out.println("\n Default Alert"); 
					break;
					case 8: System.out.println("\n Jpg 1"); 
					break;
			
				}				
}
				
case 6:
				System.out.println("\n--------SETTINGS MENU------\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1:
						System.out.println("\n---------CALL SETTINGS OPTIONS-------\n1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sendng\n5.Phone line in use\n6.Automatic answer\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n OFF"); 
							break;
							case 2: System.out.println("\n ON"); 
							break;
							case 3: System.out.println("\nO N"); 
							break;
							case 4: System.out.println("\n OFF"); 
							break;
							case 5: System.out.println("\n 07025319560"); 
							break;
							case 6: System.out.println("\n OFF"); 
							break;
						}
						break;


							
					case 2:
						System.out.println("\n---------PHONE SETTINGS OPTIONS-------\n1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Confirm SIM service actions\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n English"); 
							break;
							case 2: System.out.println("\n ON"); 
							break;
							case 3: System.out.println("\n Nokia welcomes you to its new phone"); 
							break;
							case 4: System.out.println("\n MTN"); 
							break;
							case 5: System.out.println("\n Confirmed"); 
							break;
						}
						break;
					case 3:
						System.out.println("\n---------SECURITY SETTINGS OPTIONS-------\n1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Security level\n6.Change access codes\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n Requested"); 
							break;
							case 2: System.out.println("\n ON"); 
							break;
							case 3: System.out.println("\n ON"); 
							break;
							case 4: System.out.println("\n ON"); 
							break;
							case 5: System.out.println("\n HIGH"); 
							break;
							case 6: System.out.println("\n Changed"); 
							break;
						}
						break;
					case 4: System.out.println("\n Factory reset successful"); 
					break;
				}
				break;
			case 7: System.out.println("\nCall Diverted"); break;
			case 8:
				System.out.println("\n--------MUSIC MENU------\n1. Music player\n2. Radio\n3. Recorder\n4. Track list\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\n Music playing successfully"); 
					break;
					case 2: System.out.println("\n Radio playing successfully"); 
					break;
					case 3: System.out.println("\n Recording..."); 
					break;
					case 4: System.out.println("\n Nagode by Dusin Oyekan"); 
					break;
				}
				break;
			case 9: System.out.println("\n Games coming soon"); 
			break;
			case 10: System.out.println("\n Calculated successfully"); 
			break;
			case 11: System.out.println("\n Reminder set"); 
			break;
			case 12:
				System.out.println("\n--------CLOCK MENU------\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\n Alarm set"); 
					break;
					case 2: System.out.println("\n CLock set"); 
					break;
					case 3: System.out.println("\n Date set"); break;
					case 4: System.out.println("\nS topwatch started successfully"); 
					break;
					case 5: System.out.println("\n countdown started successfully"); 
					break;
					case 6: System.out.println("\n Date and Time updated"); 
					break;
				}
				break;
			case 13: System.out.println("\n Profile set successfully"); 
			break;
			case 14: System.out.println("\n services contacted successfully"); 
			break;
			case 15: System.out.println("\n MTN services contacted successfully"); 
			break;
		}
	}
}   
    

        
   
default:
    System.out.println("Invalid Main Menu Choice");
    break;
  }
}

  }
  
  





   
