import greenfoot.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Vocabulary 
{
    static ArrayList<World> back = new ArrayList<World>();
    static String vocab_List;
    static Scanner list =  null;
    static ArrayList<String> last = new ArrayList<String>();
    static Scanner all;
    static ArrayList<String> problems = new ArrayList<String>();
    static Map<String, String> answers = new HashMap<String, String>();
    static int x2 = 0;
    static int y = 1;
    static int count= 0;
    static boolean an;
    static World help;
    static int right = 0;
    static Class putin = Vocabulary.class;
    static InputStream put;
    static BufferedReader input ;
    static String[] def;
    static int time = 0;
    private static String subject = "";
    static ArrayList<String> Files = new ArrayList<String>();
    static GreenfootImage img;
    static Spare_Image tale;

    public static boolean run() throws IOException
    {      
        right = 0;
        Collections.shuffle(problems);
        for(int x = 0; x < 3; x++)
        {
            def = answers.get(problems.get(x)).split(" ");
            String answer = Greenfoot.ask(problems.get(x));
            count = 0;
            for(String temp: def)
            {
                if(answer.toLowerCase().contains(temp.toLowerCase()))
                    count++;
            }
            if(count > def.length/2 && count > 1 || count == def.length)
            {
                help.showText("Correct",help.getWidth()/2,help.getHeight()/4+(y*25));
                Greenfoot.delay(50);
                right++;
            }
            else
            {
                print("Actually... the answer is " + answers.get(problems.get(x)));
                Greenfoot.delay(50);
                //while(help.getObjects(Spare_Image.class).contains(tale))
                    help.removeObjects(help.getObjects(Spare_Image.class));
            }
            if(right >= 2)
            {
                an = true;
            }
            else
            {
                an = false;
            }
            try 
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }      
            for(int y = 0; y < time; y++)
            {
                help.showText("",help.getWidth()/2,help.getHeight()/4+(y*25));
            }
        }
        return an;
    }

    public static boolean run(int num) throws IOException
    {      
        right = 0;
        Collections.shuffle(problems);

        for(int x = 0; x < num; x++)
        {
            def = answers.get(problems.get(x)).split(" ");
            String answer = Greenfoot.ask(problems.get(x));
            count = 0;
            for(String temp: def)
            {
                if(answer.toLowerCase().contains(temp.toLowerCase()))
                    count++;
            }
            if(count > def.length/2 && count > 1 || count == def.length)
            {
                help.showText("Correct",help.getWidth()/2,help.getHeight()/4+(y*25));
                Greenfoot.delay(50);
                right++;

            }
            else
            {
                print("Actually... the answer is " + answers.get(problems.get(x)));
                Greenfoot.delay(50);
                //while(help.getObjects(Spare_Image.class).contains(tale))
                    help.removeObjects(help.getObjects(Spare_Image.class));
            }
            if(right >= num/2)
            {
                an = true;
            }
            else
            {
                an = false;
            }
            try 
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }      
            for(int y = 0; y < time; y++)
            {
                help.showText("",help.getWidth()/2,help.getHeight()/4+(y*25));
            }
        }
        return an;
    }

    public static void setBack(World world)
    {
        back.add(world);
    }
    public static void setSubject(String sub)
    {
        subject = sub;
    }
    public static void setMode(ArrayList<String> lesson) throws IOException
    {
        problems.clear();
        answers.clear(); 
        x2=0;
        for(int u = 0; u < lesson.size(); u++)
        {
            String line;
            put = putin.getResourceAsStream("/" + subject + lesson.get(u));
            input = new BufferedReader(new InputStreamReader(put));
            while((line = input.readLine()) != null)
            {
                problems.add(line);
                answers.put(problems.get(x2),input.readLine());
                x2++;
            }
            input.close();
        }
    }
    public static String getSubject()
    {
        return (subject);
    }
    public static void setHelp(World hell)
    {
        help = hell;
    }
    public static void print(String printed)
    {
        time = 0;
        if(printed.length() > 30)
        {
            int axis = 0;
            int x = 0;
            String bob = "";
            String [] printing = printed.split(" ");
            for(int y = 0; y < (printed.toCharArray().length)/40;y++)
            {
                bob="";
                while(bob.length() < 40 && x < printing.length)
                {
                    bob+= printing[x]+" ";
                    x++;
                }
                //help.showText(bob,help.getWidth()/2,help.getHeight()/4+axis);
                 img = new GreenfootImage(bob, 40, Color.BLACK, Color.WHITE);
                tale =  new Spare_Image(img, help);
                help.addObject(tale, help.getWidth()/2,20 + axis);
                time++;
                axis+=50;
                time++;
            }
            bob="";
            while(x < printing.length)
                {
                    bob+= printing[x]+" ";
                    x++;
                }
            //help.showText(bob,help.getWidth()/2,help.getHeight()/4+axis);
            img = new GreenfootImage(bob, 40, Color.BLACK, Color.WHITE);
            tale =  new Spare_Image(img, help);
            help.addObject(tale, help.getWidth()/2,20+axis);
            time++;
        }
        else
        {
            //help.showText(printed,help.getWidth()/2,help.getHeight()/4);
             img = new GreenfootImage(printed, 40, Color.BLACK, Color.WHITE);
             tale =  new Spare_Image(img, help);
            help.addObject(tale, help.getWidth()/2,help.getHeight()/4);
            time++;
        }
    }
    public static void selections(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
				if (file.isDirectory()) {
					Files.add(file.getCanonicalPath());
					selections(file);
				} else {
					Files.add(file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}