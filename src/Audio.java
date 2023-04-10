import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

// $FF: renamed from: d
public final class Audio {
   // $FF: renamed from: b int
   private static int field_329 = 0;
   // $FF: renamed from: a java.lang.String[]
   public String[] field_330;
   // $FF: renamed from: b java.lang.String[]
   private String[] field_331;
   // $FF: renamed from: a int
   public int field_332 = -1;
   // $FF: renamed from: c int
   private int field_333 = -1;
   // $FF: renamed from: a boolean
   private boolean field_334 = true;
   // $FF: renamed from: a javax.microedition.media.Player
   private Player field_335;
   // $FF: renamed from: a javax.microedition.media.PlayerListener
   private PlayerListener field_336;

   public Audio(PlayerListener var1) {
      this.field_336 = var1;
   }

   // $FF: renamed from: a (int) boolean
   private boolean method_378(int var1) {
      switch (var1) {
         case 0:
            return true;
         case 1:
            if (this.field_330 != null) {
               return true;
            }

            return false;
         case 2:
            if (this.field_331 != null) {
               return true;
            }

            return false;
         case 3:
            if (this.field_331 != null && this.field_330 != null) {
               return true;
            }

            return false;
         default:
            return false;
      }
   }

   // $FF: renamed from: a (int) void
   public final void method_379(int var1) {
      field_329 = var1;
      if (!this.method_378(field_329)) {
         field_329 = 0;
      }

      if (field_329 == 0) {
         this.method_384(this.field_335);
      }

   }

   // $FF: renamed from: a (int, int) void
   public final void method_380(int var1, int var2) {
      try {
         if (var1 != this.field_332 || this.field_335 != null && this.field_335.getState() != 400) {
            if (this.field_335 != null) {
               this.method_384(this.field_335);
            }

            if ((field_329 & 1) == 1) {
               this.field_335 = this.method_385(this.field_330[var1], "audio/midi");
               this.field_335.setLoopCount(var2);
               if (this.field_334) {
                  this.field_335.start();
               }

               this.field_332 = var1;
            }
         }

      } catch (Exception var4) {
         System.err.println("error starting player " + var4);
      }
   }

   // $FF: renamed from: a () void
   public final void method_381() {
      this.field_333 = this.field_332;
      this.method_384(this.field_335);
   }

   // $FF: renamed from: b () void
   public final void method_382() {
      if (this.field_333 != -1) {
         this.method_380(this.field_333, -1);
         this.field_333 = -1;
      }

   }

   // $FF: renamed from: c () void
   public final void method_383() {
      this.method_384(this.field_335);
   }

   // $FF: renamed from: a (javax.microedition.media.Player) void
   private void method_384(Player var1) {
      try {
         var1.stop();
         var1.deallocate();
         var1.close();
         if (var1 == this.field_335) {
            this.field_332 = -1;
         }

      } catch (Exception var3) {
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) javax.microedition.media.Player
   private Player method_385(String var1, String var2) {
      Player var3 = null;
      var1 = var1 + ".mid";

      try {
         InputStream var4;
         (var3 = Manager.createPlayer(var4 = this.getClass().getResourceAsStream(var1), var2)).addPlayerListener(this.field_336);
         var3.realize();
         var3.prefetch();
         var4.close();
      } catch (Exception var5) {
         System.err.println("error creating player " + var5);
      }

      return var3;
   }

   // $FF: renamed from: b (int, int) void
   public final void method_386(int var1, int var2) {
      this.method_381();
      this.method_380(var1, var2);
   }
}
