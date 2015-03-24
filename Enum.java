import javax.swing.JOptionPane;



   public class Enum {
 	 enum Seasons { January, February, March, April, May, June, July, August, September, October, November, December}

 
   public static void main(String[] args) {

         
	     Seasons[] choices = { Seasons.January,Seasons.February, Seasons.March, Seasons.April, Seasons.May, Seasons.June, Seasons.July, Seasons.August, Seasons.September, Seasons.October, Seasons.November, Seasons.December };
	     
         Seasons select=(Seasons)JOptionPane.showInputDialog(null, "Select A Month.", "Seasons", JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);
         while(select!=null){
         
           switch(select){
            case December:
        	   JOptionPane.showMessageDialog(null,"Do you want to build a snowman");
           break;
            case January:
        	   JOptionPane.showMessageDialog(null,"Do you want to build a snowman");
           break;
            case February:
        	   JOptionPane.showMessageDialog(null,"Do you want to build a snowman");
           break;
            case March:
        	   JOptionPane.showMessageDialog(null,"Happy Spring Days!");
           break;
            case April:
        	   JOptionPane.showMessageDialog(null,"Happy Spring Days!");
           break;
            case May:
        	   JOptionPane.showMessageDialog(null,"Happy Spring Days!");
           break;
            case June:
        	   JOptionPane.showMessageDialog(null,"Its Summer Time");
           break;
            case July:
        	   JOptionPane.showMessageDialog(null,"Its Summer Time");
           break;
            case August:
        	   JOptionPane.showMessageDialog(null,"Its Summer Time");
           break;
            case September:
        	   JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
           break;
            case October:
        	   JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
           break;
            case November:
        	   JOptionPane.showMessageDialog(null," Welcome to the foliage season!");
           break;
          
           }
           select=(Seasons)JOptionPane.showInputDialog(null, "Select A Month.", "Seasons", JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);

        }
	     }
   }

               

        