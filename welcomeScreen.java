
package startuppcassistant;

// @author Peter McLane


import java.util.Scanner;

 
public class welcomeScreen {
    
   public void setupScreen () {
    
       
       Scanner scan = new Scanner (System.in);
       
       System.out.println("hello....");
       System.out.print("please enter your name: ");
       
       String inputName = scan.nextLine();
       
       System.out.print("hello " + inputName + " welcome to Desktop Sidekick!");
       System.out.println(" Desktop Sidekick is a tool that assists those who need ");
       System.out.println("help with navagating computers and also offers help to perform "
               + "basic computer functions. ");
       System.out.println("Still not sure what Desktop Sidekick does? type in \"calculator\" into"
               + " the search bar and see what happens...");
       System.out.print("Search: ");
       
       String searchInput = scan.nextLine();
       
       // add option to skip later on
       
       if(searchInput.toLowerCase().equals("calculator")){
           System.out.print("Opening calculator...");
           applicationOpen calc = new applicationOpen();
           calc.calculatorApp();
        }
       
       else if(searchInput.toLowerCase().equals("notepad")){
           System.out.println("Opening notepad...");
           applicationOpen ntpad = new applicationOpen();
           ntpad.notepadApp();
       }
       else if((searchInput.toLowerCase().equals("media player"))){
           System.out.println("Opening media player...");
           applicationOpen medplay = new applicationOpen();
           medplay.mediaplayerApp();
       }
       else if((searchInput.toLowerCase().equals("paint"))){
           System.out.println("Opening ms paint...");
           applicationOpen mpaint = new applicationOpen();
           mpaint.mspaint();
       }
       else if(((searchInput.toLowerCase().equals("word"))) || ((searchInput.toLowerCase().equals("microsoft word")))){
           System.out.println("Opening Microsoft Word...");
           applicationOpen mword = new applicationOpen();
           mword.msword();
       }
       
       
       
           
       
       
       
       
       
       
       
       
       
}
    
    
}
