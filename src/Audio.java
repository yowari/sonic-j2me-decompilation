import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class Audio {
   // $FF: renamed from: b int
   private static int options = 0;
   // $FF: renamed from: a java.lang.String[]
   public String[] audioTracks;
   // $FF: renamed from: b java.lang.String[]
   private String[] field_331;
   // $FF: renamed from: a int
   public int currentTrack = -1;
   // $FF: renamed from: c int
   private int interruptedTrack = -1;
   // $FF: renamed from: a boolean
   private boolean enableAudio = true;
   // $FF: renamed from: a javax.microedition.media.Player
   private Player player;
   // $FF: renamed from: a javax.microedition.media.PlayerListener
   private PlayerListener playerListener;

   public Audio(PlayerListener playerListener) {
      this.playerListener = playerListener;
   }

   // $FF: renamed from: a (int) boolean
   private boolean method_378(int var1) {
      switch (var1) {
         case 0:
            return true;
         case 1:
            if (this.audioTracks != null) {
               return true;
            }

            return false;
         case 2:
            if (this.field_331 != null) {
               return true;
            }

            return false;
         case 3:
            if (this.field_331 != null && this.audioTracks != null) {
               return true;
            }

            return false;
         default:
            return false;
      }
   }

   public final void setOptions(int newOptions) {
      options = newOptions;
      if (!this.method_378(options)) {
         options = 0;
      }

      if (options == 0) {
         this.closePlayer(this.player);
      }

   }

   public final void play(int track, int loopCount) {
      try {
         if (track != this.currentTrack || this.player != null && this.player.getState() != 400) {
            if (this.player != null) {
               this.closePlayer(this.player);
            }

            if ((options & 1) == 1) {
               this.player = this.createPlayer(this.audioTracks[track], "audio/midi");
               this.player.setLoopCount(loopCount);
               if (this.enableAudio) {
                  this.player.start();
               }

               this.currentTrack = track;
            }
         }

      } catch (Exception error) {
         System.err.println("error starting player " + error);
      }
   }

   public final void interruptTrack() {
      this.interruptedTrack = this.currentTrack;
      this.closePlayer(this.player);
   }

   public final void replayInterruptedTrack() {
      if (this.interruptedTrack != -1) {
         this.play(this.interruptedTrack, -1);
         this.interruptedTrack = -1;
      }

   }

   public final void closePlayer() {
      this.closePlayer(this.player);
   }

   private void closePlayer(Player player) {
      try {
         player.stop();
         player.deallocate();
         player.close();
         if (player == this.player) {
            this.currentTrack = -1;
         }

      } catch (Exception error) {
      }
   }

   private Player createPlayer(String file, String format) {
      Player player = null;
      file = file + ".mid";

      try {
         InputStream inputStream;
         (player = Manager.createPlayer(inputStream = this.getClass().getResourceAsStream(file), format)).addPlayerListener(this.playerListener);
         player.realize();
         player.prefetch();
         inputStream.close();
      } catch (Exception error) {
         System.err.println("error creating player " + error);
      }

      return player;
   }

   public final void interruptTrackAndPlay(int track, int loopCount) {
      this.interruptTrack();
      this.play(track, loopCount);
   }
}
