import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class Game extends GameCanvas {
   // $FF: renamed from: a long
   public long field_328;

   public Game(MIDlet midlet, int resume) {
      super(midlet, resume);
   }

   // $FF: renamed from: e (boolean) void
   private void method_264(boolean var1) {
      int var2 = 0;

      for(int var3 = super.field_195.length - 1; var3 >= 0 && var2 < super.field_196; --var3) {
         if (super.field_195[var3][24] == 1) {
            ++var2;
            int var4 = super.field_195[var3][1];
            if (var1 == (var4 == 45 || var4 == 26 || var4 == 53 || var4 == 10 || var4 == 88 && super.field_195[var3][4] == 127)) {
               super.field_199 = super.field_195[var3];
               this.method_271(super.field_199[1]);
            }
         }
      }

   }

   // $FF: renamed from: aa () void
   private void method_265() {
      if (GameCanvas.gameWidth < GameCanvas.screenWidth) {
         int var1 = GameCanvas.screenWidth - GameCanvas.gameWidth >> 1;
         GameCanvas.g.translate(var1, 0);
      }

      GameCanvas.g.setClip(0, GameCanvas.gameY, GameCanvas.gameWidth, GameCanvas.gameHeight);
      class_0.method_1(GameCanvas.g, GameCanvas.cameraPosition[0], GameCanvas.cameraPosition[1], true);
      this.method_34(GameCanvas.g, super.zoneID == 1 || super.zoneID == 5);
      this.method_264(false);
      this.method_207();
      if (!GameCanvas.field_125) {
         this.method_109();
      }

      this.method_113();
      this.method_33(GameCanvas.g, super.zoneID == 1 || super.zoneID == 5);
      this.method_264(true);
      if (GameCanvas.field_125) {
         this.method_109();
      }

      if (GameCanvas.gameWidth < GameCanvas.screenWidth) {
         GameCanvas.g.translate(-(GameCanvas.screenWidth - GameCanvas.gameWidth >> 1), 0);
      }

      this.method_28();
      GameCanvas.g.setClip(0, 0, GameCanvas.screenWidth, GameCanvas.screenHeight);
   }

   // $FF: renamed from: ab () void
   private void method_266() {
      switch (super.appState) {
         case 1:
            this.method_147();
            break;
         // game
         case 2:
            if (super.redrawAllGameScreen || super.clearedAct) {
               GameCanvas.drawScreenBackground(0, 0, GameCanvas.screenWidth, GameCanvas.screenHeight);
               GameCanvas.drawSonicLogo();
               GameCanvas.redrawRingAndScoreCounter = true;
               GameCanvas.redrawLivesCounter = true;
               GameCanvas.redrawTimer = true;
               super.redrawAllGameScreen = false;
            }

            if (super.field_32 % 5 == 0 || super.clearedAct) {
               this.method_37();
            }

            this.method_265();
            ++super.field_32;
            break;
         case 3:
            this.method_155();
            GameCanvas.g.setColor(0);
            GameCanvas.g.fillRect(0, GameCanvas.gameY, GameCanvas.fullGameWidth, GameCanvas.gameHeight);
            super.field_79 = GameCanvas.fullGameWidth + GameCanvas.field_81[GameCanvas.field_215[super.zone]][2] >> 1;
            int[] var2 = new int[]{82, 100, 108, 116, 100, 84};
            GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[10][0], GameCanvas.field_81[10][1], GameCanvas.field_81[10][2], GameCanvas.field_81[10][3], GameCanvas.field_35[0], super.field_79 - GameCanvas.field_81[10][2] - 1, var2[0], 20, false);
            if (super.zone == 6) {
               GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[3][0], GameCanvas.field_81[3][1], GameCanvas.field_81[3][2], GameCanvas.field_81[3][3], GameCanvas.field_35[0], super.field_79 - 48, var2[1], 20, false);
            } else {
               GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[4 + super.act][0], GameCanvas.field_81[4 + super.act][1], GameCanvas.field_81[4 + super.act][2], GameCanvas.field_81[4 + super.act][3], GameCanvas.field_35[0], super.field_79 - GameCanvas.field_81[10][2] + 25, var2[2], 20, false);
               GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[8][0], GameCanvas.field_81[8][1], GameCanvas.field_81[8][2], GameCanvas.field_81[8][3], GameCanvas.field_35[0], super.field_79 - GameCanvas.field_81[10][2] + 1, var2[3], 20, false);
               GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[3][0], GameCanvas.field_81[3][1], GameCanvas.field_81[3][2], GameCanvas.field_81[3][3], GameCanvas.field_35[0], super.field_79 - GameCanvas.field_81[GameCanvas.field_215[super.zone]][2], var2[4], 20, false);
            }

            GameCanvas.drawRegion(GameCanvas.g, GameCanvas.uiImages[10], GameCanvas.field_81[GameCanvas.field_215[super.zone]][0], GameCanvas.field_81[GameCanvas.field_215[super.zone]][1], GameCanvas.field_81[GameCanvas.field_215[super.zone]][2], GameCanvas.field_81[GameCanvas.field_215[super.zone]][3], GameCanvas.field_35[0], super.field_79, var2[5], 24, false);
            GameCanvas.g.drawImage(GameCanvas.uiImages[4], GameCanvas.fullGameWidth - 10, GameCanvas.uiContentY + (GameCanvas.uiContentHeight >> 1), 20);
            GameCanvas.g.drawImage(GameCanvas.uiImages[5], 10, GameCanvas.uiContentY + (GameCanvas.uiContentHeight >> 1), 24);
            break;
         // Loading Act
         case 4:
            GameCanvas.drawScreenBackground(0, 0, GameCanvas.fullGameWidth, GameCanvas.gameY);
            GameCanvas.drawScreenBackground(0, GameCanvas.gameY + GameCanvas.gameHeight, GameCanvas.fullGameWidth, GameCanvas.gameY);
            GameCanvas.drawSonicLogo();
            super.redrawAllGameScreen = false;
            GameCanvas.redrawLivesCounter = true;
            GameCanvas.g.setColor(0);
            GameCanvas.g.fillRect(0, GameCanvas.gameY, GameCanvas.fullGameWidth, GameCanvas.gameHeight);
         case 5:
         default:
            break;
         // continue
         case 6:
            super.commandTexts[0] = "";
            this.method_155();
            ++super.field_32;
            this.method_254();
            break;
         case 7:
            ++super.field_32;
            this.method_256();
            break;
         case 8:
            this.method_259();
            break;
         case 9:
            this.method_262();
            break;
         // Pause menu
         case 10:
         case 11:
            GameCanvas.drawScreenBackground(0, 0, GameCanvas.screenWidth, GameCanvas.screenHeight);
            this.method_265();
            GameCanvas.g.setColor(0);

            for(int line = 0; line < GameCanvas.gameHeight; line += 2) {
               GameCanvas.g.fillRect(0, line + GameCanvas.gameY, GameCanvas.fullGameWidth, 1);
            }

            if (super.appState == 11) {
               this.method_158(super.texts[85], false);
               this.method_148(super.texts[24], 2, 0, super.currentPauseMenuItem == 0);
               this.method_148(super.texts[25], 2, 1, super.currentPauseMenuItem == 1);
            } else {
               this.method_158(super.texts[60], false);
               this.method_148(super.texts[70], 2, 0, super.currentPauseMenuItem == 0);
               this.method_148(super.texts[71], 2, 1, super.currentPauseMenuItem == 1);
            }

            super.redrawAllGameScreen = true;
      }

      if (super.appState == 4 || super.appState == 2) {
         this.method_267();
      }

      if (super.field_254) {
         GameCanvas.drawSonicLogo();
         super.field_254 = false;
      }

      if (super.appState != 2 || super.field_32 % 5 == 0) {
         this.method_26();
      }

   }

   // $FF: renamed from: ac () void
   private void method_267() {
      int var1;
      int var2;
      if (super.field_252) {
         GameCanvas.g.setColor(0);

         for(var1 = 0; var1 < 10; ++var1) {
            if ((var2 = 24 - (super.field_251 - var1) * 4) >= 0) {
               if (var2 > 24) {
                  var2 = 24;
               }

               GameCanvas.g.fillRect(var1 * 24 + (24 - var2), 0, var2, 240);
            }
         }

         if (22 < super.field_251) {
            super.field_251 = 0;
            super.field_252 = false;
         }

         ++super.field_251;
      }

      this.method_175();
      if (super.field_253) {
         GameCanvas.g.setColor(0);

         for(var1 = 0; var1 < 10; ++var1) {
            if (super.field_251 - var1 > 0) {
               if ((var2 = super.field_251 - var1 << 2) > 24) {
                  var2 = 24;
               }

               GameCanvas.g.fillRect(var1 * 24, GameCanvas.uiContentY, var2, GameCanvas.uiContentHeight);
            }
         }

         if (22 < super.field_251) {
            super.field_251 = 0;
            super.field_253 = false;
         }

         ++super.field_251;
      }

      if (super.field_38) {
         this.method_154(super.texts[49], GameCanvas.fullGameWidth >> 1, GameCanvas.gameY + GameCanvas.gameHeight - GameCanvas.defaultFontHeight - 2, 16777215, 658170);
      }

   }

   public final void paint(Graphics g) {
      try {
         GameCanvas.g = g;
         this.method_266();
         if (super.cheatsEnabled) {
            Font currentFont = g.getFont();
            String text;
            int tmp;
            if (super.cheatsOptions[1]) {
               if ((tmp = super.lastFrameLags[super.nextFrameLagIndex]) != 0) {
                  text = String.valueOf(1000 / tmp);
               } else {
                  text = "??";
               }

               text = text + " fps";
               g.setColor(0);
               g.fillRect(0, 0, currentFont.stringWidth("XXXXXX"), GameCanvas.defaultFontHeight);
               g.setColor(0xFFFFFF);
               g.drawString(text, 0, 0, 20);
            }

            if (super.cheatsOptions[3]) {
               text = Integer.toHexString(GameCanvas.cameraPosition[0]).toUpperCase() + ", " + Integer.toHexString(GameCanvas.cameraPosition[1]).toUpperCase();
               tmp = currentFont.stringWidth(text);
               g.setColor(0);
               g.fillRect(GameCanvas.fullGameWidth - tmp, 0, tmp, GameCanvas.defaultFontHeight);
               g.setColor(0xFFFFFF);
               g.drawString(text, GameCanvas.fullGameWidth, 0, 24);
            }
         }

         GameCanvas.g = null;
      } catch (Throwable error) {
      }
   }

   // $FF: renamed from: ad () void
   private void method_268() {
      super.field_136 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < super.field_195.length && var2 < super.field_196; ++var3) {
         if (super.field_195[var3][24] == 1) {
            ++var2;
            super.field_199 = super.field_195[var3];
            this.method_270();
            if (super.field_199[1] != 17 || super.field_199[4] != 55) {
               if (super.field_199[0] <= 0 && super.field_199[21] == 0) {
                  super.field_198[super.field_199[20]] = true;
                  super.field_197[super.field_199[20]] = false;
                  this.method_120(var3);
               } else if (!super.field_197[super.field_199[20]] && super.field_199[1] < 120 && super.field_199[1] != 42 && super.field_199[1] != 43 && super.field_199[1] != 36) {
                  this.method_120(var3);
               } else if (this.method_115(super.field_199) && super.field_199[21] == 0 && super.field_199[1] < 120 && super.field_199[1] != 42 && super.field_199[1] != 43 && super.field_199[1] != 36) {
                  super.field_197[super.field_199[20]] = false;
                  super.field_197[super.field_199[22]] = false;
                  this.method_120(var3);
               }
            }
         }
      }

      super.field_196 += super.field_136;
   }

   private void update() throws Exception {
      if (this.handleCommandAction()) {
         this.resetPressedKeys();
      } else {
         switch (super.appState) {
            case 1:
               this.method_146();
               break;
            case 2:
               super.prevRings = super.rings;
               if (super.clearedAct) {
                  super.field_249 = true;
                  super.field_250 = 10;
                  GameCanvas.field_131 = true;
               }

               GameCanvas.field_95[0] = GameCanvas.method_102();
               GameCanvas.field_95[1] = GameCanvas.method_103() - 1;
               super.field_284 = 0;
               super.field_285 = 0;
               super.field_282 = false;
               super.field_277 = false;
               super.field_273 = false;
               this.method_57();
               if (!GameCanvas.field_125) {
                  this.method_116();
                  this.method_268();
               }

               if (!GameCanvas.field_125) {
                  this.method_205();
               }

               if (super.field_273) {
                  this.method_104();
               }

               this.method_112();
               this.method_118();
               --super.field_101;
               --super.field_103;
               if (super.field_101 == 0) {
                  this.method_178();
               }

               if (super.field_103 <= 0) {
                  super.field_88 = 1536;
                  super.field_89 = 12;
               }

               this.method_92();
               this.method_173();
               ++super.field_33;
               if (super.field_33 % 60 == 0 && !GameCanvas.field_131) {
                  super.field_108 = (super.field_108 + 1) % 60;
                  if (super.field_108 == 0) {
                     if (super.field_109 == 9) {
                        super.field_108 = 59;
                        this.method_105();
                     } else {
                        ++super.field_109;
                     }
                  }
               }

               if (GameCanvas.field_130) {
                  super.field_108 = 0;
                  super.field_109 = 0;
               }

               if (!GameCanvas.field_118 && super.rings >= 100 && super.prevRings < 100) {
                  super.audio.interruptTrackAndPlay(7, 1);
                  ++super.lives;
               }

               if (!GameCanvas.field_118 && super.rings >= 200 && super.prevRings < 200) {
                  super.audio.interruptTrackAndPlay(7, 1);
                  ++super.lives;
               }

               if (!GameCanvas.field_118 && super.rings >= 300 && super.prevRings < 300) {
                  super.audio.interruptTrackAndPlay(7, 1);
                  ++super.lives;
               }
               break;
            case 3:
               if (super.pressedKeys[0]) {
                  super.zoneID = GameCanvas.zoneIDs[super.zone][super.act];
                  super.actID = GameCanvas.actIDs[super.zone][super.act];
                  super.lives = 3;
                  if (super.cheatsEnabled) {
                     super.field_40 = super.emeralds;
                  } else {
                     super.field_40 = 0;
                  }

                  super.score = 0;
                  super.field_202 = true;
                  this.method_42();
               } else if (super.pressedKeys[4]) {
                  this.resetPressedKeys();
                  super.act = (super.act + 1) % 3;
                  if (super.act == 0) {
                     this.method_23(true);
                  }
               } else if (super.pressedKeys[3]) {
                  this.resetPressedKeys();
                  super.act = (super.act + 2) % 3;
                  if (super.act == 2) {
                     this.method_23(false);
                  }
               }

               if (super.zone == 6) {
                  super.act = 0;
               }
            case 4:
            case 5:
            default:
               break;
            // continue
            case 6:
               ++super.field_33;
               this.method_253();
               break;
            case 7:
               this.method_255();
               break;
            case 8:
               this.method_257();
               break;
            case 9:
               if (super.rendering && System.currentTimeMillis() - this.field_328 > 250L) {
                  this.field_328 = System.currentTimeMillis();
                  this.updateNameInput();
               }
               break;
            case 10:
               super.field_286 = 0;
               super.field_68 = (byte)((super.field_68 + 1) % 24);
               if (super.pressedKeys[0]) {
                  this.saveConfig();
                  if (super.currentPauseMenuItem == 0) {
                     super.appState = 2;
                     super.redrawAllGameScreen = true;
                     super.field_249 = true;
                     super.field_250 = 10;
                     super.field_254 = true;
                     GameCanvas.redrawLivesCounter = true;
                     this.method_178();
                     this.method_13();
                  } else {
                     super.appState = 11;
                  }
               } else if (super.pressedKeys[1]) {
                  super.currentPauseMenuItem = super.currentPauseMenuItem + 1 & 1;
               } else if (super.pressedKeys[2]) {
                  super.currentPauseMenuItem = super.currentPauseMenuItem + 1 & 1;
               }

               this.resetPressedKeys();
               break;
            case 11:
               super.field_286 = 0;
               super.field_68 = (byte)((super.field_68 + 1) % 24);
               if (super.pressedKeys[0]) {
                  if (super.currentPauseMenuItem == 0) {
                     super.appState = 1;
                     super.field_249 = true;
                     super.field_250 = 10;
                     this.loadMenu(false);
                  } else {
                     this.resetPressedKeys();
                     super.appState = 10;
                     super.field_249 = true;
                     super.field_250 = 10;
                     super.field_254 = true;
                  }
               } else if (super.pressedKeys[1]) {
                  this.resetPressedKeys();
                  super.currentPauseMenuItem = super.currentPauseMenuItem + 1 & 1;
               } else if (super.pressedKeys[2]) {
                  this.resetPressedKeys();
                  super.currentPauseMenuItem = super.currentPauseMenuItem + 1 & 1;
               }
         }

         this.method_174();
      }
   }

   public final void run() {
      try {
         this.init();
         super.startTime = System.currentTimeMillis();
         int skipFrame = 0;

         while(true) {
            while(true) {
               super.startFrameTime = System.currentTimeMillis();
               this.update();
               ++super.frame;
               super.gameElapsedTime = (long)(super.frame * 16);
               super.appElapsedTime = System.currentTimeMillis() - super.startTime;
               if ((long)super.minFrameTime >= super.gameElapsedTime - super.appElapsedTime && skipFrame <= 7) {
                  ++skipFrame;
                  super.rendering = false;
               } else {
                  long startRenderTime = System.currentTimeMillis();
                  skipFrame = 0;
                  this.method_25();
                  this.repaint();
                  this.serviceRepaints();
                  ++super.renderedFrame;
                  super.lastFrameLags[super.nextFrameLagIndex++] = (int)(System.currentTimeMillis() - startRenderTime);
                  if (super.nextFrameLagIndex == super.lastFrameLags.length) {
                     super.nextFrameLagIndex = 0;
                  }

                  super.minFrameTime = 0;

                  for(int i = 0; i < super.lastFrameLags.length; ++i) {
                     super.minFrameTime += super.lastFrameLags[i];
                  }

                  super.minFrameTime /= super.lastFrameLags.length;
                  Thread.yield();
                  long endFrameTime;
                  if ((endFrameTime = System.currentTimeMillis()) - super.startFrameTime < 16L) {
                     try {
                        Thread.sleep(16L - (endFrameTime - super.startFrameTime));
                     } catch (Exception exception) {
                     }
                  }

                  super.rendering = true;
               }
            }
         }
      } catch (Throwable error) {
         error.printStackTrace();
      }
   }

   // $FF: renamed from: af () void
   private void method_270() {
      try {
         switch (super.field_199[1]) {
            case 0:
            case 1:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
               if (super.field_199[5] != 0 || method_284(super.field_199[2], super.field_199[3], 8, -1)) {
                  this.method_285();
               }
               break;
            case 2:
               if (method_284(super.field_199[2], super.field_199[3], 16, 16)) {
                  this.method_358();
               }
               break;
            case 3:
               this.method_286();
               break;
            case 4:
               this.method_288();
               break;
            case 5:
               this.method_287();
               break;
            case 6:
               this.method_289();
               break;
            case 7:
               this.method_290();
               break;
            case 8:
               this.method_291();
               break;
            case 9:
               this.method_292();
               break;
            case 10:
               this.method_293();
               break;
            case 11:
               this.method_294();
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 38:
            case 50:
            case 51:
            case 52:
            case 53:
            case 61:
            case 72:
            case 73:
            case 74:
            case 76:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            default:
               break;
            case 13:
               this.method_296();
               break;
            case 14:
               if (method_284(super.field_199[2], super.field_199[3], 32, -1)) {
                  this.method_297();
               }
               break;
            case 15:
               this.method_298();
               break;
            case 16:
               this.method_299();
               break;
            case 17:
               this.method_300();
               break;
            case 18:
               if (method_284(super.field_199[2], super.field_199[3], 16, 32)) {
                  this.method_301();
               }
               break;
            case 20:
               if (method_284(super.field_199[2], super.field_199[3], 16, -1)) {
                  this.method_302();
               }
               break;
            case 27:
               this.method_303();
               break;
            case 36:
               this.method_304();
               break;
            case 37:
               if (method_284(super.field_199[2], super.field_199[3], 8, 32)) {
                  this.method_305();
               }
               break;
            case 39:
               this.method_359();
               break;
            case 40:
               this.method_360();
               break;
            case 41:
               this.method_361();
               break;
            case 42:
               if (method_284(super.field_199[2], super.field_199[3], 16, 16)) {
                  this.method_306();
               }
               break;
            case 43:
               if (super.field_199[4] < 10 && method_284(super.field_199[2], super.field_199[3], 16, 16)) {
                  this.method_306();
               }
               break;
            case 44:
               this.method_307();
               break;
            case 45:
               if (method_284(super.field_199[2], super.field_199[3], 32, 32)) {
                  this.method_308();
               }
               break;
            case 46:
               if (method_284(super.field_199[2], super.field_199[3], 32, 32)) {
                  this.method_309();
               }
               break;
            case 47:
               if (super.field_40 < 6) {
                  this.method_31();
               }
               break;
            case 48:
               this.method_310();
               break;
            case 49:
               this.method_362();
               break;
            case 54:
               this.method_295();
               break;
            case 55:
               this.method_311();
               break;
            case 56:
               if (method_284(super.field_199[2], super.field_199[3], 32, 32)) {
                  this.method_312();
               }
               break;
            case 57:
               this.method_363();
               break;
            case 58:
               if (method_284(super.field_199[2], super.field_199[3], 24, 24)) {
                  this.method_313();
               }
               break;
            case 59:
               this.method_314();
               break;
            case 60:
               this.method_315();
               break;
            case 62:
               this.method_316();
               break;
            case 70:
               this.method_364();
               break;
            case 71:
               this.method_365();
               break;
            case 75:
               this.method_317();
               break;
            case 77:
               this.method_318();
               break;
            case 78:
               this.method_366();
               break;
            case 79:
               this.method_319();
               break;
            case 86:
               this.method_367();
               break;
            case 90:
               this.method_320();
               break;
            case 93:
               this.method_369();
               break;
            case 120:
               this.method_250();
               break;
            case 130:
               this.method_251();
               break;
            case 140:
               this.method_10();
               break;
            case 150:
               this.method_9();
         }

      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: d (int) void
   private void method_271(int var1) {
      try {
         switch (var1) {
            case 0:
            case 1:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
               this.method_321();
               break;
            case 2:
               this.method_370();
               break;
            case 3:
               this.method_322();
               break;
            case 4:
               this.method_324();
               break;
            case 5:
               this.method_323();
               break;
            case 6:
               this.method_325();
               break;
            case 7:
               this.method_326();
               break;
            case 8:
               this.method_327();
               break;
            case 9:
               this.method_328();
               break;
            case 10:
               this.method_329();
               break;
            case 11:
               this.method_330();
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 48:
            case 52:
            case 53:
            case 72:
            case 73:
            case 74:
            case 76:
            case 80:
            case 82:
            case 83:
            case 84:
            case 85:
            case 88:
            case 89:
            case 91:
            case 92:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 126:
            case 127:
            case 128:
            case 129:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            default:
               break;
            case 13:
               this.method_332();
               break;
            case 14:
               this.method_333();
               break;
            case 15:
               this.method_334();
               break;
            case 16:
               this.method_335();
               break;
            case 17:
               this.method_336();
               break;
            case 18:
               this.method_337();
               break;
            case 20:
               this.method_338();
               break;
            case 27:
               this.method_339();
               break;
            case 36:
               this.method_340();
               break;
            case 37:
               this.method_341();
               break;
            case 38:
               this.method_371();
               break;
            case 39:
            case 41:
            case 50:
            case 51:
            case 57:
            case 70:
            case 71:
            case 78:
            case 81:
            case 86:
            case 87:
               this.method_375(var1);
               break;
            case 40:
               this.method_372();
               break;
            case 42:
            case 43:
               this.method_343();
               break;
            case 44:
               this.method_344();
               break;
            case 45:
               this.method_345();
               break;
            case 46:
               this.method_346();
               break;
            case 47:
               if (super.field_40 < 6) {
                  this.method_30();
               }
               break;
            case 49:
               this.method_374();
               break;
            case 54:
               this.method_331();
               break;
            case 55:
               this.method_347();
               break;
            case 56:
               this.method_348();
               break;
            case 58:
               this.method_349();
               break;
            case 59:
               this.method_350();
               break;
            case 60:
               this.method_352();
               break;
            case 61:
               this.method_373();
               break;
            case 62:
               this.method_353();
               break;
            case 75:
               this.method_354();
               break;
            case 77:
               this.method_355();
               break;
            case 79:
               this.method_356();
               break;
            case 90:
               this.method_357();
               break;
            case 93:
               this.method_377();
               break;
            case 120:
            case 125:
            case 130:
            case 135:
            case 140:
               this.method_272();
               break;
            case 150:
               this.method_273(false);
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   // $FF: renamed from: ag () void
   private void method_272() {
      this.method_283(super.field_199);
      if (super.zoneID == 4) {
         this.method_273(true);
      }

   }

   // $FF: renamed from: f (boolean) void
   private void method_273(boolean var1) {
      for(int var4 = 0; var4 < 10; ++var4) {
         if (super.field_143[var4][2] == 0) {
            int var2;
            int var3;
            if (super.field_143[var4][3] == 0) {
               var2 = super.field_143[var4][0];
               var3 = super.field_143[var4][1];
            } else {
               var2 = (super.field_174 + super.field_176) / 100;
               var3 = (super.field_175 + super.field_177) / 100 + 24;
            }

            if (var1) {
               short var5 = super.field_143[var4][0];
               int var6 = (super.field_174 + super.field_176) / 100;
               if (Math.abs(var5 - var6) > 32) {
                  continue;
               }
            }

            GameCanvas.method_126(102, 0, 0, 24, 24, 0, var2 + super.field_178, var3 + super.field_179);
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int, int) void
   private void method_274(int var1, int var2, int var3, int var4, int var5) {
      method_275(var1, var2, var3, var4, GameCanvas.field_207[var1][var5]);
   }

   // $FF: renamed from: a (int, int, int, int, int[]) void
   private static void method_275(int var0, int var1, int var2, int var3, int[] var4) {
      int var5 = var4[4];
      int var6 = var4[5];
      int var7;
      switch (var3) {
         case 1:
            var7 = GameCanvas.field_35[4];
            var5 = -var5;
            break;
         case 2:
            var7 = GameCanvas.field_35[6];
            var6 = -var6;
            break;
         case 3:
            var7 = GameCanvas.field_35[2];
            var5 = -var5;
            var6 = -var6;
            break;
         default:
            var7 = 0;
      }

      var5 = var5 * 4 / 3;
      var6 = var6 * 4 / 3;
      GameCanvas.method_127(var0, var4[0], var4[1], var4[2], var4[3], var7, var1 + var5, var2 + var6, 3);
   }

   // $FF: renamed from: d (int, int, int, int, int) void
   private void method_276(int var1, int var2, int var3, int var4, int var5) {
      switch (var1) {
         case 0:
            if (var5 == 0) {
               this.method_274(120, var2, var3, var4, 1);
               return;
            }

            this.method_274(120, var2, var3, var4, 2);
            return;
         case 1:
            if (var5 == 0) {
               this.method_274(120, var2, var3, var4, 3);
               return;
            }

            this.method_274(120, var2, var3, var4, 4);
            return;
         case 2:
            if (var5 == 0) {
               this.method_274(120, var2, var3, var4, 1);
               return;
            }

            this.method_274(120, var2, var3, var4, 6);
            return;
         case 3:
            this.method_274(120, var2, var3, var4, 6);
            return;
         case 4:
            this.method_274(120, var2, var3, var4, 7);
            return;
         case 5:
            if (var5 == 0) {
               this.method_274(120, var2, var3, var4, 21);
               return;
            }

            this.method_274(120, var2, var3, var4, 22);
            return;
         case 6:
            this.method_274(120, var2, var3, var4, 0);
         default:
      }
   }

   // $FF: renamed from: d (int, int, int, int) void
   private void method_277(int var1, int var2, int var3, int var4) {
      int var7 = GameCanvas.field_207[120][15][4];
      int var8 = GameCanvas.field_207[120][15][5];
      int var9 = super.field_172;
      int var10 = super.field_170 / 100;
      if (var3 == 1) {
         var7 = -var7;
      }

      while(var10 < 0) {
         var10 += 360;
      }

      int var11 = 180 + GameCanvas.method_5(var10) * 90 / 100;
      if (var9 > 16) {
         this.method_274(120, var1, var2, var3, 15 + (super.field_32 >> 2 & 1));
      }

      int var5;
      int var6;
      int var13;
      for(var13 = 0; var13 < 4; ++var13) {
         int var12 = (var13 + 1) * 16;
         var5 = var1 + GameCanvas.method_5(var11) * var12 / 100 + var7;
         var6 = var2 + GameCanvas.method_6(var11) * var12 / 100 + var8;
         if (var9 > 16 + var12) {
            this.method_274(120, var5, var6, 0, 17);
         }

         if (var4 == 2 && Math.abs(var9 - (16 + var12)) < 4) {
            this.method_199(1, var5, var6, 0, 0, 0, 0);
         }
      }

      var5 = var1 + var7 + GameCanvas.method_5(var11) * var9 / 100;
      var6 = var2 + var8 + GameCanvas.method_6(var11) * var9 / 100;
      if (var4 == 2) {
         var13 = var1 + var7 + GameCanvas.method_5(var11) * 96 / 100;
         int var14 = var2 + var8 + GameCanvas.method_6(var11) * 96 / 100;
         this.method_274(121, var13, var14, 0, 0);
         if ((super.field_32 & 7) == 4) {
            this.method_199(1, var13 + GameCanvas.method_58(48) - 24, var14 + GameCanvas.method_58(48) - 24, 0, 0, 0, 0);
            return;
         }
      } else {
         this.method_274(121, var5, var6, 0, 0);
      }

   }

   // $FF: renamed from: i (int, int, int) void
   private void method_278(int var1, int var2, int var3) {
      this.method_274(120, var1, var2, var3, 19);
   }

   // $FF: renamed from: j (int, int, int) void
   private void method_279(int var1, int var2, int var3) {
      this.method_274(120, var1, var2, var3, 19);
   }

   // $FF: renamed from: k (int, int, int) void
   private void method_280(int var1, int var2, int var3) {
      this.method_274(120, var1, var2 + 8 - 32 + super.field_172, var3, 20);
   }

   // $FF: renamed from: l (int, int, int) void
   private void method_281(int var1, int var2, int var3) {
      switch (super.field_166) {
         case 0:
            this.method_277(var1, var2, var3, 0);
            return;
         case 1:
            return;
         case 2:
            this.method_278(var1, var2, var3);
            return;
         case 3:
            this.method_279(var1, var2, var3);
            return;
         case 4:
            this.method_280(var1, var2, var3);
         case 5:
         default:
      }
   }

   // $FF: renamed from: m (int, int, int) void
   private void method_282(int var1, int var2, int var3) {
      switch (super.field_166) {
         case 0:
            this.method_277(var1, var2, var3, 2);
            return;
         case 1:
            return;
         case 2:
            this.method_278(var1, var2, var3);
            return;
         case 3:
            this.method_279(var1, var2, var3);
         case 5:
         default:
            return;
         case 4:
            this.method_280(var1, var2, var3);
      }
   }

   // $FF: renamed from: d (int[]) void
   private void method_283(int[] var1) {
      int var7 = super.field_32 >> 3 & 1;
      int var8 = super.field_32 >> 2 & 1;
      int var9 = super.field_32 >> 1 & 1;
      int var10 = super.field_32 & 1;
      if (super.field_167 >= 2) {
         this.method_246(var1);
         int var2 = var1[2];
         int var3 = var1[3];
         int var4 = super.field_168;
         int var5 = super.field_169;
         int var6 = (super.field_32 & 1) == 0 && super.field_182 > 0 ? 1 : 0;
         switch (var4) {
            case 0:
               this.method_281(var2, var3, var5);
               this.method_276(super.field_184, var2, var3, var5, var8);
               this.method_274(120, var2, var3, var5, 8 + var6);
               return;
            case 1:
               this.method_281(var2, var3, var5);
               this.method_276(1, var2, var3, var5, var8);
               this.method_274(120, var2, var3, var5, 8);
               return;
            case 2:
               this.method_281(var2, var3, var5);
               this.method_276(super.field_184, var2, var3, var5, var8);
               this.method_274(120, var2, var3, var5, 11 + var10);
               this.method_274(120, var2, var3, var5, 8 + var6);
               return;
            case 3:
               this.method_282(var2, var3, var5);
               this.method_276(2, var2, var3, var5, var7);
               this.method_274(120, var2, var3, var5, 8);
               if (var8 != 0) {
                  this.method_199(1, var2 + GameCanvas.method_58(32) - 16, var3 + GameCanvas.method_58(32) - 16 - 8, 0, 0, 0, 0);
                  return;
               }
               break;
            case 4:
               this.method_274(120, var2, var3, var5, 7);
               this.method_274(120, var2, var3, var5, 8);
               return;
            case 5:
               this.method_276(0, var2, var3, var5, var8);
               this.method_274(120, var2, var3, var5, 8);
               if (var9 == 1) {
                  this.method_274(120, var2, var3, var5, 18);
               }

               this.method_274(120, var2, var3, var5, 13 + var8);
               return;
            case 6:
               this.method_276(0, var2, var3, var5, var8);
               this.method_274(120, var2, var3, var5, 8);
               if (var9 != 0) {
                  this.method_274(120, var2, var3, var5, 18);
               }

               this.method_274(120, var2, var3, var5, 11 + var10);
            case 7:
         }

      }
   }

   // $FF: renamed from: a (int, int, int, int) boolean
   private static boolean method_284(int var0, int var1, int var2, int var3) {
      return (var2 == -1 || 0 <= var0 - GameCanvas.field_225[0] + var2 && GameCanvas.fullGameWidth >= var0 - GameCanvas.field_225[0] - var2) && (var3 == -1 || 0 <= var1 - GameCanvas.field_225[1] + var3 && 240 >= var1 - GameCanvas.field_225[1] - var3);
   }

   // $FF: renamed from: ah () void
   private void method_285() {
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      if (GameCanvas.method_140(super.field_199[2], super.field_199[3], super.field_199[6], super.field_199[7], 8, 8) > 0) {
         if (super.field_199[5] == 0 && super.field_199[0] != -1) {
            super.field_199[5] = 1;
            super.field_199[10] = super.field_33;
            ++super.rings;
         }
      } else if (super.field_199[12] != 0 && GameCanvas.method_140(super.field_199[2], super.field_199[12], super.field_199[6], super.field_199[12], 8, 8) >= 0 && super.field_199[5] == 0 && super.field_199[0] != -1) {
         super.field_199[5] = 1;
         super.field_199[10] = super.field_33;
         ++super.rings;
      }

      if (super.field_199[5] == 1 && super.field_33 - super.field_199[10] >= 20) {
         super.field_199[0] = -1;
         super.field_199[5] = 0;
      }

   }

   // $FF: renamed from: ai () void
   private void method_286() {
      int var1 = GameCanvas.method_5(super.field_32 * 3) * 87;
      int var2 = GameCanvas.method_5(super.field_199[6] * 3) * 87;
      super.field_199[6] = super.field_32;
      int var4 = super.field_199[4] + 1;
      if (super.field_199[4] == 5) {
         var1 = -var1;
         var2 = -var2;
      } else if (super.field_199[19] == 1) {
         var1 = -var1;
         var2 = -var2;
      }

      byte var5 = 24;
      byte var6 = 8;
      int var3;
      if (super.zoneID == 3) {
         var5 = 44;
         var6 = 24;
         var3 = var4 << 4;
         var3 += 8;
      } else if (super.zoneID == 5) {
         var5 = 24;
         var6 = 24;
         var3 = var4 << 4;
         var3 -= 24;
      } else {
         var3 = var4 << 4;
         var3 -= 8;
      }

      int var8 = GameCanvas.method_136(super.field_199[2] + GameCanvas.method_5(180 + var1 / 100) * var3 / 100, super.field_199[3] + GameCanvas.method_6(180 + var1 / 100) * var3 / 100, super.field_199[2] + GameCanvas.method_5(180 + var2 / 100) * var3 / 100, super.field_199[3] + GameCanvas.method_6(180 + var2 / 100) * var3 / 100, var5, var6);
      if (super.zoneID != 3 && super.zoneID != 5) {
         if (var8 != 0) {
            var8 = GameCanvas.method_136(super.field_199[2] + GameCanvas.method_5(180 + var1 / 100) * var3 / 100, super.field_199[3] + GameCanvas.method_6(180 + var1 / 100) * var3 / 100 + 5, super.field_199[2] + GameCanvas.method_5(180 + var2 / 100) * var3 / 100, super.field_199[3] + GameCanvas.method_6(180 + var2 / 100) * var3 / 100 + 5, var5, var6);
         }

         if (var8 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] + GameCanvas.method_6(180 + var1 / 100) * var3 / 100 - var6 << 8;
            int[] var10000 = GameCanvas.field_116;
            var10000[0] += (GameCanvas.method_5(180 + var1 / 100) * var3 - GameCanvas.method_5(180 + var2 / 100) * var3 << 8) / 100;
            this.method_138(super.field_199[2] + GameCanvas.method_5(180 + var1 / 100) * var3 / 100, var5);
            this.method_107(super.field_199[22]);
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var8 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aj () void
   private void method_287() {
      int var1 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      int var10 = super.field_33 - super.field_199[14];
      super.field_199[14] = super.field_33;
      int var3 = 99;

      for(int var2 = 0; var2 < 12; ++var2) {
         if ((var1 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - 12, GameCanvas.field_95[0], GameCanvas.field_95[1] - 12, 4, 12, super.field_199[2] - 96 + (var2 << 4), super.field_199[3] + super.field_199[10], super.field_199[6] - 96 + (var2 << 4), super.field_199[7] + super.field_199[10], 8, 8)) >= 0 && var1 != 3) {
            var7 = true;
            GameCanvas.field_116[1] = super.field_199[3] - 8 << 8;
            if (Math.abs(GameCanvas.method_102() - (super.field_199[2] - 8)) < 999) {
               var3 = var2;
               Math.abs(GameCanvas.method_102() - super.field_199[2]);
            }
            break;
         }
      }

      int[] var10000;
      if (var3 != 99) {
         GameCanvas.field_116[1] = super.field_199[3] - 8 + super.field_199[10] << 8;
         this.method_138(super.field_199[2], 96);
         this.method_107(super.field_199[22]);
         super.field_199[5] = var3;
         int var11;
         if (var3 <= 6) {
            var11 = var3;
         } else {
            var11 = 6 - var3 % 6;
         }

         var10000 = super.field_199;
         var10000[10] += var10;
         if (super.field_199[10] >= var11 * 2) {
            super.field_199[10] = var11 * 2;
         }

         if (var3 == 0 || var3 == 11) {
            super.field_199[10] = 0;
         }
      } else {
         var10000 = super.field_199;
         var10000[10] -= var10;
         if (super.field_199[10] <= 0) {
            super.field_199[10] = 0;
         }
      }

      if (var7) {
         var1 = 0;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var1 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: ak () void
   private void method_288() {
      boolean var4 = false;

      for(int var1 = 0; var1 < 12; ++var1) {
         if ((super.field_32 / 10 + (12 - var1)) % 7 == 2 && GameCanvas.method_136(super.field_199[2] - 96 + (var1 << 4), super.field_199[3], super.field_199[2] - 96 + (var1 << 4), super.field_199[3], 8, 12) >= 0) {
            this.method_104();
            return;
         }
      }

   }

   // $FF: renamed from: al () void
   private void method_289() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = 0;
      boolean var4 = false;
      int var5 = -1;
      int var6 = -99;
      int var7 = 999;
      boolean var8 = false;
      byte var9 = 0;
      if (super.field_199[4] != 0) {
         var9 = -1;
      }

      int var14 = super.field_199[2];
      int var15;
      if (super.field_199[5] == 0) {
         if (var9 == 0) {
            var15 = GameCanvas.field_145.length;
         } else {
            var15 = -GameCanvas.field_145.length;
         }

         if ((var5 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - 12, GameCanvas.field_95[0], GameCanvas.field_95[1] - 12, 2, 12, super.field_199[2] - var15, super.field_199[3] - GameCanvas.field_145[0] + 8, super.field_199[2] - var15, super.field_199[3] - GameCanvas.field_145[0] + 8, 8, 8)) >= 0) {
            GameCanvas.field_116[1] = super.field_199[3] - GameCanvas.field_145[0] + 8 - 8 << 8;
         }
      }

      int var10;
      if (super.field_199[5] != 0) {
         for(var10 = 0; var10 < 36; ++var10) {
            if (super.field_33 / 2 - super.field_199[10] - ((var10 << 1) + var10) < 0) {
               var3 = var10 / 6 << 3;
               break;
            }

            if (var10 == 29) {
               super.field_199[5] = 2;
            }
         }

         if (var3 >= 48) {
            super.field_199[5] = 2;
         }

         if (super.field_199[4] != 0) {
            var14 = super.field_199[2] - var3;
         } else {
            var14 = super.field_199[2] + var3;
         }
      }

      if (super.field_199[5] != 2) {
         var10 = GameCanvas.field_145.length;
         if (GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 128, 128) >= 0) {
            for(int var12 = 0; var12 < var10; ++var12) {
               if (var9 == 0) {
                  var15 = var12;
               } else {
                  var15 = var10 - var12 - 1;
               }

               if (var9 == 0 && var3 <= var12 || var9 != 0 && var10 - var3 >= var12) {
                  if (GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - 12, GameCanvas.field_95[0], GameCanvas.field_95[1] - 12, 2, 12, super.field_199[2] - var10 + (var12 << 1), super.field_199[3] - GameCanvas.field_145[var15], super.field_199[2] - var10 + (var12 << 1), super.field_199[3] - GameCanvas.field_145[var15], 1, 1) == 0 && var7 > Math.abs(GameCanvas.method_102() - (super.field_199[2] - var10 + (var12 << 1)))) {
                     var7 = Math.abs(GameCanvas.method_102() - (super.field_199[2] - var10 + (var12 << 1)));
                     var6 = var15;
                  }

                  if (var6 != -99 && 8 > Math.abs(GameCanvas.method_102() - (super.field_199[2] - var10 + (var12 << 1))) && GameCanvas.method_103() - (super.field_199[3] - GameCanvas.field_145[var15]) > 0 && GameCanvas.method_103() - (super.field_199[3] - GameCanvas.field_145[var15]) <= 64 && var7 > Math.abs(GameCanvas.method_102() - (super.field_199[2] - var10 + (var12 << 1)))) {
                     var7 = Math.abs(GameCanvas.method_102() - (super.field_199[2] - var10 + (var12 << 1)));
                     var6 = var15;
                     break;
                  }
               }
            }
         }

         var5 = -1;
         if (var7 != 999) {
            super.field_199[17] = var6;
            GameCanvas.field_116[1] = super.field_199[3] - GameCanvas.field_145[var6] - 1 << 8;
            if (super.field_199[5] == 0) {
               super.field_199[10] = super.field_33 / 2;
            }

            super.field_199[5] = 1;
            int var13;
            if (var9 == 0) {
               var13 = var3;
            } else {
               var13 = var10 - var3;
            }

            this.method_138(var14, var13);
            this.method_107(super.field_199[22]);
            var5 = 0;
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var5 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: am () void
   private void method_290() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = -1;
      this.method_166(super.field_199[2], super.field_199[3], super.field_199[4]);
      byte var13;
      if (super.field_199[4] == 21) {
         var13 = 2;
      } else if (super.field_199[4] == 1) {
         var13 = 0;
      } else {
         var13 = 1;
      }

      boolean var5 = false;
      boolean var6 = false;
      super.field_199[17] = super.field_199[2];
      super.field_199[18] = super.field_199[3];
      int var10002;
      if (var13 != 2 && super.field_199[4] != 32) {
         var10002 = super.field_199[5]++;
         byte var17 = 32;
         if (super.field_199[4] == 35) {
            var17 = 32;
         } else if (super.field_199[4] == 1) {
            var17 = 16;
         } else if (super.field_199[4] == 41) {
            var17 = 16;
         } else if (super.field_199[4] == 34) {
            var17 = 24;
         } else if (super.field_199[4] == 43) {
            var17 = 32;
         } else if (super.field_199[4] == 33) {
            var17 = 16;
         } else if (super.field_199[4] == 42) {
            var17 = 24;
         }

         int var16;
         if (super.field_199[4] == 3) {
            var16 = super.field_199[18] >> 8;
            super.field_199[3] = super.field_199[9] + var16;
         } else if (super.field_199[4] != 7) {
            if (super.field_199[4] == 1) {
               var16 = GameCanvas.method_5(super.field_199[5]) * var17 / 100 - var17;
               super.field_199[3] = super.field_199[9] + 8 + var16;
            } else {
               var16 = GameCanvas.method_5(super.field_199[5]) * var17 / 100 - var17;
               super.field_199[3] = super.field_199[9] + var16;
            }
         }
      }

      if (var13 == 2) {
         super.field_199[3] = super.field_199[9];
      }

      if (var13 == 2 && super.field_199[13] != 0) {
         super.field_199[3] = super.field_199[9] + 15;
         if (super.field_199[16] == 0) {
            super.field_199[16] = 1;
         }
      }

      super.field_199[13] = 0;
      int var7 = 999;
      int var14;
      if ((var14 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[17], super.field_199[18], super.field_146[var13], GameCanvas.field_165[var13][0])) >= 0) {
         if (var14 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - super.field_146[var13] - 12 << 8;
            GameCanvas.field_116[10] = 0;
            var3 = -99;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var14 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + super.field_146[var13] + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            var3 = -99;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         }
      }

      int var8 = GameCanvas.field_165[var13].length;
      int var9 = GameCanvas.field_165[var13][0];
      if (var13 == 2) {
         var9 = 96;
      }

      int var4;
      if (GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[17], super.field_199[18], var8, var9) >= 0) {
         for(var4 = 0; var4 < var8; ++var4) {
            if (GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - 12, GameCanvas.field_95[0], GameCanvas.field_95[1] - 12, 2, 13, super.field_199[2] - var8 + (var4 << 1), super.field_199[3] - GameCanvas.field_165[var13][var4], super.field_199[17] - var8 + (var4 << 1), super.field_199[18] - GameCanvas.field_165[var13][var4], 1, 1) == 0 && var7 > Math.abs(GameCanvas.method_102() - (super.field_199[2] - var8 + (var4 << 1)))) {
               var7 = Math.abs(GameCanvas.method_102() - (super.field_199[2] - var8 + (var4 << 1)));
               var3 = var4;
            }

            if (var3 != -99 && 8 >= Math.abs(GameCanvas.method_102() - (super.field_199[2] - var8 + (var4 << 1))) && GameCanvas.method_103() - (super.field_199[3] - GameCanvas.field_165[var13][var4]) >= -1 && GameCanvas.method_103() - (super.field_199[3] - GameCanvas.field_165[var13][var4]) <= 64 && var7 > Math.abs(GameCanvas.method_102() - (super.field_199[2] - var8 + (var4 << 1)))) {
               var7 = Math.abs(GameCanvas.method_102() - (super.field_199[2] - var8 + (var4 << 1)));
               var3 = var4;
               break;
            }
         }
      }

      byte var15 = -1;
      if (var7 != 999) {
         GameCanvas.field_116[1] = super.field_199[3] - GameCanvas.field_165[var13][var3] + 4 << 8;
         this.method_138(super.field_199[2], GameCanvas.field_165[var13].length);
         this.method_107(super.field_199[22]);
         var15 = 0;
         if (var13 == 2) {
            super.field_199[13] = 1;
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var15 != 0) {
         super.field_203 = false;
      }

      if (super.field_199[16] != 0) {
         var10002 = super.field_199[16]++;
         if (super.field_199[16] == 60) {
            super.field_199[15] = super.field_32 - 1;
         }

         if (super.field_199[16] >= 60) {
            boolean var11 = false;
            boolean var12 = false;

            for(var4 = 0; var4 < 8; ++var4) {
               int var18;
               int var19;
               if ((var19 = (var18 = super.field_32 - super.field_199[15]) - 1) < 0) {
                  var19 = 0;
               }

               if (var4 << 3 < var18) {
                  var19 = var18 = var4 << 3;
               }

               if (GameCanvas.method_136(super.field_199[2] + (var18 << 1) - 56, super.field_199[3] - GameCanvas.field_165[var13][var18], super.field_199[17] + (var19 << 1) - 56, super.field_199[18] - GameCanvas.field_165[var13][var19], 6, 6) >= 0) {
                  this.method_104();
                  return;
               }
            }
         }
      }

   }

   // $FF: renamed from: an () void
   private void method_291() {
      byte var2 = 56;
      boolean var4 = false;
      this.method_167(super.field_199[8], super.field_199[9]);
      super.field_199[7] = super.field_199[3];
      int[] var10000;
      int var10002;
      if (super.field_199[4] == 128) {
         if (super.field_199[18] == 0) {
            super.field_199[3] = super.field_199[9] + 112;
         }

         super.field_199[18] = 1;
         if (!super.field_204[128] && !super.field_204[129]) {
            if (super.field_199[3] < super.field_199[9] + 112) {
               var10000 = super.field_199;
               var10000[3] += 2;
               if (super.field_199[3] > super.field_199[9] + 112) {
                  super.field_199[3] = super.field_199[9] + 112;
               }
            }
         } else if (super.field_199[3] > super.field_199[9]) {
            var10002 = super.field_199[3]--;
         }

         int[][] var5 = this.method_121(10, 0);

         for(int var1 = 0; var1 < var5.length; ++var1) {
            if (super.field_199[2] - 56 - (var5[var1][2] - 16) <= 32 && super.field_199[2] - 56 - (var5[var1][2] - 16) >= -112 && super.field_204[128] && super.field_199[3] < super.field_199[9] + 16) {
               super.field_199[3] = super.field_199[9] + 16;
            }
         }
      } else {
         short var7 = 160;
         if (super.field_199[4] == 17) {
            var2 = 48;
         } else if (super.field_199[4] == 2) {
            var2 = 56;
            var7 = 80;
         } else if (super.field_199[4] == 35) {
            var2 = 16;
            var7 = 120;
         } else if (super.field_199[4] == 18) {
            var2 = 48;
            var7 = 80;
         }

         if (super.field_199[5] == 0) {
            if (super.field_199[3] < super.field_199[9] + var7) {
               var10000 = super.field_199;
               var10000[3] += 4;
               if (super.field_199[3] >= super.field_199[9] + var7) {
                  super.field_199[3] = super.field_199[9] + var7;
                  super.field_199[5] = 1;
               }
            }
         } else if (super.field_199[5] < 60) {
            var10002 = super.field_199[5]++;
         } else if (super.field_199[3] > super.field_199[9]) {
            var10002 = super.field_199[3]--;
            if (super.field_199[3] == super.field_199[9]) {
               super.field_199[5] = 0;
            }
         }
      }

      int var6;
      if ((var6 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[7], var2, 12)) >= 0) {
         if (var6 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - 12 << 8;
            this.method_138(super.field_199[2], var2);
            this.method_107(super.field_199[22]);
            if (super.field_199[3] - 24 < super.field_199[9]) {
               this.method_139();
            }
         } else if (var6 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - var2 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var6 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + var2 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var6 == 3) {
            this.method_139();
            GameCanvas.field_116[1] = super.field_199[3] + 12 + 12 + 12 + 1 << 8;
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var6 != 0) {
         super.field_203 = false;
      }

      if (super.field_199[4] != 35 && GameCanvas.method_136(super.field_199[2], super.field_199[3] + 32, super.field_199[2], super.field_199[7] + 32, 40, 14) >= 0) {
         this.method_104();
      }

   }

   // $FF: renamed from: ao () void
   private void method_292() {
      byte var1 = 20;
      byte var2 = 14;
      super.field_199[7] = super.field_199[3];
      super.field_199[15] = super.field_199[2];
      int var3;
      if ((var3 = super.field_199[4]) == 64) {
         var1 = 64;
      } else if (var3 == 16) {
         var1 = 16;
         var2 = 19;
      }

      if (var3 == 48) {
         var1 = 30;
      } else {
         int var10002;
         if (var3 == 18) {
            var1 = 14;
            var2 = 20;
            var10002 = super.field_199[6]++;
            super.field_199[5] = super.field_199[6];
            if (super.field_199[6] < 60) {
               super.field_199[5] = 0;
            } else if (super.field_199[6] < 68) {
               super.field_199[5] = super.field_199[6] - 60;
            } else if (super.field_199[6] < 128) {
               super.field_199[5] = 8;
            } else if (super.field_199[6] < 136) {
               super.field_199[5] = 136 - super.field_199[6];
            } else {
               super.field_199[5] = 0;
               super.field_199[6] = 0;
            }

            super.field_199[2] = super.field_199[8] - (super.field_199[5] << 2) + 32;
         } else if (var3 == 32) {
            var1 = 8;
            var2 = 18;
         } else if (var3 == 82) {
            var1 = 20;
            var2 = 6;
            var10002 = super.field_199[6]++;
            super.field_199[5] = super.field_199[6];
            if (super.field_199[6] < 60) {
               super.field_199[5] = 0;
            } else if (super.field_199[6] < 68) {
               super.field_199[5] = super.field_199[6] - 60;
            } else if (super.field_199[6] < 128) {
               super.field_199[5] = 8;
            } else if (super.field_199[6] < 136) {
               super.field_199[5] = 136 - super.field_199[6];
            } else {
               super.field_199[5] = 0;
               super.field_199[6] = 0;
            }

            super.field_199[2] = super.field_199[8] - (super.field_199[5] << 2) + 32;
         } else if (var3 == 1) {
            var1 = 20;
            var10002 = super.field_199[6]++;
            super.field_199[5] = super.field_199[6];
            if (super.field_199[6] < 60) {
               super.field_199[5] = 0;
            } else if (super.field_199[6] < 68) {
               super.field_199[5] = super.field_199[6] - 60;
            } else if (super.field_199[6] < 128) {
               super.field_199[5] = 8;
            } else if (super.field_199[6] < 136) {
               super.field_199[5] = 136 - super.field_199[6];
            } else {
               super.field_199[5] = 0;
               super.field_199[6] = 0;
            }

            super.field_199[3] = super.field_199[9] - (super.field_199[5] << 2) + 32;
         }
      }

      boolean var4 = false;
      int var5;
      if ((var5 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[15], super.field_199[7], var1, var2)) >= 0) {
         if (super.field_199[4] != 82 && super.field_199[4] != 18 && super.field_199[4] != 16) {
            if (var5 == 0 && super.field_199[19] == 0 || var5 == 3 && super.field_199[19] != 0) {
               this.method_104();
               var4 = true;
            }
         } else if (var5 == 1 || var5 == 2) {
            this.method_104();
            var4 = true;
         }

         if (var5 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - var2 << 8;
            this.method_138(super.field_199[2], var1);
            this.method_107(super.field_199[22]);
            if (this.method_60(GameCanvas.method_102(), GameCanvas.method_103() - 32)) {
               if (GameCanvas.field_116[12] == 0) {
                  GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
               } else {
                  GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
               }
            }
         } else if (var5 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (!var4 && super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var5 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (var4 && super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var5 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + var2 + 12 + 12 + 1 << 8;
            if (GameCanvas.field_116[5] < 0) {
               GameCanvas.field_116[5] = 0;
            }

            if (super.zoneID == 0) {
               int[] var10000 = GameCanvas.field_116;
               var10000[1] += 4096;
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var5 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: ap () void
   private void method_293() {
      byte var1 = 16;
      boolean var3 = false;
      boolean var4 = false;
      int var5 = -1;
      boolean var6 = false;
      super.field_199[15] = super.field_199[2];
      super.field_199[16] = super.field_199[3];
      if (super.field_199[4] == 129) {
         var1 = 64;
      }

      int var10 = super.field_199[2];
      int[] var10000;
      if (super.field_199[5] != 0 && super.field_199[10] == 0) {
         var10000 = super.field_199;
         var10000[3] += 2;
         if (this.method_62(super.field_199[2] - var1 + 1, super.field_199[3] + 16) || this.method_62(super.field_199[2] + var1 - 1, super.field_199[3] + 16)) {
            super.field_199[5] = 0;
            if (super.field_199[4] == 0) {
               super.field_199[6] = 1;
            }
         }
      }

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         if (super.field_199[8] == GameCanvas.field_147[var7] && super.field_199[9] == GameCanvas.field_148[var7]) {
            var5 = var7;
            break;
         }
      }

      if (super.field_199[5] == 0 && var5 != -1 && super.field_199[10] == 0 && Math.abs(super.field_199[2] - GameCanvas.field_149[var5]) <= 16 && Math.abs(super.field_199[3] - GameCanvas.field_150[var5]) <= 16) {
         super.field_199[10] = 1;
      }

      if (super.field_199[17] == 0 && super.field_199[10] > 0 && super.field_199[3] < GameCanvas.field_150[var5]) {
         var10000 = super.field_199;
         var10000[3] += 2;
         if (super.field_199[3] > GameCanvas.field_150[var5]) {
            super.field_199[3] = GameCanvas.field_150[var5];
         }
      }

      int var10002;
      if (super.field_199[17] == 0) {
         if (super.field_199[10] >= 1 && super.field_199[10] < 15) {
            var10002 = super.field_199[10]++;
         } else if (super.field_199[10] == 15) {
            var10000 = super.field_199;
            var10000[2] += GameCanvas.field_151[var5];
         } else if (super.field_199[10] >= 16) {
            var10002 = super.field_199[10]++;
            if (super.field_199[10] >= 46 && super.field_199[10] - 48 <= 96 && super.field_199[10] % 2 == 0) {
               var10002 = super.field_199[3]++;
            }
         }
      } else if (GameCanvas.field_151[var5] < 0) {
         if (super.field_199[18] < super.field_199[2]) {
            var10000 = super.field_199;
            var10000[2] += GameCanvas.field_151[var5];
         }
      } else if (super.field_199[18] > super.field_199[2]) {
         var10000 = super.field_199;
         var10000[2] += GameCanvas.field_151[var5];
      }

      super.field_199[17] = 0;
      if (super.field_199[4] != 129 && super.zoneID == 2) {
         int var8;
         int[][] var12;
         if (super.zoneID == 2 && super.actID == 0 && super.field_199[4] == 0) {
            var12 = this.method_121(8, 128);

            for(var8 = 0; var8 < var12.length; ++var8) {
               if (var12[var8][2] - 56 - (super.field_199[2] - 16) <= 32 && var12[var8][2] - 56 - (super.field_199[2] - 16) >= -112) {
                  super.field_199[3] = var12[var8][3] - 28;
               }
            }

            int[][] var14 = this.method_121(15, 128);
            super.field_204[129] = false;

            for(int var9 = 0; var9 < var14.length; ++var9) {
               if (var14[var9][2] - 8 - (super.field_199[2] - 16) <= 32 && var14[var9][2] - 8 - (super.field_199[2] - 16) >= -32 && var14[var9][3] - 8 - (super.field_199[3] - 16) <= 32 && var14[var9][3] - 8 - (super.field_199[3] - 16) >= -32) {
                  super.field_204[129] = true;
                  super.field_152[129] = true;
               }
            }
         }

         if (super.field_199[4] != 0) {
            var12 = this.method_121(9, 16);

            for(var8 = 0; var8 < var12.length; ++var8) {
               if (var12[var8][2] - 20 - (super.field_199[2] - 16) <= 32 && var12[var8][2] - 20 - (super.field_199[2] - 16) >= -40 && var12[var8][3] - 20 - (super.field_199[3] - 16) <= 32 && var12[var8][3] - 20 - (super.field_199[3] - 16) >= -40 && super.field_199[10] == 15) {
                  super.field_199[10] = 16;
               }
            }
         }

         if (super.field_199[4] == 2) {
            var12 = this.method_121(77, 16);

            for(var8 = 0; var8 < var12.length; ++var8) {
               if (var12[var8][2] - 20 - 64 - (super.field_199[2] - 16) <= 32 && var12[var8][2] - 20 - 64 - (super.field_199[2] - 16) >= -112 && var12[var8][3] - 48 + 16 - 16 - (super.field_199[3] - 16) <= 32 && var12[var8][3] - 48 + 16 - 16 - (super.field_199[3] - 16) >= -32 && var12[var8][5] > 1 && var12[var8][5] / 4 < 26) {
                  super.field_199[3] = var12[var8][3] - 48 + 16 - 16;
                  super.field_199[18] = var12[var8][2] - 10 + 16;
                  super.field_199[17] = 1;
                  break;
               }
            }
         }
      }

      var10 -= super.field_199[2];
      int var11;
      if ((var11 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[15], super.field_199[16], var1, 16)) >= 0) {
         if (var11 == 0) {
            boolean var13 = false;
            if ((var7 = GameCanvas.method_136(super.field_199[2], super.field_199[3] - 16, super.field_199[15], super.field_199[16] - 16, var1, 2)) == 1) {
               if ((super.pressedKeys[4] && super.field_199[5] == 0 || super.field_199[4] == 129 || super.field_199[4] == 0) && super.field_199[10] == 0) {
                  var10002 = super.field_199[2]++;
                  if (this.method_62(super.field_199[2] + var1, super.field_199[3] - 16)) {
                     var10002 = super.field_199[2]--;
                  }
               }
            } else if (var7 == 2 && (super.pressedKeys[3] && super.field_199[5] == 0 || super.field_199[4] == 129 || super.field_199[4] == 0) && super.field_199[10] == 0) {
               var10002 = super.field_199[2]--;
               if (this.method_62(super.field_199[2] - var1, super.field_199[3] - 16)) {
                  var10002 = super.field_199[2]++;
               }
            }

            GameCanvas.field_116[1] = super.field_199[3] - 16 << 8;
            this.method_138(super.field_199[2], var1);
            this.method_107(super.field_199[22]);
            var6 = true;
            var10000 = GameCanvas.field_116;
            var10000[0] -= var10 << 8;
         }

         if (var11 == 1) {
            if (super.pressedKeys[4] && (super.field_199[5] == 0 || super.field_199[4] == 129 || super.field_199[4] == 0)) {
               if (super.field_199[10] == 0) {
                  var10002 = super.field_199[2]++;
                  super.field_199[7] = 1;
                  if (this.method_62(super.field_199[2] + var1, super.field_199[3] + 16 - 1)) {
                     var10002 = super.field_199[2]--;
                  }

                  if (super.field_199[4] == 129 && super.field_199[2] > super.field_199[8] + 64) {
                     super.field_199[2] = super.field_199[8] + 64;
                  }
               }

               this.method_72();
            }

            GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
            GameCanvas.field_116[10] = 0;
         }

         if (var11 == 2) {
            if (super.pressedKeys[3] && (super.field_199[5] == 0 || super.field_199[4] == 129 || super.field_199[4] == 0)) {
               if (super.field_199[10] == 0) {
                  var10002 = super.field_199[2]--;
                  super.field_199[7] = -1;
                  if (this.method_62(super.field_199[2] - var1, super.field_199[3] + 16 - 1)) {
                     var10002 = super.field_199[2]++;
                  }
               }

               this.method_72();
            }

            GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
         }

         if (var11 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 16 + 12 + 12 + 1 << 8;
            this.method_139();
         }
      }

      if (!this.method_62(super.field_199[2] - var1 + 1, super.field_199[3] + 16) && !this.method_62(super.field_199[2] + var1 - 1, super.field_199[3] + 16)) {
         var10002 = super.field_199[5]++;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var11 != 0) {
         super.field_203 = false;
      }

      if (var6) {
         this.method_170(super.field_199[2], super.field_199[3], super.field_199[4]);
      } else {
         this.method_172(super.field_199[2], super.field_199[3], super.field_199[4]);
      }
   }

   // $FF: renamed from: aq () void
   private void method_294() {
      this.method_168(super.field_199[2], super.field_199[3], super.field_199[4]);
      int[] var10000;
      if (super.field_199[4] != 2 && super.field_199[4] != 10) {
         if (super.field_199[4] == 1) {
            super.field_199[3] = super.field_199[9] + (GameCanvas.method_5(super.field_199[5]) << 3) / 100 - 8;
            var10000 = super.field_199;
            var10000[5] += 6;
         }
      } else if (super.field_199[5] == 2) {
         super.field_199[3] = super.field_199[11] + GameCanvas.method_5(super.field_33) * 6 / 100 + 6;
      } else if (super.field_199[5] == 1) {
         int var10002 = super.field_199[10]++;
         var10000 = super.field_199;
         var10000[3] += super.field_199[10];
         if (this.method_62(super.field_199[2] - 16 + 1, super.field_199[3] + 16) || this.method_62(super.field_199[2] + 16 - 1, super.field_199[3] + 16)) {
            if ((super.field_199[8] != 4016 || super.field_199[9] != 1296) && (super.field_199[8] != 3920 || super.field_199[9] != 1328)) {
               super.field_199[5] = 2;
            } else {
               super.field_199[5] = 0;
            }

            var10000 = super.field_199;
            var10000[3] -= (super.field_199[3] + 16) % 16;
            super.field_199[11] = super.field_199[3];
         }
      } else if (super.field_199[3] < GameCanvas.method_103() && super.field_199[2] - 100 < GameCanvas.method_102()) {
         super.field_199[10] = 1;
         super.field_199[5] = 1;
      }

      int var3;
      if ((var3 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 16, 16)) >= 0) {
         if (var3 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - 16 << 8;
            this.method_138(super.field_199[2], 16);
            this.method_107(super.field_199[22]);
         } else if (var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 16 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var3 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 16 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var3 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 16 + 12 + 12 + 1 << 8;
            this.method_139();
         } else if (var3 == 4 && super.field_205 != super.field_199[20]) {
            if (GameCanvas.method_102() < super.field_199[2]) {
               GameCanvas.field_116[0] = super.field_199[2] - 16 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            } else {
               GameCanvas.field_116[0] = super.field_199[2] + 16 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[3]) {
                  this.method_72();
               }
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: ar () void
   private void method_295() {
      byte var1 = 48;
      byte var2 = 16;
      byte var3 = 0;
      int var6 = 0;
      boolean var7 = false;
      if (super.field_199[4] == 57) {
         var1 = 63;
         var2 = 8;
      } else if (super.field_199[4] == 40) {
         var1 = 32;
         var2 = 8;
      }

      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      int[] var10000;
      int var10002;
      if (super.field_199[4] == 7 || super.field_199[4] == 4) {
         var1 = 16;
         var2 = 8;
         if (super.field_199[10] == 1) {
            var6 = super.field_199[2];
            var10002 = super.field_199[2]++;
            if (super.field_199[4] == 7) {
               if (this.method_62(super.field_199[2] + 16, super.field_199[3] + 8 - 1 - 16)) {
                  var10002 = super.field_199[2]--;
                  super.field_199[10] = 2;
               }
            } else if (Math.abs(super.field_199[2] - super.field_199[8]) >= 96) {
               super.field_199[2] = super.field_199[8] + 96;
               super.field_199[10] = 2;
            }

            var6 -= super.field_199[2];
         } else if (super.field_199[10] == 2) {
            var10000 = super.field_199;
            var10000[3] += 5;
            if (this.method_62(super.field_199[2] - 16 + 1, super.field_199[3] + 8) || this.method_62(super.field_199[2] + 16 - 1, super.field_199[3] + 8)) {
               super.field_199[5] = 0;
               var10000 = super.field_199;
               var10000[3] -= (super.field_199[3] + 8) % 16;
               super.field_199[10] = 3;
            }
         }
      }

      if (super.field_199[4] == 1) {
         var1 = 16;
         var2 = 16;
         var6 = super.field_199[2];
         if (super.field_33 % 384 <= 144) {
            super.field_199[2] = super.field_199[8] - super.field_33 % 384 / 3;
         } else if (super.field_33 % 384 > 240) {
            super.field_199[2] = super.field_199[8] - (48 - (super.field_33 % 384 / 3 - 80));
         }

         var6 -= super.field_199[2];
      } else if (super.field_199[4] == 2) {
         var1 = 16;
         var2 = 16;
         super.field_199[3] = super.field_199[9] + 9;
         if (super.field_199[10] != 0) {
            var6 = super.field_199[2];
            var10002 = super.field_199[2]++;
            if (this.method_62(super.field_199[2] + 16, super.field_199[3] + 16 - 1 - 16)) {
               var10002 = super.field_199[2]--;
            }

            var6 -= super.field_199[2];
         }
      } else if (super.field_199[4] == 65) {
         var6 = super.field_199[2];
         super.field_199[2] = super.field_199[8] + GameCanvas.method_5(super.field_33) * 48 / 100 - 32 - 48;
         super.field_199[3] = super.field_199[9] + 8;
         var3 = 32;
         var1 = 47;
         var6 -= super.field_199[2];
      } else if (super.field_199[4] == 57) {
         if (super.field_199[10] != 0) {
            var10002 = super.field_199[10]++;
         }

         if (super.field_199[10] > 5) {
            var6 = super.field_199[2];
            if (super.field_199[19] == 0) {
               if (super.field_33 - super.field_199[11] <= 32) {
                  super.field_199[2] = super.field_199[8] + (super.field_33 - super.field_199[11] << 2);
               } else if (super.field_33 - super.field_199[11] >= 500 && super.field_33 - super.field_199[11] < 532) {
                  super.field_199[2] = super.field_199[8] + (128 - (super.field_33 - super.field_199[11] - 500 << 2));
               }
            } else if (super.field_33 - super.field_199[11] <= 32) {
               super.field_199[2] = super.field_199[8] - (super.field_33 - super.field_199[11] << 2);
            } else if (super.field_33 - super.field_199[11] >= 500 && super.field_33 - super.field_199[11] < 532) {
               super.field_199[2] = super.field_199[8] - (128 - (super.field_33 - super.field_199[11] - 500 << 2));
            }

            if (super.field_33 - super.field_199[11] >= 532) {
               super.field_199[10] = 0;
               super.field_199[11] = 0;
               super.field_199[2] = super.field_199[8];
            }

            var6 -= super.field_199[2];
         } else {
            super.field_199[2] = super.field_199[8];
         }
      } else if (super.field_199[4] == 40) {
         if ((super.field_33 >> 1) % 256 < 128) {
            super.field_199[3] = super.field_199[9] - (super.field_33 >> 1) % 256;
         } else {
            super.field_199[3] = super.field_199[9] - (128 - ((super.field_33 >>> 1) % 256 - 128));
         }
      }

      int var8 = -1;
      if ((super.field_199[4] != 7 && super.field_199[4] != 4 || super.field_199[5] != 0) && (var8 = GameCanvas.method_136(super.field_199[2] + var3, super.field_199[3] + 0, super.field_199[6] + var3, super.field_199[7] + 0, var1, var2)) >= 0 && var8 == 0) {
         GameCanvas.field_116[1] = super.field_199[3] - var2 + 0 << 8;
         if (super.field_199[4] == 2 || super.field_199[4] == 1 || super.field_199[4] == 65) {
            if (super.field_199[10] == 0) {
               super.field_199[10] = 1;
               super.field_199[11] = super.field_33;
            }

            var10000 = GameCanvas.field_116;
            var10000[0] -= var6 << 8;
         }

         if (super.field_199[4] == 57) {
            if (super.field_199[2] + var3 - var1 <= GameCanvas.method_102() && GameCanvas.method_102() <= super.field_199[2] + var3 + var1 && super.field_199[10] == 0) {
               super.field_199[10] = 1;
               super.field_199[11] = super.field_33;
            }

            var10000 = GameCanvas.field_116;
            var10000[0] -= var6 << 8;
         }

         if (super.field_199[4] == 7 || super.field_199[4] == 4) {
            if (super.field_199[5] == 1 && super.field_199[10] == 0) {
               super.field_199[10] = 1;
            }

            var10000 = GameCanvas.field_116;
            var10000[0] -= var6 << 8;
         }

         this.method_138(super.field_199[2] + var3, var1);
         this.method_107(super.field_199[22]);
         var7 = true;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var8 != 0) {
         super.field_203 = false;
      }

      if (var7) {
         this.method_169(super.field_199[2], super.field_199[3], super.field_199[4]);
      } else {
         this.method_171(super.field_199[2], super.field_199[3], super.field_199[4]);
      }
   }

   // $FF: renamed from: as () void
   private void method_296() {
      int var1 = super.field_199[2];
      if (super.field_199[5] == 0) {
         if (super.field_199[2] + 160 < GameCanvas.method_102() && Math.abs(super.field_199[3] - GameCanvas.method_103() + 12) < 43) {
            int var10002 = super.field_199[5]++;
         }
      } else {
         int[] var10000 = super.field_199;
         var10000[5] += 2;
         if (super.field_199[5] > 1152) {
            super.field_199[5] = 1152;
         }

         super.field_199[2] = super.field_199[5] + super.field_199[8];
      }

      if (super.field_199[2] + 96 > GameCanvas.method_102() && Math.abs(super.field_199[3] - GameCanvas.method_103() + 12) < 43) {
         this.method_104();
         if (super.field_199[5] > 0 && GameCanvas.method_102() + 300 < super.field_199[2]) {
            super.field_199[2] = GameCanvas.method_102() + 300;
         }
      }

      int var4;
      if ((var4 = GameCanvas.method_136(super.field_199[2] - 96, super.field_199[3], var1 - 96, super.field_199[3], 120, 32)) >= 0) {
         if (var4 == 0) {
            return;
         }

         if (var4 == 1) {
            return;
         }

         if (var4 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 120 - 96 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            return;
         }

         if (var4 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 32 + 12 + 12 + 1 << 8;
            GameCanvas.field_116[5] = 0;
            this.method_139();
         }
      }

   }

   // $FF: renamed from: at () void
   private void method_297() {
      super.field_199[5] = super.field_33 / 2 % 180;
      if (super.field_199[5] == 0) {
         super.field_199[10] = 0;
      }

      super.field_199[2] = super.field_199[8];
      super.field_199[3] = super.field_199[9] - 356 + (super.field_199[5] << 3);
      if (Math.abs(GameCanvas.method_102() - super.field_199[2]) < 44) {
         if (super.field_199[3] < super.field_199[9]) {
            if (super.field_199[3] - 240 < GameCanvas.method_103() && super.field_199[3] > GameCanvas.method_103() - 12) {
               this.method_104();
            }
         } else if (super.field_199[3] - 240 < GameCanvas.method_103() && super.field_199[9] > GameCanvas.method_103() - 12) {
            this.method_104();
         }
      }

      if (super.field_199[10] == 0) {
         if (super.field_199[3] > super.field_199[9]) {
            super.field_199[10] = 1;
            return;
         }
      } else {
         int var10002 = super.field_199[10]++;
      }

   }

   // $FF: renamed from: au () void
   private void method_298() {
      byte var2 = 7;
      if (super.field_204[super.field_199[4]]) {
         var2 = 0;
      }

      super.field_204[super.field_199[4]] = false;
      int var3;
      if ((var3 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 14, var2)) >= 0) {
         if (var3 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - var2 << 8;
            super.field_204[super.field_199[4]] = true;
            super.field_152[super.field_199[4]] = true;
            this.method_138(super.field_199[2], 14);
            this.method_107(super.field_199[22]);
         } else if (var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 14 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var3 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 14 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: av () void
   private void method_299() {
      byte var2 = 8;
      boolean var3 = false;
      boolean var4 = false;
      int var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      int var8 = super.field_199[2];
      super.field_199[11] = super.field_199[2];
      super.field_199[7] = super.field_199[3] + super.field_199[14];
      if (super.zoneID == 4) {
         var2 = 16;
      }

      if (super.field_199[4] == 5) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var6 = 64;
      } else if (super.field_199[4] == 1) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var6 = -64;
      }

      if (super.field_199[4] == 12) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var7 = 48;
      } else if (super.field_199[4] == 11) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var7 = -48;
      } else if (super.field_199[4] == 6) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var7 = 64;
      } else if (super.field_199[4] == 2) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var7 = -64;
      } else if (super.field_199[4] == 16) {
         super.field_199[5] = super.field_33 * 15 / 10 % 360;
         var5 = super.field_199[5];
         var7 = -32;
      }

      int[] var10000;
      int var10002;
      if (super.field_199[4] == 7) {
         if (super.field_204[128] && super.field_199[5] <= 0) {
            var10002 = super.field_199[5]++;
         }

         if (super.field_199[5] > 0) {
            var10002 = super.field_199[5]++;
            if (super.field_199[5] > 90) {
               var10000 = super.field_199;
               var10000[3] -= 2;
               if (super.field_199[3] < 368) {
                  super.field_199[3] = 368;
               }
            }
         }

         var5 = super.field_199[5];
      } else if (super.field_199[4] == 3 && super.field_199[5] != 0) {
         var10002 = super.field_199[5]++;
         if (super.field_199[5] > 40) {
            var10000 = super.field_199;
            var10000[6] += 80;
            var10000 = super.field_199;
            var10000[18] += super.field_199[6];
         }

         var5 = super.field_199[5];
      }

      int var11;
      if (super.field_199[4] == 3) {
         var11 = super.field_199[18] >> 8;
         super.field_199[3] = super.field_199[9] + var11;
      } else if (super.field_199[4] != 7) {
         var11 = GameCanvas.method_5(var5) * var7 / 100;
         super.field_199[3] = super.field_199[9] + var11;
         int var10 = GameCanvas.method_5(var5) * var6 / 100;
         super.field_199[2] = super.field_199[8] + var10;
      }

      super.field_199[14] = 0;
      if (super.field_199[13] != 0) {
         super.field_199[14] = 4;
      }

      super.field_199[13] = 0;
      boolean var9 = false;
      var8 -= super.field_199[2];
      int var12;
      if ((var12 = GameCanvas.method_136(super.field_199[2], super.field_199[3] + super.field_199[14] + 32, super.field_199[11], super.field_199[7] + 32, 32, 8)) >= 0 && var12 == 0) {
         GameCanvas.field_116[0] = GameCanvas.method_102() - var8 << 8;
         GameCanvas.field_116[1] = super.field_199[3] - var2 + super.field_199[14] << 8;
         if (super.field_199[4] == 3 && var5 == 0) {
            super.field_199[5] = 1;
         }

         this.method_138(super.field_199[2], 32);
         this.method_107(super.field_199[22]);
         super.field_199[13] = 1;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var12 != 0) {
         super.field_203 = false;
      }

      if ((var12 = GameCanvas.method_136(super.field_199[2], super.field_199[3] + super.field_199[14] - 4, super.field_199[11], super.field_199[7] - 4, 32, 4)) >= 0 && var12 != 3) {
         GameCanvas.field_116[0] = GameCanvas.method_102() - var8 << 8;
         GameCanvas.field_116[1] = super.field_199[3] - var2 + super.field_199[14] << 8;
         if (super.field_199[4] == 3 && var5 == 0) {
            super.field_199[5] = 1;
         }

         this.method_138(super.field_199[2], 32);
         this.method_107(super.field_199[22]);
         super.field_199[13] = 1;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var12 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aw () void
   private void method_300() {
      this.method_316();
   }

   // $FF: renamed from: ax () void
   private void method_301() {
      int var4 = -1;
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];

      for(int var1 = 0; var1 < 2; ++var1) {
         if (super.field_199[10 + var1] != 1 && (var4 = GameCanvas.method_136(super.field_199[2] - 8 + (var1 << 4), super.field_199[3], super.field_199[6] - 8 + (var1 << 4), super.field_199[7], 8, 32)) >= 0) {
            byte var6 = -1;
            if (var4 == 1) {
               var6 = 1;
            }

            if (var4 != 1 && var4 != 2) {
               if (var4 == 3) {
                  GameCanvas.field_116[1] = super.field_199[3] + 32 + 12 + 12 + 1 << 8;
                  this.method_139();
               }
            } else {
               if (Math.abs(GameCanvas.field_116[10]) >= 300 && !GameCanvas.field_122 && GameCanvas.field_124) {
                  int[] var10000 = GameCanvas.field_116;
                  var10000[10] -= 10 * var6;
                  super.field_199[10 + var1] = 1;
                  int var7 = 0;
                  byte var8 = 24;
                  if (super.zoneID == 0) {
                     var7 = super.field_199[4];
                     var8 = 26;
                  }

                  this.method_200(var8, super.field_199[2] - 8 + (var1 << 4), super.field_199[3] - 16 - 16, 30 * var6 + 360, 400, var7);
                  this.method_200(var8, super.field_199[2] - 8 + (var1 << 4), super.field_199[3] - 16 - 16 + 16, 60 * var6 + 360, 400, var7);
                  this.method_200(var8, super.field_199[2] - 8 + (var1 << 4), super.field_199[3] - 16 - 16 + 32, 40 * var6 + 360, 400, var7);
                  this.method_200(var8, super.field_199[2] - 8 + (var1 << 4), super.field_199[3] - 16 - 16 + 48, 50 * var6 + 360, 400, var7);
               } else {
                  GameCanvas.field_116[10] = 0;
               }

               if (GameCanvas.field_116[10] == 0) {
                  if (var6 == 1) {
                     GameCanvas.field_116[0] = super.field_199[2] - 8 - 12 - 8 + (var1 << 4) << 8;
                  } else {
                     GameCanvas.field_116[0] = super.field_199[2] + 8 + 12 + 1 - 8 + (var1 << 4) << 8;
                  }

                  if (var6 == 1) {
                     if (super.pressedKeys[4]) {
                        this.method_72();
                     }
                  } else if (super.pressedKeys[3]) {
                     this.method_72();
                  }
               }
            }
         }
      }

      if (super.field_199[10] == 1 && super.field_199[11] == 1) {
         super.field_199[0] = 0;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var4 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: ay () void
   private void method_302() {
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      super.field_199[10] = super.field_33;
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];

      for(int var1 = 0; var1 < 8; ++var1) {
         if (super.field_199[15] != 0 && (var4 = super.field_33 - super.field_199[16] - GameCanvas.field_154[var1]) < 0) {
            var4 = 0;
         }

         int var7 = GameCanvas.field_153[var1];
         if (var4 != 0) {
            var5 = -1;
         } else {
            var5 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - 12, GameCanvas.field_95[0], GameCanvas.field_95[1] - 12, 12, 12, super.field_199[2] + ((var7 % 4 << 4) - 16 - 8), super.field_199[3] + (var7 >> 2 << 4), super.field_199[6] + ((var7 % 4 << 4) - 16 - 8), super.field_199[7] + (var7 >> 2 << 4), 8, 8);
         }

         if (var5 >= 0) {
            if (var5 == 0) {
               var6 = true;
               GameCanvas.field_116[1] = super.field_199[3] + (var7 >> 2 << 4) + var4 * 5 - 8 << 8;
               this.method_138(super.field_199[2] + ((var7 % 4 << 4) - 16 - 8), 8);
               this.method_107(super.field_199[22]);
               if (super.field_199[15] == 0) {
                  super.field_199[16] = super.field_33;
               }

               super.field_199[15] = 1;
            } else if (var5 == 1) {
               GameCanvas.field_116[0] = super.field_199[2] + ((var7 % 4 << 4) - 16 - 8) - 8 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            } else if (var5 == 2) {
               GameCanvas.field_116[0] = super.field_199[2] + ((var7 % 4 << 4) - 16 - 8) + 8 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[3]) {
                  this.method_72();
               }
            }
         }
      }

      if (var6) {
         var5 = 0;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var5 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: az () void
   private void method_303() {
      int var3;
      if ((var3 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 14, 14)) >= 0) {
         if (var3 == 0) {
            if (GameCanvas.field_124) {
               super.field_199[0] = 0;
               GameCanvas.field_122 = true;
               GameCanvas.field_118 = false;
               GameCanvas.field_124 = true;
               GameCanvas.field_116[5] = -1280;
               if (super.field_297 == 0) {
                  super.field_297 = 100;
               } else if (super.field_297 == 100) {
                  super.field_297 = 200;
               } else if (super.field_297 == 200) {
                  super.field_297 = 500;
               } else if (super.field_297 == 500) {
                  super.field_297 = 1000;
               }

               this.method_35(super.field_297, true);
               this.method_204(super.field_199[2], super.field_199[3], super.field_297);
               this.method_200(22, super.field_199[2] - 8, super.field_199[3] - 16, 330, 400, 0);
               this.method_200(22, super.field_199[2] - 8, super.field_199[3] - 16, 300, 400, 1);
               this.method_200(22, super.field_199[2] - 8, super.field_199[3] - 16, 390, 400, 2);
               this.method_200(22, super.field_199[2] - 8, super.field_199[3] - 16, 420, 400, 3);
               GameCanvas.field_116[1] = super.field_199[3] - 14 << 8;
            } else {
               GameCanvas.field_116[1] = super.field_199[3] - 14 << 8;
               if (GameCanvas.field_100 != 0) {
                  GameCanvas.field_116[0] = GameCanvas.method_102() + GameCanvas.method_5(GameCanvas.field_100 + 90) * 24 / 100 << 8;
                  GameCanvas.field_100 = 0;
               }

               this.method_138(super.field_199[2], 14);
               this.method_107(super.field_199[22]);
            }
         } else if (var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 14 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var3 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 14 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var3 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 14 + 12 + 12 + 1 << 8;
            this.method_139();
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aA () void
   private void method_304() {
      if (super.field_199[5] == 0 && super.field_112 == super.field_199[2] && super.field_113 == super.field_199[3]) {
         super.field_199[5] = 32;
      }

      if (super.field_199[5] > 0) {
         int var10002 = super.field_199[5]++;
         if (super.field_199[5] > 32) {
            super.field_199[5] = 32;
         }
      }

      if (GameCanvas.method_136(super.field_199[2], super.field_199[3] - 12, super.field_199[2], super.field_199[3] - 12, 8, 32) >= 0 && super.field_199[5] == 0) {
         super.field_199[5] = 1;
         super.field_112 = GameCanvas.method_102();
         super.field_113 = GameCanvas.method_103();
         super.field_114 = super.field_108;
         super.field_115 = super.field_109;
      }

   }

   // $FF: renamed from: aB () void
   private void method_305() {
      if (super.field_199[4] < 16) {
         int var3;
         if ((var3 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 8, 32)) >= 0) {
            if (var3 == 1) {
               GameCanvas.field_116[0] = super.field_199[2] - 8 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            } else if (var3 == 2) {
               GameCanvas.field_116[0] = super.field_199[2] + 8 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[3]) {
                  this.method_72();
               }
            } else if (var3 == 3) {
               GameCanvas.field_116[1] = super.field_199[3] + 32 + 12 + 12 + 1 << 8;
               this.method_139();
            }
         }

         if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
            super.field_203 = false;
         }
      }

   }

   // $FF: renamed from: aC () void
   private void method_306() {
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      int[] var10000;
      int var5;
      if (super.field_199[12] == 1) {
         boolean var3 = false;
         var5 = (super.field_32 - super.field_199[14]) * 4;
         super.field_199[14] = super.field_32;
         if (var5 > 0) {
            for(int var4 = var5; var4 >= 0; --var4) {
               if (super.field_199[3] < super.field_199[7] + 1000) {
                  var10000 = super.field_199;
                  var10000[3] += 2;
               }

               if (this.method_62(super.field_199[2], super.field_199[3] + 16) && super.field_199[3] > super.field_199[7] - 1000) {
                  var10000 = super.field_199;
                  var10000[3] -= 2;
                  super.field_199[12] = 0;
                  break;
               }

               if (super.field_199[3] < 0) {
                  super.field_199[3] = 0;
               }
            }
         }
      }

      if (super.field_199[4] != 0) {
         var5 = GameCanvas.method_140(super.field_199[2], super.field_199[3], super.field_199[6], super.field_199[7], 16, 16);
         if (super.field_199[5] != 0) {
            super.field_199[7] = (super.field_32 - super.field_199[13]) * 2;
            if (super.field_199[7] > 60) {
               super.field_199[7] = 60;
            }
         }

         if (var5 >= 0) {
            if (GameCanvas.field_124 && var5 != 3 || !GameCanvas.field_122 && GameCanvas.field_124 && var5 == 3) {
               GameCanvas.field_116[5] = -768;
               this.method_199(1, super.field_199[2], super.field_199[3], 0, 0, 0, 0);
               super.field_199[5] = super.field_199[4];
               super.field_199[13] = super.field_32;
               this.method_135(super.field_199[4]);
               super.field_199[4] = 0;
            } else if (var5 == 0) {
               GameCanvas.field_116[1] = super.field_199[3] - 16 << 8;
               this.method_138(super.field_199[2], 16);
               this.method_107(super.field_199[22]);
            } else if (var5 == 1) {
               GameCanvas.field_116[0] = super.field_199[2] - 16 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            } else if (var5 == 2) {
               GameCanvas.field_116[0] = super.field_199[2] + 16 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[3]) {
                  this.method_72();
               }
            } else if (var5 == 3) {
               GameCanvas.field_116[1] = super.field_199[3] + 16 + 12 + 12 + 1 << 8;
               if (GameCanvas.field_116[5] < 0) {
                  var10000 = GameCanvas.field_116;
                  var10000[5] *= -1;
               }

               if (super.field_199[12] == 0) {
                  var10000 = super.field_199;
                  var10000[3] -= 5;
                  super.field_199[14] = super.field_32;
               }

               super.field_199[12] = 1;
               if (!GameCanvas.field_122) {
                  if (GameCanvas.method_102() < super.field_199[2]) {
                     GameCanvas.field_116[0] = GameCanvas.method_102() - 5 << 8;
                  } else {
                     GameCanvas.field_116[0] = GameCanvas.method_102() + 5 << 8;
                  }
               }
            }
         }

         if (super.field_203 && super.field_205 == super.field_199[20] && var5 != 0) {
            super.field_203 = false;
         }

      }
   }

   // $FF: renamed from: aD () void
   private void method_307() {
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      if (super.field_199[5] == 1) {
         int var10002 = super.field_199[10]++;
         if (super.field_199[10] > 129) {
            super.field_199[10] = 129;
            super.field_199[5] = 2;
            this.method_41();
            return;
         }
      } else if (super.field_199[5] == 0 && GameCanvas.method_102() > super.field_199[2] - 3 && super.field_199[3] + 48 > GameCanvas.method_103()) {
         super.field_199[5] = 1;
         super.field_199[10] = 0;
         super.clearedAct = true;
      }

   }

   // $FF: renamed from: aE () void
   private void method_308() {
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      if (super.field_199[5] == 0) {
         if (GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[6], super.field_199[7], 12, 12) >= 0) {
            super.field_199[5] = 1;
            super.field_199[11] = 0;
            this.method_35(GameCanvas.field_156[super.field_199[4]], true);
            return;
         }
      } else if (super.field_199[5] == 1) {
         int var10002 = super.field_199[11]++;
         if (super.field_199[11] > 120) {
            super.field_199[5] = 2;
         }
      }

   }

   // $FF: renamed from: aF () void
   private void method_309() {
      this.method_308();
   }

   // $FF: renamed from: aG () void
   private void method_310() {
      int var3;
      if ((var3 = GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 16, 16)) >= 0 && var3 != 0) {
         if (var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 16 - 12 << 8;
            GameCanvas.field_116[10] = 0;
         } else if (var3 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 16 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
         } else if (var3 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 16 + 12 + 12 + 1 << 8;
            this.method_139();
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aH () void
   private void method_311() {
      byte var1 = 32;
      byte var2 = 28;
      byte var3 = 4;
      if (super.field_199[4] == 1) {
         var1 = 12;
         var2 = 8;
         var3 = 0;
      }

      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      int var4;
      if ((var4 = GameCanvas.method_136(super.field_199[2], super.field_199[3] + var3, super.field_199[6], super.field_199[7] + var3, var1, var2)) >= 0) {
         if (var4 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - var2 + var3 << 8;
            this.method_138(super.field_199[2], var1);
            this.method_107(super.field_199[22]);
            if (super.field_199[4] == 1 && super.field_199[5] == 0) {
               super.clearedAct = true;
               super.field_199[5] = 1;
               int[] var10000 = super.field_199;
               var10000[3] += 8;
               super.field_199[10] = super.field_33;
               super.field_274 = 2;
            }
         } else if (!super.field_267) {
            if (var4 == 1) {
               GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            } else if (var4 == 2) {
               GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[3]) {
                  this.method_72();
               }
            } else if (var4 == 3) {
               GameCanvas.field_116[1] = super.field_199[3] + var2 + 12 + 12 + 1 + var3 << 8;
            }
         }
      }

      if (super.field_199[5] == 1) {
         if ((super.field_33 - super.field_199[10]) % 20 == 0 && GameCanvas.field_157.length > (super.field_33 - super.field_199[10]) / 20) {
            this.method_199(1, super.field_199[8] + GameCanvas.field_157[(super.field_33 - super.field_199[10]) / 20], super.field_199[9] + GameCanvas.field_158[(super.field_33 - super.field_199[10]) / 20], 0, 0, 0, 0);
         }

         if (super.field_33 - super.field_199[10] > 100) {
            super.field_199[5] = 2;
            super.field_199[10] = super.field_33;
            this.method_203(super.field_199[8] + 4, super.field_199[9] + 27 + 16, super.zoneID);
         }
      } else if (super.field_199[5] == 2 && super.field_33 - super.field_199[10] > 180) {
         this.method_41();
         int var10002 = super.field_199[5]++;
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var4 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aI () void
   private void method_312() {
      if (GameCanvas.method_141(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 8, 8) >= 0) {
         int var4 = Math.abs(GameCanvas.method_102() - super.field_199[2]);
         int var5 = Math.abs(GameCanvas.method_103() - 12 - super.field_199[3]);
         if (super.field_199[10] < 10) {
            this.method_204(super.field_199[2], super.field_199[3], 10);
            this.method_35(10, true);
            int var10002 = super.field_199[10]++;
         }

         if (GameCanvas.method_102() - super.field_199[2] > 0) {
            GameCanvas.field_116[3] = 1792 * var4 / (var4 + var5);
         } else {
            GameCanvas.field_116[3] = -1792 * var4 / (var4 + var5);
         }

         if (GameCanvas.method_103() - 12 - super.field_199[3] > 0) {
            GameCanvas.field_116[5] = 2048 * var5 / (var4 + var5);
         } else {
            GameCanvas.field_116[5] = -2048 * var5 / (var4 + var5);
         }

         if (!GameCanvas.field_122) {
            GameCanvas.field_116[3] = GameCanvas.field_116[3] * 80 / 100;
            int[] var10000 = GameCanvas.field_116;
            var10000[5] -= 1024;
         }

         GameCanvas.field_116[10] = 0;
         GameCanvas.field_116[13] = 0;
         GameCanvas.field_116[14] = 0;
         GameCanvas.field_122 = true;
         GameCanvas.field_118 = false;
         GameCanvas.field_123 = true;
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aJ () void
   private void method_313() {
      int var3;
      if ((var3 = GameCanvas.method_141(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 16, 16)) >= 0) {
         if (var3 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - 16 << 8;
            this.method_138(super.field_199[2], 16);
            this.method_107(super.field_199[22]);
         } else if (var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 16 - 12 << 8;
            if (super.pressedKeys[4]) {
               this.method_72();
            }

            GameCanvas.field_116[10] = 0;
            GameCanvas.field_116[13] = 0;
            GameCanvas.field_116[14] = 0;
         } else if (var3 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 16 + 12 + 1 << 8;
            if (super.pressedKeys[3]) {
               this.method_72();
            }

            GameCanvas.field_116[10] = 0;
            GameCanvas.field_116[13] = 0;
            GameCanvas.field_116[14] = 0;
         } else if (var3 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + 16 + 12 + 12 + 1 << 8;
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aK () void
   private void method_314() {
      int var1 = super.field_32;
      boolean var2 = false;
      byte var5 = 4;
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      if (super.field_199[19] == 1) {
         var1 += 45;
      } else if (super.field_199[19] == 2) {
         var1 += 135;
      } else if (super.field_199[19] == 3) {
         var1 += 180;
      }

      if (super.field_199[4] == 195 || super.field_199[4] == 179) {
         var5 = 8;
      }

      if (super.field_199[4] != 243 && super.field_199[4] != 195 && super.field_199[4] != 227 && super.field_199[4] != 179) {
         int var6 = super.field_32;
         if (super.field_199[4] == 2) {
            if (super.field_199[19] != 0) {
               if (var6 % 96 * 2 < 96) {
                  super.field_199[3] = super.field_199[9] - (96 - (var6 % 96 * 2 - 96)) + 64;
               } else {
                  super.field_199[3] = super.field_199[9] - var6 % 96 * 2 + 64;
               }
            } else if (var6 % 96 * 2 < 96) {
               super.field_199[3] = super.field_199[9] - var6 % 96 * 2;
            } else {
               super.field_199[3] = super.field_199[9] - (96 - (var6 % 96 * 2 - 96));
            }
         } else if (super.field_199[4] == 1) {
            if (var6 % 96 * 2 < 96) {
               super.field_199[2] = super.field_199[8] - var6 % 96 * 2;
            } else {
               super.field_199[2] = super.field_199[8] - (96 - (var6 % 96 * 2 - 96));
            }
         }
      } else {
         this.method_351((360 / var5 - var1 % (360 / var5)) * var5, 16, 17);
         super.field_199[2] = super.field_199[8] + super.field_199[16] * 80 / 10000;
         super.field_199[3] = super.field_199[9] + super.field_199[17] * 80 / 10000;
      }

      byte var7 = 12;
      if (!GameCanvas.field_124 && !GameCanvas.field_126) {
         var7 = 20;
      }

      if (GameCanvas.method_136(super.field_199[2], super.field_199[3], super.field_199[6], super.field_199[7], 16, 16) >= 0) {
         this.method_104();
      } else {
         if (Math.abs(super.field_199[2] - GameCanvas.method_102()) < 28 && Math.abs(super.field_199[3] - (GameCanvas.method_103() - var7)) < var7 + 16) {
            this.method_104();
         }

      }
   }

   // $FF: renamed from: aL () void
   private void method_315() {
      boolean var1 = false;
      boolean var2 = false;
      byte var3 = 0;
      byte var4 = 0;
      byte var5 = 12;
      if (!GameCanvas.field_124 && !GameCanvas.field_126) {
         var5 = 20;
      }

      if (super.field_199[18] == 0) {
         super.field_199[5] = super.field_32;
         super.field_199[18] = 1;
      }

      int var10;
      int var11 = (var10 = super.field_32 - super.field_199[5]) - 1;
      if (super.field_199[4] != 213 && super.field_199[4] != 181 && super.field_199[4] != 197 && super.field_199[4] != 101 && super.field_199[4] != 69 && super.field_199[4] != 53) {
         if (super.field_199[4] != 212 && super.field_199[4] != 196 && super.field_199[4] != 84 && super.field_199[4] != 68 && super.field_199[4] != 52) {
            if (super.field_199[4] == 38) {
               var3 = 6;
            } else if (super.field_199[4] == 195) {
               var3 = 3;
            }
         } else {
            var3 = 4;
         }
      } else {
         var3 = 5;
      }

      if (super.field_199[4] != 181 && super.field_199[4] != 101) {
         if (super.field_199[4] != 196 && super.field_199[4] != 197 && super.field_199[4] != 84 && super.field_199[4] != 195) {
            if (super.field_199[4] != 213 && super.field_199[4] != 212 && super.field_199[4] != 69 && super.field_199[4] != 68) {
               if (super.field_199[4] != 52 && super.field_199[4] != 53) {
                  if (super.field_199[4] == 38) {
                     var4 = 4;
                  }
               } else {
                  var4 = 6;
               }
            } else {
               var4 = 8;
            }
         } else {
            var4 = 10;
         }
      } else {
         var4 = 12;
      }

      if (super.field_199[4] != 69 && super.field_199[4] != 84 && super.field_199[4] != 101 && super.field_199[4] != 38 && super.field_199[4] != 68 && super.field_199[4] != 52 && super.field_199[4] != 53) {
         this.method_351((360 / var4 - var10 % (360 / var4)) * var4, 16, 17);
         this.method_351((360 / var4 - var11 % (360 / var4)) * var4, 14, 15);
      } else {
         this.method_351(360 - (360 / var4 - var10 % (360 / var4)) * var4 % 360, 16, 17);
         this.method_351(360 - (360 / var4 - var11 % (360 / var4)) * var4 % 360, 14, 15);
      }

      if (super.field_199[4] == 84) {
         this.method_351(var10 % (360 / var4) * var4, 16, 17);
         this.method_351(var11 % (360 / var4) * var4, 14, 15);
      } else if (super.field_199[19] == 1) {
         this.method_351(var10 % (360 / var4) * var4, 16, 17);
         this.method_351(var11 % (360 / var4) * var4, 14, 15);
      }

      boolean var6 = false;
      byte var7 = 16;
      byte var8 = 16;
      if (super.zoneID == 4) {
         var7 = 8;
         var8 = 8;
      }

      for(int var9 = 1; var9 < var3; ++var9) {
         if (super.zoneID == 4) {
            var7 = 8;
            var8 = 8;
            if (GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - var5, GameCanvas.field_95[0], GameCanvas.field_95[1] - var5, 12, var5, super.field_199[2] + var9 * super.field_199[16] * 16 / 10000, super.field_199[3] + var9 * super.field_199[17] * 16 / 10000, super.field_199[2] + var9 * super.field_199[14] * 16 / 10000, super.field_199[3] + var9 * super.field_199[15] * 16 / 10000, 6, 6) >= 0) {
               this.method_104();
            }
         }
      }

      int var12;
      if (super.zoneID == 4) {
         var12 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - var5, GameCanvas.field_95[0], GameCanvas.field_95[1] - var5, 12, var5, super.field_199[2] + var3 * super.field_199[16] * (var7 << 1) / 10000, super.field_199[3] + var3 * super.field_199[17] * (var7 << 1) / 10000, super.field_199[2] + var3 * super.field_199[14] * (var7 << 1) / 10000, super.field_199[3] + var3 * super.field_199[15] * (var7 << 1) / 10000, var7 - 2, var8 - 2);
      } else {
         var12 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - var5, GameCanvas.field_95[0], GameCanvas.field_95[1] - var5, 12, var5, super.field_199[2] + var3 * super.field_199[16] * var7 / 10000, super.field_199[3] + var3 * super.field_199[17] * var7 / 10000, super.field_199[2] + var3 * super.field_199[14] * var7 / 10000, super.field_199[3] + var3 * super.field_199[15] * var7 / 10000, 6, 6);
      }

      if (var12 >= 0) {
         this.method_104();
      }

   }

   // $FF: renamed from: aM () void
   private void method_316() {
      int var1 = 16;
      byte var2 = 16;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      super.field_199[6] = super.field_199[2];
      super.field_199[7] = super.field_199[3];
      byte var9;
      if (super.field_199[4] == 248 && super.actID == 2) {
         var9 = 64;
         var2 = 16;
         if (Math.abs(GameCanvas.method_102() - super.field_199[8]) <= 64 && Math.abs(GameCanvas.method_103() + 12 - (super.field_199[9] - 32 + 8)) <= 32) {
            super.field_152[super.field_199[4] - 240] = true;
         }

         if (Math.abs(GameCanvas.method_102() - super.field_199[8]) <= 64 && Math.abs(GameCanvas.method_103() + 12 - (super.field_199[9] + 48)) <= 32) {
            super.field_152[super.field_199[4] - 240] = false;
         }

         if (super.field_152[super.field_199[4] - 240] && super.field_199[3] > super.field_208) {
            super.field_199[18] = 1;
            super.field_199[5] = 128;
            super.field_199[2] = super.field_199[8] + 128 - super.field_199[5];
         } else {
            super.field_199[18] = 1;
            super.field_199[5] = 0;
            super.field_199[2] = super.field_199[8] + 128 - super.field_199[5];
         }

         var1 = var9 - 1;
      } else if (super.field_199[4] != 241 || !super.field_152[128] || super.zoneID != 1 || super.actID != 3) {
         int var10002;
         if (super.field_199[4] >= 240) {
            var9 = 64;
            var2 = 16;
            if (super.field_199[19] == 0) {
               if (super.field_152[super.field_199[4] - 240] && super.field_199[18] == 0) {
                  super.field_199[18] = 1;
                  super.field_199[5] = 128;
                  super.field_199[2] = super.field_199[8] + 128 - super.field_199[5];
               }

               super.field_199[18] = 1;
               if (super.field_199[5] == 0) {
                  if (super.field_152[super.field_199[4] - 240]) {
                     super.field_199[5] = 1;
                  } else {
                     super.field_199[2] = super.field_199[8] + 128;
                  }
               } else {
                  var10002 = super.field_199[5]++;
                  if (super.field_199[5] > 128) {
                     super.field_199[5] = 128;
                  }

                  super.field_199[2] = super.field_199[8] + 128 - super.field_199[5];
               }
            } else {
               if (super.field_152[super.field_199[4] - 240] && super.field_199[18] == 0) {
                  super.field_199[18] = 1;
                  super.field_199[5] = 128;
                  super.field_199[2] = super.field_199[8] + super.field_199[5];
               }

               super.field_199[18] = 1;
               if (super.field_199[5] == 0) {
                  if (super.field_152[super.field_199[4] - 240]) {
                     super.field_199[5] = 1;
                  } else {
                     super.field_199[2] = super.field_199[8];
                  }
               } else {
                  var10002 = super.field_199[5]++;
                  if (super.field_199[5] > 128) {
                     super.field_199[5] = 128;
                  }

                  super.field_199[2] = super.field_199[8] + super.field_199[5];
               }
            }

            var1 = var9 - 1;
         } else if (super.field_199[4] != 229 || super.zoneID != 1 || super.actID != 0) {
            if (super.field_199[4] >= 224) {
               var9 = 8;
               var2 = 32;
               if (super.field_152[super.field_199[4] - 224] && super.field_199[18] == 0) {
                  super.field_199[18] = 1;
                  super.field_199[5] = 64;
                  super.field_199[3] = super.field_199[9] + 64 - super.field_199[5];
               }

               super.field_199[18] = 1;
               if (super.field_199[5] == 0) {
                  if (super.field_152[super.field_199[4] - 224]) {
                     super.field_199[5] = 1;
                  } else {
                     super.field_199[3] = super.field_199[9] + 64;
                  }
               } else {
                  var10002 = super.field_199[5]++;
                  if (super.field_199[5] > 64) {
                     super.field_199[5] = 64;
                  }

                  super.field_199[3] = super.field_199[9] + 64 - super.field_199[5];
               }

               var1 = var9 - 1;
            } else {
               int var10;
               if (super.field_199[4] == 19) {
                  var1 = 32;
                  var2 = 32;
                  var10002 = super.field_199[5]++;
                  if (super.field_33 % 360 > 90 && super.field_33 % 360 < 270) {
                     var10 = 33;
                  } else {
                     var10 = 32;
                  }

                  if (super.field_199[19] == 0) {
                     super.field_199[3] = super.field_199[9] + GameCanvas.method_5(super.field_33) * var10 / 100 - var10;
                  } else {
                     super.field_199[3] = super.field_199[9] - GameCanvas.method_5(super.field_33) * var10 / 100 - var10;
                  }

                  var6 = true;
               } else if (super.field_199[4] >= 0 && super.field_199[4] <= 2) {
                  var1 = 16;
                  var2 = 16;
                  var3 = super.field_199[2];
                  if (super.field_199[4] != 0) {
                     var10002 = super.field_199[5]++;
                     var10 = 32 * super.field_199[4];
                     if (super.field_199[19] == 0) {
                        super.field_199[2] = super.field_199[8] + GameCanvas.method_5(super.field_33) * var10 / 100 - var10;
                     } else {
                        super.field_199[2] = super.field_199[8] - GameCanvas.method_5(super.field_33) * var10 / 100 - var10;
                     }
                  }

                  var3 -= super.field_199[2];
                  var5 = true;
               } else if (super.field_199[4] <= 91 && super.field_199[4] >= 88) {
                  var1 = 16;
                  var2 = 16;
                  var3 = super.field_199[2];
                  var10 = 32 * (super.field_199[4] - 88 + 1) - 16;
                  if (super.field_33 % 720 < 180) {
                     if (super.field_199[19] == 0) {
                        super.field_199[3] = super.field_199[9] - GameCanvas.method_5(90 + super.field_33 % 720) * var10 / 100;
                        super.field_199[2] = super.field_199[8] - 16 + 32 * (super.field_199[4] - 88 + 1);
                     } else {
                        super.field_199[3] = super.field_199[9] + GameCanvas.method_5(90 + super.field_33 % 720) * var10 / 100;
                        super.field_199[2] = super.field_199[8] + 16 - 32 * (super.field_199[4] - 88 + 1);
                     }
                  } else if (super.field_33 % 720 < 360) {
                     if (super.field_199[19] == 0) {
                        super.field_199[2] = super.field_199[8] - GameCanvas.method_5(270 - (super.field_33 % 720 - 180)) * var10 / 100;
                        super.field_199[3] = super.field_199[9] - 16 + 32 * (super.field_199[4] - 88 + 1);
                     } else {
                        super.field_199[2] = super.field_199[8] + GameCanvas.method_5(270 - (super.field_33 % 720 - 180)) * var10 / 100;
                        super.field_199[3] = super.field_199[9] + 16 - 32 * (super.field_199[4] - 88 + 1);
                     }

                     var5 = true;
                  } else if (super.field_33 % 720 < 540) {
                     if (super.field_199[19] == 0) {
                        super.field_199[3] = super.field_199[9] + GameCanvas.method_5(90 + (super.field_33 % 720 - 360)) * var10 / 100;
                        super.field_199[2] = super.field_199[8] + 16 - 32 * (super.field_199[4] - 88 + 1);
                     } else {
                        super.field_199[3] = super.field_199[9] - GameCanvas.method_5(90 + (super.field_33 % 720 - 360)) * var10 / 100;
                        super.field_199[2] = super.field_199[8] - 16 + 32 * (super.field_199[4] - 88 + 1);
                     }
                  } else if (super.field_33 % 720 < 720) {
                     if (super.field_199[19] == 0) {
                        super.field_199[2] = super.field_199[8] + GameCanvas.method_5(270 - (super.field_33 % 720 - 540)) * var10 / 100;
                        super.field_199[3] = super.field_199[9] + 16 - 32 * (super.field_199[4] - 88 + 1);
                     } else {
                        super.field_199[2] = super.field_199[8] - GameCanvas.method_5(270 - (super.field_33 % 720 - 540)) * var10 / 100;
                        super.field_199[3] = super.field_199[9] - 16 + 32 * (super.field_199[4] - 88 + 1);
                     }

                     var5 = true;
                  }

                  var3 -= super.field_199[2];
               } else if (super.field_199[4] == 160) {
                  var1 = 16;
                  var2 = 32;
                  if (super.field_152[0] && super.field_199[18] == 0) {
                     super.field_199[18] = 1;
                     super.field_199[3] = super.field_199[9];
                  }

                  super.field_199[18] = 1;
                  if (super.field_152[0]) {
                     var10002 = super.field_199[3]--;
                     if (super.field_199[3] < super.field_199[9]) {
                        super.field_199[3] = super.field_199[9];
                     }
                  } else if (super.actID == 0) {
                     super.field_199[3] = 688;
                  } else {
                     super.field_199[3] = super.field_199[9] + 64;
                  }
               } else if (super.field_199[4] == 55) {
                  var1 = 32;
                  var2 = 25;
                  if (super.field_152[super.field_199[4] - 40] && super.field_199[18] == 0) {
                     super.field_199[18] = 1;
                     super.field_199[2] = 7992;
                  }

                  super.field_199[18] = 1;
                  if ((super.field_199[8] != 7992 || super.field_199[9] != 1353) && super.field_152[super.field_199[4] - 40]) {
                     var10002 = super.field_199[2]++;
                     if (super.field_199[2] > 7992) {
                        super.field_199[2] = 7992;
                     }
                  }
               }
            }
         }
      }

      byte var7 = 12;
      if (!GameCanvas.field_124 && !GameCanvas.field_126) {
         var7 = 16;
      }

      int var8 = -1;
      if ((super.field_199[4] != 55 || super.field_199[8] != 7992 || super.field_199[9] != 1353) && (var8 = GameCanvas.method_137(GameCanvas.method_102(), GameCanvas.method_103() - var7, GameCanvas.field_95[0], GameCanvas.field_95[1] - var7, 12, var7, super.field_199[2], super.field_199[3], super.field_199[6], super.field_199[7], var1, var2)) >= 0) {
         int[] var10000;
         if (var8 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] - var2 << 8;
            this.method_138(super.field_199[2], var1);
            this.method_107(super.field_199[22]);
            var10000 = GameCanvas.field_116;
            var10000[0] -= var3 << 8;
         } else if (var8 == 1) {
            if (!GameCanvas.field_120 || super.field_199[4] != 227) {
               GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
               GameCanvas.field_116[10] = 0;
               if (super.pressedKeys[4]) {
                  this.method_72();
               }
            }
         } else if (var8 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var8 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + var2 + var7 + var7 + 1 << 8;
            this.method_139();
         } else if (var8 == 4) {
            if (var5) {
               if (super.field_199[2] > GameCanvas.method_102()) {
                  if (!GameCanvas.field_120 || super.field_199[4] != 227) {
                     GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 << 8;
                     GameCanvas.field_116[10] = 0;
                     if (super.pressedKeys[4]) {
                        this.method_72();
                     }
                  }
               } else {
                  GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
                  GameCanvas.field_116[10] = 0;
                  if (super.pressedKeys[3]) {
                     this.method_72();
                  }
               }
            }

            if (var6) {
               if (super.field_199[3] > GameCanvas.method_103() - var7) {
                  GameCanvas.field_116[1] = super.field_199[3] - var2 << 8;
                  this.method_138(super.field_199[2], var1);
                  this.method_107(super.field_199[22]);
                  var10000 = GameCanvas.field_116;
                  var10000[0] -= var3 << 8;
                  var8 = 0;
               } else {
                  GameCanvas.field_116[1] = super.field_199[3] + var2 + var7 + var7 + 1 + 8 << 8;
                  this.method_139();
               }
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var8 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: aN () void
   private void method_317() {
      boolean var1 = false;
      short var2 = 0;
      boolean var3 = false;
      int var4 = super.field_199[4] / 16;
      if (super.field_199[18] == 0) {
         super.field_199[10] = super.field_33;
         super.field_199[18] = 1;
      }

      if ((super.field_33 - super.field_199[10]) % (var4 * 50) == 0 && super.field_199[2] - GameCanvas.field_225[0] >= -16 && super.field_199[2] - GameCanvas.field_225[0] <= 256 && super.field_199[3] - GameCanvas.field_225[1] >= -16 && super.field_199[3] - GameCanvas.field_225[1] <= 184) {
         if (super.field_199[4] == 48 || super.field_199[4] == 66 || super.field_199[4] == 65 || super.field_199[4] == 49 || super.field_199[4] == 80 || super.field_199[4] == 64 || super.field_199[4] == 81) {
            if (super.field_199[4] == 48) {
               var2 = 96;
            }

            if (super.field_199[4] == 49) {
               var2 = 128;
            }

            if (super.field_199[4] == 64) {
               var2 = 96;
            }

            if (super.field_199[4] == 65) {
               var2 = 128;
            }

            if (super.field_199[4] == 66) {
               var2 = 196;
            }

            if (super.field_199[4] == 80) {
               var2 = 72;
            }

            if (super.field_199[4] == 81) {
               var2 = 136;
            }

            this.method_199(20, super.field_199[2], super.field_199[3], 0, 0, 0, var2);
            return;
         }

         if (super.field_199[4] == 53 || super.field_199[4] == 37 || super.field_199[4] == 69) {
            this.method_199(16, super.field_199[2], super.field_199[3], 0, 200, 0, 0);
            return;
         }

         if (super.field_199[4] == 55 || super.field_199[4] == 71 || super.field_199[4] == 23) {
            this.method_199(16, super.field_199[2], super.field_199[3], 200, 0, 0, 0);
            return;
         }

         if (super.field_199[4] == 54) {
            this.method_199(16, super.field_199[2], super.field_199[3], -200, 0, 0, 0);
         }
      }

   }

   // $FF: renamed from: aO () void
   private void method_318() {
      byte var2 = 0;
      if (super.actID == 2) {
         var2 = 1;
      }

      if (super.field_199[4] == 16) {
         int[][] var3 = this.method_121(10, 2);

         int var1;
         for(var1 = 0; var1 < var3.length; ++var1) {
            if (Math.abs(super.field_199[2] + 32 - 64 * var2 - var3[var1][2]) < 2) {
               if (super.field_199[5] == 0) {
                  super.field_199[5] = 1;
                  super.field_199[10] = super.field_33;
               }

               super.field_199[7] = var3[var1][20];
               break;
            }
         }

         if (super.field_199[7] > 0) {
            for(var1 = 0; var1 < var3.length; ++var1) {
               if (var3[var1][20] == super.field_199[7]) {
                  super.field_199[6] = var1;
                  break;
               }
            }
         }

         if (super.field_199[10] != 0) {
            super.field_199[5] = super.field_33 - super.field_199[10];
         }

         if (super.field_199[5] > 0 && super.field_199[7] > 0) {
            if (super.field_199[5] / 4 > 44) {
               super.field_199[5] = 0;
               super.field_199[6] = 0;
               super.field_199[7] = 0;
               super.field_199[10] = 0;
            } else if (super.field_199[5] / 4 > 26) {
               super.field_199[3] = super.field_199[9] - (160 - (super.field_199[5] - 104) * 2);
            } else if (super.field_199[5] / 4 > 6) {
               super.field_199[3] = super.field_199[9] - (super.field_199[5] - 24) * 2;
            }

            int var10002 = super.field_199[5]++;
         }

         if (super.field_199[4] == 16 && super.field_199[5] / 4 > 0 && super.field_199[2] - 20 - 32 <= GameCanvas.method_102() && super.field_199[2] - 20 - 32 + 112 >= GameCanvas.method_102() && super.field_199[3] <= GameCanvas.method_103() && super.field_199[9] >= GameCanvas.method_103()) {
            this.method_104();
         }
      }

   }

   // $FF: renamed from: aP () void
   private void method_319() {
      byte var2 = 72;
      int var3 = 0;
      if (super.field_199[6] == 0 && super.field_199[7] == 0) {
         super.field_199[6] = super.field_199[2];
         super.field_199[7] = super.field_199[3];
      }

      if (super.field_199[4] == 1) {
         super.field_199[5] = super.field_33;
         var3 = (GameCanvas.method_5(super.field_199[5]) * 16 / 100 - 16) * 2;
         var3 += 2;
      } else if (super.field_199[4] == 2) {
         super.field_199[5] = super.field_33;
         var3 = (GameCanvas.method_5(super.field_199[5]) * -16 / 100 + -16) * 2;
         var3 += 2;
      } else if (super.field_199[4] == 20) {
         var2 = 56;
         if (super.field_199[5] == 0) {
            if (super.field_204[1]) {
               super.field_199[5] = 1;
               super.field_199[10] = super.field_33;
            } else {
               super.field_199[3] = super.field_199[9] - 160;
            }
         } else {
            super.field_199[5] = super.field_33 - (super.field_199[10] - 1);
            if (super.field_199[5] > 72) {
               super.field_199[5] = 72;
            }

            super.field_199[3] = super.field_199[9] - 160 + super.field_199[5] * 2;
         }

         var3 = 16;
      } else if (super.field_199[4] == 4) {
         var2 = 56;
         if (!super.field_204[0] && super.field_199[5] == 0) {
            super.field_199[3] = super.field_199[9] - 160;
         } else {
            if (super.field_204[0] && super.field_199[5] == 0) {
               super.field_199[10] = super.field_33;
            }

            super.field_199[5] = super.field_33 - (super.field_199[10] - 1);
            if (super.field_199[5] > 72) {
               super.field_199[5] = 72;
            }

            super.field_199[3] = super.field_199[9] - 160 + super.field_199[5] * 2;
         }

         var3 = 16;
      }

      int var5;
      if ((var5 = GameCanvas.method_136(super.field_199[2], super.field_199[3] + var3, super.field_199[6], super.field_199[7], 32, var2)) >= 0) {
         if (var5 == 0) {
            GameCanvas.field_116[1] = super.field_199[3] + var3 - var2 << 8;
            this.method_138(super.field_199[2], 32);
            this.method_107(super.field_199[22]);
         } else if (var5 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 32 - 12 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[4]) {
               this.method_72();
            }
         } else if (var5 == 2) {
            GameCanvas.field_116[0] = super.field_199[2] + 32 + 12 + 1 << 8;
            GameCanvas.field_116[10] = 0;
            if (super.pressedKeys[3]) {
               this.method_72();
            }
         } else if (var5 == 3) {
            GameCanvas.field_116[1] = super.field_199[3] + var3 + var2 + 12 + 12 + 1 << 8;
            if (super.field_199[4] == 1 && (super.field_199[5] % 360 < 90 || super.field_199[5] % 360 > 270)) {
               this.method_139();
            } else if (super.field_199[4] == 2 && super.field_199[5] % 360 < 270 && super.field_199[5] % 360 > 90) {
               this.method_139();
            } else if (super.field_199[4] != 1 && super.field_199[4] != 2) {
               this.method_139();
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var5 != 0) {
         super.field_203 = false;
      }

      super.field_199[7] = super.field_199[3] + var3;
      super.field_199[6] = super.field_199[2];
   }

   // $FF: renamed from: aQ () void
   private void method_320() {
      this.method_299();
   }

   // $FF: renamed from: aR () void
   private void method_321() {
      byte var1 = 0;
      int var2 = super.field_32 % 4 * 12;
      if (super.field_32 % 4 == 3) {
         var1 = 4;
         var2 = 12;
      }

      if (super.field_199[5] == 0) {
         GameCanvas.method_126(0, 0, var2, 12, 12, GameCanvas.field_35[var1], super.field_199[2], super.field_199[3]);
      } else {
         GameCanvas.method_126(0, 12, (super.field_33 - super.field_199[10]) / 5 % 4 * 12, 12, 12, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
      }

      if (super.field_199[11] == 1) {
         if (super.field_199[5] == 0) {
            GameCanvas.method_126(0, 0, var2, 12, 12, GameCanvas.field_35[var1], super.field_199[2], super.field_199[12]);
            return;
         }

         GameCanvas.method_126(0, 12, (super.field_33 - super.field_199[10]) / 5 % 4 * 12, 12, 12, GameCanvas.field_35[0], super.field_199[2], super.field_199[12]);
      }

   }

   // $FF: renamed from: aS () void
   private void method_322() {
      boolean var1 = false;
      int var2 = GameCanvas.method_5(super.field_32 * 3) * 87;
      int var3 = super.field_199[4] + 1;
      if (super.field_199[4] == 5) {
         var2 = -var2;
      } else if (super.field_199[19] == 1) {
         var2 = -var2;
      }

      int var4;
      for(var4 = 1; var4 < var3; ++var4) {
         if (super.zoneID != 3) {
            if (super.zoneID != 5) {
               GameCanvas.method_126(3, 12, 24, 12, 12, GameCanvas.field_35[0], super.field_199[2] + var4 * GameCanvas.method_5(180 + var2 / 100) * 16 / 100, super.field_199[3] + var4 * GameCanvas.method_6(180 + var2 / 100) * 16 / 100);
            } else {
               GameCanvas.method_126(3, 0, 96, 16, 16, GameCanvas.field_35[0], super.field_199[2] + var4 * GameCanvas.method_5(180 + var2 / 100) * 16 / 100, super.field_199[3] + var4 * GameCanvas.method_6(180 + var2 / 100) * 16 / 100);
            }
         }
      }

      if (super.zoneID != 3 && super.zoneID != 5) {
         GameCanvas.method_126(3, 12, 12, 12, 12, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
      }

      if (super.zoneID != 3) {
         if (super.zoneID != 5) {
            var4 = var3 * 16;
            var4 -= 8;
            GameCanvas.method_126(3, 0, 0, 32, 12, GameCanvas.field_35[0], super.field_199[2] + GameCanvas.method_5(180 + var2 / 100) * var4 / 100, super.field_199[3] + GameCanvas.method_6(180 + var2 / 100) * var4 / 100);
         }

      }
   }

   // $FF: renamed from: aT () void
   private void method_323() {
      boolean var1 = false;
      if (GameCanvas.gameImages[5] != null) {
         int var2 = GameCanvas.gameImages[5].getHeight();
         int var3 = GameCanvas.gameImages[5].getWidth() / 3;

         for(int var4 = 0; var4 < 12; ++var4) {
            int var5;
            if ((var5 = super.field_199[10] - Math.abs(super.field_199[5] - var4)) < 0) {
               var5 = 0;
            }

            if (var4 == 0 || var4 == 11) {
               var5 = 0;
            }

            GameCanvas.method_126(5, var3 * 2, 0, var3, var2, GameCanvas.field_35[0], super.field_199[2] - 96 + var4 * 16, super.field_199[3] + var5);
         }

      }
   }

   // $FF: renamed from: aU () void
   private void method_324() {
      int[] var3 = new int[]{-4, 4};
      boolean var4 = false;

      for(int var5 = 0; var5 < 12; ++var5) {
         int var6 = (super.field_32 / 10 + (12 - var5)) % 7;
         GameCanvas.method_126(4, 0, var6 * 18, 12, 18, GameCanvas.field_35[0], super.field_199[2] - 96 + var5 * 16, super.field_199[3] + var3[var6 / 4]);
      }

   }

   // $FF: renamed from: aV () void
   private void method_325() {
      int var1 = GameCanvas.field_35[0];
      int var2 = 0;
      boolean var3 = false;
      boolean var4 = false;
      byte var9 = 20;
      if (super.field_199[4] != 0) {
         var1 = GameCanvas.field_35[4];
         var9 = 40;
      }

      if (super.field_199[5] != 0) {
         var2 = super.field_33 / 2 - super.field_199[10];
      }

      for(int var11 = 0; var11 < 36; ++var11) {
         int var12;
         if ((var12 = var2 - var11 * 3) < 0) {
            var12 = 0;
         } else {
            var12 *= var2 / 6;
         }

         int var13;
         if (super.field_199[4] != 0) {
            var13 = 72 - var11 / 6 * 16 - 16;
         } else {
            var13 = var11 / 6 * 16;
         }

         GameCanvas.method_126(6, var11 / 6 * 12, 72 - (var11 % 6 + 1) * 12, 12, 12, var1, super.field_199[2] + var13 - var9, super.field_199[3] + 72 - (var11 % 6 + 1) * 16 - 36 + var12 + 12);
      }

   }

   // $FF: renamed from: aW () void
   private void method_326() {
      boolean var1 = false;
      byte var4;
      if (super.field_199[4] == 21) {
         var4 = 2;
      } else if (super.field_199[4] == 1) {
         var4 = 0;
      } else {
         var4 = 1;
      }

      int var2;
      if (var4 == 2) {
         GameCanvas.method_127(7, 12, 0, 96, 72, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] - 16, 3);
         if (super.field_199[16] >= 60) {
            boolean var3 = false;

            for(var2 = 0; var2 < 8; ++var2) {
               int var5 = super.field_32 - super.field_199[15];
               if (var2 << 3 < var5) {
                  var5 = var2 << 3;
               }

               GameCanvas.method_127(101, 0, (super.field_32 + (var2 << 1)) % 4 * 24, 18, 24, GameCanvas.field_35[0], super.field_199[2] + (var5 << 1) - 56, super.field_199[3] - GameCanvas.field_165[var4][var5], 3);
            }
         }
      } else {
         if (var4 == 0) {
            GameCanvas.method_127(7, 0, 72, 96, 60, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] - 16, 3);
            return;
         }

         for(var2 = 0; var2 < 4; ++var2) {
            GameCanvas.method_127(7, 0, 0, 12, 72, GameCanvas.field_35[0], super.field_199[2] + var2 * 16 - 32, super.field_199[3] - 48, 20);
         }
      }

   }

   // $FF: renamed from: aX () void
   private void method_327() {
      int var1 = GameCanvas.field_35[0];
      int var2 = (super.field_199[3] - super.field_199[9]) % 12;

      for(int var3 = 0; var3 <= (super.field_199[3] - super.field_199[9]) / 12; ++var3) {
         int var4 = super.field_199[9] - 18 + var3 * 12 + var2;
         if (var3 == 0) {
            int var5 = Math.max(GameCanvas.method_125(super.field_199[9] - 24 - GameCanvas.cameraPosition[1] + 4), 0);
            GameCanvas.g.setClip(0, GameCanvas.gameY + var5, GameCanvas.gameWidth, GameCanvas.gameHeight - var5);
         }

         GameCanvas.method_126(94, 0, 6, 24, 12, var1, super.field_199[8], var4);
         if (var3 == 0) {
            GameCanvas.g.setClip(0, GameCanvas.gameY, GameCanvas.gameWidth, GameCanvas.gameHeight);
         }
      }

      GameCanvas.method_126(94, 0, 0, 24, 6, var1, super.field_199[8], super.field_199[9] - 24);
      GameCanvas.method_126(94, 0, 18, 24, 6, var1, super.field_199[2], super.field_199[3] - 12);
      if (super.field_199[4] != 128 && super.field_199[4] != 2) {
         if (super.field_199[4] == 35) {
            GameCanvas.method_126(95, 0, 0, 24, 18, var1, super.field_199[2], super.field_199[3]);
         } else {
            if (super.field_199[4] == 17 || super.field_199[4] == 18) {
               GameCanvas.method_126(8, 0, 18, 84, 24, var1, super.field_199[2], super.field_199[3] + 21);
               GameCanvas.method_126(8, 0, 0, 36, 18, var1, super.field_199[2] - 24, super.field_199[3]);
               GameCanvas.method_126(8, 48, 0, 36, 18, var1, super.field_199[2] + 24, super.field_199[3]);
            }

         }
      } else {
         GameCanvas.method_126(8, 0, 0, 84, 42, var1, super.field_199[2], super.field_199[3] + 12);
      }
   }

   // $FF: renamed from: aY () void
   private void method_328() {
      if (GameCanvas.gameImages[9] != null) {
         byte var1 = 0;
         if (super.field_199[19] == 2) {
            var1 = 2;
         }

         int var2;
         int var3 = (var2 = GameCanvas.gameImages[9].getWidth()) / 5;
         int var4 = GameCanvas.gameImages[9].getHeight();
         int var5;
         if (super.field_199[4] == 48) {
            for(var5 = 0; var5 < 3; ++var5) {
               GameCanvas.method_126(9, 0, 0, var3, var4, GameCanvas.field_35[var1], super.field_199[2] - 24 + var5 * 24, super.field_199[3]);
            }
         } else if (super.field_199[4] == 64) {
            if (super.zoneID != 1 || super.actID != 0 || super.field_199[4] != 64 || super.field_199[19] == 0) {
               for(var5 = 0; var5 < 6; ++var5) {
                  GameCanvas.method_126(9, var4 >> 1, 0, var3, var4, GameCanvas.field_35[var1], super.field_199[2] - 60 + var5 * 24, super.field_199[3]);
               }
            }
         } else {
            if (super.field_199[4] == 18 || super.field_199[4] == 16) {
               if (super.field_199[19] == 0) {
                  var1 = 3;
               } else {
                  var1 = 1;
               }

               GameCanvas.method_126(9, 0, 0, var2, var4, GameCanvas.field_35[var1], super.field_199[2], super.field_199[3]);
               return;
            }

            if (super.field_199[4] == 82) {
               if (super.field_199[19] == 0) {
                  GameCanvas.method_126(9, var4 >> 1, 0, var3, var4, GameCanvas.field_35[7], super.field_199[2] - 20, super.field_199[3] + 10);
                  return;
               }

               GameCanvas.method_126(9, var4 >> 1, 0, var3, var4, GameCanvas.field_35[1], super.field_199[2] - 4, super.field_199[3] + 10);
               return;
            }

            if (super.field_199[4] == 32) {
               GameCanvas.method_126(9, var4 >> 1, 0, var3, var4, GameCanvas.field_35[var1], super.field_199[2], super.field_199[3]);
               return;
            }

            GameCanvas.method_126(9, 0, 0, var2, var4, GameCanvas.field_35[var1], super.field_199[2], super.field_199[3]);
         }

      }
   }

   // $FF: renamed from: aZ () void
   private void method_329() {
      if (super.field_199[4] == 129) {
         for(int var1 = 0; var1 < 4; ++var1) {
            GameCanvas.method_128(54, 0, super.field_199[2] - 62 + 31 * var1, super.field_199[3] - 16, 20);
         }
      } else {
         GameCanvas.method_126(54, 0, 0, GameCanvas.gameImages[54].getWidth(), GameCanvas.gameImages[54].getHeight(), GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
      }

   }

   // $FF: renamed from: ba () void
   private void method_330() {
      GameCanvas.method_126(11, 0, 0, GameCanvas.gameImages[11].getWidth(), GameCanvas.gameImages[11].getHeight(), GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
   }

   // $FF: renamed from: bb () void
   private void method_331() {
      if (super.field_199[4] != 2 && super.field_199[4] != 1) {
         int var1;
         if (super.field_199[4] == 65) {
            for(var1 = 0; var1 < 3; ++var1) {
               GameCanvas.method_126(54, 0, 0, 23, 24, GameCanvas.field_35[0], super.field_199[2] + (var1 << 5), super.field_199[3]);
            }
         } else {
            if (super.field_199[4] == 57) {
               for(var1 = 1; var1 < 15; ++var1) {
                  GameCanvas.method_126(12, 0, 18, 6, 18, GameCanvas.field_35[0], super.field_199[2] - 48 + (var1 << 3), super.field_199[3] - 6);
               }

               GameCanvas.method_126(12, 0, 0, 6, 18, GameCanvas.field_35[0], super.field_199[2] - 48, super.field_199[3] - 6);
               GameCanvas.method_126(12, 0, 0, 6, 18, GameCanvas.field_35[4], super.field_199[2] + 42, super.field_199[3] - 6);
               return;
            }

            if (super.field_199[4] == 40) {
               for(var1 = 0; var1 < 8; ++var1) {
                  GameCanvas.method_126(12, 6, var1 % 2 * 18, 6, 18, GameCanvas.field_35[0], super.field_199[2] - 24 + (var1 << 3), super.field_199[3] - 6);
               }
            } else if ((super.field_199[4] == 7 || super.field_199[4] == 4) && super.field_199[5] != 0) {
               GameCanvas.method_126(12, 0, 0, 24, 12, GameCanvas.field_35[4], super.field_199[2], super.field_199[3]);
            }
         }
      } else {
         GameCanvas.method_126(54, 0, 0, 23, 24, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
         if (super.field_199[4] == 2) {
            this.method_32((super.field_199[2] >> 4) - 1, (super.field_199[3] >> 4) - 1, 3, 3);
            return;
         }
      }

   }

   // $FF: renamed from: bc () void
   private void method_332() {
      int var1;
      for(var1 = 0; var1 < 2; ++var1) {
         GameCanvas.method_126(13, 0, (super.field_32 + var1) % 3 * 24, 24, 24, GameCanvas.field_35[0], super.field_199[2] + var1 * 32 + 48, super.field_199[3] + var1 * 32 - 16);
      }

      for(int var2 = 0; var2 < 4; ++var2) {
         var1 = super.field_199[2] - GameCanvas.cameraPosition[0] + (var2 >> 1) * 24 + 12;

         for(int var3 = 0; var3 < var1 / 24 + 2; ++var3) {
            GameCanvas.method_126(99, 0, (super.field_32 + var2) % 3 * 12, 24, 12, GameCanvas.field_35[0], super.field_199[2] + (var2 >> 1) * 32 + 16 - var3 * 32, super.field_199[3] + var2 * 16 - 24);
         }
      }

   }

   // $FF: renamed from: bd () void
   private void method_333() {
      boolean var1 = false;
      int var2;
      if ((var2 = super.field_199[5] / 4) != 0 && super.field_199[3] - 24 < super.field_199[9]) {
         GameCanvas.method_129(98, 0, 24 * (super.field_32 % 2), 48, 24, GameCanvas.field_35[0], super.field_199[2] - 24, super.field_199[3] - 24);
      }

      if (var2 > 6) {
         var2 = 6;
      }

      int var3;
      for(var3 = 1; var3 < var2; ++var3) {
         if (super.field_199[3] - var3 * 24 < super.field_199[9]) {
            GameCanvas.method_129(14, 0, 24 * (var3 % 2), 48, 24, GameCanvas.field_35[0], super.field_199[2] - 24, super.field_199[3] - var3 * 24 - 24);
         } else if (super.field_199[3] - var3 * 24 - 32 < super.field_199[9]) {
            GameCanvas.method_129(14, 0, 24 * (var3 % 2), 48, 18, GameCanvas.field_35[0], super.field_199[2] - 24, super.field_199[3] - var3 * 24 - 24);
         }
      }

      if (super.field_199[5] / 4 != 0 && super.field_199[3] - var3 * 24 - 24 < super.field_199[9]) {
         GameCanvas.method_129(98, 0, 48 + 24 * (super.field_32 % 2), 48, 24, GameCanvas.field_35[0], super.field_199[2] - 24, super.field_199[3] - var3 * 24 - 24);
      }

      if (super.field_199[10] > 0 && GameCanvas.field_159.length > super.field_199[10] / 3) {
         GameCanvas.method_129(77, 0, 24 * GameCanvas.field_159[super.field_199[10] / 3], 84, 24, GameCanvas.field_35[0], super.field_199[8], super.field_199[9]);
      }

   }

   // $FF: renamed from: be () void
   private void method_334() {
      int var1 = GameCanvas.gameImages[15].getWidth();
      GameCanvas.gameImages[15].getHeight();
      if (super.field_204[super.field_199[4]]) {
         GameCanvas.method_126(15, 0, 12, var1, 6, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] - 1);
      } else {
         GameCanvas.method_126(15, 0, 0, var1, 8, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] - 3);
      }

      GameCanvas.method_126(15, 0, 8, var1, 4, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] + 5);
   }

   // $FF: renamed from: bf () void
   private void method_335() {
      if (super.zoneID != 3) {
         if (super.field_199[4] != 16) {
            GameCanvas.method_126(16, 0, 0, 48, 24, 0, super.field_199[2], super.field_199[3] + super.field_199[14]);
            return;
         }

         GameCanvas.method_126(16, 0, 24, 48, 36, 0, super.field_199[2], super.field_199[3] + 8 + super.field_199[14]);

         for(int var1 = 5; var1 >= 0; --var1) {
            GameCanvas.method_126(16, 0, 48, 48, 12, 0, super.field_199[2], super.field_199[3] + 8 + 48 - 16 + 16 * var1 + super.field_199[14]);
         }
      }

   }

   // $FF: renamed from: bg () void
   private void method_336() {
      this.method_353();
   }

   // $FF: renamed from: bh () void
   private void method_337() {
      boolean var2 = false;
      byte var3;
      if (super.field_199[4] == 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      int var1;
      if (super.field_199[10] != 1) {
         for(var1 = 0; var1 < 4; ++var1) {
            GameCanvas.method_129(18, var3 * 12, 0, 12, 12, 0, super.field_199[2] - 16, super.field_199[3] - 16 - 16 + var1 * 16);
         }
      }

      if (super.field_199[4] == 2) {
         var3 = 2;
      } else {
         var3 = 1;
      }

      if (super.field_199[11] != 1) {
         for(var1 = 0; var1 < 4; ++var1) {
            GameCanvas.method_129(18, var3 * 12, 0, 12, 12, 0, super.field_199[2], super.field_199[3] - 16 - 16 + var1 * 16);
         }
      }

   }

   // $FF: renamed from: bi () void
   private void method_338() {
      int var4 = 0;
      if (super.field_199[5] < 129) {
         for(int var1 = 0; var1 < 8; ++var1) {
            int var3 = GameCanvas.field_153[var1];
            if (GameCanvas.field_153[var1] % 4 >= 2) {
               var3 -= 2;
            }

            if (super.field_199[15] != 0 && (var4 = super.field_33 - super.field_199[16] - GameCanvas.field_154[var1]) < 0) {
               var4 = 0;
            }

            int var5 = GameCanvas.gameImages[27].getWidth() / 4;
            GameCanvas.method_126(27, var3 % 4 * var5, var3 / 4 * var5, var5, var5, 0, super.field_199[2] + GameCanvas.field_153[var1] % 4 * 16 - 16 - 8, super.field_199[3] + GameCanvas.field_153[var1] / 4 * 16 + var4 * (var4 / 5));
         }
      }

   }

   // $FF: renamed from: bj () void
   private void method_339() {
      GameCanvas.method_126(27, 0, 0, 24, 24, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
   }

   // $FF: renamed from: bk () void
   private void method_340() {
      if (!super.field_240 && !super.field_241) {
         if (super.field_199[5] == 0) {
            GameCanvas.method_126(36, 0, 12, 12, 12, GameCanvas.field_35[4], super.field_199[2], super.field_199[3] - 32 - 4);
         } else {
            GameCanvas.method_126(36, 0, 0, 12, 12, GameCanvas.field_35[4], super.field_199[2] - GameCanvas.method_5(90 * super.field_199[5] / 4) * 8 / 100, super.field_199[3] - 24 + GameCanvas.method_6(90 * super.field_199[5] / 4) * 8 / 100 - 4);
         }

         GameCanvas.method_126(36, 0, 24, 12, 36, GameCanvas.field_35[4], super.field_199[2], super.field_199[3] - 4);
      }
   }

   // $FF: renamed from: bl () void
   private void method_341() {
      byte var1 = 0;
      if (super.field_199[4] == 1) {
         var1 = 1;
      } else if (super.field_199[4] == 2) {
         var1 = 2;
      } else if (super.field_199[4] == 16) {
         var1 = 3;
      } else if (super.field_199[4] == 17) {
         var1 = 4;
      } else if (super.field_199[4] == 18) {
         var1 = 5;
      }

      GameCanvas.method_126(37, var1 * 10, 0, 10, 40, 0, super.field_199[2], super.field_199[3]);
   }

   // $FF: renamed from: bm () void
   private void method_342() {
      byte var1 = 24;
      if (GameCanvas.gameImages[42] != null) {
         int var3 = GameCanvas.gameImages[42].getWidth();
         byte var4 = 0;
         if (super.field_199[4] < 7) {
            if (GameCanvas.field_160[super.field_199[4]] == 8) {
               var1 = 16;
               var4 = 8;
            }

            int var5;
            if (super.field_199[5] != 0 && super.field_199[7] < 60) {
               if (super.field_199[5] >= 7) {
                  return;
               }

               if ((var5 = super.field_199[7]) >= 48) {
                  var5 = 48;
               }

               GameCanvas.method_126(42, 6, GameCanvas.field_160[super.field_199[5]] * var1 + 5, 12, 11, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] - var5);
            }

            if (GameCanvas.field_160[super.field_199[4]] != 8) {
               if (super.field_32 % 2 == 0) {
                  var5 = GameCanvas.field_160[super.field_199[4]] * var1;
               } else {
                  var5 = (super.field_32 % 6 / 2 + 5) * var1;
               }
            } else {
               var5 = 192;
               var1 = 16;
            }

            GameCanvas.method_126(42, 0, var5, var3, var1, GameCanvas.field_35[0], super.field_199[2], super.field_199[3] + var4);
         }
      }
   }

   // $FF: renamed from: bn () void
   private void method_343() {
      this.method_342();
   }

   // $FF: renamed from: bo () void
   private void method_344() {
      byte var1 = 0;
      if (super.field_199[10] / 3 > 22) {
         var1 = 36;
      }

      if (super.field_199[5] != 2) {
         GameCanvas.method_126(44, 0, var1 + super.field_199[10] / 3 % 4 * 36, 36, 36, 0, super.field_199[2], super.field_199[3] + 10);
      } else {
         GameCanvas.method_126(44, 0, 144, 36, 36, 0, super.field_199[2], super.field_199[3] + 10);
      }

      if (super.field_199[5] == 1) {
         GameCanvas.method_126(0, 12, super.field_199[10] / 4 % 4 * 12, 12, 12, GameCanvas.field_161[super.field_199[10] / 2 % 4], super.field_199[2] + GameCanvas.field_162[super.field_199[10] / 4 % 10] - 24, super.field_199[3] + 10 + GameCanvas.field_163[super.field_199[10] / 4 % 10] - 24);
      }

   }

   // $FF: renamed from: bp () void
   private void method_345() {
      boolean var1 = false;
      int var2 = GameCanvas.gameImages[45].getWidth();
      byte var6;
      if (super.field_199[4] != 0 && super.field_199[4] != 3) {
         if (super.field_199[4] == 1) {
            var6 = 36;
         } else {
            var6 = 18;
         }
      } else {
         var6 = 0;
      }

      if (super.field_199[5] == 1) {
         GameCanvas.method_126(45, 0, var6, var2, 18, 0, super.field_199[2], super.field_199[3]);
      }

   }

   // $FF: renamed from: bq () void
   private void method_346() {
      this.method_345();
   }

   // $FF: renamed from: br () void
   private void method_347() {
      if (super.field_199[4] == 1) {
         if (super.field_199[5] < 2) {
            GameCanvas.method_126(55, super.field_32 % 2 * 18, 72, 18, 12, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
            GameCanvas.method_126(55, 0, 0, 48, 48, GameCanvas.field_35[0], super.field_199[8], super.field_199[9] + 37);
            return;
         }

         GameCanvas.method_126(55, 0, 48, 48, 24, GameCanvas.field_35[0], super.field_199[8], super.field_199[9] + 12 + 37);
      }

   }

   // $FF: renamed from: bs () void
   private void method_348() {
      GameCanvas.method_126(56, 0, 24, 24, 24, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
   }

   // $FF: renamed from: bt () void
   private void method_349() {
      GameCanvas.method_128(58, 0, super.field_199[2], super.field_199[3], 3);
   }

   // $FF: renamed from: bu () void
   private void method_350() {
      GameCanvas.method_130(super.field_199[2], super.field_199[3], 60, 0, GameCanvas.field_35[0]);
   }

   // $FF: renamed from: n (int, int, int) void
   private void method_351(int var1, int var2, int var3) {
      if (var1 < 0) {
         var1 += 360;
      }

      if (360 >= var1) {
         var1 -= var1 / 360 * 360;
      }

      if (var1 <= 90) {
         super.field_199[var2] = GameCanvas.field_303[90 - var1];
         super.field_199[var3] = GameCanvas.field_303[var1];
      }

      if (var1 > 90 && var1 <= 180) {
         super.field_199[var2] = -GameCanvas.field_303[90 - (180 - var1)];
         super.field_199[var3] = GameCanvas.field_303[180 - var1];
      }

      if (var1 > 180 && var1 <= 270) {
         super.field_199[var2] = -GameCanvas.field_303[90 - (var1 - 180)];
         super.field_199[var3] = -GameCanvas.field_303[var1 - 180];
      }

      if (var1 > 270 && var1 < 360) {
         super.field_199[var2] = GameCanvas.field_303[90 - (360 - var1)];
         super.field_199[var3] = -GameCanvas.field_303[360 - var1];
      }

   }

   // $FF: renamed from: bv () void
   private void method_352() {
      boolean var1 = false;
      byte var3 = 0;
      byte var4 = 0;
      int var5 = super.field_32 - super.field_199[5];
      if (super.field_199[4] != 213 && super.field_199[4] != 181 && super.field_199[4] != 197 && super.field_199[4] != 101 && super.field_199[4] != 69 && super.field_199[4] != 53) {
         if (super.field_199[4] != 212 && super.field_199[4] != 196 && super.field_199[4] != 84 && super.field_199[4] != 68 && super.field_199[4] != 52) {
            if (super.field_199[4] == 38) {
               var3 = 6;
            } else if (super.field_199[4] == 195) {
               var3 = 3;
            }
         } else {
            var3 = 4;
         }
      } else {
         var3 = 5;
      }

      if (super.field_199[4] != 181 && super.field_199[4] != 101) {
         if (super.field_199[4] != 196 && super.field_199[4] != 197 && super.field_199[4] != 84 && super.field_199[4] != 195) {
            if (super.field_199[4] != 213 && super.field_199[4] != 212 && super.field_199[4] != 69 && super.field_199[4] != 68) {
               if (super.field_199[4] != 52 && super.field_199[4] != 53) {
                  if (super.field_199[4] == 38) {
                     var4 = 4;
                  }
               } else {
                  var4 = 6;
               }
            } else {
               var4 = 8;
            }
         } else {
            var4 = 10;
         }
      } else {
         var4 = 12;
      }

      if (super.field_199[4] != 69 && super.field_199[4] != 84 && super.field_199[4] != 101 && super.field_199[4] != 38 && super.field_199[4] != 68 && super.field_199[4] != 52 && super.field_199[4] != 53) {
         this.method_351((360 / var4 - var5 % (360 / var4)) * var4, 16, 17);
      } else {
         this.method_351(360 - (360 / var4 - var5 % (360 / var4)) * var4 % 360, 16, 17);
      }

      if (super.field_199[4] == 84) {
         this.method_351(var5 % (360 / var4) * var4, 16, 17);
      } else if (super.field_199[19] == 1) {
         this.method_351(var5 % (360 / var4) * var4, 16, 17);
      }

      int var2;
      if (super.zoneID != 4) {
         for(var2 = 1; var2 < var3; ++var2) {
            GameCanvas.method_130(super.field_199[2] + var2 * super.field_199[16] * 16 / 10000, super.field_199[3] + var2 * super.field_199[17] * 16 / 10000, 60, 2, GameCanvas.field_35[0]);
         }

         GameCanvas.method_130(super.field_199[2], super.field_199[3], 60, 4, GameCanvas.field_35[0]);
         GameCanvas.method_130(super.field_199[2] + var2 * super.field_199[16] * 16 / 10000, super.field_199[3] + var2 * super.field_199[17] * 16 / 10000, 60, 3, GameCanvas.field_35[0]);
      } else {
         for(var2 = 1; var2 < var3; ++var2) {
            GameCanvas.method_130(super.field_199[2] + var2 * super.field_199[16] * 16 / 10000, super.field_199[3] + var2 * super.field_199[17] * 16 / 10000, 60, 1, GameCanvas.field_35[0]);
         }

         GameCanvas.method_130(super.field_199[2], super.field_199[3], 60, 1, GameCanvas.field_35[0]);
         GameCanvas.method_130(super.field_199[2] + var2 * super.field_199[16] * 16 / 10000, super.field_199[3] + var2 * super.field_199[17] * 16 / 10000, 60, 1, GameCanvas.field_35[0]);
      }
   }

   // $FF: renamed from: bw () void
   private void method_353() {
      int var1 = super.field_199[2];
      int var2 = super.field_199[3];
      if (super.field_199[4] >= 240) {
         for(int var3 = 0; var3 < 4; ++var3) {
            GameCanvas.method_128(107, 0, var1 - 48 + var3 * 32, var2, 3);
         }
      } else {
         if (super.field_199[4] >= 224) {
            GameCanvas.method_128(107, 0, var1, var2, 3);
            return;
         }

         if (super.field_199[4] <= 2) {
            GameCanvas.method_128(17, 0, var1 - 16, var2 - 16, 20);
            return;
         }

         if (super.field_199[4] == 19) {
            GameCanvas.method_128(17, 0, var1 - 32, var2 - 32, 20);
            GameCanvas.method_128(17, 0, var1, var2 - 32, 20);
            GameCanvas.method_128(17, 0, var1 - 32, var2, 20);
            GameCanvas.method_128(17, 0, var1, var2, 20);
            return;
         }

         if (super.field_199[4] <= 91 && super.field_199[4] >= 88) {
            GameCanvas.method_128(21, 0, var1, var2, 3);
            return;
         }

         if (super.field_199[4] == 160) {
            GameCanvas.method_128(17, 0, var1, var2 - 16, 3);
            GameCanvas.method_128(17, 0, var1, var2 + 16, 3);
            return;
         }

         if (super.field_199[4] == 55 && (super.field_199[8] != 7992 || super.field_199[9] != 1353)) {
            GameCanvas.method_128(107, 0, var1, var2, 3);
         }
      }

   }

   // $FF: renamed from: bx () void
   private void method_354() {
      byte var1 = 0;
      byte var2 = -25;
      if (super.zoneID == 3) {
         if (super.field_199[4] == 54) {
            var1 = 4;
            var2 = 25;
         }

         GameCanvas.method_126(75, 0, 0, 16, 32, GameCanvas.field_35[var1], super.field_199[2] + var2, super.field_199[3]);
      }

   }

   // $FF: renamed from: by () void
   private void method_355() {
      int var1 = super.field_199[5] / 4;
      if (super.field_199[4] == 16 && var1 > 0) {
         if (var1 < 6) {
            var1 %= 2;
         } else {
            var1 = var1 % 2 + 2;
         }

         int var3 = GameCanvas.gameImages[14].getWidth();

         int var2;
         for(var2 = 0; var2 < (super.field_199[9] - super.field_199[3]) / 32; ++var2) {
            GameCanvas.method_129(14, 0, var3 / 2 * (var2 % 2), var3, var3 / 2, GameCanvas.field_35[0], super.field_199[2] - 20 + 24 - 32, super.field_199[3] - 48 + var2 * 32 + 16);
         }

         int var4;
         if ((var4 = (super.field_199[9] - super.field_199[3]) % (var3 / 2)) > 0) {
            GameCanvas.method_129(14, 0, var3 / 2 * (var2 % 2), var3, var4, GameCanvas.field_35[0], super.field_199[2] - 20 + 24 - 32, super.field_199[3] - 48 + var2 * 32 + 16);
         }

         int var5 = GameCanvas.gameImages[77].getWidth();
         GameCanvas.method_129(77, 0, GameCanvas.field_164[var1], var5, GameCanvas.field_164[var1 + 1] - GameCanvas.field_164[var1], GameCanvas.field_35[0], super.field_199[8] - 20 - 32, super.field_199[9] - 48);
         GameCanvas.method_129(77, 0, GameCanvas.field_164[var1 + 2], var5, GameCanvas.field_164[var1 + 1 + 2] - GameCanvas.field_164[var1 + 2], GameCanvas.field_35[0], super.field_199[2] - 20 - 32, super.field_199[3] - 48);
      }

   }

   // $FF: renamed from: bz () void
   private void method_356() {
      int var1 = 0;
      int var2 = 0;
      if (super.field_199[4] == 1) {
         var1 = GameCanvas.method_5(super.field_199[5]) * 16 / 100 - 16;
         var2 = GameCanvas.method_5(super.field_199[5]) * -9 / 100 + -9;
         var1 *= 2;
         var2 *= 2;
         var1 += 2;
         var2 += 2;
      } else if (super.field_199[4] == 2) {
         var1 = GameCanvas.method_5(super.field_199[5]) * -16 / 100 + -16;
         var2 = GameCanvas.method_5(super.field_199[5]) * 9 / 100 - 9;
         var1 *= 2;
         var2 *= 2;
         var1 += 2;
         var2 += 2;
      }

      if (super.field_199[4] != 20 && super.field_199[4] != 4) {
         GameCanvas.method_126(79, 0, 0, 24, 54, GameCanvas.field_35[0], super.field_199[2] - 16, super.field_199[3] + var1 - 36);
         GameCanvas.method_126(79, 0, 0, 24, 54, GameCanvas.field_35[4], super.field_199[2] + 16, super.field_199[3] + var1 - 36);
         GameCanvas.method_126(79, 0, 0, 24, 54, GameCanvas.field_35[6], super.field_199[2] - 16, super.field_199[3] + var1 + 36);
         GameCanvas.method_126(79, 0, 0, 24, 54, GameCanvas.field_35[2], super.field_199[2] + 16, super.field_199[3] + var1 + 36);
         GameCanvas.method_126(79, 0, 54, 24, 24, GameCanvas.field_35[2], super.field_199[2], super.field_199[3] + var2 - 8 - 6);
      } else {
         var2 = GameCanvas.method_5(super.field_33) * 28 / 100 - 28;
         GameCanvas.method_126(79, 0, 0, 24, 42, GameCanvas.field_35[0], super.field_199[2] - 16, super.field_199[3] - 28 + 16);
         GameCanvas.method_126(79, 0, 0, 24, 42, GameCanvas.field_35[4], super.field_199[2] + 16, super.field_199[3] - 28 + 16);
         GameCanvas.method_126(79, 0, 0, 24, 42, GameCanvas.field_35[6], super.field_199[2] - 16, super.field_199[3] + 28 + 16);
         GameCanvas.method_126(79, 0, 0, 24, 42, GameCanvas.field_35[2], super.field_199[2] + 16, super.field_199[3] + 28 + 16);
         GameCanvas.method_126(79, 0, 54, 24, 24, GameCanvas.field_35[2], super.field_199[2], super.field_199[3] + var2 + 28 + 1);
      }
   }

   // $FF: renamed from: bA () void
   private void method_357() {
      this.method_335();
   }

   // $FF: renamed from: bB () void
   private void method_358() {
      byte var1 = 16;
      byte var2 = 8;
      if (super.field_199[4] == 16 || super.field_199[4] == 18) {
         var1 = 8;
         var2 = 16;
      }

      int var10002;
      if (super.field_199[5] > 0) {
         var10002 = super.field_199[5]++;
         if (super.field_199[5] > 12) {
            super.field_199[5] = 0;
         }
      }

      int var3;
      if ((var3 = GameCanvas.method_141(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], var1, var2)) >= 0) {
         short var4 = 4096;
         int var5 = super.field_199[4] / 16;
         if (super.field_199[4] % 16 == 2) {
            var4 = 2560;
         }

         if (var5 == 1) {
            var1 = 7;
         } else {
            var2 = 7;
         }

         if (var3 != 0 && var3 != 4) {
            if (var3 == 1) {
               GameCanvas.field_116[0] = super.field_199[2] - var1 - 12 - 1 << 8;
               GameCanvas.field_116[10] = 0;
               GameCanvas.field_116[13] = 0;
               GameCanvas.field_116[14] = 0;
               if (var5 == 1 && super.field_199[19] == 1) {
                  super.field_294 = 15;
                  GameCanvas.field_116[10] = -var4;
                  GameCanvas.field_116[12] = 1;
                  GameCanvas.field_116[13] = 1;
                  GameCanvas.field_116[14] = 1;
                  var10002 = super.field_199[5]++;
               }
            } else if (var3 == 2) {
               GameCanvas.field_116[0] = super.field_199[2] + var1 + 12 + 1 << 8;
               GameCanvas.field_116[10] = 0;
               GameCanvas.field_116[13] = 0;
               GameCanvas.field_116[14] = 0;
               if (var5 == 1 && super.field_199[19] == 0) {
                  super.field_294 = 15;
                  GameCanvas.field_116[10] = var4;
                  GameCanvas.field_116[12] = 0;
                  GameCanvas.field_116[13] = 2;
                  GameCanvas.field_116[14] = 2;
                  var10002 = super.field_199[5]++;
               }
            } else if (var3 == 3) {
               if (var5 == 2) {
                  if (super.field_199[19] == 2) {
                     GameCanvas.field_116[5] = var4;
                     GameCanvas.field_122 = true;
                     super.field_294 = 30;
                  }

                  var10002 = super.field_199[5]++;
               }

               GameCanvas.field_116[1] = super.field_199[3] + var2 + 12 + 12 + 1 << 8;
            }
         } else {
            GameCanvas.field_116[1] = super.field_199[3] - var2 << 8;
            if (var5 == 0) {
               if (super.field_199[5] == 4) {
                  GameCanvas.field_116[1] = super.field_199[3] - 8 << 8;
                  GameCanvas.field_122 = true;
                  GameCanvas.field_118 = false;
                  GameCanvas.field_117 = true;
                  GameCanvas.field_124 = false;
                  super.field_297 = 0;
                  GameCanvas.field_116[5] = GameCanvas.method_6(0) * var4 / 100;
               }

               var10002 = super.field_199[5]++;
            } else {
               this.method_107(super.field_199[22]);
            }
         }
      }

      if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
         super.field_203 = false;
      }

   }

   // $FF: renamed from: bC () void
   private void method_359() {
      int[] var1;
      int var2;
      int var3 = (var2 = (var1 = super.field_199)[19]) == 0 ? -2 : 2;
      if (!GameCanvas.method_184(var1)) {
         int var10002;
         switch (var1[14]) {
            case 1:
               if (Math.abs(GameCanvas.method_102() - var1[2]) < 50) {
                  var1[5] = 30;
                  var1[15] = 0;
                  var10002 = var1[14]++;
               }
               break;
            case 2:
               if (GameCanvas.method_102() > var1[2]) {
                  var1[19] = 1;
               } else {
                  var1[19] = 0;
               }

               if (var1[5] <= 0) {
                  var1[5] = 48;
                  var1[15] = 1;
                  if (var1[4] == 1) {
                     var1[14] = 6;
                  } else {
                     var10002 = var1[14]++;
                  }
               }
               break;
            case 3:
               this.method_185(var1);
               if (var1[5] <= 0) {
                  var1[5] = 8;
                  var1[15] = 2;
                  var10002 = var1[14]++;
               }
               break;
            case 4:
               this.method_185(var1);
               if (var1[5] <= 0) {
                  var1[5] = 8;
                  var1[15] = 3;
                  var10002 = var1[14]++;
               }
               break;
            case 5:
               var1[2] += var3;
               this.method_185(var1);
               var1[15] = 4 + (super.field_32 & 1);
               break;
            case 6:
               if (var1[5] > 0) {
                  break;
               }

               this.method_200(7, var1[2], var1[3], var2 == 0 ? 270 : 90, 150, 0);
               var1[5] = 60;
               var10002 = var1[14]++;
            case 7:
               if (var1[5] > 0) {
                  break;
               }

               var1[15] = 0;
               var1[5] = 10;
               var10002 = var1[14]++;
            case 8:
               if (var1[5] > 0) {
                  break;
               }

               var10002 = var1[14]++;
            case 9:
               var1[15] = -1;
               break;
            default:
               var1[15] = -1;
               var1[14] = 1;
         }

         if (var1[14] >= 3 && var1[14] <= 7) {
            this.method_195(var1);
         }

      }
   }

   // $FF: renamed from: bD () void
   private void method_360() {
      int[] var1;
      int var2;
      int var3 = (var2 = (var1 = super.field_199)[19]) == 0 ? -2 : 2;
      if (!GameCanvas.method_184(var1)) {
         int var10002;
         switch (var1[14]) {
            case 1:
               var1[18] = 0;
               var10002 = var1[14]++;
            case 2:
               var1[18] = 0;
               if (var1[6] > 440) {
                  if (var1[19] == 0) {
                     var1[19] = 1;
                  } else {
                     var1[19] = 0;
                  }

                  var1[6] = 0;
               }

               if (GameCanvas.method_191(var1, 160, 100)) {
                  var1[5] = 20;
                  var1[14] = 3;
               }

               var1[2] += var3;
               var1[15] = super.field_32 & 1;
               break;
            case 3:
               var10002 = var1[6]--;
               var1[15] = 2 + (super.field_32 & 1);
               if (var1[5] > 0) {
                  break;
               }

               var1[5] = 90;
               var10002 = var1[14]++;
            case 4:
               var10002 = var1[6]--;
               var1[15] = 4 + (super.field_32 & 1);
               if (var1[5] == 16) {
                  var1[18] = 1;
               } else if (var1[5] == 8) {
                  var1[18] = 2;
               }

               if (var1[5] > 0) {
                  break;
               }

               var1[18] = 0;
               this.method_200(7, var1[2] + (var2 == 0 ? -18 : 18), var1[3] + 24, var2 == 0 ? 210 : 150, 150, 0);
               var1[5] = 30;
               var10002 = var1[14]++;
            case 5:
               var10002 = var1[6]--;
               if (var1[5] > 0) {
                  break;
               }

               var10002 = var1[14]++;
            case 6:
               var1[2] += var3;
               var1[15] = super.field_32 & 1;
               if (var1[6] > 480) {
                  var1[14] = 2;
               }
               break;
            default:
               var1[14] = 1;
         }

         this.method_195(var1);
      }
   }

   // $FF: renamed from: bE () void
   private void method_361() {
      int[] var1;
      int var3 = (var1 = super.field_199)[19] == 0 ? -1 : 1;
      if (Math.abs(var1[2] - GameCanvas.method_102()) <= 240 || Math.abs(var1[3] - GameCanvas.method_103()) <= 168) {
         if (!GameCanvas.method_184(var1)) {
            int var10002;
            switch (var1[14]) {
               case 3:
                  if (var1[5] <= 0) {
                     GameCanvas.method_187(var1);
                     var1[6] = 0;
                     var10002 = var1[14]--;
                  }
                  break;
               default:
                  var1[14] = 1;
               case 1:
                  var10002 = var1[14]++;
               case 2:
                  var1[15] = (super.field_32 >> 1) % 3;
                  var1[2] += var3;
                  this.method_185(var1);
                  if (this.method_190(var1)) {
                     var1[5] = 60;
                     var10002 = var1[14]++;
                  }

                  if ((super.field_32 & 7) == 0) {
                     this.method_199(15, var1[2] - var3 * 20, var1[3] - 2, 0, 0, 0, 0);
                  }
            }

            this.method_195(var1);
         }
      }
   }

   // $FF: renamed from: bF () void
   private void method_362() {
      int[] var1;
      int var2 = (var1 = super.field_199)[19] == 0 ? -1 : 1;
      if (Math.abs(var1[2] - GameCanvas.method_102()) <= 240 || Math.abs(var1[3] - GameCanvas.method_103()) <= 168) {
         int var10002 = var1[5]++;
         if (GameCanvas.method_192(var1[2], var1[3])) {
            var1[18] = 0;
         } else {
            int var3;
            int var4;
            if (var1[18] == 3 || var1[18] == 4) {
               for(var3 = 0; var3 < 4; ++var3) {
                  var4 = 6 + var3 * 3;
                  if (this.method_189(var1[var4] >> 8, var1[var4 + 1] >> 8, 8, 8, var1[var4 + 2] == -1 ? 0 : 1)) {
                     var1[var4 + 2] = var1[2] == 1 ? -1 : 1;
                  }
               }
            }

            switch (var1[18]) {
               case 3:
                  var1[6] += 0 * var1[8];
                  var1[9] += 32 * var1[11];
                  var1[12] += 64 * var1[14];
                  var1[15] += 96 * var1[17];
                  if (var1[5] >= 32) {
                     var10002 = var1[18]++;
                  }
                  break;
               case 4:
                  var1[6] += 96 * var1[8];
                  var1[9] += 64 * var1[11];
                  var1[12] += 32 * var1[14];
                  var1[15] += 0 * var1[17];
                  if (var1[5] >= 64) {
                     var10002 = var1[18]++;
                  }
                  break;
               case 5:
                  if (var1[8] == var1[11] && var1[11] == var1[14] && var1[14] == var1[17]) {
                     var1[9] = var1[6] + (-var1[8] * 12 << 8);
                     var1[12] = var1[9] + (-var1[8] * 12 << 8);
                     var1[15] = var1[12] + (-var1[8] * 12 << 8);
                  }

                  var1[5] = 0;
                  var1[18] = 3;
                  break;
               default:
                  var1[18] = 1;
               case 1:
                  var1[5] = 0;
                  var1[6] = var1[2] << 8;
                  var1[7] = var1[3] << 8;
                  var1[8] = var2;
                  var1[9] = var1[6] + (-var2 * 12 << 8);
                  var1[10] = var1[7];
                  var1[11] = var2;
                  var1[12] = var1[9] + (-var2 * 12 << 8);
                  var1[13] = var1[10];
                  var1[14] = var2;
                  var1[15] = var1[12] + (-var2 * 12 << 8);
                  var1[16] = var1[13];
                  var1[17] = var2;
                  var10002 = var1[18]++;
               case 2:
                  var1[7] = this.method_188(var1[6] >> 8, var1[7] >> 8, 8) << 8;
                  var1[10] = this.method_188(var1[9] >> 8, var1[10] >> 8, 8) << 8;
                  var1[13] = this.method_188(var1[12] >> 8, var1[13] >> 8, 8) << 8;
                  var1[16] = this.method_188(var1[15] >> 8, var1[16] >> 8, 8) << 8;
                  if (var1[5] >= 8) {
                     var1[5] = 0;
                     var10002 = var1[18]++;
                  }
            }

            for(var3 = 0; var3 < 4; ++var3) {
               var4 = 7 + var3 * 3;
               var1[var4] = this.method_188(var1[var4 - 1] >> 8, var1[var4] >> 8, 8) << 8;
            }

            for(var3 = 0; var3 < 3; ++var3) {
               var4 = 7 + var3 * 3;
               if (var1[7] + 4096 < var1[var4 + 3]) {
                  var1[var4 + 3] = var1[7];
               }

               if (Math.abs(var1[8] - var1[var4 + 4]) > 3072) {
                  var1[var4 + 4] += var1[8] << 8;
               }
            }

            var1[2] = var1[6] >> 8;
            var1[3] = var1[7] >> 8;
            if (!this.method_195(var1) && this.method_194(var1[12] >> 8, var1[13] >> 8, 22, 10, false) != 0) {
               this.method_200(14, var1[2], var1[3], 30 * var2 + 360, 300, 0);
               this.method_200(14, var1[9] >> 8, var1[10] >> 8, 15 * var2 + 360, 300, 1);
               this.method_200(14, var1[12] >> 8, var1[13] >> 8, -15 * var2 + 360, 300, 1);
               this.method_200(14, var1[15] >> 8, var1[16] >> 8, -30 * var2 + 360, 300, 1);
               var1[0] = 0;
               this.method_104();
            }

         }
      }
   }

   // $FF: renamed from: bG () void
   private void method_363() {
      int[] var1;
      int var2 = (var1 = super.field_199)[19] == 0 ? -1 : 1;
      if (Math.abs(var1[2] - GameCanvas.method_102()) <= 240 || Math.abs(var1[3] - GameCanvas.method_103()) <= 168) {
         if (!GameCanvas.method_184(var1)) {
            int var10002;
            switch (var1[14]) {
               case 4:
                  this.method_196(var1, 16);
                  if (var1[5] <= 0) {
                     var1[14] = 1;
                  }
                  break;
               default:
                  var1[14] = 1;
               case 1:
                  var1[10] = 0;
                  var1[11] = 0;
                  var1[5] = 360;
                  var10002 = var1[14]++;
               case 2:
                  var1[15] = (super.field_32 >> 2) % 3;
                  var1[10] = var2 * 20;
                  var1[12] += var1[10];
                  var1[13] += var1[11];
                  this.method_196(var1, 16);
                  var1[2] = var1[12] / 100;
                  var1[3] = var1[13] / 100;
                  if (this.method_190(var1) || var1[6] > 180) {
                     GameCanvas.method_187(var1);
                     var1[6] = 0;
                  }

                  if (var1[5] > 0) {
                     break;
                  }

                  var1[15] = 1;
                  var1[5] = 60;
                  var10002 = var1[14]++;
               case 3:
                  this.method_196(var1, 16);
                  if (var1[5] < 12) {
                     var1[15] = 3;
                  }

                  if (var1[5] <= 0) {
                     this.method_200(9, var1[2] + 16, var1[3] - 16, 15, 240, 0);
                     this.method_200(9, var1[2] - 16, var1[3] - 16, 345, 240, 0);
                     var1[5] = 50;
                     var10002 = var1[14]++;
                  }
            }

            this.method_195(var1);
         }
      }
   }

   // $FF: renamed from: bH () void
   private void method_364() {
      int[] var1;
      if (!GameCanvas.method_184(var1 = super.field_199)) {
         int var10002;
         switch (var1[14]) {
            default:
               var1[14] = 1;
            case 1:
               var1[15] = -1;
               var1[8] = 0;
               var1[9] = 0;
               var1[10] = 0;
               var1[11] = 400;
               var10002 = var1[14]++;
            case 2:
               if (GameCanvas.method_102() - 160 < var1[2]) {
                  break;
               }

               var10002 = var1[14]++;
            case 3:
               var1[10] = 500;
               var1[11] = 400;
               var1[15] = 0;
               var1[5] = 94;
               var10002 = var1[14]++;
            case 4:
               var1[15] = super.field_32 & 1;
               var1[10] = 400;
               if (var1[9] == 0 && this.method_189(var1[2], var1[3], 20, 20, 1)) {
                  var1[9] = 1;
                  var1[11] = -800;
                  var1[5] = 94;
               }

               if (var1[5] > 0) {
                  break;
               }

               var1[5] = 94;
               var10002 = var1[14]++;
            case 5:
               var1[10] = 0;
               var1[11] = 0;
               var1[15] = 1;
               var1[5] = 20;
               var10002 = var1[14]++;
            case 6:
               if (var1[5] > 0) {
                  break;
               }

               var1[15] = 2;
               var1[5] = 20;
               var10002 = var1[14]++;
            case 7:
               if (var1[5] > 0) {
                  break;
               }

               var1[15] = 3;
               var1[5] = 60;
               var10002 = var1[14]++;
            case 8:
               if (var1[5] > 0) {
                  break;
               }

               var1[15] = 2;
               var1[5] = 20;
               var10002 = var1[14]++;
            case 9:
               if (var1[5] > 0) {
                  break;
               }

               var1[15] = 1;
               var1[5] = 20;
               var10002 = var1[14]++;
            case 10:
               if (var1[5] <= 0) {
                  var1[5] = 94;
                  var1[14] = 3;
               }
         }

         var1[11] += 20;
         if (var1[11] > 400) {
            var1[11] = 400;
         }

         var1[12] += var1[10];
         var1[13] += var1[11];
         if (var1[11] > 0 && this.method_62(var1[12] / 100, var1[13] / 100 + 12)) {
            var1[9] = 0;

            for(int var2 = 0; var2 < 4; ++var2) {
               this.method_62(var1[12] / 100, var1[13] / 100 + 12);
               var1[13] -= 100;
            }

            if (var1[13] < 0) {
               var1[13] = 0;
            }
         }

         var1[2] = var1[12] / 100;
         var1[3] = var1[13] / 100;
         if (var1[15] >= 0) {
            this.method_195(var1);
         }

      }
   }

   // $FF: renamed from: bI () void
   private void method_365() {
      int[] var1;
      int var2 = (var1 = super.field_199)[19] == 0 ? -1 : 1;
      if (Math.abs(var1[2] - GameCanvas.method_102()) <= 240 || Math.abs(var1[3] - GameCanvas.method_103()) <= 168) {
         if (!GameCanvas.method_184(var1)) {
            switch (var1[14]) {
               case 2:
                  break;
               default:
                  var1[14] = 1;
               case 1:
                  var1[10] = 0;
                  var1[11] = 0;
                  var1[5] = 120;
                  int var10002 = var1[14]++;
            }

            var1[15] = (super.field_32 >> 2) % 3;
            var1[10] = var2 * 25;
            var1[12] += var1[10];
            var1[13] += var1[11];
            var1[2] = var1[12] / 100;
            var1[3] = var1[13] / 100;
            this.method_186(var1, 24);
            if (this.method_190(var1) || var1[6] > 240) {
               GameCanvas.method_187(var1);
               var1[6] = 0;
            }

            if (var1[5] <= 0) {
               var1[15] = 1;
               var1[5] = 40;
            }

            this.method_195(var1);
         }
      }
   }

   // $FF: renamed from: bJ () void
   private void method_366() {
      int[] var1;
      int var2 = (var1 = super.field_199)[19] == 0 ? -1 : 1;
      if (!GameCanvas.method_184(var1)) {
         int var10002;
         switch (var1[14]) {
            case 2:
               var1[15] = 1;
               var1[3] += 2;
               if (var1[3] >= var1[9]) {
                  var1[3] = var1[9];
                  var10002 = var1[14]++;
               }
               break;
            case 3:
               var1[15] = GameCanvas.field_140[super.field_32 & 3];
               var1[2] += var2;
               if (Math.abs(var1[2] - GameCanvas.method_102()) > 80) {
                  var10002 = var1[14]++;
               }
               break;
            case 4:
               var1[15] = GameCanvas.field_140[super.field_32 & 3];
               var1[2] += var2;
               var1[3] -= 2;
               if (this.method_62(var1[2], var1[3] - 16)) {
                  var1[14] = 1;
               }
               break;
            default:
               var1[14] = 1;
            case 1:
               var1[15] = 0;
               if (GameCanvas.method_102() > var1[2]) {
                  var1[19] = 1;
               } else {
                  var1[19] = 0;
               }

               if (var1[3] + 40 <= GameCanvas.method_103() && var1[3] + 100 >= GameCanvas.method_103() && Math.abs(var1[2] - GameCanvas.method_102()) < 100) {
                  var1[9] = GameCanvas.method_103() - 16;
                  var10002 = var1[14]++;
               }
         }

         this.method_195(var1);
      }
   }

   // $FF: renamed from: bK () void
   private void method_367() {
      int[] var1;
      if (!GameCanvas.method_184(var1 = super.field_199)) {
         var1[15] = super.field_32 & 1;
         var1[3] = var1[17] - Math.abs(GameCanvas.method_6(var1[6] % 180)) * 268 / 100;
         this.method_195(var1);
      }
   }

   // $FF: renamed from: bL () void
   private void method_368() {
      if (super.field_32 % 60 < 30) {
         if (super.field_203 && super.field_205 == super.field_199[20]) {
            super.field_203 = false;
         }

      } else {
         int var3 = GameCanvas.method_141(super.field_199[2], super.field_199[3], super.field_199[2], super.field_199[3], 8, 32);
         if (super.field_199[5] == 1) {
            var3 = -1;
         }

         if (var3 >= 0 && var3 == 1) {
            GameCanvas.field_116[0] = super.field_199[2] - 8 - 12 << 8;
         }

         if (super.field_203 && super.field_205 == super.field_199[20] && var3 != 0) {
            super.field_203 = false;
         }

      }
   }

   // $FF: renamed from: bM () void
   private void method_369() {
      this.method_368();
   }

   // $FF: renamed from: bN () void
   private void method_370() {
      short var1 = 2;
      int var2 = super.field_199[4] / 16;
      if (super.field_199[4] % 16 == 2) {
         var1 = 153;
      }

      byte var3 = 0;
      if (super.field_199[5] > 4) {
         var3 = 2;
      } else if (super.field_199[5] > 0) {
         var3 = 1;
      }

      int var4 = GameCanvas.field_35[0];
      switch (var2) {
         case 1:
            var4 = super.field_199[19] == 0 ? GameCanvas.field_35[1] : GameCanvas.field_35[7];
            break;
         case 2:
            var4 = GameCanvas.field_35[6];
      }

      byte var5 = 0;
      byte var6 = 0;
      if (var3 == 2) {
         switch (var2) {
            case 0:
               var6 = -8;
               break;
            case 1:
               if (super.field_199[19] == 0) {
                  var5 = 8;
               } else {
                  var5 = -8;
               }
               break;
            case 2:
               var6 = 8;
         }
      }

      GameCanvas.method_130(super.field_199[2] + var5, super.field_199[3] + var6, var1, var3, var4);
   }

   // $FF: renamed from: bO () void
   private void method_371() {
      if (super.zoneID == 0) {
         if (GameCanvas.gameImages[5] != null) {
            int var1 = GameCanvas.gameImages[5].getHeight();
            int var2 = GameCanvas.gameImages[5].getWidth() / 3 * 2;
            int var3 = GameCanvas.field_35[0];
            if (super.field_199[19] == 0) {
               var3 = GameCanvas.field_35[4];
            }

            GameCanvas.method_126(5, 0, 0, var2, var1, var3, super.field_199[2], super.field_199[3]);
         }
      }
   }

   // $FF: renamed from: bP () void
   private void method_372() {
      int var1 = super.field_199[19] == 0 ? -1 : 1;
      this.method_375(40);
      if (super.field_199[18] == 1) {
         GameCanvas.method_126(40, 0, 184, 16, 16, super.field_199[19] == 0 ? 0 : GameCanvas.field_35[4], super.field_199[2] + var1 * 18, super.field_199[3] + 28);
      } else {
         if (super.field_199[18] == 2) {
            GameCanvas.method_126(40, 16, 184, 16, 16, super.field_199[19] == 0 ? 0 : GameCanvas.field_35[4], super.field_199[2] + var1 * 18, super.field_199[3] + 28);
         }

      }
   }

   // $FF: renamed from: bQ () void
   private void method_373() {
      GameCanvas.method_126(61, 0, 12 * ((super.field_32 >> 1) % 6), 24, 12, GameCanvas.field_35[0], super.field_199[2], super.field_199[3]);
   }

   // $FF: renamed from: bR () void
   private void method_374() {
      if (super.field_199[18] >= 1) {
         int var1 = super.field_199[18] == 3 ? super.field_199[5] >> 2 : 8 - (super.field_199[5] - 30 >> 2);

         for(int var2 = 0; var2 < 3; ++var2) {
            int var3 = 15 - var2 * 3;
            GameCanvas.method_130(super.field_199[var3] >> 8, (super.field_199[var3 + 1] >> 8) - (var2 == 1 ? var1 : 0), 49, 2, super.field_199[var3 + 2] == 1 ? GameCanvas.field_35[4] : GameCanvas.field_35[0]);
         }

         GameCanvas.method_130(super.field_199[6] >> 8, (super.field_199[7] >> 8) - var1, 49, super.field_199[18] > 3 ? 1 : 0, super.field_199[8] == 1 ? GameCanvas.field_35[4] : GameCanvas.field_35[0]);
      }
   }

   // $FF: renamed from: e (int) void
   private void method_375(int var1) {
      if (super.field_199[15] >= 0) {
         int var2 = GameCanvas.field_35[0];
         switch (super.field_199[19]) {
            case 1:
               var2 = GameCanvas.field_35[4];
               break;
            case 2:
               var2 = GameCanvas.field_35[6];
               break;
            case 3:
               var2 = GameCanvas.field_35[2];
         }

         GameCanvas.method_130(super.field_199[2], super.field_199[3], var1, super.field_199[15], var2);
      }
   }

   // $FF: renamed from: bS () void
   private void method_376() {
      if (super.field_32 % 60 < 30) {
         GameCanvas.method_126(92, 0, 0, 32, 16, GameCanvas.field_35[0], super.field_199[2] + 8, super.field_199[3] - 32);
         GameCanvas.method_126(92, 0, 0, 32, 16, GameCanvas.field_35[6], super.field_199[2] + 8, super.field_199[3] + 32);
      } else {
         GameCanvas.method_126(92, 0, 0, 32, 16, GameCanvas.field_35[1], super.field_199[2], super.field_199[3] - 16);
         GameCanvas.method_126(92, 0, 0, 32, 16, GameCanvas.field_35[5], super.field_199[2], super.field_199[3] + 16);
      }
   }

   // $FF: renamed from: bT () void
   private void method_377() {
      this.method_376();
   }

   static {
      short[][] var10000 = new short[][]{{0, 0, 16, 24, -4}, {0, 24, 16, 24, -4}, {0, 48, 16, 16, 0}};
   }
}
