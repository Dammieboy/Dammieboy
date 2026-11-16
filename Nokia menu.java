import java.util.Scanner;
public class NokiaMenu{
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
    case 8: System.out.println("b card sent"); 
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
          }
          
    case 10:System.out.println("Speed Dial Successfully"); 
    break;
    case 11:System.out.println("Voice tags successfully"); break;
    
    default:
    System.out.println("Invalid Phone Book Choice");
    break;
    }
  
case 2:



}
}




