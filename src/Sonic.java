import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Sonic extends MIDlet {
   // $FF: renamed from: a Sonic
   private static Sonic field_337;
   // $FF: renamed from: a javax.microedition.lcdui.Display
   private static Display field_338;
   // $FF: renamed from: a c
   private class_1 field_339;

   public Sonic() {
      System.out.println("sonic");
      System.out.println("Version 1.0.12");
      System.out.println("Build 3805");
      field_337 = this;
      field_338 = Display.getDisplay(field_337);
      this.field_339 = new class_2(this, -1);
      field_338.setCurrent(this.field_339);
      (new Thread(this.field_339)).start();
   }

   public final void startApp() {
   }

   public final void pauseApp() {
      System.err.println("pauseapp");
      this.field_339.method_22();
   }

   public final void destroyApp(boolean var1) {
   }
}
