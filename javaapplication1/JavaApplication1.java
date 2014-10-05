package javaapplication1;

// Practice of java nested loops, if else Scanner and CRAZE :P
// A Partially troubleshooted program (fingers crossed) exceptions not fixed
// J.K. mad man is Proud to present some crazy shit! JK's LOL Series :D xD

import java.util.Scanner;

public class JavaApplication1 
{
    static int hell=0; // :D LOLz
    
    public static void main(String[] args) 
    {
        System.err.println("\tWelcome to LOL's Series!!\n\n");
        startThisShit();
    }
    
    @SuppressWarnings("unused")
	public static void startThisShit()
    {
        boolean run=true;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter Starting number of LOL's Series: ");
        int Start = scan.nextInt();
        
        System.out.println("\nEnter Ending number of LOL's Series: ");
        int End = scan.nextInt();
        
        System.out.println("\nEnter number of repetitions of LOL's Series: ");
        int reps = scan.nextInt();
        
        System.out.println();
        
        // temp string to fix so called int 'bug' in java
		String temp = scan.nextLine();
        
        if(Start>End || reps<=0)
            {
                hell++;
                if (hell >=3 || (Start>End && reps == 0))
                {
                    System.err.println("Go To Hell!!!"); 
                    System.exit(0);
                }
                System.err.println("Damn you! Enter values correctly!\n\n");
                startThisShit();
            }
        
        ShitLoop:
        do
        {
            int runsOfDamnLoop=1;
            InnerLoop:
            while (runsOfDamnLoop <= reps)
            {
                if(runsOfDamnLoop ==1)
                {
                    System.out.println("Let's do this! :P");
                } else System.out.println("Let's do this again! :P");         
                doThisShit(Start, End);
                System.out.println("Number of repetitions: " 
                        + runsOfDamnLoop++ + " times");
                if(reps==1)
                {
                   break ShitLoop; 
                }
                if (runsOfDamnLoop > 2)
                {
                    System.out.print(" (COMPUTER): Why so much work for me? "
                            + "No way you lazy creep. "
                            + "Do so much repetitions yourself -_- \n ");
                    run=false;
                    System.out.println("InnerLoop Broken! :D");
                    continue ShitLoop;   
                }
                System.out.println("InnerLoop Continuing! :D");
            }
        } while(run);
        System.out.println("ShitLoop Broken! :D");
    scan.close();
    }
    
    public static void doThisShit(int start, int end)
    {
        DamnLoop:
        for ( int i = start; i<=end;)
        {
            System.out.print(i++ + ",");
            for(int x = start; x<i;)
            {
                if (i > end)
                    {
                        break DamnLoop;
                    }
                System.out.print(x++ + ","); 
            }
        }
        System.out.println("\nDamnLoop Broken! :D");        
    }
}
