import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Sonic extends MIDlet {
   private static Sonic midlet;
   private static Display display;
   private GameCanvas game;

   public Sonic() {
      System.out.println("sonic");
      System.out.println("Version 1.0.12");
      System.out.println("Build 3805");
      midlet = this;
      display = Display.getDisplay(midlet);
      this.game = new Game(this, -1);
      display.setCurrent(this.game);
      (new Thread(this.game)).start();
   }

   public final void startApp() {
   }

   public final void pauseApp() {
      System.err.println("pauseapp");
      this.game.pauseApp();
   }

   public final void destroyApp(boolean unconditional) {
   }
}
