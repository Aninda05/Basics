import java.applet.*;
import java.awt.*;

 /* <applet code = "ball" width = 400 height = 200> </applet> */
public class ball extends Applet implements Runnable
 {
 Thread t;
 int x = 0;
 int y = 0;
 int r,g,b;
 Color c;

public void start()
 {
 t = new Thread(this);
 t.start();
 }

public void paint(Graphics g)
   {
	   g.setColor(c);
      g.fillOval(x,y,100,100);
    }

public void run()
 {
	 r=(int)(Math.random()*256);
		b=(int)(Math.random()*256);
		g=(int)(Math.random()*256);
		c=new Color(r,g,b);
   try
      {
      for(;;)
       {
                for(;;)
            {
                 if(y == 120)
                     {
                      break;
                     }
    else if (x == 390)
        {
     x = 0;
     y = 0;
    repaint();
         }
                    else
                     {
                     y = y +3;
                      x = x +3;
                     Thread.sleep(100);
               repaint();
               }
                }
           for(;;)
              {
               if(y==0)
                   {
                        break;
                        }
               else if (x == 390)
           {
          x = 0;
          y = 0;
                 repaint();
    }
    else
                 {
        y = y-3;
               x = x +3;
               Thread.sleep(100);
                repaint();
               }
                } 
            run();
       }
  }

catch(InterruptedException e)
    {

    }
 }
}