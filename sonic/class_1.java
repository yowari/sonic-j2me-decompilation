import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: c
public class class_1 extends Canvas implements Runnable, PlayerListener {
   // $FF: renamed from: d java.lang.String[]
   private static String[] field_9 = new String[]{"SON", "SON", "SON", "SON", "SON"};
   // $FF: renamed from: C int[]
   private static int[] field_10 = new int[]{10000, 8000, 6000, 4000, 2000};
   // $FF: renamed from: D int[]
   private static int[] field_11 = new int[]{0, 1, 2, 1, 0};
   // $FF: renamed from: g boolean[]
   private boolean[] field_12 = new boolean[10];
   // $FF: renamed from: c javax.microedition.lcdui.Image[]
   private static Image[] field_13 = new Image[5];
   // $FF: renamed from: a javax.microedition.lcdui.Font
   public static final Font field_14 = Font.getFont(0, 0, 16);
   // $FF: renamed from: a int
   public static final int field_15;
   // $FF: renamed from: b int
   public static int field_16;
   // $FF: renamed from: c int
   public static int field_17;
   // $FF: renamed from: d int
   public static int field_18;
   // $FF: renamed from: e int
   public static int field_19;
   // $FF: renamed from: f int
   public static int field_20;
   // $FF: renamed from: g int
   public static int field_21;
   // $FF: renamed from: h int
   public static int field_22;
   // $FF: renamed from: i int
   public static int field_23;
   // $FF: renamed from: aG int
   private static int field_24;
   // $FF: renamed from: aH int
   private static int field_25;
   // $FF: renamed from: a javax.microedition.lcdui.Graphics
   public static Graphics field_26;
   // $FF: renamed from: a javax.microedition.lcdui.Image
   public static Image field_27;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   public static Image[] field_28;
   // $FF: renamed from: b javax.microedition.lcdui.Image[]
   public static Image[] field_29;
   // $FF: renamed from: a boolean[]
   public boolean[] field_30 = new boolean[10];
   // $FF: renamed from: a java.lang.String[]
   public String[] field_31 = new String[2];
   // $FF: renamed from: j int
   public int field_32 = 1;
   // $FF: renamed from: k int
   public int field_33 = 1;
   // $FF: renamed from: a java.util.Random
   private static final Random field_34;
   // $FF: renamed from: a int[]
   public static final int[] field_35;
   // $FF: renamed from: a d
   public class_3 field_36;
   // $FF: renamed from: e java.lang.String[]
   private static final String[] field_37;
   // $FF: renamed from: a boolean
   public boolean field_38 = false;
   // $FF: renamed from: a byte[][]
   private byte[][] field_39 = new byte[][]{{31, 32, 33}, {35, 34}, {39, 40, 41, 42, 43}};
   // $FF: renamed from: l int
   public int field_40;
   // $FF: renamed from: aI int
   private int field_41;
   // $FF: renamed from: aJ int
   private int field_42;
   // $FF: renamed from: E int[]
   private final int[] field_43;
   // $FF: renamed from: aK int
   private int field_44;
   // $FF: renamed from: aL int
   private int field_45;
   // $FF: renamed from: aM int
   private int field_46;
   // $FF: renamed from: aN int
   private int field_47;
   // $FF: renamed from: aO int
   private int field_48;
   // $FF: renamed from: aP int
   private int field_49;
   // $FF: renamed from: aQ int
   private int field_50;
   // $FF: renamed from: aR int
   private int field_51;
   // $FF: renamed from: aS int
   private int field_52;
   // $FF: renamed from: aT int
   private int field_53;
   // $FF: renamed from: aU int
   private int field_54;
   // $FF: renamed from: aV int
   private int field_55;
   // $FF: renamed from: aW int
   private int field_56;
   // $FF: renamed from: aX int
   private int field_57;
   // $FF: renamed from: aY int
   private int field_58;
   // $FF: renamed from: aZ int
   private int field_59;
   // $FF: renamed from: b short[][]
   private static final short[][] field_60;
   // $FF: renamed from: c short[][]
   private static final short[][] field_61;
   // $FF: renamed from: ba int
   private int field_62;
   // $FF: renamed from: b java.lang.String[]
   public String[] field_63;
   // $FF: renamed from: f java.lang.String[]
   private String[] field_64;
   // $FF: renamed from: a java.lang.String
   private String field_65;
   // $FF: renamed from: c byte
   private byte field_66;
   // $FF: renamed from: d byte
   private byte field_67;
   // $FF: renamed from: a byte
   public byte field_68;
   // $FF: renamed from: e byte
   private byte field_69;
   // $FF: renamed from: L boolean
   private boolean field_70;
   // $FF: renamed from: M boolean
   private boolean field_71;
   // $FF: renamed from: a java.util.Vector
   private Vector field_72;
   // $FF: renamed from: f byte
   private byte field_73;
   // $FF: renamed from: N boolean
   private boolean field_74;
   // $FF: renamed from: b javax.microedition.lcdui.Font
   public static Font field_75;
   // $FF: renamed from: b boolean
   public boolean field_76;
   // $FF: renamed from: bb int
   private int field_77;
   // $FF: renamed from: h int[][]
   private int[][] field_78;
   // $FF: renamed from: m int
   public int field_79;
   // $FF: renamed from: bc int
   private int field_80;
   // $FF: renamed from: a int[][]
   public static final int[][] field_81;
   // $FF: renamed from: bd int
   private int field_82;
   // $FF: renamed from: be int
   private int field_83;
   // $FF: renamed from: bf int
   private int field_84;
   // $FF: renamed from: bg int
   private int field_85;
   // $FF: renamed from: O boolean
   private boolean field_86;
   // $FF: renamed from: P boolean
   private boolean field_87;
   // $FF: renamed from: n int
   public int field_88;
   // $FF: renamed from: o int
   public int field_89;
   // $FF: renamed from: bh int
   private int field_90;
   // $FF: renamed from: bi int
   private int field_91;
   // $FF: renamed from: bj int
   private int field_92;
   // $FF: renamed from: bk int
   private int field_93;
   // $FF: renamed from: F int[]
   private int[] field_94;
   // $FF: renamed from: b int[]
   public static int[] field_95;
   // $FF: renamed from: bl int
   private int field_96;
   // $FF: renamed from: bm int
   private int field_97;
   // $FF: renamed from: bn int
   private int field_98;
   // $FF: renamed from: bo int
   private int field_99;
   // $FF: renamed from: p int
   public static int field_100;
   // $FF: renamed from: q int
   public int field_101;
   // $FF: renamed from: r int
   public int field_102;
   // $FF: renamed from: s int
   public int field_103;
   // $FF: renamed from: t int
   public int field_104;
   // $FF: renamed from: u int
   public int field_105;
   // $FF: renamed from: v int
   public int field_106;
   // $FF: renamed from: w int
   public int field_107;
   // $FF: renamed from: x int
   public int field_108;
   // $FF: renamed from: y int
   public int field_109;
   // $FF: renamed from: z int
   public int field_110;
   // $FF: renamed from: A int
   public int field_111;
   // $FF: renamed from: B int
   public int field_112;
   // $FF: renamed from: C int
   public int field_113;
   // $FF: renamed from: D int
   public int field_114;
   // $FF: renamed from: E int
   public int field_115;
   // $FF: renamed from: c int[]
   public static int[] field_116;
   // $FF: renamed from: c boolean
   public static boolean field_117;
   // $FF: renamed from: d boolean
   public static boolean field_118;
   // $FF: renamed from: Q boolean
   private static boolean field_119;
   // $FF: renamed from: e boolean
   public static boolean field_120;
   // $FF: renamed from: f boolean
   public static boolean field_121;
   // $FF: renamed from: g boolean
   public static boolean field_122;
   // $FF: renamed from: h boolean
   public static boolean field_123;
   // $FF: renamed from: i boolean
   public static boolean field_124;
   // $FF: renamed from: j boolean
   public static boolean field_125;
   // $FF: renamed from: k boolean
   public static boolean field_126;
   // $FF: renamed from: R boolean
   private static boolean field_127;
   // $FF: renamed from: l boolean
   public static boolean field_128;
   // $FF: renamed from: m boolean
   public static boolean field_129;
   // $FF: renamed from: n boolean
   public static boolean field_130;
   // $FF: renamed from: o boolean
   public static boolean field_131;
   // $FF: renamed from: S boolean
   private static boolean field_132;
   // $FF: renamed from: h boolean[]
   private boolean[] field_133;
   // $FF: renamed from: b int[][]
   public static final int[][] field_134;
   // $FF: renamed from: F int
   public int field_135;
   // $FF: renamed from: G int
   public int field_136;
   // $FF: renamed from: c int[][]
   public int[][] field_137;
   // $FF: renamed from: H int
   public int field_138;
   // $FF: renamed from: i int[][]
   private int[][] field_139;
   // $FF: renamed from: a byte[]
   public static final byte[] field_140;
   // $FF: renamed from: d int[]
   public static final int[] field_141;
   // $FF: renamed from: I int
   public int field_142;
   // $FF: renamed from: a short[][]
   public short[][] field_143;
   // $FF: renamed from: J int
   public int field_144;
   // $FF: renamed from: e int[]
   public static final int[] field_145;
   // $FF: renamed from: f int[]
   public int[] field_146;
   // $FF: renamed from: g int[]
   public static final int[] field_147;
   // $FF: renamed from: h int[]
   public static final int[] field_148;
   // $FF: renamed from: i int[]
   public static final int[] field_149;
   // $FF: renamed from: j int[]
   public static final int[] field_150;
   // $FF: renamed from: k int[]
   public static final int[] field_151;
   // $FF: renamed from: b boolean[]
   public boolean[] field_152;
   // $FF: renamed from: l int[]
   public static final int[] field_153;
   // $FF: renamed from: m int[]
   public static final int[] field_154;
   // $FF: renamed from: p boolean
   public boolean field_155;
   // $FF: renamed from: n int[]
   public static final int[] field_156;
   // $FF: renamed from: o int[]
   public static final int[] field_157;
   // $FF: renamed from: p int[]
   public static final int[] field_158;
   // $FF: renamed from: q int[]
   public static final int[] field_159;
   // $FF: renamed from: r int[]
   public static final int[] field_160;
   // $FF: renamed from: s int[]
   public static final int[] field_161;
   // $FF: renamed from: t int[]
   public static final int[] field_162;
   // $FF: renamed from: u int[]
   public static final int[] field_163;
   // $FF: renamed from: v int[]
   public static final int[] field_164;
   // $FF: renamed from: d int[][]
   public static final int[][] field_165;
   // $FF: renamed from: K int
   public int field_166;
   // $FF: renamed from: L int
   public int field_167;
   // $FF: renamed from: M int
   public int field_168;
   // $FF: renamed from: N int
   public int field_169;
   // $FF: renamed from: O int
   public int field_170;
   // $FF: renamed from: P int
   public int field_171;
   // $FF: renamed from: Q int
   public int field_172;
   // $FF: renamed from: R int
   public int field_173;
   // $FF: renamed from: S int
   public int field_174;
   // $FF: renamed from: T int
   public int field_175;
   // $FF: renamed from: U int
   public int field_176;
   // $FF: renamed from: V int
   public int field_177;
   // $FF: renamed from: W int
   public int field_178;
   // $FF: renamed from: X int
   public int field_179;
   // $FF: renamed from: Y int
   public int field_180;
   // $FF: renamed from: Z int
   public int field_181;
   // $FF: renamed from: aa int
   public int field_182;
   // $FF: renamed from: ab int
   public int field_183;
   // $FF: renamed from: ac int
   public int field_184;
   // $FF: renamed from: ad int
   public int field_185;
   // $FF: renamed from: ae int
   public int field_186;
   // $FF: renamed from: c byte[]
   private byte[] field_187;
   // $FF: renamed from: d byte[]
   private byte[] field_188;
   // $FF: renamed from: e byte[]
   private byte[] field_189;
   // $FF: renamed from: f byte[]
   private byte[] field_190;
   // $FF: renamed from: g byte[]
   private byte[] field_191;
   // $FF: renamed from: d short[][]
   private static final short[][] field_192;
   // $FF: renamed from: e short[][]
   private static final short[][] field_193;
   // $FF: renamed from: j int[][]
   private int[][] field_194;
   // $FF: renamed from: e int[][]
   public int[][] field_195;
   // $FF: renamed from: af int
   public int field_196;
   // $FF: renamed from: c boolean[]
   public boolean[] field_197;
   // $FF: renamed from: d boolean[]
   public boolean[] field_198;
   // $FF: renamed from: w int[]
   public int[] field_199;
   // $FF: renamed from: k int[][]
   private int[][] field_200;
   // $FF: renamed from: q boolean
   public boolean field_201;
   // $FF: renamed from: r boolean
   public boolean field_202;
   // $FF: renamed from: s boolean
   public boolean field_203;
   // $FF: renamed from: e boolean[]
   public boolean[] field_204;
   // $FF: renamed from: ag int
   public int field_205;
   // $FF: renamed from: b byte[][]
   private static final byte[][] field_206;
   // $FF: renamed from: a int[][][]
   public static int[][][] field_207;
   // $FF: renamed from: ah int
   public int field_208;
   // $FF: renamed from: bp int
   private int field_209;
   // $FF: renamed from: bq int
   private int field_210;
   // $FF: renamed from: br int
   private int field_211;
   // $FF: renamed from: bs int
   private int field_212;
   // $FF: renamed from: f short[][]
   private static final short[][] field_213;
   // $FF: renamed from: b int[][][]
   private int[][][] field_214;
   // $FF: renamed from: x int[]
   public static final int[] field_215;
   // $FF: renamed from: f int[][]
   public static final int[][] field_216;
   // $FF: renamed from: g int[][]
   public static final int[][] field_217;
   // $FF: renamed from: bt int
   private int field_218;
   // $FF: renamed from: bu int
   private int field_219;
   // $FF: renamed from: ai int
   public int field_220;
   // $FF: renamed from: aj int
   public int field_221;
   // $FF: renamed from: ak int
   public int field_222;
   // $FF: renamed from: al int
   public int field_223;
   // $FF: renamed from: am int
   public int field_224;
   // $FF: renamed from: y int[]
   public static int[] field_225;
   // $FF: renamed from: z int[]
   public static int[] field_226;
   // $FF: renamed from: G int[]
   private int[] field_227;
   // $FF: renamed from: H int[]
   private int[] field_228;
   // $FF: renamed from: I int[]
   private int[] field_229;
   // $FF: renamed from: h byte[]
   private byte[] field_230;
   // $FF: renamed from: i byte[]
   private byte[] field_231;
   // $FF: renamed from: b byte[]
   public byte[] field_232;
   // $FF: renamed from: j byte[]
   private byte[] field_233;
   // $FF: renamed from: c byte[][]
   private byte[][] field_234;
   // $FF: renamed from: J int[]
   private int[] field_235;
   // $FF: renamed from: d byte[][]
   private byte[][] field_236;
   // $FF: renamed from: k byte[]
   private byte[] field_237;
   // $FF: renamed from: c int[][][]
   private static final int[][][] field_238;
   // $FF: renamed from: bv int
   private int field_239;
   // $FF: renamed from: t boolean
   public boolean field_240;
   // $FF: renamed from: u boolean
   public boolean field_241;
   // $FF: renamed from: g byte
   private byte field_242;
   // $FF: renamed from: h byte
   private byte field_243;
   // $FF: renamed from: i byte
   private byte field_244;
   // $FF: renamed from: bw int
   private int field_245;
   // $FF: renamed from: j byte
   private byte field_246;
   // $FF: renamed from: an int
   public int field_247;
   // $FF: renamed from: l byte[]
   private byte[] field_248;
   // $FF: renamed from: v boolean
   public boolean field_249;
   // $FF: renamed from: ao int
   public int field_250;
   // $FF: renamed from: ap int
   public int field_251;
   // $FF: renamed from: w boolean
   public boolean field_252;
   // $FF: renamed from: x boolean
   public boolean field_253;
   // $FF: renamed from: y boolean
   public boolean field_254;
   // $FF: renamed from: z boolean
   public static boolean field_255;
   // $FF: renamed from: A boolean
   public static boolean field_256;
   // $FF: renamed from: B boolean
   public static boolean field_257;
   // $FF: renamed from: bx int
   private int field_258;
   // $FF: renamed from: by int
   private int field_259;
   // $FF: renamed from: bz int
   private int field_260;
   // $FF: renamed from: bA int
   private int field_261;
   // $FF: renamed from: T boolean
   private boolean field_262;
   // $FF: renamed from: bB int
   private int field_263;
   // $FF: renamed from: bC int
   private int field_264;
   // $FF: renamed from: bD int
   private int field_265;
   // $FF: renamed from: U boolean
   private boolean field_266;
   // $FF: renamed from: C boolean
   public boolean field_267;
   // $FF: renamed from: bE int
   private int field_268;
   // $FF: renamed from: bF int
   private int field_269;
   // $FF: renamed from: bG int
   private int field_270;
   // $FF: renamed from: aq int
   public int field_271;
   // $FF: renamed from: bH int
   private int field_272;
   // $FF: renamed from: D boolean
   public boolean field_273;
   // $FF: renamed from: b byte
   public byte field_274;
   // $FF: renamed from: K int[]
   private int[] field_275;
   // $FF: renamed from: bI int
   private int field_276;
   // $FF: renamed from: E boolean
   public boolean field_277;
   // $FF: renamed from: V boolean
   private boolean field_278;
   // $FF: renamed from: W boolean
   private static boolean field_279;
   // $FF: renamed from: X boolean
   private static boolean field_280;
   // $FF: renamed from: Y boolean
   private boolean field_281;
   // $FF: renamed from: F boolean
   public boolean field_282;
   // $FF: renamed from: ar int
   public int field_283;
   // $FF: renamed from: as int
   public int field_284;
   // $FF: renamed from: at int
   public int field_285;
   // $FF: renamed from: au int
   public int field_286;
   // $FF: renamed from: bJ int
   private int field_287;
   // $FF: renamed from: bK int
   private int field_288;
   // $FF: renamed from: Z boolean
   private boolean field_289;
   // $FF: renamed from: aa boolean
   private boolean field_290;
   // $FF: renamed from: bL int
   private int field_291;
   // $FF: renamed from: bM int
   private int field_292;
   // $FF: renamed from: bN int
   private int field_293;
   // $FF: renamed from: av int
   public int field_294;
   // $FF: renamed from: bO int
   private int field_295;
   // $FF: renamed from: m byte[]
   private byte[] field_296;
   // $FF: renamed from: aw int
   public int field_297;
   // $FF: renamed from: f boolean[]
   public boolean[] field_298;
   // $FF: renamed from: G boolean
   public boolean field_299;
   // $FF: renamed from: ax int
   public int field_300;
   // $FF: renamed from: ay int
   public int field_301;
   // $FF: renamed from: H boolean
   public boolean field_302;
   // $FF: renamed from: A int[]
   public static final int[] field_303;
   // $FF: renamed from: a javax.microedition.midlet.MIDlet
   public MIDlet field_304;
   // $FF: renamed from: az int
   public int field_305;
   // $FF: renamed from: aA int
   public int field_306;
   // $FF: renamed from: aB int
   public int field_307;
   // $FF: renamed from: b long
   public long field_308;
   // $FF: renamed from: c long
   public long field_309;
   // $FF: renamed from: d long
   public long field_310;
   // $FF: renamed from: e long
   public long field_311;
   // $FF: renamed from: aC int
   public int field_312;
   // $FF: renamed from: I boolean
   public boolean field_313;
   // $FF: renamed from: B int[]
   public int[] field_314;
   // $FF: renamed from: aD int
   public int field_315;
   // $FF: renamed from: aE int
   public static int field_316;
   // $FF: renamed from: aF int
   public static int field_317;
   // $FF: renamed from: c java.lang.String[]
   public String[] field_318;
   // $FF: renamed from: a java.io.InputStream
   public static InputStream field_319;
   // $FF: renamed from: l int[][]
   private static final int[][] field_320;
   // $FF: renamed from: J boolean
   public boolean field_321;
   // $FF: renamed from: ab boolean
   private boolean field_322;
   // $FF: renamed from: bP int
   private int field_323;
   // $FF: renamed from: a char[]
   private static final char[] field_324;
   // $FF: renamed from: bQ int
   private int field_325;
   // $FF: renamed from: L int[]
   private int[] field_326;
   // $FF: renamed from: K boolean
   public boolean field_327;

   // $FF: renamed from: a (int) int
   public static int method_5(int var0) {
      int var1;
      if ((var1 = var0 % 360) >= 0 && var1 <= 90) {
         return field_303[var1] / 100;
      } else if (var1 > 90 && var1 <= 180) {
         return field_303[90 - (var1 - 90)] / 100;
      } else if (var1 > 180 && var1 <= 270) {
         return -1 * (field_303[var1 - 180] / 100);
      } else {
         return var1 > 270 && var1 <= 359 ? -1 * (field_303[90 - (var1 - 270)] / 100) : 0;
      }
   }

   // $FF: renamed from: b (int) int
   public static int method_6(int var0) {
      int var1;
      if ((var1 = var0 % 360) >= 0 && var1 < 90) {
         return -1 * field_303[89 - var1] / 100;
      } else if (var1 >= 90 && var1 < 180) {
         return field_303[var1 - 90] / 100;
      } else if (var1 >= 180 && var1 < 270) {
         return field_303[89 - (var1 - 180)] / 100;
      } else {
         return var1 >= 270 && var1 <= 359 ? -1 * (field_303[var1 - 270] / 100) : 0;
      }
   }

   // $FF: renamed from: a () void
   public final void method_7() {
      this.field_178 = 11424;
      this.field_179 = 1232;

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field_143[var1][0] = (short)(-160 + 32 * var1 + 16);
         this.field_143[var1][1] = 176;
         this.field_143[var1][2] = 0;
         this.field_143[var1][3] = 0;
      }

   }

   // $FF: renamed from: b () void
   public final void method_8() {
      for(int var1 = 0; var1 < 10; ++var1) {
         if (this.field_143[var1][3] != 0) {
            this.method_200(23, this.field_143[var1][0], this.field_143[var1][1], 330, 300, 0);
            this.method_200(23, this.field_143[var1][0], this.field_143[var1][1], 30, 300, 1);
            this.method_200(23, this.field_143[var1][0], this.field_143[var1][1], 300, 300, 2);
            this.method_200(23, this.field_143[var1][0], this.field_143[var1][1], 60, 300, 3);
            this.field_143[var1][2] = 1;
         }
      }

   }

   // $FF: renamed from: c () void
   public final void method_9() {
      if (this.field_199[14] == 0) {
         this.method_7();
         int var10002 = this.field_199[14]++;
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         if (this.field_143[var3][2] == 0) {
            int var1;
            int var2;
            if (this.field_143[var3][3] == 0) {
               var1 = this.field_178 + this.field_143[var3][0];
               var2 = this.field_179 + this.field_143[var3][1];
            } else {
               var1 = this.field_178 + (this.field_174 + this.field_176) / 100;
               var2 = this.field_179 + (this.field_175 + this.field_177) / 100 + 24;
            }

            this.method_247(var1, var2, 16, 16);
         }
      }

   }

   // $FF: renamed from: d () void
   public final void method_10() {
      int[] var1 = this.field_199;
      boolean var4 = false;
      this.method_244(var1);
      if (this.field_167 > 99) {
         if (this.method_245()) {
            var1[0] = 0;
         }

      } else {
         this.field_171 += 200;
         this.field_176 = 0;
         this.field_177 = method_5(this.field_171 / 100) * 12;
         int var3 = (method_102() - (this.field_178 - 160)) / 32;
         int var2 = (this.field_174 + 16000) / 3200;
         int var5 = Math.abs(this.field_174 / 100 + 160 - (var2 * 32 + 16));
         if (var3 == var2 && var5 < 3 && this.field_144 == 0) {
            var4 = true;
         }

         if (this.field_144 > 0) {
            --this.field_144;
         }

         if (this.field_172 > 16 && this.method_194(var1[2], var1[3] + 8 - 32 + this.field_172, 14, 32, false) != 0) {
            this.method_104();
         }

         if (this.method_248() && this.field_167 > 3 && this.field_182 == 0) {
            method_249(var1[2], var1[3]);
            if (this.field_182 == 0 && this.field_167 < 100) {
               if (--this.field_186 <= 0) {
                  this.method_8();
                  this.field_167 = 100;
                  return;
               }

               this.field_184 = 3;
               this.field_182 = this.field_185 = 60;
            }
         }

         switch (this.field_167) {
            case 7:
            case 8:
            case 9:
            default:
               this.field_167 = 1;
            case 1:
               this.field_184 = 0;
               this.field_168 = 2;
               this.field_174 = 19200;
               this.field_175 = 10000;
               this.field_170 = 0;
               this.field_171 = 0;
               this.field_180 = 50;
               this.field_144 = 90;
               var4 = false;
               ++this.field_167;
            case 2:
               if (this.field_180 > 0) {
                  break;
               }

               ++this.field_167;
            case 3:
               this.field_168 = 2;
               this.field_175 -= 20;
               this.field_174 -= 100;
               if (this.field_174 > 6400) {
                  break;
               }

               this.field_174 = 6400;
               this.field_168 = 0;
               this.field_184 = 1;
               this.field_185 = 60;
               this.field_180 = 60;
               ++this.field_167;
            case 4:
               if (var4) {
                  this.field_167 = 10;
                  break;
               } else {
                  this.field_168 = 2;
                  this.field_169 = 0;
                  this.field_174 -= 70;
                  if (this.field_174 > -12000) {
                     break;
                  }

                  this.field_174 = -12000;
                  ++this.field_167;
               }
            case 5:
               if (var4) {
                  this.field_167 = 10;
                  break;
               } else {
                  this.field_168 = 2;
                  this.field_169 = 1;
                  this.field_174 += 70;
                  if (this.field_174 < 12000) {
                     break;
                  }

                  this.field_174 = 12000;
                  ++this.field_167;
               }
            case 6:
               this.field_167 = 4;
               break;
            case 10:
               this.field_168 = 0;
               this.field_184 = 1;
               ++this.field_167;
            case 11:
               this.field_175 += 120;
               if (this.field_172 < 32) {
                  ++this.field_172;
               }

               if (this.field_175 < 15400) {
                  break;
               }

               this.field_175 = 15400;
               this.field_180 = 48;
               this.field_143[var2][3] = 1;
               ++this.field_167;
            case 12:
               this.field_176 = 0;
               this.field_177 = method_58(400) - 200;
               if (this.field_180 > 0) {
                  break;
               }

               this.field_176 = 0;
               this.field_177 = 0;
               ++this.field_167;
            case 13:
               this.field_175 -= 300;
               if (this.field_175 > 2400) {
                  break;
               }

               this.field_175 = 2400;
               this.field_180 = 50;
               ++this.field_167;
            case 14:
               this.field_176 = 0;
               this.field_177 = method_58(400) - 200;
               if (this.field_172 > 0) {
                  --this.field_172;
               }

               if (this.field_180 > 0) {
                  break;
               }

               if (this.field_143[var2][2] == 0) {
                  this.field_176 = 0;
                  this.field_177 = 0;
                  this.method_200(23, var1[2], var1[3] + 24, 330, 300, 0);
                  this.method_200(23, var1[2], var1[3] + 24, 30, 300, 1);
                  this.method_200(23, var1[2], var1[3] + 24, 300, 300, 2);
                  this.method_200(23, var1[2], var1[3] + 24, 60, 300, 3);
                  this.field_143[var2][2] = 1;
               }

               this.field_180 = 30;
               ++this.field_167;
            case 15:
               if (this.field_180 <= 0) {
                  this.field_144 = 120;
                  this.field_167 = this.field_169 == 0 ? 4 : 5;
               }
         }

         this.method_246(var1);
         if (this.field_167 == 4 || this.field_167 == 5) {
            if (Math.abs(var1[2] - method_102()) < 64) {
               if (this.field_175 > 1000) {
                  this.field_175 -= 160;
                  return;
               }
            } else if (this.field_175 < 8000) {
               this.field_175 += 140;
            }
         }

      }
   }

   public final void hideNotify() {
      this.method_22();
   }

   public final void showNotify() {
   }

   public class_1(MIDlet var1, int var2) {
      short[][] var10000 = new short[][]{{0, 0, 64, 96}, {64, 0, 64, 96}, {128, 0, 64, 96}};
      this.field_40 = 0;
      this.field_43 = new int[]{4456493, this.getWidth() - 68 - 12 << 16 | 45, 3473476, this.getWidth() - 53 - 12 << 16 | 68, 4456543, this.getWidth() - 68 - 12 << 16 | 95};
      this.field_46 = 0;
      this.field_47 = 0;
      this.field_49 = 0;
      this.field_52 = 0;
      this.field_58 = field_18 >> 1;
      this.field_59 = field_22 * 3 >> 2;
      this.field_63 = new String[88];
      this.field_64 = new String[357];
      this.field_71 = false;
      this.field_77 = 10;
      this.field_78 = new int[this.field_77][15];
      this.field_82 = 0;
      this.field_83 = 2100;
      this.field_84 = 0;
      this.field_85 = 0;
      this.field_88 = 1536;
      this.field_89 = 12;
      this.field_90 = 128;
      this.field_91 = 56;
      this.field_92 = 1664;
      this.field_93 = 896;
      this.field_94 = new int[2];
      this.field_133 = new boolean[4];
      this.field_135 = 0;
      this.field_136 = 0;
      this.field_137 = new int[30][25];
      this.field_143 = new short[10][4];
      this.field_144 = 0;
      this.field_146 = new int[]{64, 32, 64};
      this.field_152 = new boolean[256];
      this.field_155 = false;
      this.field_187 = new byte[8192];
      this.field_195 = new int[256][25];
      this.field_199 = new int[25];
      this.field_200 = new int[30][10];
      this.field_201 = false;
      this.field_202 = false;
      this.field_204 = new boolean[256];
      this.field_208 = 0;
      this.field_209 = 0;
      this.field_210 = 0;
      this.field_211 = 0;
      this.field_212 = 0;
      this.field_221 = -1;
      this.field_222 = 0;
      this.field_223 = 0;
      this.field_224 = 0;
      this.field_227 = new int[2];
      this.field_228 = new int[2];
      this.field_229 = new int[2];
      this.field_233 = new byte[8192];
      this.field_234 = new byte[4][];
      this.field_237 = new byte[512];
      this.field_239 = 0;
      this.field_240 = false;
      this.field_241 = false;
      this.field_243 = 9;
      this.field_247 = 0;
      this.field_248 = new byte[4];
      this.field_254 = false;
      this.field_258 = 0;
      this.field_259 = 0;
      this.field_260 = 0;
      this.field_261 = 0;
      this.field_262 = false;
      this.field_266 = false;
      this.field_267 = false;
      this.field_268 = 0;
      this.field_269 = 0;
      this.field_272 = 10;
      this.field_275 = new int[4];
      this.field_276 = 0;
      this.field_277 = false;
      this.field_284 = 0;
      this.field_285 = 0;
      this.field_286 = 0;
      this.field_287 = 0;
      this.field_288 = 0;
      this.field_289 = false;
      this.field_290 = false;
      this.field_294 = 0;
      this.field_296 = new byte[4];
      this.field_297 = 0;
      this.field_298 = new boolean[]{false, false, false, false, false};
      this.field_299 = false;
      this.field_300 = 0;
      this.field_301 = 0;
      this.field_302 = false;
      this.field_305 = 0;
      this.field_306 = 0;
      this.field_307 = 0;
      this.field_312 = Integer.MIN_VALUE;
      this.field_314 = new int[6];
      this.field_315 = 0;
      int[] var3 = new int[]{0, 12, 24, 12};
      this.field_318 = new String[]{"", ""};
      this.field_321 = false;
      this.field_322 = false;
      this.field_325 = 0;
      this.field_326 = new int[3];
      this.field_327 = false;
      this.field_304 = var1;
      this.field_305 = var2;
      this.setFullScreenMode(true);
      this.sizeChanged(this.getWidth(), this.getHeight());
   }

   public final void keyPressed(int var1) {
      if (!this.field_299 && this.field_220 == 1) {
         if (var1 == "230691".charAt(this.field_300)) {
            ++this.field_300;
         } else {
            this.field_300 = 0;
         }

         if (this.field_300 == 6) {
            this.field_299 = true;
         }
      }

      if (!field_129 || this.field_220 != 2) {
         switch (this.method_263(var1)) {
            case 1:
               this.field_30[3] = true;
               this.field_30[2] = true;
               return;
            case 2:
            case 14:
               this.field_30[2] = true;
               return;
            case 3:
               this.field_30[4] = true;
               this.field_30[2] = true;
               return;
            case 4:
            case 16:
               this.field_30[3] = true;
               return;
            case 5:
            case 18:
               this.field_30[0] = true;
               return;
            case 6:
            case 17:
               this.field_30[4] = true;
               return;
            case 7:
               this.field_30[3] = true;
               this.field_30[1] = true;
               break;
            case 8:
            case 15:
               this.field_30[1] = true;
               return;
            case 9:
               this.field_30[4] = true;
               this.field_30[1] = true;
               return;
            case 10:
               this.field_30[9] = true;
               if (this.field_299 && this.field_298[4]) {
                  this.field_302 = !this.field_302;
                  return;
               }
            case 11:
            default:
               break;
            case 12:
               this.field_30[5] = true;
               return;
            case 13:
               this.field_30[6] = true;
               return;
         }

      }
   }

   public final void keyReleased(int var1) {
      switch (this.method_263(var1)) {
         case 1:
            this.field_30[3] = false;
            this.field_30[2] = false;
            return;
         case 2:
         case 14:
            this.field_30[2] = false;
            return;
         case 3:
            this.field_30[4] = false;
            this.field_30[2] = false;
            return;
         case 4:
         case 16:
            this.field_30[3] = false;
            return;
         case 5:
         case 18:
            this.field_30[0] = false;
            return;
         case 6:
         case 17:
            this.field_30[4] = false;
            return;
         case 7:
            this.field_30[3] = false;
            this.field_30[1] = false;
         case 11:
         default:
            return;
         case 8:
         case 15:
            this.field_30[1] = false;
            return;
         case 9:
            this.field_30[4] = false;
            this.field_30[1] = false;
            return;
         case 10:
            this.field_30[9] = false;
            return;
         case 12:
            this.field_30[5] = false;
            return;
         case 13:
            this.field_30[6] = false;
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2 == "endOfMedia") {
         switch (this.field_36.field_332) {
            case 7:
               this.field_36.method_382();
         }
      }

   }

   // $FF: renamed from: e () void
   public final void method_11() {
      for(int var1 = 0; var1 < this.field_30.length; ++var1) {
         this.field_30[var1] = false;
      }

   }

   // $FF: renamed from: f () void
   public final void method_12() throws Exception {
      this.method_15();
      this.method_162();
      this.method_17();
      this.method_19();
      this.field_201 = true;
      this.method_161(true);
      this.field_220 = 1;
      this.field_249 = true;
      this.field_250 = 10;
      this.field_36 = new class_3(this);
      this.field_36.field_330 = field_37;
      this.field_36.method_379(this.field_296[1]);
      this.field_196 = 0;
   }

   public void paint(Graphics var1) {
   }

   public void run() {
   }

   // $FF: renamed from: g () void
   public final void method_13() {
      this.field_312 = Integer.MIN_VALUE;
      this.field_306 = (int)((System.currentTimeMillis() - this.field_308) / 16L);
   }

   // $FF: renamed from: h () void
   public final void method_14() {
      method_181(this.field_296, "config");
   }

   // $FF: renamed from: aa () void
   private void method_15() {
      this.field_296 = method_182("config");
      if (this.field_296 == null) {
         this.field_71 = true;
         this.field_296 = new byte[4];
         this.field_296[0] = 1;
         this.field_296[1] = 1;
         this.field_296[2] = 0;
         this.method_14();
      }

   }

   // $FF: renamed from: ab () void
   private void method_16() {
      byte[] var1;
      (var1 = new byte[10])[0] = this.field_242;
      var1[1] = this.field_243;
      var1[2] = this.field_244;

      for(int var2 = 0; var2 < 4; ++var2) {
         var1[3 + var2] = (byte)(this.field_245 >> (var2 << 3 & 255));
      }

      var1[7] = (byte)this.field_40;
      method_181(var1, "savedGame");
   }

   // $FF: renamed from: ac () void
   private void method_17() {
      try {
         byte[] var1 = method_182("savedGame");
         this.field_242 = var1[0];
         this.field_243 = var1[1];
         this.field_244 = var1[2];
         int var2 = 0;

         for(int var3 = 0; var3 < 4; ++var3) {
            var2 |= (var1[3 + var3] & 255) << (var3 << 3);
         }

         this.field_245 = var2;
         this.field_301 = this.field_40 = var1[7];
      } catch (Exception var4) {
         this.method_16();
      }
   }

   // $FF: renamed from: ad () void
   private void method_18() {
      byte[] var1 = new byte[55];

      for(int var2 = 0; var2 < 5; ++var2) {
         var1[0 + var2 * 11] = (byte)field_11[var2];

         int var3;
         for(var3 = 0; var3 < 3; ++var3) {
            for(int var4 = 0; var4 < 2; ++var4) {
               var1[1 + var3 * 2 + var4 + var2 * 11] = (byte)(field_9[var2].charAt(var3) >> var4 * 8 % 256);
            }
         }

         for(var3 = 0; var3 < 4; ++var3) {
            var1[7 + var3 + var2 * 11] = (byte)(field_10[var2] >> var3 * 8 % 256);
         }
      }

      method_181(var1, "highscore");
   }

   // $FF: renamed from: ae () void
   private void method_19() {
      try {
         byte[] var1 = method_182("highscore");

         for(int var2 = 0; var2 < 5; ++var2) {
            field_11[var2] = var1[0 + var2 * 11];
            char[] var3 = new char[3];

            int var4;
            int var5;
            for(var4 = 0; var4 < 3; ++var4) {
               var5 = 0;

               for(int var6 = 0; var6 < 2; ++var6) {
                  var5 = (char)(var5 | var1[1 + var4 * 2 + var6 + var2 * 11] << var6 * 8);
               }

               var3[var4] = (char)var5;
            }

            field_9[var2] = new String(var3);
            var4 = 0;

            for(var5 = 0; var5 < 4; ++var5) {
               var4 |= (var1[7 + var5 + var2 * 11] & 255) << var5 * 8;
            }

            field_10[var2] = var4;
         }

      } catch (Exception var7) {
         this.method_18();
      }
   }

   // $FF: renamed from: af () void
   private void method_20() {
      if (this.field_220 == 1) {
         if (this.field_66 == 3 || this.field_66 == 4) {
            if (this.field_296[1] != 0) {
               this.field_31[0] = this.field_63[69];
            } else {
               this.field_31[0] = this.field_63[68];
            }

            if (this.field_66 == 4) {
               this.field_31[1] = this.field_63[59];
               return;
            }

            this.field_31[1] = this.field_63[57];
            return;
         }

         if (this.field_66 == 14) {
            this.field_31[1] = this.field_63[59];
            this.field_31[0] = "";
            return;
         }
      } else {
         if (this.field_220 != 6 && this.field_220 != 4 && this.field_220 != 2 && this.field_220 != 3 && this.field_220 != 9) {
            if (this.field_296[1] != 0) {
               this.field_31[0] = this.field_63[69];
            } else {
               this.field_31[0] = this.field_63[68];
            }
         } else {
            this.field_31[0] = "";
         }

         if (this.field_220 == 2) {
            if ((this.field_111 > 0 || !field_125) && !this.field_155) {
               this.field_31[1] = this.field_63[60];
               return;
            }

            this.field_31[1] = "";
            return;
         }

         if (this.field_220 == 10) {
            this.field_31[1] = this.field_63[61];
            return;
         }

         if (this.field_220 == 6) {
            this.field_31[1] = this.field_63[66];
            return;
         }

         if (this.field_220 == 3) {
            this.field_31[1] = this.field_63[59];
            return;
         }

         if (this.field_220 == 4) {
            this.field_31[1] = "";
            return;
         }

         if (this.field_220 == 9) {
            this.field_31[1] = "OK";
         }
      }

   }

   // $FF: renamed from: a () boolean
   public final boolean method_21() {
      try {
         if (this.field_76 && this.field_31[1].equals(this.field_63[60])) {
            this.method_22();
            return true;
         }

         this.field_76 = false;
         byte var1 = -1;
         if (this.field_30[5]) {
            this.field_30[5] = false;
            var1 = 0;
         } else if (this.field_30[6]) {
            if (this.field_220 == 1) {
               return false;
            }

            this.field_30[6] = false;
            var1 = 1;
         }

         if (var1 != -1) {
            if (this.field_31[var1].equals(this.field_63[59])) {
               if (this.field_220 == 3) {
                  this.field_220 = 1;
                  this.field_249 = true;
                  this.field_250 = 10;
                  this.method_161(false);
                  this.field_66 = 4;
                  this.field_69 = 1;
                  this.method_156(11 + this.field_69);
                  this.method_164(2);
               } else {
                  this.field_220 = 1;
                  this.field_249 = true;
                  this.field_250 = 10;
                  this.method_161(false);
               }

               return true;
            }

            if (this.field_31[var1].equals(this.field_63[60])) {
               this.field_220 = 10;
               this.field_249 = true;
               this.field_250 = 10;
               this.field_247 = 0;
               this.field_36.method_381();
               return true;
            }

            if (this.field_31[var1].equals(this.field_63[61])) {
               this.method_14();
               this.field_220 = 2;
               this.field_201 = true;
               this.field_249 = true;
               this.field_250 = 10;
               this.field_254 = true;
               field_257 = true;
               this.method_178();
               return true;
            }

            if (this.field_31[var1].equals(this.field_63[66])) {
               this.field_220 = 1;
               this.field_249 = true;
               this.field_250 = 10;
               this.method_161(false);
               return true;
            }

            if (this.field_31[var1].equals(this.field_63[68])) {
               this.field_296[1] = this.field_248[1];
               if (this.field_296[1] == 0) {
                  this.field_296[1] = 1;
               }

               this.method_14();
               this.field_36.method_379(1);
               this.field_249 = true;
               this.field_250 = 10;
               return true;
            }

            if (this.field_31[var1].equals(this.field_63[69])) {
               this.field_248[1] = this.field_296[1];
               this.field_296[1] = 0;
               this.method_14();
               this.field_36.method_379(0);
               this.field_249 = true;
               this.field_250 = 10;
               return true;
            }

            if (this.field_31[var1].equals(this.field_63[57])) {
               this.field_66 = 14;
               this.field_69 = 1;
               this.method_164(3);
               return true;
            }

            if (this.field_31[var1].equals("OK")) {
               this.method_261();
            }
         }
      } catch (Exception var2) {
         this.field_76 = false;
      }

      return false;
   }

   // $FF: renamed from: i () void
   public final void method_22() {
      if (this.field_220 == 2) {
         this.field_220 = 10;
         this.field_249 = true;
         this.field_250 = 10;
         this.field_247 = 0;
         this.field_76 = false;
         this.field_36.method_381();
      } else {
         this.field_201 = true;
      }
   }

   // $FF: renamed from: a (boolean) void
   public final void method_23(boolean var1) {
      for(int var2 = 0; var2 < 6; ++var2) {
         if (var1 && this.field_223 < field_216.length) {
            ++this.field_223;
            if (this.field_223 == 6 && this.field_224 == 3 || this.field_223 > 6) {
               this.field_223 = 0;
               this.field_224 = 0;
            }
         } else if (this.field_223 >= 0) {
            --this.field_223;
            if (this.field_223 < 0) {
               this.field_223 = 6;
               this.field_224 = 2;
            }
         }

         if (method_24(field_216[this.field_223][0])) {
            return;
         }
      }

   }

   // $FF: renamed from: a (int) boolean
   private static boolean method_24(int var0) {
      if (var0 == 0) {
         return true;
      } else if (var0 == 2) {
         return true;
      } else {
         return var0 == 4;
      }
   }

   // $FF: renamed from: j () void
   public final void method_25() {
      if (this.field_249) {
         this.method_20();
         if (this.field_250 > 0) {
            --this.field_250;
            return;
         }

         this.field_250 = 0;
         this.field_249 = false;
      }

   }

   public final void sizeChanged(int var1, int var2) {
      field_17 = var1;
      field_16 = var2;
      field_18 = field_17;
      field_21 = field_17;
      field_22 = field_21 * 3 >> 2;
      field_21 = Math.min(field_21, 360);
      field_22 = Math.min(field_22, 252);
      field_316 = field_21 / 12 + 2;
      field_317 = field_22 / 12 + 2;
      this.field_291 = -field_21 * 2 * 4 / 3;
      this.field_292 = field_21 * 2 * 4 / 3;
      this.field_293 = field_22 * 4 * 4 / 3;
      field_23 = field_16 - field_22 >> 1;
      field_19 = field_22 + 72;
      field_20 = field_16 - field_19 >> 1;
      field_25 = field_23 + (field_22 >> 1);
      field_24 = field_21 >> 1;
      this.field_59 = field_22 * 3 >> 2;
      this.field_58 = field_18 >> 1;
      this.field_214 = new int[field_316][field_317][3];
   }

   // $FF: renamed from: k () void
   public final void method_26() {
      this.method_27(false);
   }

   // $FF: renamed from: b (boolean) void
   public final void method_27(boolean var1) {
      int var3 = field_26.getFont().getHeight();
      if (this.field_31[0] != null && (this.field_31[0] != this.field_318[0] || this.field_220 != 2 || var1)) {
         this.method_36(this.field_31[0], field_18 >> 2, field_16 - var3, 17, true);
         this.field_318[0] = this.field_31[0];
      }

      if (this.field_31[1] != null && (this.field_31[1] != this.field_318[1] || this.field_220 != 2 || var1)) {
         this.method_36(this.field_31[1], field_18 * 3 >> 2, field_16 - var3, 17, true);
         this.field_318[1] = this.field_31[1];
      }

   }

   // $FF: renamed from: l () void
   public final void method_28() {
      int var1 = 112 - ((field_18 >> 1) - 48 - 6);
      int var2 = (field_18 >> 1) + 6 + 112;
      if (this.field_111 <= 0 && field_125 || field_280 && this.field_108 == 59 && this.field_109 == 9) {
         int var3 = (660 - this.field_110) * 6;
         if (120 - var3 < 8) {
            var3 = 112;
         }

         if (this.field_108 == 59 && this.field_109 == 9) {
            method_132(field_26, field_28[15], 0, 0, 48, 12, field_35[0], var3 - var1, field_22 >> 1, 20, true);
            method_132(field_26, field_28[15], 0, 12, 48, 12, field_35[0], var2 - var3, field_22 >> 1, 20, true);
            return;
         }

         method_132(field_26, field_28[14], 0, 0, 48, 12, field_35[0], var3 - var1, field_22 >> 1, 20, true);
         method_132(field_26, field_28[14], 0, 12, 48, 12, field_35[0], var2 - var3, field_22 >> 1, 20, true);
      }

   }

   // $FF: renamed from: ag () void
   private void method_29() {
      this.field_188 = new byte[this.field_230.length >> 1];
      this.field_189 = new byte[this.field_230.length >> 1];
      this.field_190 = new byte[this.field_230.length >> 1];
      this.field_191 = new byte[this.field_230.length >> 1];

      for(int var1 = 0; var1 < this.field_230.length >> 1; ++var1) {
         int var2 = this.field_230[var1 << 1] & 255;
         this.field_190[var1] = 0;
         this.field_191[var1] = 0;
         byte var3;
         Math.abs((var3 = (byte)(var2 << 6)) >> 6);
         if (var2 >> 5 <= 1) {
            this.field_191[var1] = 1;
         }

         if ((var2 >> 5) % 2 == 0) {
            this.field_190[var1] = 1;
         }

         this.field_189[var1] = (byte)(var2 >> 3 & 3);
         this.field_188[var1] = 0;
         if ((var2 & 1) == 1) {
            this.field_188[var1] = 1;
         } else if ((var2 & 3) == 2) {
            this.field_188[var1] = 2;
         }
      }

   }

   // $FF: renamed from: m () void
   public final void method_30() {
      int[][] var1 = new int[][]{{0, 0, 48, 48}, {49, 0, 35, 48}, {84, 0, 18, 48}, {102, 0, 36, 48}};
      if (this.field_106 >= 50 && this.field_199[5] == 0) {
         int var2 = field_35[0];
         int var3;
         if ((var3 = this.field_32 >> 1 & 3) == 3) {
            var2 = field_35[4];
            var3 = 1;
         }

         method_126(47, var1[var3][0], var1[var3][1], var1[var3][2], var1[var3][3], var2, this.field_199[2], this.field_199[3]);
      }

   }

   // $FF: renamed from: n () void
   public final void method_31() {
      if (this.field_106 >= 50) {
         this.field_199[6] = this.field_199[2];
         this.field_199[7] = this.field_199[3];
         if (this.field_199[5] == 0) {
            if (method_137(method_102(), method_103() - 12, field_95[0], field_95[1] - 12, 12, 12, this.field_199[2], this.field_199[3], this.field_199[6], this.field_199[7], 32, 32) >= 0) {
               this.field_199[5] = 1;
               this.field_199[0] = -1;
               this.field_199[11] = this.field_32;
               ++this.field_40;
               this.field_327 = true;
               return;
            }
         } else {
            this.field_199[10] = this.field_32 - this.field_199[11];
            if (this.field_199[10] > 5) {
               this.field_199[10] = 5;
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int) void
   public final void method_32(int var1, int var2, int var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var9 = false;
      boolean var10 = false;

      for(int var13 = var1; var13 < var1 + var3; ++var13) {
         if (this.field_218 << 4 > (field_226[0] >> 4) + var13) {
            for(int var14 = var2; var14 < var2 + var4; ++var14) {
               int var7 = (field_226[0] >> 4) + var13 >> 4;
               int var8 = ((field_226[1] >> 4) + var14 >> 4) % this.field_219;

               try {
                  int var16 = (this.field_236[var8][var7] << 9) + (((field_226[0] >> 4) + var13 & 15) + (((field_226[1] >> 4) + var14 & 15) << 4) << 1) + 1;
                  int var15;
                  if ((var15 = (this.field_230[var16] & 255) + (this.field_188[var16 >> 1] << 8)) != 0) {
                     if (this.field_221 == 2) {
                        if (var15 == 367 || var15 == 366) {
                           var15 = (var15 + this.field_32 / 5 & 1) + 366;
                        }

                        if (var15 == 365 || var15 == 364) {
                           var15 = (var15 + this.field_32 / 5 & 1) + 364;
                        }

                        if (var15 == 363 || var15 == 362) {
                           var15 = (var15 + this.field_32 / 5 & 1) + 362;
                        }
                     }

                     byte var11 = 0;
                     if (this.field_189[var16 >> 1] != 0) {
                        if (this.field_189[var16 >> 1] == 1) {
                           var11 = 4;
                        } else if (this.field_189[var16 >> 1] == 2) {
                           var11 = 6;
                        } else if (this.field_189[var16 >> 1] == 3) {
                           var11 = 2;
                        }
                     }

                     method_132(field_26, field_27, var15 % 16 * 12, var15 / 16 * 12, 12, 12, field_35[var11], var13 * 12 - (field_226[0] & 15), var14 * 12 - (field_226[1] & 15), 20, true);
                  }
               } catch (Exception var12) {
               }
            }
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, boolean) void
   public final void method_33(Graphics var1, boolean var2) {
      int var3 = method_124(field_226[0] & 15);
      int var4 = method_124(field_226[1] & 15);

      for(int var5 = 0; var5 < field_316; ++var5) {
         if (this.field_218 << 4 > (field_226[0] >> 4) + var5) {
            for(int var6 = 0; var6 < field_317; ++var6) {
               int var7 = this.field_214[var5][var6][1];
               int var8 = this.field_214[var5][var6][0];
               if (this.field_214[var5][var6][2] == 1 && var8 != 0 && !var2) {
                  try {
                     var1.drawRegion(field_27, (var8 & 15) * 12, (var8 >> 4) * 12, 12, 12, field_35[var7], var5 * 12 - var3, var6 * 12 - var4 + field_23, 20);
                  } catch (Throwable var10) {
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, boolean) void
   public final void method_34(Graphics var1, boolean var2) {
      boolean var5 = false;
      int var6 = 0;
      int var7 = field_226[0] >> 4;
      int var8 = field_226[1] >> 4;
      int var9 = var7;
      int var10 = method_124(field_226[0] & 15);
      int var11 = method_124(field_226[1] & 15);

      for(int var12 = 0; var12 < field_316; ++var12) {
         int var14 = var12 * 12 - var10;
         int var15 = var8;

         for(int var13 = 0; var13 < field_317; ++var13) {
            int var16 = var13 * 12 - var11;
            int var3 = var9 >> 4;
            int var4 = var15 >> 4;

            int var22;
            try {
               var6 = (this.field_236[var4][var3] << 9) + ((var9 & 15) + ((var15 & 15) << 4) << 1) + 1;
               var22 = (this.field_230[var6] & 255) + (this.field_188[var6 >> 1] << 8);
            } catch (Throwable var20) {
               var22 = 0;
            }

            ++var15;
            byte var17 = 0;
            byte var18;
            if ((var18 = this.field_189[var6 >> 1]) != 0) {
               if (var18 == 1) {
                  var17 = 4;
               } else if (var18 == 2) {
                  var17 = 6;
               } else if (var18 == 3) {
                  var17 = 2;
               }
            }

            this.field_214[var12][var13][0] = var22;
            if (var22 != 0) {
               this.field_214[var12][var13][1] = var17;
               this.field_214[var12][var13][2] = 0;
               if (this.field_231[var22] != 0) {
                  this.field_214[var12][var13][2] = 1;
               } else if (!var2) {
                  try {
                     var1.drawRegion(field_27, (var22 & 15) * 12, (var22 >> 4) * 12, 12, 12, field_35[var17], var14, var16 + field_23, 20);
                  } catch (Throwable var21) {
                  }
               }
            }
         }

         ++var9;
      }

   }

   // $FF: renamed from: a (int, boolean) void
   public final void method_35(int var1, boolean var2) {
      if (99950000 > this.field_107 && this.field_107 % '\uc350' > (this.field_107 + var1) % '\uc350') {
         ++this.field_111;
         if (var2) {
            this.field_36.method_386(7, 1);
         }
      }

      this.field_107 += var1;
      if (this.field_107 > 99999999) {
         this.field_107 = 99999999;
      }

   }

   // $FF: renamed from: a (java.lang.String, int, int, int, boolean) void
   private void method_36(String var1, int var2, int var3, int var4, boolean var5) {
      int var6 = field_26.getFont().getHeight();
      if (var1.length() != 0) {
         int var7 = field_26.getFont().stringWidth(var1) + 5;
         if ((var4 & 1) == 1) {
            method_151(var2 - var7 / 2, var3, var7, var6);
         } else {
            method_151(var2, var3, var7, var6);
         }

         if (var5) {
            method_153(var1, var2 + 1, var3, 16777215, 255, var4);
         }

      }
   }

   // $FF: renamed from: o () void
   public final void method_37() {
      this.method_38(false);
   }

   // $FF: renamed from: c (boolean) void
   public final void method_38(boolean var1) {
      if (!var1) {
         if (this.field_258 == this.field_106 && this.field_259 == this.field_107) {
            if (this.field_106 == 0 && (this.field_32 & 1) == 0) {
               field_255 = true;
            }
         } else {
            field_255 = true;
         }

         if (this.field_108 == 0 || this.field_260 != this.field_109 * 100 + this.field_108) {
            field_256 = true;
         }

         if (this.field_261 != this.field_111) {
            field_257 = true;
         }
      } else {
         field_255 = true;
         field_257 = true;
         field_256 = true;
      }

      if (this.field_111 > 99) {
         this.field_111 = 99;
      }

      this.field_261 = this.field_111;
      this.field_258 = this.field_106;
      this.field_259 = this.field_107;
      if (field_255) {
         boolean var12 = false;
         method_151(0, 0, 100, field_23);
         method_132(field_26, field_28[1], 0, 0, field_28[1].getWidth(), field_28[1].getHeight(), field_35[0], 4, -10, 36, true);
         if (this.field_106 != 0 || (this.field_32 >> 1 & 1) == 0) {
            method_39(24, -30, this.field_106, 3);
         }

         method_39(24, -18, this.field_107, 8);
         field_255 = false;
      }

      this.field_260 = this.field_109 * 100 + this.field_108;
      if (field_256) {
         method_151(field_18 - 48, 0, 48, field_23);
         method_132(field_26, field_28[11], 0, 0, field_28[11].getWidth(), field_28[11].getHeight(), field_35[0], field_18 - 48, -8, 36, true);
         method_39(field_18 + -44, -18, this.field_109, 1);
         method_39(field_18 + -30, -18, this.field_108, 2);
         field_256 = false;
      }

      if (field_257) {
         method_151(0, field_23 + field_22, 50, field_23);
         int var13 = 7 + field_28[2].getHeight() - field_28[12].getHeight();
         method_132(field_26, field_28[2], 0, 0, 17, 15, field_35[0], 5, 7 + field_22, 20, true);
         if (this.field_111 > 9) {
            method_39(31, field_22 + var13, this.field_111, 2);
         } else {
            method_39(31, field_22 + var13, this.field_111, 1);
         }

         field_257 = false;
      }

   }

   // $FF: renamed from: d (int, int, int, int) void
   private static void method_39(int var0, int var1, int var2, int var3) {
      int var4 = var0 + var3 * 5 - 5;
      int var5 = var2 % 10;
      method_132(field_26, field_28[12], 5 * var5, 0, 5, 10, field_35[0], var4, var1, 20, true);

      for(int var6 = 1; var6 < var3; ++var6) {
         int var7 = 1;

         for(int var8 = 0; var8 < var6; ++var8) {
            var7 *= 10;
         }

         var5 = var2 / var7 % 10;
         method_132(field_26, field_28[12], 5 * var5, 0, 5, 10, field_35[0], var4 - var6 * 5, var1, 20, true);
      }

   }

   // $FF: renamed from: e () boolean
   private static boolean method_40() {
      return false;
   }

   // $FF: renamed from: p () void
   public final void method_41() {
      this.field_78 = new int[this.field_77][15];
      this.field_36.method_380(13, 1);
      this.field_31[0] = "";
      this.field_31[1] = "";
      this.field_80 = 0;
      this.field_263 = 30;
      this.field_262 = true;
      this.field_78[0][0] = 1;
      this.field_78[0][1] = 10;
      this.field_78[0][2] = 240;
      this.field_78[0][3] = 28;
      this.field_78[0][8] = 1 - field_81[this.field_78[0][1]][2];
      this.field_78[0][9] = 0;
      this.field_78[1][0] = 1;
      this.field_78[1][1] = 4 + this.field_224;
      this.field_78[1][2] = 240;
      this.field_78[1][3] = 42;
      this.field_78[1][8] = 25 - field_81[this.field_78[0][1]][2];
      this.field_78[1][9] = 3;
      this.field_78[2][0] = 1;
      this.field_78[2][1] = 8;
      this.field_78[2][2] = 240;
      this.field_78[2][3] = 51;
      this.field_78[2][8] = -1 - field_81[this.field_78[0][1]][2];
      this.field_78[2][9] = 2;
      this.field_78[3][0] = 1;
      this.field_78[3][1] = 14;
      this.field_78[3][2] = 0 - field_81[this.field_78[3][1]][2];
      this.field_78[3][3] = 30;
      this.field_78[3][8] = -field_81[this.field_78[3][1]][2];
      this.field_78[3][9] = 0;
      this.field_79 = field_18 + field_81[this.field_78[3][1]][2] >> 1;
      this.field_78[4][0] = 1;
      this.field_78[4][1] = 15;
      this.field_78[4][2] = 0 - field_81[this.field_78[4][1]][2];
      this.field_78[4][3] = 40;
      this.field_78[4][8] = -field_81[this.field_78[3][1]][2] / 2 - field_81[this.field_78[4][1]][2] / 2;
      this.field_78[4][9] = 1;

      for(int var2 = 0; var2 < this.field_78.length; ++var2) {
         if (this.field_78[var2][0] == 1) {
            this.field_78[var2][4] = field_81[this.field_78[var2][1]][0];
            this.field_78[var2][5] = field_81[this.field_78[var2][1]][1];
            this.field_78[var2][6] = field_81[this.field_78[var2][1]][2];
            this.field_78[var2][7] = field_81[this.field_78[var2][1]][3];
         }
      }

   }

   // $FF: renamed from: q () void
   public final void method_42() {
      try {
         this.field_220 = 4;
         this.field_240 = false;
         this.field_241 = false;
         this.field_155 = false;
         this.field_289 = true;
         this.field_290 = true;
         this.field_239 = 0;
         this.field_83 = 2100;
         this.field_327 = false;
         this.field_78 = new int[this.field_77][15];
         this.field_33 = 0;
         this.field_32 = 0;
         this.field_101 = 0;
         this.field_102 = 0;
         this.field_288 = 0;
         this.field_287 = 0;
         this.field_249 = true;
         this.field_250 = 10;
         this.field_274 = 0;
         this.field_267 = false;
         if (this.field_321) {
            this.method_179();
         }

         boolean var1 = false;
         this.field_80 = 0;
         this.field_78[0][0] = 1;
         this.field_78[0][1] = 10;
         this.field_78[0][2] = 240;
         this.field_78[0][3] = 38;
         this.field_78[0][8] = 1 - field_81[this.field_78[0][1]][2];
         this.field_78[0][9] = 0;
         this.field_78[1][0] = 1;
         this.field_78[1][1] = 4 + this.field_224;
         this.field_78[1][2] = 240;
         this.field_78[1][3] = 56;
         this.field_78[1][8] = 25 - field_81[this.field_78[0][1]][2];
         this.field_78[1][9] = 3;
         this.field_78[2][0] = 1;
         this.field_78[2][1] = 8;
         this.field_78[2][2] = 240;
         this.field_78[2][3] = 64;
         this.field_78[2][8] = -1 - field_81[this.field_78[0][1]][2];
         this.field_78[2][9] = 2;
         this.field_78[3][0] = 1;
         this.field_78[3][1] = field_215[this.field_223];
         this.field_78[3][2] = 0 - field_81[this.field_78[3][1]][2];
         this.field_78[3][3] = 40;
         this.field_78[3][8] = -field_81[this.field_78[3][1]][2];
         this.field_78[3][9] = 0;
         this.field_79 = (field_18 >> 1) + field_81[this.field_78[3][1]][2] / 2;
         if (this.field_223 == 6) {
            this.field_78[4][0] = 1;
            this.field_78[4][1] = 3;
            this.field_78[4][2] = 0 - field_81[this.field_78[4][1]][2];
            this.field_78[4][3] = 52;
            this.field_78[4][8] = -48;
            this.field_78[4][9] = 1;
         } else {
            this.field_78[4][0] = 1;
            this.field_78[4][1] = 3;
            this.field_78[4][2] = 0 - field_81[this.field_78[4][1]][2];
            this.field_78[4][3] = 52;
            this.field_78[4][8] = -65;
            this.field_78[4][9] = 1;
         }

         for(int var2 = 0; var2 < this.field_78.length; ++var2) {
            if (this.field_78[var2][0] == 1) {
               this.field_78[var2][4] = field_81[this.field_78[var2][1]][0];
               this.field_78[var2][5] = field_81[this.field_78[var2][1]][1];
               this.field_78[var2][6] = field_81[this.field_78[var2][1]][2];
               this.field_78[var2][7] = field_81[this.field_78[var2][1]][3];
            }
         }

         this.method_178();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      this.method_13();
   }

   // $FF: renamed from: i (int, int, int) void
   private static void method_43(int var0, int var1, int var2) {
      int var3 = var2 % 10;
      int var4 = 1;

      while(true) {
         int var5 = 1;

         int var6;
         for(var6 = 0; var6 < var4; ++var6) {
            var5 *= 10;
         }

         if (var2 / var5 == 0) {
            var5 = var4;
            method_132(field_26, field_28[13], 6 * var3, 37, 6, 10, field_35[0], var0 - 6, var1, 20, true);

            for(var4 = 1; var4 < var5; ++var4) {
               var6 = 1;

               for(int var7 = 0; var7 < var4; ++var7) {
                  var6 *= 10;
               }

               var3 = var2 / var6 % 10;
               method_132(field_26, field_28[13], 6 * var3, 37, 6, 10, field_35[0], var0 - var4 * 6 - 6, var1, 20, true);
            }

            return;
         }

         ++var4;
      }
   }

   // $FF: renamed from: ah () void
   private void method_44() {
      this.method_47();
      this.method_114();
   }

   // $FF: renamed from: ai () void
   private void method_45() {
      this.field_106 = 0;
      this.field_108 = 0;
      this.field_109 = 0;
      this.field_110 = 0;
      this.field_104 = 0;
      this.field_103 = 0;
      this.field_101 = 0;
      this.field_102 = 0;
      this.field_85 = 0;
      this.field_84 = 0;

      for(int var1 = 0; var1 < this.field_200.length; ++var1) {
         this.field_200[var1][0] = 0;
      }

      field_117 = false;
      field_118 = false;
      field_132 = false;
      field_119 = false;
      field_120 = false;
      field_121 = false;
      field_122 = false;
      field_124 = false;
      field_125 = false;
      field_279 = false;
      field_280 = false;
      field_126 = false;
      field_127 = false;
      field_128 = false;
      field_129 = false;
      field_131 = false;
      field_130 = false;
      this.field_297 = 0;

      int var2;
      for(var2 = 0; var2 < 256; ++var2) {
         this.field_204[var2] = false;
         this.field_152[var2] = false;
      }

      this.field_196 = 0;
      this.field_135 = 0;

      for(var2 = 0; var2 < this.field_195.length; ++var2) {
         this.field_195[var2][24] = 0;
      }

   }

   // $FF: renamed from: aj () void
   private void method_46() {
      this.method_11();
      this.method_45();
      if (this.field_221 == 4 && this.field_222 == 2) {
         this.method_197(150, 11424, 1394, 0, 0);
      }

      for(int var1 = 0; var1 < field_116.length; ++var1) {
         field_116[var1] = 0;
      }

      field_100 = 0;
      this.field_94[0] = 0;
      this.field_94[1] = 0;
      field_225[0] = 0;
      field_225[1] = 0;
      if (this.field_221 != 5 || this.field_222 != 3) {
         field_116[0] = field_134[this.field_221][this.field_222 * 2 + 0] << 8;
         field_116[1] = (field_134[this.field_221][this.field_222 * 2 + 1] << 8) + 5120;
      }

      if (this.field_112 != 0 || this.field_113 != 0) {
         field_116[0] = this.field_112 << 8;
         field_116[1] = this.field_113 << 8;
         this.field_108 = this.field_114;
         this.field_109 = this.field_115;
      }

      this.method_92();
      this.method_165();
      field_116[8] = -1;
      this.field_220 = 2;
      this.field_201 = true;
      this.method_116();
      this.field_249 = true;
      this.field_250 = 10;
   }

   // $FF: renamed from: ak () void
   private void method_47() {
      method_133(field_29);
      field_27 = null;
      this.field_240 = false;
      this.field_289 = true;
      this.field_290 = true;
      if (this.field_221 != 1) {
         this.field_208 = 16777215;
      }

      field_225[0] = 0;
      field_225[1] = 0;
      this.method_55();
      this.method_29();
      this.method_198();
      method_56(this.field_221, this.field_222);
      this.method_179();
      class_0.method_0(this.field_221, this.field_222);
      this.method_13();
   }

   // $FF: renamed from: a (java.lang.String) java.io.DataInputStream
   public static DataInputStream method_48(String var0) {
      return new DataInputStream(method_49(var0));
   }

   // $FF: renamed from: a (java.lang.String) java.io.InputStream
   public static InputStream method_49(String var0) {
      return field_319 = (new Object()).getClass().getResourceAsStream(var0);
   }

   // $FF: renamed from: a (java.lang.String) byte[]
   public static byte[] method_50(String var0) {
      try {
         byte[] var1 = new byte[512];
         boolean var2 = false;
         InputStream var3 = method_49(var0);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();

         int var6;
         while((var6 = var3.read(var1)) != -1) {
            var4.write(var1, 0, var6);
         }

         var4.close();
         var3.close();
         return var4.toByteArray();
      } catch (Exception var5) {
         return null;
      }
   }

   // $FF: renamed from: r () void
   public static void method_51() {
      try {
         field_319.close();
      } catch (Exception var1) {
      }
   }

   // $FF: renamed from: a (java.io.DataInputStream) int[][][]
   public static int[][][] method_52(DataInputStream var0) {
      int[][][] var1 = new int[0][][];

      try {
         int var2;
         var1 = new int[var2 = var0.readInt()][][];

         for(int var3 = 0; var3 < var2; ++var3) {
            var1[var3] = method_53(var0);
         }
      } catch (Exception var4) {
      }

      return var1;
   }

   // $FF: renamed from: a (java.io.DataInputStream) int[][]
   public static int[][] method_53(DataInputStream var0) {
      int[][] var1 = new int[0][];

      try {
         int var2;
         var1 = new int[var2 = var0.readInt()][];

         for(int var3 = 0; var3 < var2; ++var3) {
            var1[var3] = method_54(var0);
         }
      } catch (Exception var4) {
      }

      return var1;
   }

   // $FF: renamed from: a (java.io.DataInputStream) int[]
   public static int[] method_54(DataInputStream var0) {
      int[] var1 = new int[0];

      try {
         int var2;
         var1 = new int[var2 = var0.readInt()];

         for(int var3 = 0; var3 < var2; ++var3) {
            var1[var3] = var0.readInt();
         }
      } catch (Exception var4) {
      }

      return var1;
   }

   // $FF: renamed from: al () void
   private void method_55() {
      try {
         this.field_232 = null;
         this.field_231 = null;
         this.field_230 = null;
         this.field_234 = (byte[][])null;
         this.field_237 = null;
         this.field_187 = null;
         this.field_233 = null;
         System.gc();
         int[][][] var3 = (int[][][])null;
         switch (this.field_221) {
            case 0:
               var3 = method_52(method_48("/mc_gh_map_data.bin"));
            case 1:
            case 3:
            default:
               break;
            case 2:
               var3 = method_52(method_48("/mc_ma_map_data.bin"));
               break;
            case 4:
               var3 = method_52(method_48("/mc_sy_map_data.bin"));
         }

         method_51();
         this.field_218 = var3[this.field_222][0].length;
         this.field_219 = var3[this.field_222].length;
         this.field_236 = new byte[this.field_219][this.field_218];

         for(int var4 = 0; var4 < this.field_219; ++var4) {
            for(int var5 = 0; var5 < this.field_218; ++var5) {
               this.field_236[var4][var5] = (byte)var3[this.field_222][var4][var5];
            }
         }

         System.gc();
         this.field_232 = method_50("/zone" + (this.field_221 + 1) + ".blt");
         this.field_231 = method_50("/MapLzone" + (this.field_221 + 1) + ".blt");
         this.field_230 = method_50("/zone" + (this.field_221 + 1) + ".bmd");
         DataInputStream var1 = method_48("/ZONE" + (this.field_221 + 1) + "ACT.act");
         this.field_234 = new byte[4][];
         this.field_234[0] = new byte[var1.readShort()];
         this.field_234[1] = new byte[var1.readShort()];
         this.field_234[2] = new byte[var1.readShort()];
         this.field_234[3] = new byte[var1.readShort()];
         var1.read(this.field_234[0]);
         var1.read(this.field_234[1]);
         var1.read(this.field_234[2]);
         var1.read(this.field_234[3]);
         var1.close();
         method_51();
         if (this.field_194 == null) {
            this.field_194 = method_53(method_48("/mc_obj_size_table.bin"));
            method_51();
         }

         if (field_207 == null) {
            field_207 = method_52(method_48("/framedata.bin"));
            method_51();
         }

         this.field_237 = new byte[512];
         method_49("/scddirtbl.blt").read(this.field_237);
         method_51();
         this.field_187 = new byte[8192];
         method_48("/scdtblwk.scd").read(this.field_187);
         method_51();
         this.field_233 = new byte[8192];
         method_48("/blkcol.bct").read(this.field_233);
         method_51();
         System.gc();
      } catch (Exception var6) {
      }
   }

   // $FF: renamed from: a (int, int) void
   public static void method_56(int var0, int var1) {
      field_27 = null;
      if (var0 == 1 && var1 == 3) {
         field_27 = method_134("/z_zone_marble.png");
      } else {
         field_27 = method_134("/zone" + (var0 + 1) + ".png");
      }
   }

   // $FF: renamed from: s () void
   public final void method_57() {
      if (this.field_220 != 2 || this.field_262 || this.field_80 >= 30) {
         int[] var10000;
         if (this.field_299 && this.field_298[4] && this.field_302) {
            if (this.field_30[2]) {
               var10000 = field_116;
               var10000[1] -= 2048;
               return;
            }

            if (this.field_30[1]) {
               var10000 = field_116;
               var10000[1] += 2048;
               return;
            }

            if (this.field_30[3]) {
               var10000 = field_116;
               var10000[0] -= 2048;
               return;
            }

            if (this.field_30[4]) {
               var10000 = field_116;
               var10000[0] += 2048;
               return;
            }
         } else {
            if (field_128 || field_129) {
               var10000 = field_116;
               var10000[11] += this.field_88;
               return;
            }

            if (field_125) {
               var10000 = field_116;
               var10000[1] += field_116[5];
               var10000 = field_116;
               var10000[5] += this.field_91;
               return;
            }

            if (this.field_327) {
               return;
            }

            if (this.method_76()) {
               if (this.method_83()) {
                  this.method_84();
                  return;
               }
            } else if (this.method_81()) {
               this.method_82();
            }
         }

      }
   }

   // $FF: renamed from: c (int) int
   public static int method_58(int var0) {
      return Math.abs(field_34.nextInt()) % var0;
   }

   // $FF: renamed from: d (int, int) boolean
   private boolean method_59(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      ++this.field_270;
      int var3 = (this.field_236[(var2 >> 4 >> 4) % this.field_219][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
      if (this.field_190[var3 >> 1] == 1) {
         return false;
      } else {
         int var4 = (this.field_232[(this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8)] & 255) << 5;
         if (this.field_189[var3 >> 1] == 1) {
            if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
               return false;
            }
         } else if (this.field_189[var3 >> 1] == 2) {
            if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
               return false;
            }
         } else if (this.field_189[var3 >> 1] == 3) {
            if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
               return false;
            }
         } else if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
            return false;
         }

         var4 = (this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8);
         field_116[8] = var4;
         return true;
      }
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean method_60(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      int var3 = (this.field_236[(var2 >> 4 >> 4) % this.field_219][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
      if (this.field_191[var3 >> 1] == 1) {
         return false;
      } else {
         int var4 = (this.field_232[(this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8)] & 255) << 5;
         if (this.field_189[var3 >> 1] == 1) {
            if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
               return false;
            }
         } else if (this.field_189[var3 >> 1] == 2) {
            if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
               return false;
            }
         } else if (this.field_189[var3 >> 1] == 3) {
            if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
               return false;
            }
         } else if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
            return false;
         }

         var4 = (this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8);
         field_116[8] = var4;
         return true;
      }
   }

   // $FF: renamed from: e (int, int) boolean
   private boolean method_61(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      int var3 = (this.field_236[(var2 >> 4 >> 4) % this.field_219][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
      return this.field_190[var3 >> 1] != 1;
   }

   // $FF: renamed from: b (int, int) boolean
   public final boolean method_62(int var1, int var2) {
      try {
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         int var3 = (this.field_236[(var2 >> 4 >> 4) % this.field_219][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
         if (this.field_190[var3 >> 1] == 1 && this.field_191[var3 >> 1] == 1) {
            return false;
         } else {
            int var4 = (this.field_232[(this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8)] & 255) << 5;
            if (this.field_189[var3 >> 1] == 1) {
               if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
                  return false;
               }
            } else if (this.field_189[var3 >> 1] == 2) {
               if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                  return false;
               }
            } else if (this.field_189[var3 >> 1] == 3) {
               if (0 == (this.field_233[var4 + (15 - (var1 & 15) << 1) + (15 - (var2 & 15) >> 3)] >> (var2 & 7) & 1)) {
                  return false;
               }
            } else if (0 == (this.field_233[var4 + ((var1 & 15) << 1) + ((var2 & 15) >> 3)] >> 7 - (var2 & 7) & 1)) {
               return false;
            }

            var4 = (this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8);
            this.field_271 = var4;
            return true;
         }
      } catch (Exception var5) {
         return true;
      }
   }

   // $FF: renamed from: f (int) int
   private int method_63(int var1) {
      return this.field_237[this.field_232[var1] & 255] & 255;
   }

   // $FF: renamed from: f () boolean
   private boolean method_64() {
      if (!this.method_60(method_102() + 12, method_103() - 12)) {
         return false;
      } else {
         for(int var1 = 0; var1 < 14; ++var1) {
            int[] var10000 = field_116;
            var10000[0] -= 256;
            if (!this.method_60(method_102() + 12, method_103() - 12)) {
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: g () boolean
   private boolean method_65() {
      if (!this.method_60(method_102() - 12, method_103() - 12)) {
         return false;
      } else {
         for(int var1 = 0; var1 < 14; ++var1) {
            int[] var10000 = field_116;
            var10000[0] += 256;
            if (!this.method_60(method_102() - 12, method_103() - 12)) {
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: h () boolean
   private boolean method_66() {
      if (!this.method_60(method_102() + 12, method_103() - 24)) {
         return false;
      } else {
         for(int var1 = 0; var1 < 14; ++var1) {
            int[] var10000 = field_116;
            var10000[0] -= 256;
            if (!this.method_60(method_102() + 12, method_103() - 24)) {
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: i () boolean
   private boolean method_67() {
      if (!this.method_60(method_102() - 12, method_103() - 24)) {
         return false;
      } else {
         for(int var1 = 0; var1 < 14; ++var1) {
            int[] var10000 = field_116;
            var10000[0] += 256;
            if (!this.method_60(method_102() - 12, method_103() - 24)) {
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: j () boolean
   private boolean method_68() {
      int var1;
      int var2;
      if (field_100 > 22 && field_100 < 338) {
         if (this.field_221 != 1 || field_100 != 316) {
            return false;
         }

         var1 = method_102() + 12;
         var2 = method_103() - 36;
      } else {
         var1 = method_102() + 12;
         var2 = method_103() - 12;
      }

      if ((this.field_221 == 4 || this.field_221 == 3) && field_100 != 0) {
         return false;
      } else if (!this.method_60(var1, var2)) {
         return false;
      } else {
         for(int var3 = 0; var3 < 14; ++var3) {
            int[] var10000 = field_116;
            var10000[0] -= 256;
            --var1;
            if (!this.method_59(var1, var2)) {
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: k () boolean
   private boolean method_69() {
      if (field_100 > 22 && field_100 < 338) {
         return false;
      } else if ((this.field_221 == 4 || this.field_221 == 3) && field_100 != 0) {
         return false;
      } else if (this.field_221 == 2 && field_100 == 22) {
         return false;
      } else {
         int var1 = method_102() - 12;
         int var2 = method_103() - 12;
         if (!this.method_60(var1, var2)) {
            return false;
         } else {
            for(int var3 = 0; var3 < 14; ++var3) {
               int[] var10000 = field_116;
               var10000[0] += 256;
               ++var1;
               if (!this.method_59(var1, var2)) {
                  break;
               }
            }

            return true;
         }
      }
   }

   // $FF: renamed from: l () boolean
   private boolean method_70() {
      int[] var10000;
      int var2;
      if (this.method_60(method_102(), method_103() - 32)) {
         for(var2 = 0; var2 < 14; ++var2) {
            var10000 = field_116;
            var10000[1] += 256;
            if (!this.method_60(method_102(), method_103() - 32)) {
               var10000 = field_116;
               var10000[1] -= 256;
               break;
            }
         }

         return true;
      } else if (!this.method_60(method_102(), method_103() - 16)) {
         return false;
      } else {
         for(var2 = 0; var2 < 14; ++var2) {
            var10000 = field_116;
            var10000[1] += 256;
            if (!this.method_60(method_102(), method_103() - 16)) {
               var10000 = field_116;
               var10000[1] -= 256;
               break;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: b (int) boolean
   private boolean method_71(int var1) {
      if (this.method_59(method_102(), method_103())) {
         int var4 = field_100;
         if (var1 != -1) {
            if (var4 < 0) {
               var4 = 0;
            }

            for(int var2 = 0; var2 < 16; ++var2) {
               int[] var10000;
               if (!field_122) {
                  var10000 = field_116;
                  var10000[0] -= (method_5(var4 + 180) << 8) / 100;
               }

               var10000 = field_116;
               var10000[1] -= method_6(var4 + 180) * 256 / 100;
               if (!this.method_59(method_102(), method_103())) {
                  if (!field_122) {
                     var10000 = field_116;
                     var10000[0] += (method_5(var4 + 180) << 8) / 100;
                  }

                  var10000 = field_116;
                  var10000[1] += (method_6(var4 + 180) << 8) / 100;
                  field_100 = this.method_108(method_102(), method_103());
                  break;
               }
            }

            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: t () void
   public final void method_72() {
      if (!field_122 && field_124) {
         field_124 = false;
      }

      this.field_82 = 2;
   }

   // $FF: renamed from: am () void
   private void method_73() {
      if (this.field_221 != 1 || this.field_208 >= method_103() - 12) {
         this.field_83 = 2100;
      }
   }

   // $FF: renamed from: m () boolean
   private static boolean method_74() {
      return 37 == field_116[8] || 38 == field_116[8] || 39 == field_116[8] || 41 == field_116[8] || 42 == field_116[8] || 47 == field_116[8] || 48 == field_116[8] || 49 == field_116[8] || 52 == field_116[8] || 59 == field_116[8] || 62 == field_116[8] || 69 == field_116[8] || 71 == field_116[8] || 72 == field_116[8] || 78 == field_116[8] || 79 == field_116[8] || 87 == field_116[8] || 88 == field_116[8] || 89 == field_116[8];
   }

   // $FF: renamed from: c (int) boolean
   private boolean method_75(int var1) {
      if (0 != var1) {
         return false;
      } else if (field_122) {
         return true;
      } else if (this.field_267) {
         return false;
      } else if (this.field_221 == 0 && (this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8] == 31 || this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8] == 32)) {
         this.field_30[2] = false;
         return false;
      } else if (this.field_30[2]) {
         if (this.field_221 == 5 && this.field_222 != 2 && method_74()) {
            return false;
         } else if (this.field_203) {
            field_122 = true;
            field_118 = false;
            field_123 = false;
            this.field_203 = false;
            field_124 = true;
            field_116[3] = method_5(0) * this.field_92 / 100 + field_116[10];
            field_116[5] = method_6(0) * this.field_92 / 100;
            return true;
         } else {
            field_122 = true;
            field_118 = false;
            field_123 = false;
            this.field_203 = false;
            field_124 = true;
            int var2 = field_100;
            int var3 = method_102() / 16 / 16;
            int var4 = method_103() / 16 / 16 % this.field_219;
            int var5 = this.field_236[var4][var3] * 512 + (method_102() / 16 % 16 + method_103() / 16 % 16 * 16) * 2 + 1;
            int var6 = 0;
            byte var8;
            if ((var8 = (byte)Math.abs((byte)((this.field_230[var5 - 1] & 255) << 6) >> 6)) % 4 != 0) {
               var6 = 256 * (var8 % 4);
            }

            int var9 = (this.field_230[var5] & 255) + var6;
            byte var10 = (byte)this.method_63(var9);
            if (field_100 == 270) {
               this.field_97 = 5;
               field_116[3] = -this.field_92;
               field_116[5] = -Math.abs(this.field_92);
            } else if (field_100 == 90) {
               this.field_97 = 5;
               field_116[3] = this.field_92;
               field_116[5] = -Math.abs(this.field_92);
            } else if (var10 != 0 && field_100 <= 290 && field_100 >= 70) {
               field_116[3] = method_5(var2) * this.field_92 / 100;
               field_116[5] = method_6(var2) * this.field_92 / 100;
            } else {
               field_116[3] = method_5(var2) * this.field_92 / 100 + field_116[10];
               field_116[5] = method_6(var2) * this.field_92 / 100;
               if (field_116[5] > 0) {
                  this.field_276 = 1;
               }

               if (Math.abs(field_116[10]) > 2560 && this.field_221 == 4 && this.field_222 == 1 && field_116[0] > 9216) {
                  int[] var10000 = field_116;
                  var10000[5] -= 768;
                  field_116[3] = method_5(var2) * this.field_92 / 100 + 2560;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: n () boolean
   private boolean method_76() {
      if (this.field_84 > -1) {
         --this.field_84;
      }

      if (this.field_85 > -1) {
         --this.field_85;
      }

      if (field_124) {
         return true;
      } else {
         if (!field_122 && !this.field_267) {
            if (this.field_30[1]) {
               if (Math.abs(field_116[10]) > this.field_90) {
                  field_124 = true;
                  return true;
               }

               if (!this.field_30[3] && !this.field_30[4]) {
                  field_126 = true;
                  this.field_84 += 2;
                  if (this.field_84 > 32) {
                     this.field_84 = 32;
                  }

                  return false;
               }
            } else if (this.field_30[0] && Math.abs(field_116[10]) <= this.field_90 && !this.field_30[3] && !this.field_30[4]) {
               field_127 = true;
               this.field_85 += 2;
               if (this.field_85 > 24) {
                  this.field_85 = 24;
               }

               return false;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: o () boolean
   private boolean method_77() {
      this.field_86 = false;
      this.field_87 = false;
      int var1 = field_100;
      short var2 = 32;
      short var3 = 256;
      if (field_100 != 22 && field_100 != 338) {
         var2 = 256;
      }

      if (field_100 >= 270 && field_100 < 300) {
         var3 = 32;
      }

      if (field_100 >= 60 && field_100 < 90) {
         var3 = 32;
      }

      byte var4 = this.field_236[method_103() >> 8][method_102() >> 8];
      if (this.field_221 == 0 && (var4 == 31 || var4 == 32)) {
         var3 = 256;
      }

      int var5 = field_100;
      if (this.method_78()) {
         this.field_203 = false;
         if (this.field_221 == 4 && (var5 == 79 && field_100 == 90 || var5 == 281 && field_100 == 270)) {
            if (field_100 == 90) {
               field_116[10] = 640;
            } else {
               field_116[10] = -640;
            }

            field_100 = var5;
            this.field_294 = 0;
            this.field_276 = 3;
            return false;
         } else {
            return true;
         }
      } else {
         for(int var6 = 0; var6 < 14; ++var6) {
            int[] var10000 = field_116;
            var10000[0] += method_5(var1 + 180) * var2 / 100;
            var10000 = field_116;
            var10000[1] += method_6(var1 + 180) * var3 / 100;
            if (this.method_78()) {
               this.field_203 = false;
               if (this.field_221 == 4 && (var5 == 79 && field_100 == 90 || var5 == 281 && field_100 == 270)) {
                  if (field_100 == 90) {
                     field_116[10] = 640;
                  } else {
                     field_116[10] = -640;
                  }

                  field_100 = var5;
                  this.field_294 = 0;
                  this.field_276 = 3;
                  return false;
               }

               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: p () boolean
   private boolean method_78() {
      if (method_103() < 0) {
         return false;
      } else {
         byte var1 = this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8];
         if (this.field_221 != 5 || this.field_222 == 2) {
            if (this.field_221 == 0) {
               if (var1 != 31 && var1 != 32) {
                  if (this.field_94[0] >= 0) {
                     this.field_86 = this.method_79();
                     if (!this.field_86) {
                        this.field_87 = this.method_80();
                     }
                  }

                  if (this.field_94[0] < 0) {
                     this.field_87 = this.method_80();
                     if (!this.field_87) {
                        this.field_86 = this.method_79();
                     }
                  }

                  if (!this.field_86 && !this.field_87) {
                     return false;
                  }

                  return true;
               }

               return this.method_71(0);
            }

            if (this.field_221 != 3) {
               if (this.field_94[0] >= 0) {
                  this.field_86 = this.method_79();
                  if (!this.field_86) {
                     this.field_87 = this.method_80();
                  }
               }

               if (this.field_94[0] < 0) {
                  this.field_87 = this.method_80();
                  if (!this.field_87) {
                     this.field_86 = this.method_79();
                  }
               }

               if (!this.field_86 && !this.field_87) {
                  return false;
               }

               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: q () boolean
   private boolean method_79() {
      try {
         int var1;
         if ((var1 = field_100) < 0) {
            var1 = 0;
         }

         int var2 = this.field_272;
         int var3 = method_102() + method_5(var1 + 90) * var2 / 100;
         int var4 = method_103() + method_6(var1 + 90) * var2 / 100;
         if (this.method_59(var3, var4)) {
            this.method_108(var3, var4);

            for(int var7 = 0; var7 < 16; ++var7) {
               int var5 = this.method_108(var3, var4);
               int[] var10000;
               if (!field_122) {
                  var10000 = field_116;
                  var10000[0] -= (method_5(var1 + 180) << 8) / 100;
               }

               var10000 = field_116;
               var10000[1] -= (method_6(var1 + 180) << 8) / 100;
               var3 = method_102() + method_5(var1 + 90) * var2 / 100;
               var4 = method_103() + method_6(var1 + 90) * var2 / 100;
               if (!this.method_59(var3, var4)) {
                  if (!field_122) {
                     var10000 = field_116;
                     var10000[0] += (method_5(var1 + 180) << 8) / 100;
                  }

                  var10000 = field_116;
                  var10000[1] += (method_6(var1 + 180) << 8) / 100;
                  if (this.field_221 == 3 && var5 == 350) {
                     var5 = 0;
                  }

                  field_100 = var5;
                  break;
               }
            }

            return true;
         }
      } catch (Exception var8) {
      }

      return false;
   }

   // $FF: renamed from: r () boolean
   private boolean method_80() {
      try {
         int var1;
         if ((var1 = field_100) < 0) {
            var1 = 0;
         }

         int var2 = this.field_272;
         int var3 = method_102() + method_5(var1 + 270) * var2 / 100;
         int var4 = method_103() + method_6(var1 + 270) * var2 / 100;
         if (this.method_59(var3, var4)) {
            this.method_108(var3, var4);

            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = this.method_108(var3, var4);
               int[] var10000;
               if (!field_122) {
                  var10000 = field_116;
                  var10000[0] -= (method_5(var1 + 180) << 8) / 100;
               }

               var10000 = field_116;
               var10000[1] -= (method_6(var1 + 180) << 8) / 100;
               var3 = method_102() + method_5(var1 + 270) * var2 / 100;
               var4 = method_103() + method_6(var1 + 270) * var2 / 100;
               if (!this.method_59(var3, var4)) {
                  if (!field_122) {
                     var10000 = field_116;
                     var10000[0] += (method_5(var1 + 180) << 8) / 100;
                  }

                  var10000 = field_116;
                  var10000[1] += (method_6(var1 + 180) << 8) / 100;
                  field_100 = var6;
                  break;
               }
            }

            return true;
         }
      } catch (Exception var8) {
      }

      return false;
   }

   // $FF: renamed from: s () boolean
   private boolean method_81() {
      this.field_94[0] = 0;
      this.field_94[1] = 0;
      if (this.method_75(0)) {
         return true;
      } else {
         int var1 = Math.abs(field_116[10]);
         this.method_91(0);
         this.method_87();
         if (var1 <= this.field_88 && Math.abs(field_116[10]) > this.field_88 && var1 <= this.field_88) {
            if (field_116[10] < 0) {
               field_116[10] = -this.field_88;
            } else {
               field_116[10] = this.field_88;
            }
         }

         int[] var10000;
         if ((field_100 <= 22 || field_100 >= 338) && (var1 > this.field_88 || !this.field_30[3] && !this.field_30[4] && field_116[10] != 0) && field_116[10] != 0) {
            if (field_116[10] < 0) {
               var10000 = field_116;
               var10000[10] += this.field_89;
               if (field_116[10] > 0) {
                  field_116[10] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
               }
            } else {
               var10000 = field_116;
               var10000[10] -= this.field_89;
               if (field_116[10] < 0) {
                  field_116[10] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
               }
            }
         }

         if (Math.abs(field_116[10]) > 4096) {
            if (field_116[10] < 0) {
               field_116[10] = -4096;
            } else {
               field_116[10] = 4096;
            }
         }

         if (this.method_76()) {
            return false;
         } else {
            this.method_100(0);
            if (this.field_221 == 0 || this.field_221 == 3) {
               this.method_122();
            }

            if (!field_128) {
               boolean var2 = false;
               byte var3 = this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8];
               if (this.field_221 == 0 && (var3 == 31 || var3 == 32)) {
                  var2 = true;
                  field_124 = true;
                  var10000 = field_116;
                  var10000[10] += 256;
                  if (field_116[10] > 4096) {
                     field_116[10] = 4096;
                  }
               }

               if (this.field_221 == 0 && (var3 == 53 || var3 == 54)) {
                  var2 = true;
               }

               if (!var2) {
                  if (this.field_203) {
                     if (this.method_60(method_102() - 12, method_103() - 24) && this.method_60(method_102() + 12, method_103() - 24)) {
                        if (this.method_64()) {
                           field_116[10] = 0;
                           field_116[13] = 0;
                           field_116[14] = 0;
                           if (this.field_30[4]) {
                              this.method_72();
                           }
                        }

                        if (this.method_65()) {
                           field_116[10] = 0;
                           field_116[13] = 0;
                           field_116[14] = 0;
                           if (this.field_30[3]) {
                              this.method_72();
                           }
                        }
                     } else {
                        if (this.method_66() || this.method_64()) {
                           field_116[10] = 0;
                           field_116[13] = 0;
                           field_116[14] = 0;
                           if (this.field_30[4]) {
                              this.method_72();
                           }
                        }

                        if (this.method_67() || this.method_65()) {
                           field_116[10] = 0;
                           field_116[13] = 0;
                           field_116[14] = 0;
                           if (this.field_30[3]) {
                              this.method_72();
                           }
                        }
                     }
                  } else {
                     if (this.method_68()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[4]) {
                           this.method_72();
                        }
                     }

                     if (this.method_69()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[3]) {
                           this.method_72();
                        }
                     }
                  }
               }

               int var4 = field_116[0];
               int var5 = field_116[1];
               boolean var6 = true;
               if (this.method_77()) {
                  this.field_133[0] = true;
                  var6 = false;
               }

               if (this.field_294 > 0) {
                  if (var6) {
                     field_116[0] = var4;
                     field_116[1] = var5;
                  }
               } else if (!this.field_203 && var6) {
                  field_116[0] = var4;
                  field_116[1] = var5;
                  if (field_100 != 22 || this.field_221 != 1 || this.field_222 != 1) {
                     field_116[3] = method_5(field_100 + 90) * field_116[10] / 100;
                     field_116[5] = method_6(field_100 + 90) * field_116[10] / 100;
                  }

                  if ((field_100 - 90) % 180 == 0) {
                     if (field_100 == 90) {
                        var10000 = field_116;
                        var10000[0] += 256;
                        if (this.field_221 == 4 && this.field_222 != 0) {
                           field_116[5] = 0;
                        }
                     } else {
                        var10000 = field_116;
                        var10000[0] -= 256;
                        if (field_116[10] > 2816) {
                           this.field_294 = 15;
                        }
                     }
                  }

                  field_116[10] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
                  field_123 = true;
                  field_122 = true;
                  field_118 = false;
                  this.field_203 = false;
                  if (this.method_70()) {
                     field_116[5] = 0;
                  }
               } else {
                  var2 = false;
                  if (this.field_221 == 0 && (var3 == 31 || var3 == 32)) {
                     var2 = true;
                  }

                  if (this.field_221 == 2 && (field_116[8] == 365 || field_116[8] == 364 || field_116[8] == 363 || field_116[8] == 362)) {
                     this.method_104();
                  }

                  if (!var2) {
                     this.method_101();
                  }
               }
            }

            return false;
         }
      }
   }

   // $FF: renamed from: an () void
   private void method_82() {
      int[] var10000;
      if (this.field_294 > 0) {
         --this.field_294;
      } else if (this.field_30[3]) {
         field_116[12] = 1;
         if (field_116[3] == 0) {
            var10000 = field_116;
            var10000[3] -= this.field_90 << 1;
         } else {
            var10000 = field_116;
            var10000[3] -= this.field_89;
            if (field_116[3] > 0) {
               var10000 = field_116;
               var10000[3] -= this.field_89;
            }
         }
      } else if (this.field_30[4]) {
         field_116[12] = 0;
         if (field_116[3] == 0) {
            var10000 = field_116;
            var10000[3] += this.field_90 << 1;
         } else {
            var10000 = field_116;
            var10000[3] += this.field_89;
            if (field_116[3] < 0) {
               var10000 = field_116;
               var10000[3] += this.field_89;
            }
         }
      }

      if (Math.abs(field_116[3]) > this.field_88) {
         if (field_116[3] < 0) {
            field_116[3] = -this.field_88;
         } else {
            field_116[3] = this.field_88;
         }
      }

      var10000 = this.field_94;
      var10000[0] += field_116[3];
      var10000 = this.field_94;
      var10000[1] += field_116[5];
      if (field_116[5] > 0 && this.field_276 <= 0) {
         if (field_100 == 270) {
            var10000 = field_116;
            var10000[0] -= 3072;
         } else if (field_100 == 90) {
            var10000 = field_116;
            var10000[0] += 3072;
         }

         field_100 = 0;
      }

      this.method_100(1);
      if (this.field_221 == 0 || this.field_221 == 3) {
         this.method_122();
      }

      if (field_122 && this.field_97 <= 0) {
         if (this.method_64()) {
            field_116[10] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
            field_116[3] = 0;
         }

         if (this.method_65()) {
            field_116[10] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
            field_116[3] = 0;
         }
      }

      this.method_86();
   }

   // $FF: renamed from: t () boolean
   private boolean method_83() {
      this.field_94[0] = 0;
      this.field_94[1] = 0;
      if (this.method_75(0)) {
         return true;
      } else {
         this.method_91(1);
         this.method_89();
         this.method_100(0);
         if (Math.abs(field_116[10]) > 4096) {
            if (field_116[10] < 0) {
               field_116[10] = -4096;
            } else {
               field_116[10] = 4096;
            }
         }

         Math.abs(field_116[10]);
         if (this.field_221 == 0 || this.field_221 == 3) {
            this.method_122();
         }

         if (!field_128) {
            boolean var1 = false;
            byte var2 = this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8];
            int[] var10000;
            if (this.field_221 == 0) {
               if (var2 == 31 || var2 == 32) {
                  var1 = true;
                  var10000 = field_116;
                  var10000[10] += 12;
                  if (field_116[10] > 4096) {
                     field_116[10] = 4096;
                  }
               }
            } else if (this.field_221 == 0) {
               if (var2 == 53 || var2 == 54) {
                  var1 = true;
               }
            } else if (this.field_221 == 3 && (var2 == 42 || var2 == 43 || var2 == 52 || var2 == 53)) {
               var1 = true;
            }

            if (!var1) {
               if (this.field_203) {
                  if (this.method_60(method_102() - 12, method_103() - 24) && this.method_60(method_102() + 12, method_103() - 24)) {
                     if (this.method_64()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[4]) {
                           this.method_72();
                        }
                     }

                     if (this.method_65()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[3]) {
                           this.method_72();
                        }
                     }
                  } else {
                     if (this.method_66() || this.method_64()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[4]) {
                           this.method_72();
                        }
                     }

                     if (this.method_67() || this.method_65()) {
                        field_116[10] = 0;
                        field_116[13] = 0;
                        field_116[14] = 0;
                        if (this.field_30[3]) {
                           this.method_72();
                        }
                     }
                  }
               } else {
                  if (this.method_68()) {
                     field_116[10] = 0;
                     field_116[13] = 0;
                     field_116[14] = 0;
                     if (this.field_30[4]) {
                        this.method_72();
                     }
                  }

                  if (this.method_69()) {
                     field_116[10] = 0;
                     field_116[13] = 0;
                     field_116[14] = 0;
                     if (this.field_30[3]) {
                        this.method_72();
                     }
                  }
               }
            }

            int var3 = field_116[0];
            int var4 = field_116[1];
            boolean var5 = true;
            if (this.method_77()) {
               this.field_133[0] = true;
               var5 = false;
            }

            if (this.field_294 > 0) {
               if (var5) {
                  field_116[0] = var3;
                  field_116[1] = var4;
               }
            } else if (!this.field_203 && var5 && !var1) {
               field_116[0] = var3;
               field_116[1] = var4;
               if (this.field_221 == 0 && Math.abs(field_116[10]) > 2560) {
                  if (field_116[10] < 0) {
                     field_116[10] = -4224;
                  } else {
                     field_116[10] = 4224;
                  }
               }

               field_116[3] = method_5(field_100 + 90) * field_116[10] / 100;
               field_116[5] = method_6(field_100 + 90) * field_116[10] / 100;
               if ((field_100 - 90) % 180 == 0) {
                  if (field_100 == 90) {
                     var10000 = field_116;
                     var10000[0] += 256;
                     if (this.field_221 == 4 && this.field_222 != 0) {
                        field_116[5] = 0;
                     }
                  } else {
                     var10000 = field_116;
                     var10000[0] -= 256;
                     if (field_116[10] > 3072 && this.field_221 == 4) {
                        this.field_294 = 15;
                     }
                  }
               }

               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               field_123 = true;
               field_122 = true;
               field_118 = false;
               this.field_203 = false;
               if (this.method_70()) {
                  field_116[5] = 0;
               }
            } else {
               var1 = false;
               if (this.field_221 == 0 && (this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8] == 31 || this.field_236[(method_103() >> 8) % this.field_219][method_102() >> 8] == 32)) {
                  var1 = true;
               }

               if (this.field_221 == 2 && (field_116[8] == 365 || field_116[8] == 364 || field_116[8] == 363 || field_116[8] == 362)) {
                  this.method_104();
               }

               if (!var1) {
                  this.method_101();
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: ao () void
   private void method_84() {
      int[] var10000;
      if (this.field_294 > 0) {
         --this.field_294;
      } else if (!this.field_267) {
         if (this.field_30[3]) {
            field_116[12] = 1;
            if (field_116[3] == 0) {
               var10000 = field_116;
               var10000[3] -= this.field_90 << 1;
            } else {
               var10000 = field_116;
               var10000[3] -= this.field_89;
               if (field_116[3] > 0) {
                  var10000 = field_116;
                  var10000[3] -= this.field_89;
               }
            }
         } else if (this.field_30[4]) {
            field_116[12] = 0;
            if (field_116[3] == 0) {
               var10000 = field_116;
               var10000[3] += this.field_90 << 1;
            } else {
               var10000 = field_116;
               var10000[3] += this.field_89;
               if (field_116[3] < 0) {
                  var10000 = field_116;
                  var10000[3] += this.field_89;
               }
            }
         }
      }

      if (Math.abs(field_116[3]) > 4096) {
         if (field_116[3] < 0) {
            field_116[3] = -4096;
         } else {
            field_116[3] = 4096;
         }
      }

      var10000 = this.field_94;
      var10000[0] += field_116[3];
      var10000 = this.field_94;
      var10000[1] += field_116[5];
      if (field_116[5] > 0 && this.field_276 <= 0) {
         if (field_100 == 270) {
            var10000 = field_116;
            var10000[0] -= 3072;
         } else if (field_100 == 90) {
            var10000 = field_116;
            var10000[0] += 3072;
         }

         field_100 = 0;
      }

      this.method_100(1);
      if (this.field_221 == 0 || this.field_221 == 3) {
         this.method_122();
      }

      --this.field_97;
      if (field_122 && this.field_97 <= 0) {
         if (this.method_64()) {
            field_116[10] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
            field_116[3] = 0;
         }

         if (this.method_65()) {
            field_116[10] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
            field_116[3] = 0;
         }
      }

      this.method_86();
   }

   // $FF: renamed from: d (int) void
   private void method_85(int var1) {
      if (var1 == 0) {
         field_124 = false;
         this.field_297 = 0;
         field_122 = false;
         field_117 = false;
         field_118 = false;
      }

      int[] var10000;
      int var2;
      if (var1 != 0) {
         if (field_117) {
            if ((var2 = this.method_108(method_102(), method_103() - 32)) < 0) {
               var2 = field_100;
            }

            if (var2 % 90 == 0) {
               field_116[5] = 0;
            } else {
               var10000 = field_116;
               var10000[3] += -(method_6(var2 + 90) * field_116[5]) / 100;
            }
         } else {
            field_116[5] = 0;
         }
      } else {
         field_116[10] = field_116[3];
         if ((var2 = this.method_108(method_102(), method_103())) < 0) {
            for(int var3 = 1; var3 < this.field_272 + 1 && (var2 = this.method_108(method_102() - var3, method_103())) < 0 && (var2 = this.method_108(method_102() + var3, method_103())) < 0; ++var3) {
            }
         }

         field_100 = var2;
         if (var2 <= 67 && var2 >= 44 || var2 >= 293 && var2 <= 316) {
            if (field_116[5] > 3072) {
               field_116[5] = 4096;
            }

            if (method_6(var2 + 90) > 0) {
               field_116[10] = field_116[5];
            } else {
               field_116[10] = -field_116[5];
            }
         } else if (var2 < 338 && var2 > 22) {
            var10000 = field_116;
            var10000[10] += method_6(var2 + 90) * field_116[5] / 100;
         }

         field_116[5] = 0;
         field_116[3] = 0;
         if (this.field_221 == 2 && (field_116[8] == 365 || field_116[8] == 364 || field_116[8] == 363 || field_116[8] == 362)) {
            this.field_273 = true;
         }

         if (field_116[10] < 0) {
            field_116[13] = 1;
         }

         if (field_116[10] > 0) {
            field_116[13] = 2;
         }

         field_116[14] = 0;
      }
   }

   // $FF: renamed from: ap () void
   private void method_86() {
      if (this.field_276 > 0) {
         --this.field_276;
      } else {
         if (-this.field_93 <= field_116[5]) {
            this.field_30[2] = false;
         } else if (!this.field_30[2] && !field_117 && !field_123) {
            field_116[5] = -this.field_93;
         }

         if (field_116[5] > 0) {
            field_117 = false;
            if (this.method_78()) {
               if (field_100 < 270 && field_100 > 90) {
                  field_100 = 0;
                  return;
               }

               this.method_85(0);
               return;
            }
         } else if (this.method_70()) {
            this.method_85(1);
         }

      }
   }

   // $FF: renamed from: aq () void
   private void method_87() {
      int[] var10000;
      if (this.field_267) {
         field_116[12] = 0;
         if (field_116[13] == 0) {
            field_116[13] = 2;
            field_116[14] = 2;
         }

         this.method_88(1);
      } else if (!field_119) {
         if (this.field_221 == 5 && this.field_222 != 2 && (37 == field_116[8] || 38 == field_116[8] || 39 == field_116[8] || 41 == field_116[8] || 42 == field_116[8] || 47 == field_116[8] || 48 == field_116[8] || 49 == field_116[8] || 52 == field_116[8] || 59 == field_116[8] || 62 == field_116[8] || 69 == field_116[8] || 71 == field_116[8] || 72 == field_116[8] || 78 == field_116[8] || 79 == field_116[8] || 87 == field_116[8] || 88 == field_116[8] || 89 == field_116[8])) {
            var10000 = field_116;
            var10000[10] += 256;
            if (1024 < field_116[10]) {
               field_116[10] = 1024;
            }

            field_116[12] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
         } else if (this.field_294 > 0) {
            --this.field_294;
         } else if (this.field_30[3]) {
            field_116[12] = 1;
            if (field_116[13] == 0) {
               field_116[13] = 1;
            }

            if (field_116[14] == 0) {
               field_116[14] = 1;
            }

            this.method_88(0);
         } else if (this.field_30[4]) {
            field_116[12] = 0;
            if (field_116[13] == 0) {
               field_116[13] = 2;
            }

            if (field_116[14] == 0) {
               field_116[14] = 2;
            }

            this.method_88(1);
         }
      }

      var10000 = this.field_94;
      var10000[0] += method_5(field_100 + 90) * field_116[10] / 100;
      var10000 = this.field_94;
      var10000[1] += method_6(field_100 + 90) * field_116[10] / 100;
   }

   // $FF: renamed from: e (int) void
   private void method_88(int var1) {
      int[] var10000;
      if (var1 == 1) {
         if (field_116[10] < 0 && field_116[13] == 1) {
            var10000 = field_116;
            var10000[10] += this.field_90;
            if (field_116[10] > 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
            }
         }

         if (field_116[10] == 0) {
            var10000 = field_116;
            var10000[10] += this.field_89;
         }

         var10000 = field_116;
         var10000[10] += this.field_89;
         if (field_116[10] > 0 && field_116[13] == 1) {
            field_116[13] = 0;
            field_116[14] = 0;
            return;
         }
      } else {
         if (field_116[10] > 0 && field_116[13] == 2) {
            var10000 = field_116;
            var10000[10] -= this.field_90;
            if (field_116[10] < 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
            }
         }

         if (field_116[10] == 0) {
            var10000 = field_116;
            var10000[10] -= this.field_89;
         }

         var10000 = field_116;
         var10000[10] -= this.field_89;
         if (field_116[10] < 0 && field_116[13] == 2) {
            field_116[13] = 0;
            field_116[14] = 0;
         }
      }

   }

   // $FF: renamed from: ar () void
   private void method_89() {
      int[] var10000;
      if (this.field_267) {
         field_116[12] = 0;
         if (field_116[13] == 0) {
            field_116[13] = 2;
            field_116[14] = 2;
         }

         this.method_88(1);
      } else if (this.field_221 == 5 && this.field_222 != 2 && (37 == field_116[8] || 38 == field_116[8] || 39 == field_116[8] || 41 == field_116[8] || 42 == field_116[8] || 47 == field_116[8] || 48 == field_116[8] || 49 == field_116[8] || 52 == field_116[8] || 59 == field_116[8] || 62 == field_116[8] || 69 == field_116[8] || 71 == field_116[8] || 72 == field_116[8] || 78 == field_116[8] || 79 == field_116[8] || 87 == field_116[8] || 88 == field_116[8] || 89 == field_116[8])) {
         var10000 = field_116;
         var10000[10] += 256;
         if (2560 < field_116[10]) {
            field_116[10] = 2560;
         }
      } else if (this.field_294 > 0) {
         --this.field_294;
      } else if (this.field_30[3]) {
         if (field_116[13] == 0) {
            field_116[13] = 1;
         }

         if (field_116[14] == 0) {
            field_116[14] = 1;
         }

         field_116[12] = 1;
         this.method_90(0);
      } else if (this.field_30[4]) {
         if (field_116[13] == 0) {
            field_116[13] = 2;
         }

         if (field_116[14] == 0) {
            field_116[14] = 2;
         }

         field_116[12] = 0;
         this.method_90(1);
      }

      var10000 = this.field_94;
      var10000[0] += method_5(field_100 + 90) * field_116[10] / 100;
      var10000 = this.field_94;
      var10000[1] += method_6(field_100 + 90) * field_116[10] / 100;
      if (field_116[10] != 0 && field_116[10] != 0) {
         if (field_116[10] < 0) {
            var10000 = field_116;
            var10000[10] += this.field_89;
            if (field_116[10] >= 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               field_124 = false;
            }
         } else {
            var10000 = field_116;
            var10000[10] -= this.field_89;
            if (field_116[10] <= 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               field_124 = false;
            }
         }
      }

      if (field_116[10] == 0) {
         field_124 = false;
         this.field_297 = 0;
      }

   }

   // $FF: renamed from: f (int) void
   private void method_90(int var1) {
      int[] var10000;
      if (var1 == 1) {
         var10000 = field_116;
         var10000[10] += this.field_89 >> 1;
         if (Math.abs(field_116[10]) > 4096) {
            if (field_116[10] < 0) {
               field_116[10] = -4096;
               return;
            }

            field_116[10] = 4096;
            return;
         }
      } else {
         var10000 = field_116;
         var10000[10] -= this.field_89 >> 1;
         if (Math.abs(field_116[10]) > 4096) {
            if (field_116[10] < 0) {
               field_116[10] = -4096;
               return;
            }

            field_116[10] = 4096;
         }
      }

   }

   // $FF: renamed from: g (int) void
   private void method_91(int var1) {
      if (!this.field_203) {
         int[] var10000;
         int var2;
         if (0 == var1) {
            if ((var2 = field_100) < 0) {
               var2 = 0;
               if (field_100 != 0 && !this.field_203 && (field_100 <= 22 || field_100 >= 338)) {
                  if (field_116[10] > 0) {
                     var2 = 90;
                  } else if (field_116[10] < 0) {
                     var2 = 270;
                  } else {
                     var2 = field_100;
                  }
               }
            }

            if (field_100 > 22 && field_100 < 338) {
               var10000 = field_116;
               var10000[10] += method_6(var2 + 90) * 32 / 100;
               return;
            }
         } else {
            var2 = field_116[10];
            int var3;
            if ((var3 = field_100) < 0) {
               var3 = 0;
               if (field_100 != 0 && !this.field_203 && (field_100 <= 22 || field_100 >= 338)) {
                  if (field_116[10] > 0) {
                     var3 = 90;
                  } else if (field_116[10] < 0) {
                     var3 = 270;
                  } else {
                     var3 = field_100;
                  }
               }
            }

            if (var3 < 338 && var3 > 22) {
               if (method_6(var3 + 90) * 80 / 100 < 0 && field_116[10] < 0) {
                  var10000 = field_116;
                  var10000[10] += method_6(var3 + 90) * 80 / 100;
               }

               if (method_6(var3 + 90) * 80 / 100 > 0 && field_116[10] > 0) {
                  var10000 = field_116;
                  var10000[10] += method_6(var3 + 90) * 80 / 100;
               }
            } else if (field_100 != 338 && field_100 != 22) {
               var10000 = field_116;
               var10000[10] += method_6(var3 + 90) * 80 / 100;
            } else {
               if ((method_6(var3 + 90) << 5) / 100 < 0 && field_116[10] < 0) {
                  var10000 = field_116;
                  var10000[10] += method_6(var3 + 90) * 80 / 100;
               }

               if ((method_6(var3 + 90) << 5) / 100 > 0 && field_116[10] > 0) {
                  var10000 = field_116;
                  var10000[10] += method_6(var3 + 90) * 80 / 100;
               }
            }

            if (field_116[10] >= 0 && var2 <= 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               field_124 = false;
            }

            if (field_116[10] <= 0 && var2 >= 0) {
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               field_124 = false;
            }
         }

      }
   }

   // $FF: renamed from: u () void
   public final void method_92() {
      int var1 = 112;
      if (this.field_85 > 0) {
         var1 = 112 + (this.field_85 << 1);
      }

      if (this.field_84 > 0) {
         var1 -= this.field_84 << 1;
      }

      int[] var10000;
      if (this.field_221 == 0 && this.field_222 == 3) {
         this.field_275[0] = 0;
         this.field_275[2] = 0;
         this.field_275[1] = 3840;
         this.field_275[3] = 128;
         if (this.field_241) {
            var10000 = this.field_275;
            var10000[1] += 768;
         }
      } else if (this.field_221 != 5 || this.field_222 != 3) {
         this.field_275[0] = 0;
         this.field_275[2] = 0;
         this.field_275[1] = field_238[this.field_221][this.field_222][2] + 320;
         this.field_275[3] = this.method_96() + (240 - (184 - var1));
         if (this.field_274 == 2) {
            this.field_267 = true;
         }

         if (this.field_222 != 2 || this.field_221 != 1) {
            if (this.field_222 < 2) {
               if (method_102() >= field_213[this.field_221][this.field_222] || this.field_274 == 1) {
                  this.field_275[0] = field_213[this.field_221][this.field_222] - 144;
                  this.field_274 = 1;
               }
            } else if (this.field_274 == 2 && this.field_221 != 1) {
               this.field_275[0] = (short)(field_238[this.field_221][this.field_222][2] + 320);
            }
         }

         if (this.field_222 == 2 && this.field_221 != 1 && this.field_241) {
            var10000 = this.field_275;
            var10000[1] += 256;
         }

         if (this.field_240) {
            if (this.field_221 == 0) {
               this.field_275[0] = 10720 - (field_21 >> 1) + -16;
               this.field_275[1] = 10720 - (field_21 >> 1) + field_21 + 16;
               this.field_275[2] = 0;
               this.field_275[3] = 800 + var1;
            } else if (this.field_221 == 2) {
               this.field_275[0] = 6272 - (field_21 >> 1) + -16;
               this.field_275[1] = 6272 - (field_21 >> 1) + field_21 + 48;
               this.field_275[2] = 560;
               this.field_275[3] = 568 + var1;
            } else if (this.field_221 == 4) {
               this.field_275[0] = 11424 - (field_21 >> 1) + -64;
               this.field_275[1] = 11424 - (field_21 >> 1) + field_21 + 0;
               this.field_275[2] = 1232;
               this.field_275[3] = 1248 + var1;
            } else if (this.field_221 == 3) {
               this.field_275[0] = 8400 - (field_21 >> 1);
               this.field_275[1] = 8400 - (field_21 >> 1) + field_21;
               this.field_275[2] = 528;
               this.field_275[3] = 576 + var1;
            }
         }

         if (this.field_241) {
            if (this.field_221 == 0) {
               this.field_275[0] = 10752 - (field_21 >> 1);
            } else if (this.field_221 == 2) {
               this.field_275[0] = 6304 - (field_21 >> 1) - 16;
            } else if (this.field_221 == 4) {
               this.field_275[0] = 11424 - (field_21 >> 1);
            } else if (this.field_221 == 3) {
               this.field_275[0] = 8400 - (field_21 >> 1);
            }
         }
      }

      if (field_125) {
         this.method_106();
      } else {
         this.method_93(var1);
      }
   }

   // $FF: renamed from: h (int) void
   private void method_93(int var1) {
      this.method_94();
      this.method_95(var1);

      for(int var2 = 0; var2 < 2; ++var2) {
         if (field_225[var2] < 0) {
            field_225[var2] = 0;
         }
      }

   }

   // $FF: renamed from: as () void
   private void method_94() {
      int var1 = field_21 >> 1;
      int var2 = method_102();
      if (field_225[0] >= this.field_275[1] - field_21 && !this.field_240 && this.field_239 == 0 && this.field_222 == 2) {
         this.method_242();
      }

      int[] var10000;
      if (var2 - field_225[0] < var1) {
         if (this.field_155) {
            if (field_225[0] + 16 << 8 > field_116[0]) {
               field_116[0] = field_225[0] + 16 << 8;
               if (field_116[10] < 0) {
                  field_116[10] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
               }

               if (!field_122 && field_124) {
                  field_124 = false;
                  return;
               }
            }
         } else {
            this.field_290 = true;
            var10000 = field_225;
            var10000[0] -= var1 - (var2 - field_225[0]);
            if (field_225[0] < this.field_275[0]) {
               field_225[0] = this.field_275[0];
            }

            if (field_225[0] + 16 << 8 > field_116[0]) {
               field_116[0] = field_225[0] + 16 << 8;
               if (field_116[10] < 0) {
                  field_116[10] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
               }

               if (!field_122 && field_124) {
                  field_124 = false;
               }

               if (field_122 && field_116[3] < 0) {
                  field_116[3] = 0;
                  return;
               }
            }
         }
      } else if (var2 - field_225[0] > var1) {
         this.field_289 = true;
         var10000 = field_225;
         var10000[0] -= var1 - (var2 - field_225[0]);
         if (field_225[0] + (var1 << 1) > this.field_275[1]) {
            field_225[0] = this.field_275[1] - (var1 << 1);
         }

         if (this.field_267) {
            if (field_225[0] + 96 + 240 << 8 < field_116[0]) {
               field_116[0] = field_225[0] + 96 + 240 << 8;
               field_116[10] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
               if (!field_122 && field_124) {
                  field_124 = false;
                  return;
               }
            }
         } else if (field_225[0] - 16 + 240 << 8 < field_116[0]) {
            field_116[0] = field_225[0] - 16 + 240 << 8;
            field_116[10] = 0;
            field_116[13] = 0;
            field_116[14] = 0;
            if (!field_122 && field_124) {
               field_124 = false;
            }
         }
      }

   }

   // $FF: renamed from: i (int) void
   private void method_95(int var1) {
      int var3 = method_103();
      if (this.field_240 && (this.field_221 != 1 || this.field_222 != 2) && field_225[1] + var1 > this.field_275[3]) {
         field_225[1] = this.field_275[3] - var1;
      }

      int[] var10000;
      if (var3 - field_225[1] < var1) {
         this.field_289 = true;
         var10000 = field_225;
         var10000[1] -= var1 - (var3 - field_225[1]);
         if ((this.field_221 == 1 && this.field_222 == 2 && field_225[0] < 7936 || this.field_221 == 5 && this.field_222 == 1) && this.field_85 <= 0 && this.field_84 <= 0) {
            return;
         }

         if (field_225[1] < this.field_275[2]) {
            field_225[1] = this.field_275[2];
            return;
         }
      } else if (var3 - field_225[1] > var1) {
         this.field_289 = true;
         var10000 = field_225;
         var10000[1] -= var1 - (var3 - field_225[1]);
         if (field_225[1] + var1 > this.field_275[3]) {
            field_225[1] = this.field_275[3] - var1;
         }

         if (this.field_221 != 1 || this.field_222 != 2) {
            if (this.field_221 == 5 && this.field_222 == 1) {
               return;
            }

            if ((this.field_221 == 3 && field_225[1] + 168 << 8 < field_116[1] || field_225[1] - 16 + 240 << 8 < field_116[1]) && !field_125) {
               field_116[1] = field_225[1] - 16 + 240 << 8;
               this.method_105();
            }
         }
      }

   }

   // $FF: renamed from: c () int
   private int method_96() {
      int var1 = this.field_219 * 256 - 232;
      switch (this.field_221) {
         case 0:
            var1 = this.method_97();
         case 1:
         case 3:
         default:
            break;
         case 2:
            var1 = this.method_98();
            break;
         case 4:
            var1 = this.method_99();
      }

      return var1;
   }

   // $FF: renamed from: d () int
   private int method_97() {
      short var1 = 1024;
      switch (this.field_222) {
         case 0:
            if (6016 > field_225[0]) {
               var1 = 768;
            }
            break;
         case 1:
            if (3792 > field_225[0]) {
               var1 = 768;
            } else if (5632 > field_225[0]) {
               var1 = 512;
            } else if (7520 > field_225[0]) {
               var1 = 1024;
            } else {
               var1 = 768;
            }
            break;
         case 2:
            if (896 > field_225[0]) {
               var1 = 768;
            } else if (2400 > field_225[0]) {
               var1 = 784;
            } else if (640 > field_225[1]) {
               var1 = 768;
            } else if (4992 <= field_225[0]) {
               var1 = 1024;
               if (5888 <= field_225[0]) {
                  if (field_225[1] > 880) {
                     if (6144 <= field_225[0]) {
                        this.field_275[1] = 6144 + field_21;
                        this.field_239 = 1;
                     }
                  } else {
                     var1 = 768;
                  }
               }
            } else {
               var1 = 1216;
            }
      }

      return var1;
   }

   // $FF: renamed from: e () int
   private int method_98() {
      short var1;
      switch (this.field_222) {
         case 0:
            if ((this.field_112 != 0 || this.field_113 != 0) && field_225[0] == 0 && field_225[1] == 0) {
               var1 = 1280;
            } else {
               boolean var2 = false;
               if (method_102() > 3584 && method_102() < 4096 && method_103() > 1024 && method_103() < 1248) {
                  var1 = 1280;
               } else if (3696 <= field_225[0]) {
                  var1 = 528;
                  if (5168 > field_225[0]) {
                     var1 = 1280;
                  }
               } else if (1792 > field_225[0]) {
                  var1 = 464;
               } else if (2400 <= field_225[0] && 2752 > field_225[0]) {
                  var1 = 1280;
                  if (728 > field_225[1]) {
                     var1 = 544;
                  }
               } else {
                  var1 = 1280;
                  if (728 > field_225[1]) {
                     if (3328 > field_225[0]) {
                        var1 = 544;
                     }
                  } else if (1176 > field_225[1] && 3792 > field_225[0]) {
                  }
               }
            }
            break;
         case 1:
            var1 = 1312;
            break;
         default:
            var1 = 1824;
            if (5472 < field_225[0] && method_103() < 1280) {
               var1 = 528;
            }
      }

      return var1;
   }

   // $FF: renamed from: f () int
   private int method_99() {
      boolean var1 = false;
      short var2;
      switch (this.field_222) {
         case 1:
            var2 = 1312;
            if (9632 <= field_225[0] && 1248 > method_103()) {
               var2 = 1056;
            }
            break;
         default:
            var2 = 1228;
            if (11264 > field_225[0]) {
               var2 = 1824;
            }
      }

      return var2;
   }

   // $FF: renamed from: j (int) void
   private void method_100(int var1) {
      this.method_73();
      int[] var10000;
      if (this.field_221 == 1 && this.field_208 < method_103() - 12) {
         var10000 = field_116;
         var10000[0] += this.field_94[0] >> 1;
         var10000 = field_116;
         var10000[1] += this.field_94[1] >> 1;
      } else {
         if (this.field_94[0] > 4096) {
            this.field_94[0] = 4096;
         }

         if (this.field_94[0] < -4096) {
            this.field_94[0] = -4096;
         }

         if (this.field_94[1] > 4096) {
            this.field_94[1] = 4096;
         }

         if (this.field_94[1] < -4096) {
            this.field_94[1] = -4096;
         }

         var10000 = field_116;
         var10000[0] += this.field_94[0];
         var10000 = field_116;
         var10000[1] += this.field_94[1];
      }

      if (var1 == 1) {
         if (this.field_96 <= 0) {
            if (this.field_221 == 1 && this.field_208 < method_103() - 12) {
               var10000 = field_116;
               var10000[5] += this.field_91 / 2;
            } else {
               var10000 = field_116;
               var10000[5] += this.field_91;
            }
         } else {
            --this.field_96;
         }
      }

      if (var1 == 1 && field_124) {
         var10000 = field_116;
         var10000[11] += this.field_88;
      } else if (Math.abs(this.field_94[0]) + Math.abs(this.field_94[1]) > this.field_88) {
         var10000 = field_116;
         var10000[11] += this.field_88;
      } else {
         var10000 = field_116;
         var10000[11] += Math.abs(this.field_94[0]) + Math.abs(this.field_94[1]);
      }
   }

   // $FF: renamed from: u () boolean
   private boolean method_101() {
      if (field_100 <= 290 && field_100 >= 70) {
         int var1;
         if (field_100 >= 90 && field_100 <= 270) {
            if (Math.abs(field_116[10]) < 640) {
               if (field_116[10] < 0) {
                  field_116[12] = 1;
                  field_116[13] = 0;
                  field_116[14] = 0;
               } else {
                  field_116[12] = 0;
                  field_116[13] = 0;
                  field_116[14] = 0;
               }

               var1 = field_116[10];
               field_116[5] = method_6(field_100 + 90) * var1 / 100;
               if (field_100 > 90 && field_100 < 270) {
                  field_116[5] = 0;
               }

               field_116[3] = method_5(field_100 + 90) * var1 / 100;
               field_122 = true;
               field_118 = false;
               this.field_203 = false;
               this.field_276 = 15;
               if (field_100 == 90 || field_100 == 270) {
                  this.field_276 = 0;
               }

               this.method_70();
            }
         } else if (Math.abs(field_116[10]) < 640) {
            if (field_116[10] < 0) {
               field_116[12] = 1;
               field_116[13] = 0;
               field_116[14] = 0;
            } else {
               field_116[12] = 0;
               field_116[13] = 0;
               field_116[14] = 0;
            }

            var1 = Math.abs(field_116[10]);
            field_116[5] = 280;
            field_116[3] = -(method_5(field_100 + 90) * var1) / 100;
            field_122 = true;
            field_118 = false;
            this.field_203 = false;
            this.field_294 = 30;
            this.method_70();
         }
      }

      return false;
   }

   // $FF: renamed from: a () int
   public static int method_102() {
      return field_116[0] >> 8;
   }

   // $FF: renamed from: b () int
   public static int method_103() {
      return field_116[1] >> 8;
   }

   // $FF: renamed from: v () void
   public final void method_104() {
      if (!this.field_277) {
         if (this.field_101 <= 0) {
            if (this.field_299 && this.field_298[0]) {
               return;
            }

            if (this.field_104 > 0) {
               this.field_104 = 0;
               this.field_102 = 60;
               field_118 = true;
               field_122 = true;
               if (field_116[12] == 1) {
                  field_116[3] = 512;
               } else {
                  field_116[3] = -512;
               }

               field_116[5] = -1024;
               field_116[12] = (field_116[12] + 1) % 2;
               field_116[13] = 0;
               field_116[14] = 0;
               this.field_277 = true;
               return;
            }

            if (this.field_102 <= 0) {
               if (this.field_106 <= 0) {
                  this.method_105();
                  return;
               }

               this.field_102 = 60;
               field_118 = true;
               field_122 = true;
               if (method_40()) {
                  field_116[3] = -512;
                  field_116[5] = -1024;
               } else {
                  if (field_116[12] == 1) {
                     field_116[3] = 512;
                  } else {
                     field_116[3] = -512;
                  }

                  field_116[5] = -1024;
               }

               field_116[12] = (field_116[12] + 1) % 2;
               field_116[13] = 0;
               field_116[14] = 0;
               if (!this.field_299 || !this.field_298[0]) {
                  this.method_201(method_102(), method_103() - 12, this.field_106);
                  this.field_106 = 0;
               }

               this.field_277 = true;
            }
         }

      }
   }

   // $FF: renamed from: w () void
   public final void method_105() {
      if (field_125) {
         this.field_249 = true;
         this.field_250 = 10;
      } else {
         field_131 = true;
         this.field_83 = 2100;
         field_122 = true;
         field_118 = false;
         field_124 = false;
         field_125 = true;
         this.field_278 = true;
         this.field_203 = false;
         field_116[10] = 0;
         field_116[13] = 0;
         field_116[14] = 0;
         this.field_96 = 5;
         field_116[3] = 0;
         field_116[5] = method_6(0) * this.field_92 / 100;
         this.field_110 = 120;
      }
   }

   // $FF: renamed from: at () void
   private void method_106() {
      if (field_125) {
         field_116[3] = 0;
         --this.field_110;
         if (field_225[1] - 16 + 240 << 8 < field_116[1] && this.field_278) {
            this.field_278 = false;
            if (!this.field_299 || !this.field_298[0]) {
               --this.field_111;
            }

            if (this.field_111 <= 0) {
               this.field_36.method_380(14, -1);
               this.field_110 = 240;
               this.field_249 = true;
               this.field_250 = 10;
            } else if (this.field_108 == 59 && this.field_109 == 9) {
               this.field_110 = 240;
               field_280 = true;
               this.field_249 = true;
               this.field_250 = 10;
               this.field_114 = 0;
               this.field_115 = 0;
               this.field_281 = true;
            }
         }

         if (this.field_110 < 0) {
            if (this.field_111 <= 0) {
               this.method_252();
               this.field_249 = true;
               this.field_250 = 10;
               return;
            }

            this.method_42();
         }
      }

   }

   // $FF: renamed from: a (int) void
   public final void method_107(int var1) {
      this.field_133[0] = true;
      if (!this.field_277 && field_116[5] >= 0) {
         if (field_122 && field_124 && !field_123) {
            field_124 = false;
         }

         int var2;
         if ((var2 = this.field_284 - 8) >= 0 && Math.abs(method_102() - this.field_285) > var2) {
            this.field_282 = true;
            this.field_283 = 0;
            if (method_102() - this.field_285 > 0) {
               this.field_283 = 1;
            }
         }

         this.field_273 = false;
         field_116[8] = 0;
         field_116[5] = 0;
         if (field_122) {
            field_116[10] = field_116[3];
            if (field_116[10] < 0) {
               field_116[13] = 1;
            }

            if (field_116[10] > 0) {
               field_116[13] = 2;
            }

            field_116[14] = 0;
         }

         field_116[3] = 0;
         this.field_203 = true;
         this.field_205 = var1;
         field_100 = 0;
         field_122 = false;
         field_117 = false;
         field_119 = false;
         this.field_297 = 0;
      }
   }

   // $FF: renamed from: a (int, int) int
   private int method_108(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      int var3 = (this.field_236[(var2 >> 4 >> 4) % this.field_219][var1 >> 4 >> 4] << 9) + ((var1 >> 4 & 15) + ((var2 >> 4 & 15) << 4) << 1) + 1;
      if (this.field_190[var3 >> 1] == 1) {
         return -1;
      } else {
         int var4 = (this.field_230[var3] & 255) + (this.field_188[var3 >> 1] << 8);
         int var5 = this.method_63(var4) * 360 / 255;
         if (this.field_189[var3 >> 1] == 1) {
            var5 = 360 - var5;
         } else if (this.field_189[var3 >> 1] == 2) {
            var5 = 540 - var5;
         } else if (this.field_189[var3 >> 1] == 3) {
            var5 = (var5 = 540 - var5) % 360;
            var5 = 360 - var5;
         }

         if (var5 % 90 == 0) {
            if (field_100 == 62) {
               return 90;
            }

            var5 = Math.abs((field_100 - 22 + 45) / 90) * 90;
            if (field_100 == 44) {
               var5 = 0;
            }
         }

         return var5 % 360;
      }
   }

   // $FF: renamed from: x () void
   public final void method_109() {
      if (!this.field_327) {
         if (this.field_102 > 0) {
            --this.field_102;
         }

         if ((this.field_102 & 1) != 1) {
            int var1 = field_35[0];
            int var3 = (540 - field_100) % 360;
            if (field_116[12] == 1) {
               var1 = field_35[4];
            }

            field_116[11] %= 92160;
            int var4 = 0;
            int var5 = 0;
            boolean var6 = false;
            boolean var7 = false;
            int var8 = method_102();
            int var9 = method_103();
            byte var10 = 33;
            int var11 = 1;
            boolean var12 = false;
            int var17;
            if (field_117) {
               var17 = 28;
            } else if (field_118 && field_122) {
               if (field_116[12] == 1) {
                  var1 = field_35[0];
               } else {
                  var1 = field_35[4];
               }

               var9 -= 5;
               var17 = 26;
            } else if (this.field_98 > 0) {
               var17 = 11;
               --this.field_98;
            } else if (field_121) {
               var1 = field_35[4];
               var17 = 35 + (this.field_32 >> 1) % 2;
               field_121 = false;
            } else if (field_120) {
               if ((this.field_32 >> 1) % 5 < 3) {
                  var1 = field_35[0];
                  var17 = 32 + (this.field_32 >> 1) % 4;
               } else {
                  var1 = field_35[4];
                  var17 = 36 - (this.field_32 >> 1) % 4;
               }

               field_120 = false;
            } else if (field_124 && field_122) {
               var4 = 0;
               if (field_122 && field_100 == 270) {
                  var4 -= 16;
               }

               var8 += var4;
               var17 = 6 + field_116[11] / this.field_88 / 4 % 5;
            } else if (field_119) {
               var9 -= 5;
               var17 = 25 + this.field_32 / 2 % 2;
            } else if (field_125) {
               if (field_279) {
                  var17 = 29;
               } else {
                  var17 = 27;
               }
            } else if (field_124 && !field_122) {
               var4 = -16 + method_5(var3) * 16 / 100;
               var5 = -15 - method_6(var3) * 15 / 100;
               var8 += var4;
               var9 += var5;
               var10 = 20;
               var17 = 6 + field_116[11] / this.field_88 / 4 % 4;
            } else if (field_126) {
               var17 = 22;
               field_126 = false;
            } else if (field_127) {
               var17 = 5;
               field_127 = false;
            } else if (this.field_82 > 0) {
               var17 = 37 + this.field_32 / 4 % 4;
            } else if (field_116[10] == 0 && !field_122) {
               if (this.field_282) {
                  if (this.field_283 == 1) {
                     var1 = field_35[0];
                  } else {
                     var1 = field_35[4];
                  }

                  var17 = 23 + this.field_286 / 8 % 2;
               } else if (this.field_203 || field_100 > 22 && field_100 < 338 || (this.method_61(method_102() + 12, method_103()) || this.method_61(method_102() + 12, method_103() + 16)) && (this.method_61(method_102() - 12, method_103()) || this.method_61(method_102() - 12, method_103() + 16))) {
                  if (this.field_286 < 75) {
                     var17 = 0;
                  } else if (this.field_286 < 90) {
                     var17 = 1;
                  } else if (this.field_286 < 105) {
                     var17 = 2;
                  } else {
                     var17 = 3 + this.field_286 / 8 % 2;
                  }
               } else {
                  if (!this.method_61(method_102() + 12, method_103()) && !this.method_61(method_102() + 12, method_103() + 16)) {
                     var1 = field_35[0];
                  } else {
                     var1 = field_35[4];
                  }

                  var17 = 23 + this.field_286 / 8 % 2;
               }
            } else if (!field_122 && (field_116[14] == 2 && field_116[10] > 0 && field_116[12] == 1 || field_116[14] == 1 && field_116[10] < 0 && field_116[12] == 0)) {
               var1 = field_35[0];
               if (field_116[12] == 0) {
                  var1 = field_35[4];
               }

               var17 = 30 + field_116[11] / this.field_88 / 4 % 2;
            } else {
               int var2;
               for(var2 = 0; var2 < 7 && (var2 * 45 + 23 >= var3 || (var2 + 1) * 45 + 23 < var3); ++var2) {
               }

               var1 = method_110(var2);
               var11 = var2 % 2;
               var10 = 20;
               if (Math.abs(field_116[10]) < this.field_88 && !field_132) {
                  if (var11 == 1) {
                     var17 = 12 + field_116[11] / this.field_88 / 4 % 6;
                  } else {
                     var17 = field_116[11] / this.field_88 / 4 % 6;
                  }
               } else if (var11 == 1) {
                  var17 = 18 + field_116[11] / this.field_88 / 4 % 4;
               } else {
                  var17 = 6 + field_116[11] / this.field_88 / 4 % 4;
               }

               var4 = -16 + method_5(var3) * 16 / 100;
               var5 = -18 - method_6(var3) * 18 / 100;
               var8 += var4;
               var9 += var5;
            }

            if (var11 == 1) {
               method_131(var8, var9, 151, var17, var1, var10);
            } else {
               method_131(var8, var9, 152, var17, var1, var10);
            }

            field_132 = false;
            if (this.field_82 > 0) {
               --this.field_82;
            }

            if (field_116[10] == 0 && !field_122) {
               ++this.field_286;
            } else {
               this.field_286 = 0;
            }

            int var15 = -16 + method_5(var3) * 16 / 100;
            int var16 = -16 - method_6(var3) * 16 / 100;
            if (this.field_101 > 0) {
               if (this.field_32 % 2 == 0) {
                  if (var4 == 0 && var5 == 0) {
                     this.method_111(method_102(), method_103() - 13, 0);
                     return;
                  }

                  this.method_111(method_102() + var15 + 16, method_103() + var16 + 16, 0);
                  return;
               }
            } else if (this.field_104 > 0) {
               if (var15 == 0 && var16 == 0) {
                  var8 = method_102() + var4;
                  var9 = method_103() - 13 + var5;
               } else {
                  var8 = method_102() + var15 + 16;
                  var9 = method_103() + var16 + 16;
               }

               method_126(109, 36, 36 * (this.field_32 % 2), 36, 36, field_35[0], var8, var9);
            }

         }
      }
   }

   // $FF: renamed from: g (int) int
   private static int method_110(int var0) {
      int var3;
      if (field_116[12] == 1) {
         boolean var1 = false;
         var3 = (new int[]{field_35[5], field_35[5], field_35[4], field_35[4], field_35[7], field_35[7], field_35[6], field_35[6]})[var0];
      } else {
         var3 = (new int[]{field_35[2], field_35[1], field_35[1], field_35[0], field_35[0], field_35[3], field_35[3], field_35[2]})[var0];
      }

      return var3;
   }

   // $FF: renamed from: j (int, int, int) void
   private void method_111(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_200.length; ++var4) {
         if (this.field_200[var4][0] == 0) {
            this.field_200[var4][0] = 1;
            this.field_200[var4][1] = var3;
            this.field_200[var4][2] = var1;
            this.field_200[var4][3] = var2;
            this.field_200[var4][5] = 0;
            return;
         }
      }

   }

   // $FF: renamed from: y () void
   public final void method_112() {
      for(int var1 = 0; var1 < this.field_200.length; ++var1) {
         if (this.field_200[var1][0] == 1 && this.field_200[var1][1] == 0) {
            int var10002 = this.field_200[var1][5]++;
            if (this.field_200[var1][5] > 60) {
               this.field_200[var1][5] = 0;
               this.field_200[var1][0] = 0;
            }
         }
      }

   }

   // $FF: renamed from: z () void
   public final void method_113() {
      for(int var2 = 0; var2 < this.field_200.length; ++var2) {
         if (this.field_200[var2][0] == 1 && this.field_200[var2][1] == 0) {
            method_126(109, 0, 36 * (this.field_200[var2][5] / 4 % 2), 36, 36, field_35[0], this.field_200[var2][2], this.field_200[var2][3]);
         }
      }

   }

   // $FF: renamed from: au () void
   private void method_114() {
      int var1 = 0;
      if (this.field_222 > 3) {
         this.field_222 = 3;
      }

      int var2;
      byte var3;
      for(var2 = 0; var2 < this.field_234[this.field_222].length / 7; ++var2) {
         var3 = this.field_234[this.field_222][var2 * 7 + 5];
         if (0 != var3 && 1 != var3 && 63 != var3 && 64 != var3 && 65 != var3 && 66 != var3 && 67 != var3 && 68 != var3 && 69 != var3) {
            ++var1;
         } else {
            ++var1;
            var1 += this.field_234[this.field_222][var2 * 7 + 6];
         }
      }

      this.field_235 = new int[var1];
      this.field_197 = new boolean[var1 + 20];
      this.field_198 = new boolean[var1 + 20];
      var1 = 0;

      for(var2 = 0; var2 < this.field_234[this.field_222].length / 7; ++var2) {
         this.field_235[var2] = var1;
         var3 = this.field_234[this.field_222][var2 * 7 + 5];
         if (0 != var3 && 1 != var3 && 63 != var3 && 64 != var3 && 65 != var3 && 66 != var3 && 67 != var3 && 68 != var3 && 69 != var3) {
            ++var1;
         } else {
            for(int var4 = 0; var4 < this.field_234[this.field_222][var2 * 7 + 6] + 1; ++var4) {
               ++var1;
            }
         }
      }

   }

   // $FF: renamed from: a (int[]) boolean
   public final boolean method_115(int[] var1) {
      if (var1[2] - field_225[0] < this.field_291) {
         return true;
      } else if (var1[2] - field_225[0] > this.field_292) {
         return true;
      } else {
         return Math.abs(var1[3] - field_225[1]) > this.field_293;
      }
   }

   // $FF: renamed from: A () void
   public final void method_116() {
      int var2 = this.field_234[this.field_222].length / 7;

      try {
         int var3;
         int var4;
         if (this.field_289) {
            if (this.field_287 < this.field_288) {
               this.field_288 = this.field_287;
            } else {
               this.field_287 = this.field_288;
            }

            var3 = this.field_288 * 7;
            var4 = this.field_287 * 7;

            label70: {
               while(((this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255) - field_225[0] <= this.field_292) {
                  if (Math.abs(((this.field_234[this.field_222][var3 + 2] & 255) << 8 | this.field_234[this.field_222][var3 + 3] & 255) - field_225[1]) < this.field_293 && !this.field_197[this.field_235[this.field_288]]) {
                     this.method_117(this.field_288);
                  }

                  ++this.field_288;
                  var3 += 7;
                  if (this.field_288 >= var2) {
                     this.field_288 = var2 - 1;
                     this.field_289 = false;
                     break label70;
                  }
               }

               this.field_289 = false;
            }

            while(((this.field_234[this.field_222][var4 + 0] & 255) << 8 | this.field_234[this.field_222][var4 + 1] & 255) - field_225[0] < this.field_291) {
               ++this.field_287;
               var4 += 7;
               if (this.field_287 >= var2) {
                  this.field_287 = var2 - 1;
                  break;
               }
            }
         } else if (this.field_290) {
            if (this.field_287 > this.field_288) {
               this.field_288 = this.field_287;
            } else {
               this.field_287 = this.field_288;
            }

            var3 = this.field_288 * 7;
            var4 = this.field_287 * 7;

            label54: {
               while(((this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255) - field_225[0] >= this.field_291) {
                  if (Math.abs(((this.field_234[this.field_222][var3 + 2] & 255) << 8 | this.field_234[this.field_222][var3 + 3] & 255) - field_225[1]) < this.field_293 && !this.field_197[this.field_235[this.field_288]]) {
                     this.method_117(this.field_288);
                  }

                  --this.field_288;
                  var3 -= 7;
                  if (this.field_288 < 0) {
                     this.field_288 = 0;
                     this.field_290 = false;
                     break label54;
                  }
               }

               this.field_290 = false;
            }

            while(((this.field_234[this.field_222][var4 + 0] & 255) << 8 | this.field_234[this.field_222][var4 + 1] & 255) - field_225[0] > this.field_292) {
               --this.field_287;
               var4 -= 7;
               if (this.field_287 < 0) {
                  this.field_287 = 0;
                  break;
               }
            }
         }

      } catch (Exception var6) {
         this.field_289 = false;
      }
   }

   // $FF: renamed from: k (int) void
   private void method_117(int var1) {
      int var2 = 1;
      int var3 = var1 * 7;
      int var4 = this.field_234[this.field_222][var1 * 7 + 5] & 255;
      int var5;
      if (0 != var4 && 1 != var4 && 63 != var4 && 64 != var4 && 65 != var4 && 66 != var4 && 67 != var4 && 68 != var4 && 69 != var4) {
         if ((var4 == 41 || var4 == 86 || var4 == 57 || var4 == 78 || var4 == 40 || var4 == 70 || var4 == 39 || var4 == 49 || var4 == 71 || var4 == 10 || var4 == 35) && (var5 = (this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255) - field_225[0] > -48 && var5 - field_225[0] < 288) {
            return;
         }
      } else {
         var2 = 1 + this.field_234[this.field_222][var3 + 6];
         var5 = (this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255;
         boolean var6 = false;
         if (var2 != 1) {
            switch (this.field_234[this.field_222][var3 + 5]) {
               case 0:
                  var5 += (var2 - 1) * 24;
               case 1:
               case 68:
               case 69:
               default:
                  break;
               case 63:
                  var5 -= (var2 - 1) * 16;
                  break;
               case 64:
                  var5 += (var2 - 1) * 16;
                  break;
               case 65:
                  var5 += (var2 - 1) * 32;
                  break;
               case 66:
                  var5 += (var2 - 1) * 16;
                  break;
               case 67:
                  var5 += (var2 - 1) * 32;
            }

            if (var5 - field_225[0] < this.field_291) {
               return;
            }

            if (var5 - field_225[0] > this.field_292) {
               return;
            }
         }
      }

      for(var5 = 0; var5 < var2; ++var5) {
         int[] var7 = new int[25];
         if (!this.field_198[this.field_235[var1] + var5] && !this.field_197[this.field_235[var1] + var5]) {
            var7[0] = 1;
            var7[1] = this.field_234[this.field_222][var3 + 5] & 255;
            var7[2] = (this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255;
            var7[3] = (this.field_234[this.field_222][var3 + 2] & 255) << 8 | this.field_234[this.field_222][var3 + 3] & 255;
            var7[8] = (this.field_234[this.field_222][var3 + 0] & 255) << 8 | this.field_234[this.field_222][var3 + 1] & 255;
            var7[9] = (this.field_234[this.field_222][var3 + 2] & 255) << 8 | this.field_234[this.field_222][var3 + 3] & 255;
            if (var2 != 1) {
               switch (this.field_234[this.field_222][var3 + 5]) {
                  case 0:
                     var7[2] += var5 * 24;
                     var7[8] += var5 * 24;
                     break;
                  case 1:
                     var7[3] += var5 * 24;
                     var7[9] += var5 * 24;
                     break;
                  case 63:
                     var7[2] -= var5 * 16;
                     var7[8] -= var5 * 16;
                     var7[3] += var5 * 16;
                     var7[9] += var5 * 16;
                     break;
                  case 64:
                     var7[2] += var5 * 16;
                     var7[8] += var5 * 16;
                     var7[3] += var5 * 16;
                     var7[9] += var5 * 16;
                     break;
                  case 65:
                     var7[2] += var5 * 32;
                     var7[8] += var5 * 32;
                     var7[3] += var5 * 32;
                     var7[9] += var5 * 32;
                     break;
                  case 66:
                     var7[2] += var5 * 16;
                     var7[8] += var5 * 16;
                     break;
                  case 67:
                     var7[2] += var5 * 32;
                     var7[8] += var5 * 32;
                     break;
                  case 68:
                     var7[3] += var5 * 16;
                     var7[9] += var5 * 16;
                     break;
                  case 69:
                     var7[3] += var5 * 32;
                     var7[9] += var5 * 32;
               }
            }

            var7[4] = this.field_234[this.field_222][var3 + 6] & 255;
            var7[19] = this.field_234[this.field_222][var3 + 4] & 255;
            var7[20] = this.field_235[var1] + var5;
            var7[22] = this.field_235[var1];
            if (this.field_296[0] == 0) {
               if (var7[1] == 41 || var7[1] == 86 || var7[1] == 57 || var7[1] == 78 || var7[1] == 40 || var7[1] == 70 || var7[1] == 39 || var7[1] == 49 || var7[1] == 71) {
                  return;
               }
            } else if (this.field_296[0] == 1 && (var7[1] == 40 || var7[1] == 70 || var7[1] == 39 || var7[1] == 49 || var7[1] == 71)) {
               return;
            }

            this.field_197[this.field_235[var1] + var5] = true;
            this.method_119(var7);
         }
      }

   }

   // $FF: renamed from: B () void
   public final void method_118() {
      if (!this.field_299 || !this.field_298[0]) {
         if (this.field_133[0] && this.field_133[3]) {
            this.method_105();
         } else if ((!field_122 || this.field_203) && this.field_133[3]) {
            this.method_105();
         } else if (this.field_221 != 2 && this.field_221 != 4) {
            if (this.field_203 && (this.method_60(method_102() - 8, method_103() - 24) || this.method_60(method_102() + 8, method_103() - 24))) {
               this.method_105();
            }
         } else if (this.field_203 && this.method_60(method_102() - 8, method_103() - 24) && this.method_60(method_102() + 8, method_103() - 24)) {
            this.method_105();
         }

         this.field_133[0] = false;
         this.field_133[3] = false;
      }
   }

   // $FF: renamed from: d (int[]) void
   private void method_119(int[] var1) {
      int var2;
      if (var1[1] != 9 && var1[1] != 15 && var1[1] != 48 && var1[1] != 11 && var1[1] != 2 && var1[1] != 79 && 0 != var1[1] && 1 != var1[1] && 63 != var1[1] && 64 != var1[1] && 65 != var1[1] && 66 != var1[1] && 67 != var1[1] && 68 != var1[1] && 69 != var1[1]) {
         if (this.field_195[this.field_135][24] == 0) {
            this.field_195[this.field_135] = var1;
            this.field_195[this.field_135][24] = 1;
            ++this.field_196;

            for(var2 = 0; var2 < this.field_195.length; ++var2) {
               if (this.field_195[var2][24] == 0) {
                  this.field_135 = var2;
                  return;
               }
            }
         } else {
            for(var2 = 0; var2 < this.field_195.length; ++var2) {
               if (this.field_195[var2][24] == 0) {
                  this.field_135 = var2;
                  break;
               }
            }

            this.field_195[this.field_135] = var1;
            this.field_195[this.field_135][24] = 1;
            ++this.field_196;

            for(var2 = 0; var2 < this.field_195.length; ++var2) {
               if (this.field_195[var2][24] == 0) {
                  this.field_135 = var2;
                  return;
               }
            }
         }
      } else {
         for(var2 = this.field_195.length - 1; var2 > 0; --var2) {
            if (this.field_195[var2][24] == 0) {
               this.field_195[var2] = var1;
               this.field_195[var2][24] = 1;
               if (this.field_135 != var2) {
                  ++this.field_196;
                  return;
               }

               ++this.field_196;

               for(int var3 = 0; var3 < this.field_195.length; ++var3) {
                  if (this.field_195[var2][24] == 0) {
                     this.field_135 = var2;
                     return;
                  }
               }

               return;
            }
         }
      }

   }

   // $FF: renamed from: b (int) void
   public final void method_120(int var1) {
      this.field_135 = var1;
      this.field_195[var1][24] = 0;
      --this.field_136;
   }

   // $FF: renamed from: a (int, int) int[][]
   public final int[][] method_121(int var1, int var2) {
      this.field_138 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.field_195.length && var3 < this.field_196; ++var4) {
         if (this.field_195[var4][24] == 1) {
            ++var3;
            if (this.field_195[var4][1] == var1 && (var2 < 0 || var2 == this.field_195[var4][4])) {
               this.field_137[this.field_138] = this.field_195[var4];
               this.field_137[this.field_138][23] = var4;
               ++this.field_138;
            }
         }
      }

      int[][] var5 = new int[this.field_138][25];
      System.arraycopy(this.field_137, 0, var5, 0, var5.length);
      return var5;
   }

   // $FF: renamed from: av () void
   private void method_122() {
      if (this.field_99-- <= 0) {
         if (method_103() >= 0) {
            boolean var1 = false;
            int var2 = method_102() >> 8;
            int var3 = method_103() >> 8;
            byte var4 = this.field_236[var3 % this.field_219][var2];
            if (field_95[0] >> 8 < var2 && this.field_221 == 0 && (var4 == 53 || var4 == 54)) {
               this.field_236[var3 % this.field_219][var2] = 53;
            }

            if (field_95[0] >> 8 > var2 && this.field_221 == 0 && (var4 == 53 || var4 == 54)) {
               this.field_236[var3 % this.field_219][var2] = 54;
            }

            int var5 = this.field_236[var3 % this.field_219][var2] & 1;
            if (this.field_221 == 0 && (var4 == 53 || var4 == 54)) {
               var1 = true;
            }

            if (var1) {
               if (this.method_59(method_102(), method_103())) {
                  if (var5 % 2 == 1 && (method_102() >> 4) % 16 < 9 && (method_103() >> 4) % 16 < 3) {
                     ++this.field_236[var3 % this.field_219][var2];
                     this.field_99 = 60;
                     return;
                  }

                  if (var5 % 2 == 0 && (method_102() >> 4) % 16 >= 7 && (method_103() >> 4) % 16 < 3) {
                     --this.field_236[var3 % this.field_219][var2];
                     this.field_99 = 60;
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int, int) void
   public static void method_123(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      method_132(field_26, field_29[var0], var1, var2, var3, var4, var5, var6, var7, 3, true);
   }

   // $FF: renamed from: h (int) int
   private static int method_124(int var0) {
      int var1 = var0 * 3 >> 2;
      if ((var0 * 100 * 3 >> 2) % 100 > 0) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: d (int) int
   public static int method_125(int var0) {
      return var0 * 3 >> 2;
   }

   // $FF: renamed from: b (int, int, int, int, int, int, int, int) void
   public static void method_126(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = method_125(var6 - field_226[0]);
      int var9 = method_125(var7 - field_226[1]);
      method_132(field_26, field_29[var0], var1, var2, var3, var4, var5, var8, var9, 3, true);
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int, int, int) void
   public static void method_127(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = method_125(var6 - field_226[0]);
      int var10 = method_125(var7 - field_226[1]);
      method_132(field_26, field_29[var0], var1, var2, var3, var4, var5, var9, var10, var8, true);
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   public static void method_128(int var0, int var1, int var2, int var3, int var4) {
      if (field_29[var0] != null) {
         int var5 = method_125(var2 - field_226[0]);
         int var6 = method_125(var3 - field_226[1]);
         method_132(field_26, field_29[var0], 0, 0, field_29[var0].getWidth(), field_29[var0].getHeight(), var1, var5, var6, var4, true);
      }
   }

   // $FF: renamed from: c (int, int, int, int, int, int, int, int) void
   public static void method_129(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = method_125(var6 - field_226[0]);
      int var9 = method_125(var7 - field_226[1]);
      method_132(field_26, field_29[var0], var1, var2, var3, var4, var5, var8, var9, 20, true);
   }

   // $FF: renamed from: b (int, int, int, int, int) void
   public static void method_130(int var0, int var1, int var2, int var3, int var4) {
      method_131(var0, var1, var2, var3, var4, 3);
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public static void method_131(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var3 >= 0) {
         if (field_207[var2].length != 0) {
            var3 %= field_207[var2].length;
            int var6 = field_207[var2][var3][0];
            int var7 = field_207[var2][var3][1];
            int var8 = field_207[var2][var3][2];
            int var9 = field_207[var2][var3][3];
            int var10 = 0;
            if (field_207[var2][var3].length > 4) {
               var10 = field_207[var2][var3][4];
            }

            int var11 = method_125(var0 - field_226[0]);
            int var12 = method_125(var1 - field_226[1]);
            method_132(field_26, field_29[var2], var6, var7, var8, var9, var4, var11, var12 + var10, var5, true);
         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, javax.microedition.lcdui.Image, int, int, int, int, int, int, int, int, boolean) void
   public static void method_132(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      try {
         if (var1 != null) {
            if (var10) {
               var8 += field_23;
            } else {
               var8 += field_20;
            }

            var0.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      } catch (Exception var12) {
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Image[]) void
   private static void method_133(Image[] var0) {
      synchronized(var0) {
         int var2 = 0;

         while(true) {
            if (var2 >= var0.length) {
               break;
            }

            var0[var2] = null;
            ++var2;
         }
      }

      System.gc();
   }

   // $FF: renamed from: a (java.lang.String) javax.microedition.lcdui.Image
   private static Image method_134(String var0) {
      try {
         return Image.createImage(var0);
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: renamed from: c (int) void
   public final void method_135(int var1) {
      switch (var1) {
         case 2:
            ++this.field_111;
            this.field_36.method_386(7, 1);
            return;
         case 3:
            this.field_103 = 1200;
            this.field_88 = 3072;
            this.field_89 = 24;
            return;
         case 4:
            this.field_104 = 1;
            return;
         case 5:
            this.field_101 = 1200;
            this.field_36.method_380(6, -1);
            return;
         case 6:
            this.field_106 += 10;
         default:
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int) int
   public static int method_136(int var0, int var1, int var2, int var3, int var4, int var5) {
      return method_137(method_102(), method_103() - 12, field_95[0], field_95[1] - 12, 12, 12, var0, var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int, int, int, int, int, int) int
   public static int method_137(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (!field_125 && !field_128) {
         if (var3 + var5 <= var9 - var11 && var1 + var5 >= var7 - var11 && var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10) {
            return var0 + var4 > var6 - var10 && var0 - var4 < var6 + var10 ? 0 : -1;
         } else if (var2 + var4 <= var8 - var10 && var0 + var4 >= var6 - var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11) {
            return 1;
         } else if (var2 - var4 >= var8 + var10 && var0 - var4 <= var6 + var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11) {
            return 2;
         } else if (var3 - var5 >= var9 + var11 && var1 - var5 <= var7 + var11 && var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10) {
            return 3;
         } else {
            return var0 + var4 >= var6 - var10 && var0 - var4 <= var6 + var10 && var1 + var5 >= var7 - var11 && var1 - var5 <= var7 + var11 ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: b (int, int) void
   public final void method_138(int var1, int var2) {
      this.field_284 = var2;
      this.field_285 = var1;
   }

   // $FF: renamed from: C () void
   public final void method_139() {
      this.field_133[3] = true;
      if (field_116[5] < 0) {
         field_116[5] = 0;
      }

   }

   // $FF: renamed from: b (int, int, int, int, int, int) int
   public static int method_140(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (!field_125 && !field_128) {
         int var6 = (540 - field_100) % 360;
         if (0 > var6) {
            var6 = 0;
         }

         byte var7 = 12;
         if (!field_124 && !field_126) {
            var7 = 18;
         }

         int var8 = method_5(var6) * var7 / 100;
         int var9 = -method_6(var6) * var7 / 100;
         int var10 = method_102() + var8;
         int var11 = method_103() + var9;
         int var12 = field_95[0] + var8;
         int var13 = field_95[1] + var9;
         if (var13 + var7 <= var3 - var5 && var11 + var7 >= var1 - var5 && var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4) {
            return 0;
         } else if (var12 + 12 <= var2 - var4 && var10 + 12 >= var0 - var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5) {
            return 1;
         } else if (var12 - 12 >= var2 + var4 && var10 - 12 <= var0 + var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5) {
            return 2;
         } else if (var13 - var7 >= var3 + var5 && var11 - var7 <= var1 + var5 && var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4) {
            return 3;
         } else {
            return var10 + 12 >= var0 - var4 && var10 - 12 <= var0 + var4 && var11 + var7 >= var1 - var5 && var11 - var7 <= var1 + var5 ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: c (int, int, int, int, int, int) int
   public static int method_141(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (!field_125 && !field_128) {
         byte var6 = 12;
         if (!field_124) {
            var6 = 16;
         }

         int var8 = -var6;
         int var9 = method_102() + 0;
         int var10 = method_103() + var8;
         int var11 = field_95[0] + 0;
         int var12 = field_95[1] + var8;
         if (var12 + var6 <= var3 - var5 && var10 + var6 >= var1 - var5 && var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4) {
            return 0;
         } else if (var11 + 12 <= var2 - var4 && var9 + 12 >= var0 - var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5) {
            return 1;
         } else if (var11 - 12 >= var2 + var4 && var9 - 12 <= var0 + var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5) {
            return 2;
         } else if (var12 - var6 >= var3 + var5 && var10 - var6 <= var1 + var5 && var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4) {
            return 3;
         } else {
            return var9 + 12 >= var0 - var4 && var9 - 12 <= var0 + var4 && var10 + var6 >= var1 - var5 && var10 - var6 <= var1 + var5 ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: e (boolean) void
   private void method_142(boolean var1) {
      if (var1) {
         this.field_111 = 3;
         this.field_107 = 0;
         this.field_110 = 0;
         this.method_42();
         this.field_112 = 0;
         this.field_113 = 0;
         this.field_114 = 0;
         this.field_115 = 0;
         this.field_281 = false;
      } else {
         for(int var2 = 0; var2 < field_10.length; ++var2) {
            if (field_10[var2] < this.field_107) {
               this.field_220 = 9;
               this.field_249 = true;
               return;
            }
         }

         this.field_220 = 1;
         this.field_249 = true;
         this.field_250 = 10;
         this.method_161(false);
      }
   }

   // $FF: renamed from: a (java.lang.String) java.util.Vector
   public static Vector method_143(String var0) {
      int var1 = 0;
      Vector var2 = new Vector();

      while(var1 < var0.length()) {
         String var3 = var0.substring(var1);
         int var4 = 0;
         int var5 = 0;

         while(method_145(var3, var4) < field_21 - 0) {
            var5 = var4;
            if ((var4 = method_144(var3, var4 + 1)) == -1) {
               var4 = var3.length();
               if (var5 == 0) {
                  break;
               }

               if (method_145(var3, var4) < field_21 - 0) {
                  var5 = 0;
                  break;
               }
            } else if (var3.charAt(var4) == '~') {
               var5 = 0;
               break;
            }
         }

         if (var5 == 0) {
            var2.addElement(var3.substring(0, var4));
            var1 += var4 + 1;
         } else {
            var2.addElement(var3.substring(0, var5));
            var1 += var5 + 1;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, int) int
   private static int method_144(String var0, int var1) {
      while(true) {
         if (var1 < var0.length()) {
            char var2;
            if ((var2 = var0.charAt(var1)) != ' ' && var2 != '~') {
               ++var1;
               continue;
            }

            return var1;
         }

         return -1;
      }
   }

   // $FF: renamed from: b (java.lang.String, int) int
   private static int method_145(String var0, int var1) {
      return field_75.substringWidth(var0, 0, var1);
   }

   // $FF: renamed from: D () void
   public final void method_146() {
      this.field_249 = true;

      int var1;
      for(var1 = 0; var1 < 10; ++var1) {
         if (this.field_12[var1]) {
            if (this.field_30[var1]) {
               this.field_30[var1] = false;
            } else {
               this.field_12[var1] = false;
            }
         } else {
            this.field_12[var1] = this.field_30[var1];
         }
      }

      if (this.field_70) {
         this.field_70 = false;
      }

      this.field_68 = (byte)((this.field_68 + 1) % 24);
      switch (this.field_66) {
         case 0:
            ++this.field_295;
            if (this.field_295 > 150) {
               this.field_295 = 0;
               this.field_66 = 11;
               this.field_201 = true;
            }
            break;
         case 1:
            ++this.field_295;
            if (this.field_295 > 150) {
               this.field_295 = 0;
               this.method_161(false);
            }
            break;
         case 2:
            if (this.field_30[4]) {
               ++this.field_296[2];
               if (this.field_296[2] >= 5) {
                  this.field_296[2] = 0;
               }

               this.method_162();
            } else if (this.field_30[3]) {
               --this.field_296[2];
               if (this.field_296[2] < 0) {
                  this.field_296[2] = 4;
               }

               this.method_162();
            } else if (this.field_30[0]) {
               this.method_14();
               this.method_161(false);
               this.method_164(0);
            }
            break;
         case 3:
            if (this.field_313) {
               if (this.field_67 < 12) {
                  ++this.field_295;
                  if (this.field_295 > 10) {
                     ++this.field_67;
                  }
               } else {
                  this.field_295 = (byte)((this.field_295 + 1) % 10);
               }
            }

            for(var1 = 0; var1 < this.field_30.length; ++var1) {
               if (this.field_30[var1]) {
                  this.field_66 = 4;
                  this.field_69 = 0;
                  this.field_67 = 6;
                  this.method_156(11 + this.field_69);
                  this.method_164(2);
               }
            }

            if (this.field_30[6]) {
               this.field_66 = 14;
               this.field_69 = 1;
            }
            break;
         case 4:
            if (this.field_313) {
               this.field_295 = (byte)((this.field_295 + 1) % 5);
            }

            if (this.field_30[4]) {
               ++this.field_69;
               if (this.field_69 == 6) {
                  this.field_69 = (byte)(this.field_69 + 2);
               }

               if (this.field_299 && this.field_69 == 9 || !this.field_299 && this.field_69 == 8) {
                  this.field_69 = 0;
               }

               this.method_156(11 + this.field_69);
            }

            if (this.field_30[3]) {
               --this.field_69;
               if (this.field_69 < 0) {
                  if (this.field_299) {
                     this.field_69 = 8;
                  } else {
                     this.field_69 = 7;
                  }
               }

               if (this.field_69 == 7) {
                  this.field_69 = (byte)(this.field_69 - 2);
               }

               this.method_156(11 + this.field_69);
               this.method_156(11 + this.field_69);
            }

            if (this.field_30[0]) {
               if (this.field_69 == 0) {
                  this.field_69 = 0;
                  this.method_17();
                  if (this.field_242 == 0 && this.field_243 == 9) {
                     this.method_11();
                     this.field_201 = true;
                     this.field_111 = 3;
                     if (this.field_299) {
                        this.field_40 = this.field_301;
                     } else {
                        this.field_40 = 0;
                     }

                     this.field_107 = 0;
                     if (this.field_305 <= 0) {
                        this.field_242 = 0;
                        this.field_224 = 0;
                     }

                     this.field_223 = 0;
                     this.field_221 = field_216[this.field_223][this.field_224];
                     this.field_222 = field_217[this.field_223][this.field_224];
                     this.field_202 = true;
                     this.method_42();
                     return;
                  }

                  this.method_164(1);
                  this.field_69 = 1;
                  this.method_156(50 + this.field_69);
                  this.field_66 = 9;
                  return;
               }

               if (this.field_69 == 1) {
                  this.field_69 = 1;
                  this.method_11();
                  this.field_223 = 0;
                  this.field_224 = 0;
                  this.field_221 = field_216[this.field_223][this.field_224];
                  this.field_222 = field_217[this.field_223][this.field_224];
                  this.field_201 = true;
                  this.field_220 = 3;
                  this.field_249 = true;
                  this.field_250 = 10;
                  method_133(field_13);
                  return;
               }

               if (this.field_69 == 2) {
                  this.field_69 = 0;
                  this.field_73 = 0;
                  this.field_66 = 10;
                  this.field_72 = new Vector();
                  this.field_70 = true;
                  this.field_74 = false;
                  field_75 = Font.getFont(0, 0, 0);
                  this.method_164(1);
               } else if (this.field_69 == 3) {
                  this.field_66 = 5;
                  this.method_164(1);
                  this.field_73 = 0;
               } else if (this.field_69 == 4) {
                  this.field_69 = 0;
                  this.field_66 = 8;
                  this.method_156(52 + this.field_69);
                  this.method_164(1);
                  this.field_70 = true;
               } else if (this.field_69 == 5) {
                  this.field_69 = 0;
                  this.field_73 = 0;
                  this.field_74 = false;
                  this.field_66 = 12;
                  this.field_70 = true;
                  this.method_164(1);
               } else if (this.field_69 == 8) {
                  this.field_69 = 0;
                  this.field_66 = 13;
                  this.field_301 = this.field_40;
                  this.field_70 = true;
                  this.method_164(1);
               }
            }

            if (this.field_30[6]) {
               this.method_164(0);
               this.field_66 = 3;
               this.field_36.method_380(9, 1);
               return;
            }

            this.method_157();
            break;
         case 5:
            if (this.field_30[6]) {
               this.field_69 = 3;
               this.field_66 = 4;
               this.method_164(2);
               this.method_156(11 + this.field_69);
            } else if (this.field_30[9]) {
               this.field_69 = 1;
               this.field_66 = 6;
            }

            if (this.field_30[2] && this.field_73 > 0) {
               --this.field_73;
               this.field_70 = true;
            }

            if (this.field_30[1] && this.field_74) {
               ++this.field_73;
               this.field_70 = true;
            }
            break;
         case 6:
            if (this.field_30[6]) {
               this.field_66 = 5;
            } else if (!this.field_30[2] && !this.field_30[1]) {
               if (this.field_30[0]) {
                  this.field_66 = 5;
                  if (this.field_69 == 0) {
                     field_10 = new int[5];
                     field_11 = new int[5];
                     field_9 = new String[]{"   ", "   ", "   ", "   ", "   "};
                     this.method_18();
                     this.field_66 = 7;
                  }
               }
            } else {
               this.field_69 = (byte)((this.field_69 + 1) % 2);
            }
            break;
         case 7:
            if (this.field_30[6] || this.field_30[0]) {
               this.field_66 = 5;
            }
            break;
         case 8:
            if (!this.field_30[6] && !this.field_30[0]) {
               if (this.field_30[2]) {
                  --this.field_69;
                  if (this.field_69 < 0) {
                     this.field_69 = 2;
                  }

                  this.method_156(52 + this.field_69);
                  this.field_70 = true;
               } else if (this.field_30[1]) {
                  this.field_69 = (byte)((this.field_69 + 1) % 3);
                  this.method_156(52 + this.field_69);
                  this.field_70 = true;
               } else if (this.field_30[4]) {
                  if (this.field_69 == 0) {
                     this.field_296[0] = (byte)((this.field_296[0] + 1) % 3);
                  } else if (this.field_69 == 1) {
                     this.field_296[1] = (byte)((this.field_296[1] + 1) % 2);
                     this.field_36.method_379(this.field_296[1]);
                  } else {
                     this.field_296[2] = (byte)((this.field_296[2] + 1) % 5);
                     this.method_162();
                     this.method_156(52 + this.field_69);
                     this.field_31[1] = this.field_63[59];
                  }

                  this.field_70 = true;
               } else if (this.field_30[3]) {
                  --this.field_296[this.field_69];
                  if (this.field_296[this.field_69] < 0) {
                     if (this.field_69 == 0) {
                        this.field_296[0] = 2;
                     } else if (this.field_69 == 1) {
                        this.field_296[1] = 1;
                        this.field_36.method_379(1);
                     } else {
                        this.field_296[2] = 4;
                     }
                  } else if (this.field_69 == 1) {
                     this.field_36.method_379(0);
                  }

                  if (this.field_69 == 2) {
                     this.method_162();
                     this.method_156(52 + this.field_69);
                     this.field_31[1] = this.field_63[59];
                  }

                  this.field_70 = true;
               }
            } else {
               this.field_66 = 4;
               this.method_164(2);
               this.field_69 = 4;
               this.method_156(11 + this.field_69);
               this.method_14();
            }

            this.method_157();
            break;
         case 9:
            if (this.field_30[6]) {
               this.field_66 = 4;
               this.field_69 = 0;
               this.method_156(11 + this.field_69);
               this.method_164(2);
            } else if (!this.field_30[2] && !this.field_30[1]) {
               if (this.field_30[0]) {
                  if (this.field_69 == 0) {
                     this.method_11();
                     this.field_201 = true;
                     method_133(field_13);
                     this.field_111 = 3;
                     if (this.field_299) {
                        this.field_40 = this.field_301;
                     } else {
                        this.field_40 = 0;
                     }

                     this.field_107 = 0;
                     this.field_242 = 0;
                     this.field_223 = 0;
                     this.field_224 = 0;
                     this.field_221 = field_216[this.field_223][this.field_224];
                     this.field_222 = field_217[this.field_223][this.field_224];
                     this.field_202 = true;
                     this.method_42();
                  } else if (this.field_69 == 1) {
                     this.method_11();
                     this.field_201 = true;
                     method_133(field_13);
                     this.field_111 = this.field_244;
                     this.field_107 = this.field_245;
                     this.field_223 = this.field_242 / 3;
                     this.field_224 = this.field_242 % 3;
                     this.field_221 = field_216[this.field_223][this.field_224];
                     this.field_222 = field_217[this.field_223][this.field_224];
                     this.field_202 = true;
                     this.method_42();
                  }
               }
            } else {
               this.field_69 = (byte)((this.field_69 + 1) % 2);
               this.method_156(50 + this.field_69);
            }

            this.method_157();
            break;
         case 10:
            if (this.field_30[4] && this.field_69 < 25) {
               ++this.field_69;
               if (this.field_69 == 23 || this.field_69 == 24) {
                  this.field_69 = 25;
               }

               this.field_73 = 0;
               this.field_70 = true;
            }

            if (this.field_30[3] && this.field_69 > 0) {
               --this.field_69;
               if (this.field_69 == 23 || this.field_69 == 24) {
                  this.field_69 = 22;
               }

               this.field_73 = 0;
               this.field_70 = true;
            }

            if (this.field_30[2] && this.field_73 > 0) {
               --this.field_73;
               this.field_70 = true;
            }

            if (this.field_30[1] && this.field_74) {
               ++this.field_73;
               this.field_70 = true;
            }

            if (this.field_30[6]) {
               this.field_69 = 2;
               this.field_66 = 4;
               this.method_164(2);
            }

            this.field_72 = method_143(this.field_64[1 + this.field_69 * 2]);
            break;
         case 11:
            ++this.field_295;
            if (this.field_295 > 150) {
               this.field_295 = 0;
               this.field_66 = 1;
               this.field_201 = true;
            }
            break;
         case 12:
            if (this.field_30[4] && this.field_69 < 5) {
               this.field_73 = 0;
               ++this.field_69;
               this.field_70 = true;
            }

            if (this.field_30[3] && this.field_69 > 0) {
               this.field_73 = 0;
               --this.field_69;
               this.field_70 = true;
            }

            if (this.field_30[2] && this.field_73 > 0) {
               --this.field_73;
               this.field_70 = true;
            }

            if (this.field_30[1] && this.field_74) {
               ++this.field_73;
               this.field_70 = true;
            }

            if (this.field_30[6]) {
               this.field_69 = 5;
               this.field_66 = 4;
               this.method_164(2);
            }
            break;
         case 13:
            if (!this.field_30[6] && !this.field_30[0]) {
               if (this.field_30[2]) {
                  --this.field_69;
                  if (this.field_69 < 0) {
                     this.field_69 = 5;
                  }

                  this.field_70 = true;
               } else if (this.field_30[1]) {
                  this.field_69 = (byte)((this.field_69 + 1) % 6);
                  this.field_70 = true;
               } else if (this.field_30[4]) {
                  if (this.field_69 == 0) {
                     this.field_298[0] = !this.field_298[0];
                  } else if (this.field_69 == 1) {
                     this.field_298[2] = !this.field_298[2];
                  } else if (this.field_69 == 2) {
                     ++this.field_301;
                     if (this.field_301 > 6) {
                        this.field_301 = 0;
                     }
                  } else if (this.field_69 == 3) {
                     this.field_298[1] = !this.field_298[1];
                  } else if (this.field_69 == 4) {
                     this.field_298[3] = !this.field_298[3];
                  } else {
                     this.field_298[4] = !this.field_298[4];
                  }

                  this.field_70 = true;
               } else if (this.field_30[3]) {
                  if (this.field_69 == 0) {
                     this.field_298[0] = !this.field_298[0];
                  } else if (this.field_69 == 1) {
                     this.field_298[2] = !this.field_298[2];
                  } else if (this.field_69 == 2) {
                     --this.field_301;
                     if (this.field_301 < 0) {
                        this.field_301 = 6;
                     }
                  } else if (this.field_69 == 3) {
                     this.field_298[1] = !this.field_298[1];
                  } else if (this.field_69 == 4) {
                     this.field_298[3] = !this.field_298[3];
                  } else {
                     this.field_298[4] = !this.field_298[4];
                  }

                  this.field_70 = true;
               }
            } else {
               this.field_66 = 4;
               this.method_164(2);
               this.field_69 = 8;
               this.method_156(11 + this.field_69);
            }
            break;
         case 14:
            this.field_249 = true;
            this.field_69 = (byte)(this.field_69 % 2);
            if (!this.field_30[2] && !this.field_30[1]) {
               if (this.field_30[0]) {
                  if (this.field_69 == 0) {
                     this.field_304.notifyDestroyed();
                  } else {
                     this.field_66 = 3;
                     this.field_36.method_380(9, 1);
                  }
               } else if (this.field_30[6]) {
                  this.field_66 = 3;
                  this.field_36.method_380(9, 1);
               }
            } else {
               this.field_69 = (byte)((this.field_69 + 1) % 2);
            }
      }

      this.field_30[5] = false;
      this.field_30[6] = false;
   }

   // $FF: renamed from: E () void
   public final void method_147() {
      int var1;
      int var2;
      int var4;
      int var5;
      int var6;
      int var7;
      int var13;
      switch (this.field_66) {
         case 0:
            field_26.setColor(16777215);
            field_26.fillRect(0, 0, field_18, field_16);
            field_26.drawImage(field_13[0], field_18 >> 1, field_20 + (field_19 >> 1), 3);
            if (this.field_295 < 30) {
               var6 = field_18 * this.field_295 / 30;
               field_26.fillRect(var6 - field_18 - 10, field_23, field_18, field_22);
               field_26.fillRect(var6 + 10, field_23, field_18, field_22);
               var7 = var6 - 11;
               field_26.drawLine(var7 + 2, 0, var7 + 2, field_16);
               field_26.drawLine(var7 + 3, 0, var7 + 3, field_16);
               field_26.drawLine(var7 + 5, 0, var7 + 5, field_16);
               field_26.drawLine(var7 + 8, 0, var7 + 8, field_16);
               var7 = var6 + 10;
               field_26.drawLine(var7 - 2, 0, var7 - 2, field_16);
               field_26.drawLine(var7 - 3, 0, var7 - 3, field_16);
               field_26.drawLine(var7 - 5, 0, var7 - 5, field_16);
               field_26.drawLine(var7 - 8, 0, var7 - 8, field_16);
               return;
            }
            break;
         case 1:
            field_26.setColor(0);
            field_26.fillRect(0, 0, field_18, field_16);
            field_26.drawImage(field_13[1], field_18 >> 1, field_20 + (field_19 >> 1), 3);
            return;
         case 2:
            field_26.setColor(0);
            field_26.fillRect(0, field_20, field_18, field_19);
            this.method_155();
            field_26.setColor(16777215);
            String var19 = this.field_63[this.field_39[2][this.field_296[2]]];
            var2 = field_14.stringWidth(var19);
            var1 = field_20 + (field_19 >> 1);
            field_26.drawString(var19, field_18 >> 1, var1, 65);
            field_26.drawImage(field_13[1], (field_18 >> 1) + (var2 >> 1) + 5, var1, 36);
            field_26.drawImage(field_13[2], (field_18 >> 1) - (var2 >> 1) - 5, var1, 40);
            return;
         case 3:
            this.method_160(true, false);
            this.method_150();
            this.method_155();
            var1 = field_23 + field_22;
            this.method_154(this.field_63[0], field_18 >> 1, var1, 16777215, 0);
            return;
         case 4:
            this.method_160(true, false);
            this.method_150();
            this.method_155();
            var1 = field_23 + field_22;
            if (this.field_305 > 0) {
               this.field_63[2] = this.field_63[70];
            }

            this.method_154(this.field_63[2 + this.field_69], field_18 >> 1, var1, 16777215, 16386570);
            field_26.drawImage(field_13[1], field_18 - 5, var1 + (field_15 >> 1), 6);
            field_26.drawImage(field_13[2], 2, var1 + (field_15 >> 1), 6);
            this.method_158(this.field_65, true);
            return;
         case 5:
            var7 = field_15;
            this.method_160(true, true);
            this.method_155();
            field_26.setColor(16777215);
            boolean var18 = false;
            this.field_74 = false;

            for(int var8 = this.field_73; var8 < 5; ++var8) {
               if (field_20 + 42 + var7 * (var8 - this.field_73) + field_15 < field_23 + field_22) {
                  field_26.drawString("" + (var8 + 1) + " " + field_9[var8] + " " + field_10[var8], 6, field_20 + 42 + var7 * (var8 - this.field_73), 20);
                  field_26.drawString(this.field_63[31 + field_11[var8]], field_18 - 6, field_20 + 42 + var7 * (var8 - this.field_73), 24);
               } else {
                  this.field_74 = true;
               }
            }

            if (this.field_73 > 0) {
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[3], field_18 >> 1, 0, 17, true);
            }

            if (this.field_74) {
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[1], (field_18 >> 1) + 10, 1, 17, true);
            }

            var1 = field_23 + field_22;
            this.method_158(this.field_63[5], false);
            this.method_154(this.field_63[20], field_18 >> 1, var1, 16777215, 0);
            return;
         case 6:
            this.method_160(true, true);
            this.method_155();
            field_26.setColor(16777215);
            this.method_158(this.field_63[21], false);
            this.method_148(this.field_63[24], 2, 0, this.field_69 == 0);
            this.method_148(this.field_63[25], 2, 1, this.field_69 == 1);
            return;
         case 7:
            this.method_160(true, true);
            this.method_155();
            field_26.setColor(16777215);
            field_26.drawString(this.field_63[26], field_18 >> 1, field_20 + (field_19 >> 1) - 25, 17);
            field_26.drawString(this.field_63[27], field_18 >> 1, field_20 + (field_19 >> 1) + 2, 17);
            return;
         case 8:
            this.method_160(true, true);
            field_26.setColor(16777215);
            int[] var9 = new int[3];
            int var10 = field_13[1].getWidth();
            field_13[2].getWidth();
            int var12 = field_17 - var10;
            if (this.field_296[1] > 1) {
               this.field_296[1] = 1;
            }

            for(var13 = 0; var13 < this.field_39.length; ++var13) {
               var9[var13] = field_14.stringWidth(this.field_63[this.field_39[var13][this.field_296[var13]]]);
               field_26.drawString(this.field_63[28 + var13], 11, field_23 + 4 + var13 * 22, 20);
               field_26.drawString(this.field_63[this.field_39[var13][this.field_296[var13]]], var12, field_23 + 4 + var13 * 22, 24);
            }

            field_26.drawImage(field_13[1], var12 + var10, field_23 + this.field_69 * 22 + 4 + (field_15 >> 1), 10);
            field_14.stringWidth(this.field_63[this.field_39[this.field_69][this.field_296[this.field_69]]]);
            field_26.drawImage(field_13[2], var12 - var9[this.field_69], field_23 + this.field_69 * 22 + 4 + (field_15 >> 1), 10);
            this.method_155();
            this.method_159();
            this.method_158(this.field_63[6], false);
            return;
         case 9:
            this.method_160(true, true);
            this.method_155();
            field_26.setColor(16777215);
            this.method_148(this.field_63[47], 2, 0, this.field_69 == 0);
            this.method_148(this.field_63[48], 2, 1, this.field_69 == 1);
            field_14.stringWidth(this.field_63[47 + this.field_69]);
            this.method_159();
            return;
         case 10:
            field_26.setFont(field_75);
            int var15 = field_26.getFont().getHeight();
            this.method_160(true, true);
            this.method_155();
            int var16 = field_20 + 42;
            var4 = field_22 + field_23 - var15;
            var5 = this.field_73;
            field_26.setColor(16777215);

            while(var16 < var4 && var5 < this.field_72.size()) {
               field_26.drawString((String)this.field_72.elementAt(var5), field_18 >> 1, var16, 17);
               var16 += var15;
               ++var5;
            }

            if (var5 < this.field_72.size()) {
               this.field_74 = true;
               int var17 = field_22;
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[1], field_18 >> 1, var17, 33, true);
            } else {
               this.field_74 = false;
            }

            if (this.field_73 > 0) {
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[3], field_18 >> 1, 0, 17, true);
            }

            this.method_158(this.field_64[this.field_69 * 2], false);
            this.method_149(24);
            return;
         case 11:
            field_26.setColor(16777215);
            field_26.fillRect(0, 0, field_17, field_16);
            field_26.drawImage(field_13[2], 0, 0, 20);
            if (this.field_295 >= 120) {
               field_26.setColor(0);
               var6 = (this.field_295 - 120) * (field_18 >> 1) / 30;

               for(var7 = 0; var7 < var6 << 1; var7 += 2) {
                  field_26.drawLine(var7, 0, var7, field_16);
                  field_26.drawLine(field_18 - 1 - var7, 0, field_18 - 1 - var7, field_16);
               }
            }
            break;
         case 12:
            var13 = field_15 + 2;
            this.method_160(true, true);
            this.method_155();
            switch (this.field_296[2]) {
               case 0:
               case 1:
               case 2:
                  this.field_64[55] = "Version 1.0.12";
                  break;
               case 3:
                  this.field_64[55] = "Versi\u00f3n 1.0.12";
                  break;
               case 4:
                  this.field_64[55] = "Versione 1.0.12";
            }

            var1 = field_23 + 3;
            var4 = field_22 + field_23 - var13;
            var5 = this.field_73;
            int var14;
            if ((var14 = this.field_69 * 7 + 52) + 6 >= this.field_64.length) {
               this.field_69 = 1;
            }

            if (this.field_69 >= 0) {
               field_26.setColor(16777215);

               while(var1 < var4 && var5 < 5) {
                  if (this.field_64[1 + var14 + var5] != null) {
                     field_26.drawString(this.field_64[1 + var14 + var5], field_18 >> 1, var1, 17);
                  }

                  var1 += var13;
                  ++var5;
               }
            }

            if (var5 < 5) {
               this.field_74 = true;
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[1], field_18 >> 1, field_22, 33, true);
            } else {
               this.field_74 = false;
            }

            if (this.field_73 > 0) {
               method_132(field_26, field_13[1], 0, 0, field_13[1].getWidth(), field_13[1].getHeight(), field_35[3], field_18 >> 1, 0, 17, true);
            }

            this.method_158(this.field_64[var14], false);
            this.method_149(6);
            return;
         case 13:
            this.method_160(true, true);
            field_26.setColor(16777215);
            field_26.drawString(this.field_63[81], 11, field_23 + 4 + 0, 20);
            field_26.drawString(this.field_63[this.field_298[0] ? 34 : 35], field_18 - 10, field_23 + 4 + 0, 24);
            field_26.drawString(this.field_63[83], 11, field_23 + 4 + 22, 20);
            field_26.drawString(this.field_63[this.field_298[2] ? 34 : 35], field_18 - 10, field_23 + 4 + 22, 24);
            field_26.drawString(this.field_63[84], 11, field_23 + 4 + 44, 20);
            field_26.drawString(String.valueOf(this.field_301), field_18 - 10, field_23 + 4 + 44, 24);
            field_26.drawString(this.field_63[82], 11, field_23 + 4 + 66, 20);
            field_26.drawString(this.field_63[this.field_298[1] ? 34 : 35], field_18 - 10, field_23 + 4 + 66, 24);
            field_26.drawString("COORDS", 11, field_23 + 4 + 88, 20);
            field_26.drawString(this.field_63[this.field_298[3] ? 34 : 35], field_18 - 10, field_23 + 4 + 88, 24);
            field_26.drawString("CAMERA", 11, field_23 + 4 + 110, 20);
            field_26.drawString(this.field_63[this.field_298[4] ? 34 : 35], field_18 - 10, field_23 + 4 + 110, 24);
            field_26.drawImage(field_13[1], field_18 - 8, field_23 + this.field_69 * 22 + 8, 20);
            var2 = field_14.stringWidth(this.field_63[35]);
            field_26.drawImage(field_13[2], field_18 - var2 - 12, field_23 + this.field_69 * 22 + 8, 24);
            this.method_155();
            this.method_158("CHEATS", false);
            return;
         case 14:
            this.method_160(true, true);
            this.method_155();
            this.method_158(this.field_63[85], false);
            this.method_148(this.field_63[24], 2, 0, this.field_69 == 0);
            this.method_148(this.field_63[25], 2, 1, this.field_69 == 1);
            return;
         case 15:
            field_26.setColor(16777215);
            field_26.fillRect(0, 0, field_17, field_16);
            field_26.drawImage(field_13[1], 0, 0, 20);
      }

   }

   // $FF: renamed from: a (java.lang.String, int, int, boolean) void
   public final void method_148(String var1, int var2, int var3, boolean var4) {
      Font var5;
      int var6 = (var5 = field_26.getFont()).stringWidth(var1);
      int var7;
      int var8 = (var7 = var5.getHeight()) + 2;
      int var9 = var2 * var8;
      int var10 = field_16 - var9 >> 1;
      int var11 = var3 * var8 + var10;
      this.method_154(var1, field_17 >> 1, var11, 16777215, 0);
      Image var12 = null;
      if (field_13 != null) {
         var12 = field_13[4];
      }

      if (var12 == null) {
         var12 = field_29[0];
      }

      if (var4) {
         int var13 = var12.getWidth() >> 1;
         int var14 = var12.getHeight() >> 2;
         int var15 = (this.field_68 >> 3) * var14;
         method_132(field_26, var12, 0, var15, var13, var14, field_35[0], (field_17 >> 1) - (var6 >> 1) - 15, var11 - field_20 + (var7 >> 1), 3, false);
         method_132(field_26, var12, 0, var15, var13, var14, field_35[0], (field_17 >> 1) + (var6 >> 1) + 15, var11 - field_20 + (var7 >> 1), 3, false);
      }

   }

   // $FF: renamed from: l (int) void
   private void method_149(int var1) {
      int var3;
      int var4 = (var3 = field_23 + field_22) + 1;
      int var6;
      int var7 = (var6 = field_18 - 30) / var1;
      field_26.setColor(2257915);
      field_26.fillRect(15, var3, var6, 7);
      field_26.setColor(410260);
      field_26.drawRect(14, var3, var6 + 1, 7);
      field_26.setColor(8506866);
      if (this.field_69 > 22) {
         int var8 = this.field_69 - 2;
         field_26.fillRect(15 + var8 * var6 / var1, var4, var7, 5);
      } else {
         field_26.fillRect(15 + this.field_69 * var6 / var1, var4, var7, 5);
      }

      field_26.drawImage(field_13[1], 15 + var6 + 6, var3, 20);
      field_26.drawImage(field_13[2], 7, var3, 20);
   }

   // $FF: renamed from: aw () void
   private void method_150() {
      method_132(field_26, field_13[0], field_320[0][0], field_320[0][1], field_320[0][2], field_320[0][3], field_35[0], field_18 >> 1, (field_19 >> 1) - 0, 3, false);
      int var1 = (10 - this.field_295) * 3;
      if (this.field_67 == 0) {
         method_132(field_26, field_13[0], field_320[1][0], field_320[1][1], field_320[1][2], field_320[1][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) + var1 - 0, 33, false);
      } else if (this.field_67 == 1) {
         method_132(field_26, field_13[0], field_320[2][0], field_320[2][1], field_320[2][2], field_320[2][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 33, false);
      } else if (this.field_67 == 2) {
         method_132(field_26, field_13[0], field_320[2][0], field_320[2][1], field_320[2][2], field_320[2][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 33, false);
         method_132(field_26, field_13[0], field_320[3][0], field_320[3][1], field_320[3][2], field_320[3][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 33, false);
      } else if (this.field_67 == 3) {
         method_132(field_26, field_13[0], field_320[4][0], field_320[4][1], field_320[4][2], field_320[4][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 33, false);
      } else if (this.field_67 == 4) {
         method_132(field_26, field_13[0], field_320[5][0], field_320[5][1], field_320[5][2], field_320[5][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 33, false);
      } else if (this.field_67 == 5) {
         method_132(field_26, field_13[0], field_320[6][0], field_320[6][1], field_320[6][2], field_320[6][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 40, false);
         method_132(field_26, field_13[0], field_320[7][0], field_320[7][1], field_320[7][2], field_320[7][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 36, false);
      } else {
         method_132(field_26, field_13[0], field_320[8][0], field_320[8][1], field_320[8][2], field_320[8][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 40, false);
         method_132(field_26, field_13[0], field_320[9][0], field_320[9][1], field_320[9][2], field_320[9][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 36, false);
         if ((this.field_295 >> 1 & 1) == 0) {
            method_132(field_26, field_13[0], field_320[10][0], field_320[10][1], field_320[10][2], field_320[10][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 36, false);
         } else {
            method_132(field_26, field_13[0], field_320[11][0], field_320[11][1], field_320[11][2], field_320[11][3], field_35[0], (field_18 >> 1) + 10, (field_19 >> 1) - 0, 36, false);
         }
      }

      method_132(field_26, field_13[0], field_320[12][0], field_320[12][1], field_320[12][2], field_320[12][3], field_35[0], field_18 >> 1, (field_19 >> 1) - 1 - 0, 17, false);
   }

   // $FF: renamed from: b (int, int, int, int) void
   public static void method_151(int var0, int var1, int var2, int var3) {
      field_26.setClip(var0, var1, var2, var3);
      int var4 = field_26.getColor();
      boolean var5 = false;

      for(int var6 = 0; var6 < var3; ++var6) {
         int var7;
         int var8;
         if ((var7 = var6 + var1) == 0) {
            var8 = 8506866;
         } else if (var7 % 3 == 0) {
            var8 = 1858252;
         } else {
            var8 = 2257915;
         }

         field_26.setColor(var8);
         field_26.drawLine(var0, var7, var0 + var2, var7);
      }

      if (var0 == 0) {
         field_26.setColor(2257915);
         field_26.drawRect(var0, var1, 1, var3);
      }

      field_26.setColor(var4);
      field_26.setClip(0, 0, field_17, field_16);
   }

   // $FF: renamed from: F () void
   public static void method_152() {
      if (field_28[8] != null) {
         field_26.drawImage(field_28[8], field_18 - 2, field_23 + field_22 + 2, 24);
      }

   }

   // $FF: renamed from: a (java.lang.String, int, int, int, int, int) void
   public static void method_153(String var0, int var1, int var2, int var3, int var4, int var5) {
      field_26.setColor(var4);
      field_26.drawString(var0, var1 - 1, var2, var5);
      field_26.drawString(var0, var1 + 1, var2, var5);
      field_26.drawString(var0, var1, var2 + 1, var5);
      field_26.drawString(var0, var1, var2 - 1, var5);
      field_26.setColor(var3);
      field_26.drawString(var0, var1, var2, var5);
   }

   // $FF: renamed from: a (java.lang.String, int, int, int, int) void
   public final void method_154(String var1, int var2, int var3, int var4, int var5) {
      method_153(var1, var2, var3, var4, var5, 17);
   }

   // $FF: renamed from: G () void
   public final void method_155() {
      method_151(0, 0, field_18, field_23);
      method_151(0, field_23 + field_22, field_18, field_23);
   }

   // $FF: renamed from: m (int) void
   private void method_156(int var1) {
      this.field_65 = this.field_63[var1];
      this.field_62 = 0;
   }

   // $FF: renamed from: ax () void
   private void method_157() {
      int var1 = field_14.stringWidth(this.field_65) + 218;
      this.field_62 = (this.field_62 + 1) % var1;
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public final void method_158(String var1, boolean var2) {
      int var3;
      if ((var3 = (field_23 >> 1) - (field_15 >> 1)) < 2) {
         var3 = 2;
      }

      if (!var2) {
         method_153(var1, field_18 >> 1, var3, 16777215, 0, 17);
      } else {
         method_153(var1, field_18 - this.field_62, var3, 16777215, 0, 20);
      }
   }

   // $FF: renamed from: ay () void
   private void method_159() {
      int var1 = field_23 + field_22 + 2;
      method_153(this.field_65, field_18 - this.field_62, var1, 16777215, 0, 20);
   }

   // $FF: renamed from: a (boolean, boolean) void
   private void method_160(boolean var1, boolean var2) {
      class_0.method_0(0, 0);
      class_0.method_1(field_26, this.field_32 * 5, 120, var1);
      if (var2) {
         field_26.setColor(0);

         for(int var3 = 0; var3 < field_22; var3 += 2) {
            field_26.drawLine(0, field_23 + var3, field_18, field_23 + var3);
         }
      }

      ++this.field_32;
   }

   // $FF: renamed from: d (boolean) void
   public final void method_161(boolean var1) {
      method_133(field_29);
      this.method_164(3);
      if (var1) {
         field_13[0] = method_134("/t_license1.png");
         field_13[1] = method_134("/t_license2.png");
         field_13[2] = method_134("/ifone.png");
         this.field_66 = 0;
      } else {
         method_133(field_13);
         field_13[0] = method_134("/t_title.png");
         field_13[1] = method_134("/t_cur1.png");
         field_13[2] = method_134("/t_cur2.png");
         field_13[4] = method_134("/ring.png");
         if (this.field_71) {
            this.field_71 = false;
            this.field_66 = 2;
            return;
         }

         method_163();
         this.method_162();
         this.field_66 = 3;
         this.method_164(0);
         this.field_36.method_380(9, 1);
      }

      this.field_295 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         this.field_12[var2] = false;
      }

      this.field_68 = 0;
   }

   // $FF: renamed from: az () void
   private void method_162() {
      int var1 = 0;

      try {
         InputStream var2 = method_49("/lang_" + this.field_296[2] + ".txt");
         ByteArrayOutputStream var3 = new ByteArrayOutputStream(300);
         byte[] var4 = new byte[1];

         while(var2.read(var4) > 0) {
            if (var4[0] == 13) {
               var2.read(var4);
               this.field_63[var1] = new String(var3.toByteArray(), "UTF-8");
               var3.reset();
               ++var1;
            } else {
               var3.write(var4);
            }
         }

         method_51();
         var3.close();
         var2 = method_49("/manual_" + this.field_296[2] + ".txt");
         var3 = new ByteArrayOutputStream(300);
         var1 = 0;

         while(var2.read(var4) > 0) {
            if (var4[0] == 13) {
               var2.read(var4);
               this.field_64[var1] = new String(var3.toByteArray(), "UTF-8");
               var3.reset();
               ++var1;
            } else {
               var3.write(var4);
            }
         }

         method_51();
         var3.close();
      } catch (Exception var5) {
      }
   }

   // $FF: renamed from: aA () void
   private static void method_163() {
      field_28[10] = method_134("/Systxt.png");
      field_28[13] = method_134("/Systxt2.png");
      field_28[11] = method_134("/windou_time.png");
      field_28[12] = method_134("/windou_suuji.png");
      field_28[14] = method_134("/gameover.png");
      field_28[15] = method_134("/timeover.png");
      field_28[1] = method_134("/windou_ring.png");
      field_28[2] = method_134("/windou_zanki.png");
      field_28[3] = method_134("/score.png");
      field_28[4] = method_134("/t_cur1.png");
      field_28[5] = method_134("/t_cur2.png");
   }

   // $FF: renamed from: n (int) void
   private void method_164(int var1) {
      switch (var1) {
         case 0:
            if (this.field_296[1] == 0) {
               this.field_31[0] = this.field_63[29];
            } else {
               this.field_31[0] = this.field_63[46];
            }

            this.field_31[1] = this.field_63[45];
            return;
         case 1:
            this.field_31[0] = "";
            this.field_31[1] = this.field_63[44];
            return;
         case 2:
            if (this.field_296[1] == 0) {
               this.field_31[0] = this.field_63[29];
            } else {
               this.field_31[0] = this.field_63[46];
            }

            this.field_31[1] = this.field_63[44];
            return;
         case 3:
            this.field_31[0] = "";
            this.field_31[1] = "";
            return;
         case 4:
            this.field_31[0] = "ENTER";
            this.field_31[1] = this.field_63[44];
         default:
      }
   }

   // $FF: renamed from: H () void
   public final void method_165() {
      this.field_209 = 0;
      this.field_210 = -1;
      this.field_211 = 0;
      this.field_212 = 0;

      for(int var1 = 0; var1 < 2; ++var1) {
         this.field_227[var1] = field_226[var1] = field_225[var1];
         this.field_229[var1] = this.field_228[var1] = 0;
      }

   }

   // $FF: renamed from: a (int, int, int) void
   public final void method_166(int var1, int var2, int var3) {
      if (var3 == 1 || var3 == 21) {
         if (this.field_212 <= 1) {
            if (this.field_211 <= 1) {
               if (Math.abs(method_102() - var1) < 300 && Math.abs(method_103() + 40 - var2) < 120) {
                  this.field_211 = 20;
                  this.field_210 = 10;
                  this.field_212 = 1;
               }

            }
         }
      }
   }

   // $FF: renamed from: c (int, int) void
   public final void method_167(int var1, int var2) {
      if (this.field_212 <= 2) {
         if (this.field_212 != 2 || this.field_211 <= 1) {
            int var3 = this.field_199[4] == 35 ? 48 : 136;
            if (Math.abs(method_102() - var1) < var3 && method_103() + 40 > var2 && method_103() - 320 < var2) {
               this.field_211 = 20;
               this.field_210 = 8;
               this.field_212 = 2;
            }

         }
      }
   }

   // $FF: renamed from: b (int, int, int) void
   public final void method_168(int var1, int var2, int var3) {
      if (var3 == 2 || var3 == 10) {
         if (this.field_212 <= 3) {
            if (this.field_212 != 3 || this.field_211 <= 1) {
               if (this.field_211 < 2 && Math.abs(method_102() - var1) < 128 && Math.abs(method_103() - var2) < 96) {
                  this.field_211 = 20;
                  this.field_210 = 7;
                  this.field_212 = 3;
               }

            }
         }
      }
   }

   // $FF: renamed from: c (int, int, int) void
   public final void method_169(int var1, int var2, int var3) {
      if (var3 == 2) {
         if (this.field_212 <= 4) {
            if (this.field_212 != 4 || this.field_211 <= 1) {
               if (Math.abs(method_102() - var1) < 96 && Math.abs(method_103() - var2) < 96) {
                  this.field_211 = 20;
                  this.field_210 = 5;
                  this.field_212 = 4;
               }

            }
         }
      }
   }

   // $FF: renamed from: d (int, int, int) void
   public final void method_170(int var1, int var2, int var3) {
      if (var3 == 1 || var3 == 2) {
         if (this.field_212 <= 4) {
            if (this.field_212 != 4 || this.field_211 <= 1) {
               if (Math.abs(method_102() - var1) < 96 && Math.abs(method_103() - var2) < 96) {
                  this.field_211 = 20;
                  this.field_210 = 5;
                  this.field_212 = 4;
               }

            }
         }
      }
   }

   // $FF: renamed from: e (int, int, int) void
   public final void method_171(int var1, int var2, int var3) {
      if (var3 == 2) {
         if (this.field_212 <= 5) {
            if (this.field_212 != 5 || this.field_211 <= 1) {
               if (Math.abs(method_102() - var1) < 96 && Math.abs(method_103() - var2) < 96) {
                  this.field_211 = 20;
                  this.field_210 = 2;
                  this.field_212 = 5;
               }

            }
         }
      }
   }

   // $FF: renamed from: f (int, int, int) void
   public final void method_172(int var1, int var2, int var3) {
      if (var3 == 1 || var3 == 2) {
         if (this.field_212 <= 5) {
            if (this.field_212 != 5 || this.field_211 <= 1) {
               if (Math.abs(method_102() - var1) < 96 && Math.abs(method_103() - var2) < 96) {
                  this.field_211 = 20;
                  this.field_210 = 2;
                  this.field_212 = 5;
               }

            }
         }
      }
   }

   // $FF: renamed from: I () void
   public final void method_173() {
      int var1 = method_102();
      int var2 = method_103();
      if (this.field_211 > 0) {
         --this.field_211;
         if (this.field_211 == 0) {
            this.field_210 = -1;
            this.field_212 = 0;
         }
      }

      if (this.field_210 >= 0) {
         this.field_209 = this.field_210;
      } else {
         this.field_212 = 0;
         if (!this.field_240 && !this.field_241) {
            switch (this.field_221) {
               case 0:
                  this.field_209 = 1;
               case 1:
               case 3:
               default:
                  break;
               case 2:
                  this.field_209 = 1;
               case 4:
                  this.field_209 = 1;
                  if (this.field_222 == 1 && Math.abs(var1 - 8464) < 240 && Math.abs(var2 - 640) < 80) {
                     this.field_209 = 2;
                  }
            }
         } else if (this.field_221 == 5 && field_225[0] < 1024) {
            this.field_209 = 1;
         } else {
            this.field_209 = 6;
         }
      }

      switch (this.field_209) {
         case 1:
            this.field_229[0] = 0;
            this.field_229[1] = 0;
            break;
         case 2:
            this.field_229[0] = 0;
            this.field_229[1] = 32;
            break;
         case 3:
            this.field_229[0] = 0;
            this.field_229[1] = 40;
            break;
         case 4:
            if (field_116[5] > 0) {
               this.field_229[0] = 0;
               this.field_229[1] = 48;
            } else {
               this.field_229[0] = 0;
               this.field_229[1] = 0;
            }
            break;
         case 5:
            this.field_229[0] = 0;
            this.field_229[1] = -16;
            break;
         case 6:
            this.field_229[0] = 0;
            this.field_229[1] = 0;
            break;
         case 7:
            this.field_229[0] = 0;
            this.field_229[1] = 16;
            break;
         case 8:
            this.field_229[0] = 0;
            this.field_229[1] = -32;
            break;
         case 9:
            this.field_229[0] = 36;
            this.field_229[1] = 16;
            break;
         case 10:
            this.field_229[0] = 32;
            this.field_229[1] = 40;
            break;
         default:
            field_226[0] = field_225[0];
            field_226[1] = field_225[1];
      }

      int var3 = Math.abs(field_225[0] - this.field_227[0]);
      int var4 = Math.abs(field_225[1] - this.field_227[1]);
      int[] var10000;
      if (this.field_209 == 6) {
         if (var3 >= 4 && var3 <= 256) {
            var10000 = this.field_227;
            var10000[0] += field_225[0] > this.field_227[0] ? 4 : -4;
         } else {
            this.field_227[0] = field_225[0];
         }

         if (var4 >= 4 && var4 <= 256) {
            var10000 = this.field_227;
            var10000[1] += field_225[1] > this.field_227[1] ? 4 : -4;
         } else {
            this.field_227[1] = field_225[1];
         }
      } else {
         if (var3 >= 32 && var3 <= 256) {
            var10000 = this.field_227;
            var10000[0] += field_225[0] > this.field_227[0] ? 32 : -32;
         } else {
            this.field_227[0] = field_225[0];
         }

         if (var4 >= 16 && var4 <= 256) {
            if (var4 > 32) {
               this.field_227[1] = field_225[1] > this.field_227[1] ? this.field_227[1] + 32 : this.field_227[1] - 32;
            } else {
               var10000 = this.field_227;
               var10000[1] += field_225[1] > this.field_227[1] ? 16 : -16;
            }
         } else {
            this.field_227[1] = field_225[1];
         }
      }

      if (this.field_228[0] != this.field_229[0]) {
         var10000 = this.field_228;
         var10000[0] += this.field_228[0] < this.field_229[0] ? 1 : -1;
      }

      field_226[0] = this.field_227[0] + this.field_228[0];
      if (this.field_228[1] != this.field_229[1]) {
         var10000 = this.field_228;
         var10000[1] += this.field_228[1] < this.field_229[1] ? 1 : -1;
      }

      field_226[1] = this.field_227[1] + this.field_228[1];
      int var5 = 0;
      if (this.field_85 > 0) {
         var5 = 0 + (this.field_85 << 1);
      }

      if (this.field_84 > 0) {
         var5 -= this.field_84 << 1;
      }

      int var6 = this.field_275[3] - var5;
      if (field_226[1] > var6) {
         field_226[1] = var6;
      }

      if (field_226[0] < 0) {
         field_226[0] = 0;
      }

   }

   // $FF: renamed from: J () void
   public final void method_174() {
      if (this.field_262 && this.field_263 > 0) {
         --this.field_263;
      } else {
         int var3;
         if (this.field_266) {
            if (this.field_264 < 0) {
               this.field_267 = false;
               this.field_266 = false;
               this.field_262 = false;
               this.field_112 = 0;
               this.field_113 = 0;
               this.field_114 = 0;
               this.field_115 = 0;
               this.field_281 = false;
               boolean var1 = false;
               this.field_224 = (this.field_224 + 1) % 3;
               if (this.field_224 == 0) {
                  this.method_23(true);
               }

               this.field_242 = (byte)(this.field_224 + this.field_223 * 3);
               this.field_244 = (byte)this.field_111;
               this.field_245 = this.field_107;
               if (this.field_246 < this.field_242) {
                  this.field_246 = this.field_242;
               }

               this.method_16();
               this.field_221 = field_216[this.field_223][this.field_224];
               this.field_222 = field_217[this.field_223][this.field_224];
               this.method_176();
               if (this.field_221 == 0 && this.field_222 == 0) {
                  this.field_220 = 8;
                  this.field_44 = 0;
               } else {
                  this.field_202 = true;
                  this.method_45();
                  if (this.field_327) {
                     this.field_220 = 7;
                     this.field_41 = 0;
                  } else {
                     this.method_42();
                  }
               }
            } else {
               --this.field_264;
               if (this.field_265 - this.field_264 > 15) {
                  for(var3 = 0; var3 < 20; ++var3) {
                     if (this.field_269 > 0) {
                        this.field_269 -= 10;
                        this.method_35(10, false);
                     }

                     if (this.field_268 > 0) {
                        this.field_268 -= 10;
                        this.method_35(10, false);
                     }
                  }
               }
            }
         }

         int[] var10000;
         if (this.field_262) {
            this.field_267 = true;
            field_116[12] = 0;
            var10000 = field_116;
            var10000[10] += 128;
         } else {
            this.field_38 = true;
         }

         for(var3 = 0; var3 < this.field_78.length; ++var3) {
            if (this.field_78[var3][0] == 1 && this.field_80 >= this.field_78[var3][9]) {
               for(int var2 = 0; var2 < 6; ++var2) {
                  int var10002;
                  if (this.field_79 + this.field_78[var3][8] > this.field_78[var3][2]) {
                     var10002 = this.field_78[var3][2]++;
                  } else {
                     if (this.field_79 + this.field_78[var3][8] >= this.field_78[var3][2]) {
                        ++this.field_80;
                        this.field_78[var3][0] = 2;
                        if (this.field_80 < 5) {
                           break;
                        }

                        if (!this.field_262) {
                           this.method_25();
                           if (this.field_202) {
                              this.method_44();
                              this.field_202 = false;
                              this.field_112 = 0;
                              this.field_113 = 0;
                              this.field_114 = 0;
                              this.field_115 = 0;
                              this.field_281 = false;
                              this.method_46();
                           } else {
                              this.method_114();
                              this.method_46();
                           }
                           break;
                        }

                        this.method_25();
                        this.field_266 = true;
                        this.field_101 = -1;
                        this.field_268 = this.field_106 * 100;
                        this.field_269 = 0;
                        if (this.field_108 < 30 && this.field_109 == 0 && !this.field_281) {
                           this.field_269 = 50000;
                        } else if (this.field_108 < 45 && this.field_109 == 0) {
                           this.field_269 = 10000;
                        } else if (this.field_109 < 1) {
                           this.field_269 = 5000;
                        } else if (this.field_108 < 30 && this.field_109 == 1) {
                           this.field_269 = 4000;
                        } else if (this.field_109 < 2) {
                           this.field_269 = 3000;
                        } else if (this.field_108 < 30 && this.field_109 == 2) {
                           this.field_269 = 2000;
                        } else {
                           this.field_269 = 1000;
                        }

                        if (this.field_269 > this.field_268) {
                           this.field_265 = this.field_264 = this.field_269 / 120 + 30;
                        } else {
                           this.field_265 = this.field_264 = this.field_268 / 120 + 30;
                        }
                        break;
                     }

                     var10002 = this.field_78[var3][2]--;
                  }
               }
            }

            if (this.field_220 == 2 && !this.field_262) {
               ++this.field_80;
               this.field_38 = false;
               if (this.field_80 < 20) {
                  this.method_13();
               } else if (this.field_80 < 30) {
                  var10000 = this.field_78[0];
                  var10000[2] += field_18 / 20;
                  var10000 = this.field_78[1];
                  var10000[2] += field_18 / 20;
                  var10000 = this.field_78[2];
                  var10000[2] += field_18 / 20;
                  var10000 = this.field_78[3];
                  var10000[2] -= field_18 / 20;
                  var10000 = this.field_78[4];
                  var10000[2] -= field_18 / 20;
                  this.method_13();
               } else if (this.field_80 == 30) {
                  this.field_78[0][0] = 0;
                  this.field_78[1][0] = 0;
                  this.field_78[2][0] = 0;
                  this.field_78[3][0] = 0;
                  this.field_78[4][0] = 0;
               }
            }
         }

      }
   }

   // $FF: renamed from: K () void
   public final void method_175() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field_78.length; ++var2) {
         if (this.field_78[var2][0] >= 1) {
            if (field_28[10] != null) {
               method_132(field_26, field_28[10], this.field_78[var2][4], this.field_78[var2][5], this.field_78[var2][6], this.field_78[var2][7], field_35[0], this.field_78[var2][2], this.field_78[var2][3], 20, true);
            }

            if (var1 < this.field_78[var2][3]) {
               var1 = this.field_78[var2][3];
            }
         }
      }

      if (this.field_266) {
         int[] var7 = new int[]{this.field_107, this.field_269, this.field_268};
         int var3 = field_17 * 30 / 100;
         int var4 = var1 + 10;
         int var5 = field_17 * 90 / 100;

         for(int var6 = 0; var6 < 3; ++var6) {
            method_132(field_26, field_28[13], 0, var6 * 12, 62, 12, field_35[0], var3, var4 + 12 * var6, 20, true);
            method_43(var5, var4 + 12 * var6 - 36 + 40, var7[var6]);
         }

         if (this.field_269 == 0 && this.field_268 == 0) {
            this.method_154(this.field_63[0], field_18 >> 1, field_23 + field_22 - field_15 - 2, 16777215, 0);
         }
      }

   }

   // $FF: renamed from: aB () void
   private void method_176() {
      while(true) {
         for(int var1 = 0; var1 < this.field_30.length; ++var1) {
            if (this.field_30[var1]) {
               return;
            }
         }

         try {
            Thread.sleep(100L);
         } catch (Exception var2) {
         }
      }
   }

   // $FF: renamed from: g () int
   private int method_177() {
      if (this.field_83 < 600) {
         return 17;
      } else if (this.field_101 > 0) {
         return 6;
      } else if (this.field_240) {
         return this.field_221 == 5 ? 12 : 11;
      } else {
         switch (this.field_221) {
            case 0:
               return 0;
            case 1:
               if (this.field_222 == 3) {
                  return 5;
               }

               return 1;
            case 2:
               return 2;
            case 3:
               return 3;
            case 4:
               return 4;
            case 5:
               if (this.field_222 == 3) {
                  return 12;
               }

               return 5;
            case 6:
               return 8;
            default:
               return 0;
         }
      }
   }

   // $FF: renamed from: L () void
   public final void method_178() {
      if (this.field_240 && this.field_221 < 5) {
         this.field_36.method_380(11, -1);
      } else {
         this.field_36.method_380(this.method_177(), -1);
      }
   }

   // $FF: renamed from: aC () void
   private void method_179() {
      field_29[151] = method_134("/sonic.png");
      field_29[152] = method_134("/sonic_s.png");
      field_29[2] = method_134("/sjump.png");
      field_29[96] = method_134("/tama.png");
      field_29[47] = method_134("/ring_large.png");
      field_29[154] = method_134("/emeralds.png");
      field_29[0] = method_134("/ring.png");
      field_29[36] = method_134("/save.png");
      field_29[42] = method_134("/item.png");
      field_29[109] = method_134("/effect.png");
      field_29[9] = method_134("/toge.png");
      field_29[153] = method_134("/sjump2.png");
      field_29[15] = method_134("/switch.png");
      field_29[97] = method_134("/bakuhatu.png");
      field_29[44] = method_134("/gole.png");
      field_29[45] = method_134("/bten.png");
      field_29[100] = method_134("/animal.png");
      switch (this.field_221) {
         case 0:
            field_29[41] = method_134("/musi.png");
            field_29[40] = method_134("/hachi.png");
            field_29[86] = method_134("/fish.png");
            field_29[39] = method_134("/kamere.png");
            field_29[57] = method_134("/kani.png");
            field_29[3] = method_134("/buranko.png");
            field_29[4] = method_134("/thashi.png");
            field_29[18] = method_134("/brkabe_g.png");
            field_29[5] = method_134("/hashi.png");
            field_29[58] = method_134("/jyama.png");
            field_29[6] = method_134("/break.png");
            field_29[37] = method_134("/kageb.png");
            field_29[16] = method_134("/shima.png");
         case 1:
         case 3:
         case 5:
         case 6:
         default:
            break;
         case 2:
            field_29[40] = method_134("/hachi.png");
            field_29[49] = method_134("/imo.png");
            field_29[78] = method_134("/bat.png");
            field_29[101] = method_134("/fire.png");
            field_29[79] = method_134("/ochi.png");
            field_29[54] = method_134("/dai.png");
            field_29[8] = method_134("/turi.png");
            field_29[94] = method_134("/turi2.png");
            field_29[95] = method_134("/turi3.png");
            field_29[13] = method_134("/yogan2.png");
            field_29[99] = method_134("/yogan22.png");
            field_29[11] = method_134("/fblock.png");
            field_29[77] = method_134("/yoganc.png");
            field_29[14] = method_134("/myogan.png");
            field_29[98] = method_134("/myogan2.png");
            field_29[7] = method_134("/yuka.png");
            field_29[27] = method_134("/bryuka.png");
            field_29[3] = method_134("/buranko_m.png");
            break;
         case 4:
            field_29[101] = method_134("/fire.png");
            field_29[40] = method_134("/hachi.png");
            field_29[57] = method_134("/kani.png");
            field_29[71] = method_134("/yado.png");
            field_29[70] = method_134("/aruma.png");
            field_29[60] = method_134("/tekyu.png");
            field_29[102] = method_134("/block.png");
            field_29[107] = method_134("/dai2_3.png");
            field_29[83] = method_134("/dai4_.png");
            field_29[17] = method_134("/dai2.png");
            field_29[61] = method_134("/signal.png");
            field_29[56] = method_134("/bobin.png");
            field_29[16] = method_134("/shima5.png");
      }

      this.field_321 = false;
   }

   // $FF: renamed from: aD () void
   private void method_180() {
      field_29[2] = null;
      field_29[96] = null;
      field_29[47] = null;
      field_29[154] = null;
      field_29[36] = null;
      field_29[42] = null;
      field_29[9] = null;
      field_29[153] = null;
      field_29[15] = null;
      field_29[44] = null;
      field_29[45] = null;
      switch (this.field_221) {
         case 0:
            field_29[41] = null;
            field_29[40] = null;
            field_29[86] = null;
            field_29[39] = null;
            field_29[57] = null;
            field_29[3] = null;
            field_29[4] = null;
            field_29[18] = null;
            field_29[5] = null;
            field_29[58] = null;
            field_29[6] = null;
            field_29[37] = null;
         case 1:
         case 3:
         default:
            break;
         case 2:
            field_29[40] = null;
            field_29[49] = null;
            field_29[78] = null;
            field_29[79] = null;
            field_29[54] = null;
            field_29[8] = null;
            field_29[94] = null;
            field_29[95] = null;
            field_29[13] = null;
            field_29[99] = null;
            field_29[11] = null;
            field_29[77] = null;
            field_29[14] = null;
            field_29[98] = null;
            field_29[7] = null;
            field_29[27] = null;
            field_29[3] = null;
            break;
         case 4:
            field_29[101] = null;
            field_29[40] = null;
            field_29[57] = null;
            field_29[71] = null;
            field_29[70] = null;
            field_29[60] = null;
            field_29[107] = null;
            field_29[83] = null;
            field_29[17] = null;
            field_29[61] = null;
            field_29[56] = null;
            field_29[16] = null;
      }

      System.gc();
      this.field_321 = true;
   }

   // $FF: renamed from: a (byte[], java.lang.String) void
   private static void method_181(byte[] var0, String var1) {
      try {
         RecordStore var2 = null;

         try {
            var2 = RecordStore.openRecordStore(var1, "iFone", "Sonic The Hedgehog: Part Two");
         } catch (Exception var5) {
            var2 = RecordStore.openRecordStore(var1, true, 1, true);
         }

         try {
            var2.setRecord(1, var0, 0, var0.length);
         } catch (Exception var4) {
            var2.addRecord(var0, 0, var0.length);
         }

         var2.closeRecordStore();
      } catch (Exception var6) {
      }
   }

   // $FF: renamed from: b (java.lang.String) byte[]
   private static byte[] method_182(String var0) {
      RecordStore var1 = null;

      try {
         try {
            var1 = RecordStore.openRecordStore(var0, "iFone", "Sonic The Hedgehog: Part Two");
         } catch (Exception var5) {
            var1 = RecordStore.openRecordStore(var0, false);
         }

         byte[] var2 = new byte[var1.getRecordSize(1)];
         var1.getRecord(1, var2, 0);
         var1.closeRecordStore();
         return var2;
      } catch (Exception var6) {
         try {
            var1.closeRecordStore();
         } catch (Exception var4) {
         }

         return null;
      }
   }

   // $FF: renamed from: i (int) int
   private static int method_183(int var0) {
      switch (var0) {
         case 1:
            return field_35[1];
         case 2:
            return field_35[2];
         case 3:
            return field_35[3];
         default:
            return 0;
      }
   }

   // $FF: renamed from: b (int[]) boolean
   public static boolean method_184(int[] var0) {
      int var10002;
      if (var0[14] == 0) {
         var0[5] = 0;
         var0[6] = 0;
         var0[7] = 0;
         var0[10] = 0;
         var0[11] = 0;
         var0[12] = var0[2] * 100;
         var0[13] = var0[3] * 100;
         var0[15] = -1;
         var0[16] = var0[2];
         var0[17] = var0[3];
         var10002 = var0[14]++;
      }

      if (var0[5] > 0) {
         var10002 = var0[5]--;
      }

      var10002 = var0[6]++;
      if (var0[7] > 0) {
         var10002 = var0[7]--;
      }

      return false;
   }

   // $FF: renamed from: a (int[]) void
   public final void method_185(int[] var1) {
      this.method_186(var1, (this.field_194[var1[1]][1] >> 1) - 2);
   }

   // $FF: renamed from: a (int[], int) void
   public final void method_186(int[] var1, int var2) {
      int var3;
      int var4 = (var3 = var1[3]) + var2;
      if (var3 < 99999) {
         ++var3;
      }

      if (this.method_62(var1[2], var4)) {
         var3 -= 2;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      var1[3] = var3;
   }

   // $FF: renamed from: b (int[]) void
   public static void method_187(int[] var0) {
      if (var0[19] == 0) {
         var0[19] = 1;
      } else {
         var0[19] = 0;
      }
   }

   // $FF: renamed from: a (int, int, int) int
   public final int method_188(int var1, int var2, int var3) {
      int var5 = var2 + var3;
      int var4;
      if (this.method_62(var1, var5)) {
         for(var4 = 0; var4 < 8; ++var4) {
            --var5;
            if (!this.method_62(var1, var5)) {
               break;
            }
         }
      } else {
         for(var4 = 0; var4 < 8 && !this.method_62(var1, var5 + 1); ++var4) {
            ++var5;
         }
      }

      if ((var5 -= var3) < 0) {
         var5 = 0;
      }

      return var5;
   }

   // $FF: renamed from: a (int, int, int, int, int) boolean
   public final boolean method_189(int var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0) {
         if (var1 - var3 - 1 < 0) {
            return true;
         }

         if (this.method_62(var1 - var3 - 1, var2 - 12)) {
            return true;
         }

         if (!this.method_62(var1 - var3 - 1, var2 + var4 + 10)) {
            return true;
         }
      } else {
         if (this.method_62(var1 + var3 + 1, var2 - 12)) {
            return true;
         }

         if (!this.method_62(var1 + var3 + 1, var2 + var4 + 10)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: c (int[]) boolean
   public final boolean method_190(int[] var1) {
      int var2 = this.field_194[var1[1]][0] >> 1;
      int var3 = this.field_194[var1[1]][1] >> 1;
      return this.method_189(var1[2], var1[3], var2, var3, var1[19] & 1);
   }

   // $FF: renamed from: a (int[], int, int) boolean
   public static boolean method_191(int[] var0, int var1, int var2) {
      int var3 = method_102();
      int var4 = method_103() - (field_124 ? 16 : 20);
      if (var0[3] - var2 <= var4 && var4 <= var0[3] + var2) {
         switch (var0[19]) {
            case 0:
               if (var0[2] - var1 < var3 && var3 < var0[2]) {
                  return true;
               }
               break;
            case 1:
               if (var0[2] < var3 && var3 < var0[2] + var1) {
                  return true;
               }
         }

         return false;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c (int, int) boolean
   public static boolean method_192(int var0, int var1) {
      return Math.abs(var0 - method_102()) > 240 || Math.abs(var1 - method_103()) > 240;
   }

   // $FF: renamed from: a (int, int, int) boolean
   public static boolean method_193(int var0, int var1, int var2) {
      int var3 = var0 - method_102();
      int var4 = var1 - (method_103() - (field_124 ? 16 : 20));
      return var3 * var3 + var4 * var4 < var2 * var2;
   }

   // $FF: renamed from: a (int, int, int, int, boolean) int
   public final int method_194(int var1, int var2, int var3, int var4, boolean var5) {
      if (field_122 && field_118) {
         return 0;
      } else {
         int var7 = !field_124 && !field_126 ? 16 : 12;
         int var8 = method_102();
         int var9 = method_103() - var7;
         int var10 = (var3 >> 1) + 12;
         int var11 = (var4 >> 1) + var7;
         if (field_124) {
            if (var8 - var10 < var1 && var1 < var8 + var10 && var9 - var11 < var2 && var2 < var9 + var11) {
               if (this.field_101 <= 0 && (!this.field_299 || !this.field_298[0])) {
                  if (var5) {
                     return 1;
                  }

                  return 2;
               }

               return 1;
            }
         } else if (var8 - var10 < var1 && var1 < var8 + var10 && var9 - var11 < var2 && var2 < var9 + var11) {
            if (this.field_101 <= 0 && (!this.field_299 || !this.field_298[0])) {
               return 2;
            }

            return 1;
         }

         return 0;
      }
   }

   // $FF: renamed from: d (int[]) boolean
   public final boolean method_195(int[] var1) {
      int var2 = this.field_194[var1[1]][0];
      int var3 = this.field_194[var1[1]][1];
      int var4 = this.method_194(var1[2], var1[3], var2, var3, true);
      if (var1[1] == 71 && var4 == 1 && var1[3] - 4 > method_103() - 16) {
         var4 = 2;
      }

      if (var4 == 1) {
         if (field_116[5] > 0) {
            field_116[5] = field_116[5] > 2560 ? -2560 : -field_116[5];
         }

         if (this.field_297 == 0) {
            this.field_297 = 100;
         } else if (this.field_297 == 100) {
            this.field_297 = 200;
         } else if (this.field_297 == 200) {
            this.field_297 = 500;
         } else if (this.field_297 == 500) {
            this.field_297 = 1000;
         }

         this.method_35(this.field_297, true);
         this.method_204(var1[2], var1[3], this.field_297);
         this.method_199(2, var1[2], var1[3], 0, 0, 0, 0);
         this.method_199(field_206[this.field_221][method_58(2)], var1[2], var1[3], 0, -300, 0, 0);
         var1[0] = 0;
         return true;
      } else if (var4 == 2) {
         this.method_104();
         return false;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (int[], int) boolean
   public final boolean method_196(int[] var1, int var2) {
      int var3;
      int var5 = (var3 = var1[13]) / 100 + var2;
      boolean var6 = false;
      if (var3 < 9999900) {
         var3 += 100;
      }

      if (this.method_62(var1[12] / 100, var5)) {
         var3 -= 200;
         var1[11] = 50;
         var6 = true;
      }

      if (var3 < 0) {
         var3 = 0;
      }

      var1[13] = var3;
      return var6;
   }

   // $FF: renamed from: c (int, int, int, int, int) void
   private void method_197(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[25];
      if (var1 >= 1) {
         var6[0] = 1;
         var6[1] = var1;
         var6[2] = var2;
         var6[3] = var3;
         var6[4] = var4;
         var6[19] = var5;
         var6[21] = 1;
         this.method_119(var6);
      }
   }

   // $FF: renamed from: aE () void
   private void method_198() {
      this.field_139 = new int[50][20];
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int) void
   public final void method_199(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 >= 1) {
         for(int var9 = 0; var9 < 50; ++var9) {
            int[] var8;
            if ((var8 = this.field_139[var9])[0] <= 0) {
               for(int var10 = 4; var10 < 20; ++var10) {
                  var8[var10] = 0;
               }

               var8[0] = 1;
               var8[1] = var1;
               var8[2] = var2 * 100;
               var8[3] = var3 * 100;
               var8[8] = var7;
               var8[10] = var4;
               var8[11] = var5;
               var8[19] = var6;
               return;
            }
         }

      }
   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   public final void method_200(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= 1) {
         for(int var8 = 0; var8 < 50; ++var8) {
            int[] var7;
            if ((var7 = this.field_139[var8])[0] <= 0) {
               for(int var9 = 4; var9 < 20; ++var9) {
                  var7[var9] = 0;
               }

               var7[0] = 1;
               var7[1] = var1;
               var7[2] = var2 * 100;
               var7[3] = var3 * 100;
               var7[8] = var6;
               var7[10] = method_5(var4) * var5 / 100;
               var7[11] = method_6(var4) * var5 / 100;
               return;
            }
         }

      }
   }

   // $FF: renamed from: k (int, int, int) void
   private void method_201(int var1, int var2, int var3) {
      if (var3 > 0) {
         if (var3 > 32) {
            var3 = 32;
         }

         this.method_202(var1, var2, var3, 256);
         if (var3 > 16) {
            var3 -= 16;
            this.method_202(var1, var2, var3, 128);
         }

      }
   }

   // $FF: renamed from: e (int, int, int, int) void
   private void method_202(int var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = var3 > 16 ? 16 : var3;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = (var7 >> 1) * 2250 + 1125;
         if ((var7 & 1) == 1) {
            var8 = -var8 + '\u8ca0';
         }

         this.method_200(4, var1, var2, var8 / 100, var4, 0);
      }

   }

   // $FF: renamed from: g (int, int, int) void
   public final void method_203(int var1, int var2, int var3) {
      int[] var4 = new int[24];
      if (var3 < 0 || var3 > 5) {
         var3 = 0;
      }

      int var5 = 60;

      int var6;
      for(var6 = 0; var6 < 24; ++var6) {
         var5 += 2 + method_58(18);
         var4[var6] = var5;
      }

      for(var6 = 0; var6 < 24; ++var6) {
         this.method_199(field_206[var3][method_58(2)], var1 + (var6 % 8 * 8 - 32), var2, 0, -350 + method_58(60), method_58(2), var5 - var4[var6]);
      }

   }

   // $FF: renamed from: h (int, int, int) void
   public final void method_204(int var1, int var2, int var3) {
      if (var3 < 10) {
         this.method_199(6, var1, var2, 0, 0, 0, 0);
      } else if (var3 < 50) {
         this.method_199(6, var1, var2, 0, 0, 0, 1);
      } else if (var3 < 100) {
         this.method_199(6, var1, var2, 0, 0, 0, 2);
      } else if (var3 < 200) {
         this.method_199(6, var1, var2, 0, 0, 0, 3);
      } else if (var3 < 500) {
         this.method_199(6, var1, var2, 0, 0, 0, 4);
      } else if (var3 < 1000) {
         this.method_199(6, var1, var2, 0, 0, 0, 5);
      } else {
         this.method_199(6, var1, var2, 0, 0, 0, 6);
      }
   }

   // $FF: renamed from: M () void
   public final void method_205() {
      for(int var2 = 0; var2 < 50; ++var2) {
         int[] var1;
         if ((var1 = this.field_139[var2])[0] > 0) {
            if (var1[6] > 600) {
               var1[0] = 0;
            } else {
               this.method_206(var1);
               int var10002;
               if (var1[5] > 0) {
                  var10002 = var1[5]--;
               }

               var10002 = var1[6]++;
            }
         }
      }

   }

   // $FF: renamed from: e (int[]) void
   private void method_206(int[] var1) {
      switch (var1[1]) {
         case 1:
            method_208(var1);
            return;
         case 2:
            method_208(var1);
            return;
         case 4:
            this.method_209(var1);
            return;
         case 5:
            method_210(var1);
            return;
         case 6:
            method_211(var1);
            return;
         case 7:
            this.method_212(var1);
            return;
         case 8:
            this.method_213(var1);
            return;
         case 9:
            this.method_214(var1);
            return;
         case 10:
            this.method_215(var1);
            return;
         case 12:
            this.method_217(var1);
            return;
         case 13:
            this.method_216(var1);
            return;
         case 14:
            this.method_218(var1);
            return;
         case 15:
            method_219(var1);
            return;
         case 16:
            this.method_220(var1);
            return;
         case 17:
            this.method_221(var1);
            return;
         case 18:
            this.method_222(var1);
            return;
         case 19:
            this.method_223(var1);
            return;
         case 20:
            this.method_224(var1);
            return;
         case 21:
            this.method_225(var1);
            return;
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
            method_226(var1);
            return;
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
            this.method_237(var1);
         case 3:
         case 11:
         case 27:
         default:
      }
   }

   // $FF: renamed from: N () void
   public final void method_207() {
      for(int var3 = 0; var3 < 50; ++var3) {
         int[] var1;
         if ((var1 = this.field_139[var3])[0] > 0) {
            switch (var1[1]) {
               case 1:
               case 2:
               case 3:
                  method_227(var1);
                  break;
               case 4:
                  this.method_228(var1);
                  break;
               case 5:
                  method_229(var1);
                  break;
               case 6:
                  method_230(var1);
                  break;
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
                  method_231(var1);
                  break;
               case 14:
                  method_232(var1);
                  break;
               case 15:
                  this.method_233(var1);
                  break;
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
                  this.method_234(var1);
               case 21:
               case 27:
               default:
                  break;
               case 22:
               case 23:
               case 24:
               case 25:
                  method_235(var1);
                  break;
               case 26:
                  method_236(var1);
                  break;
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
                  method_238(var1);
            }
         }
      }

   }

   // $FF: renamed from: f (int[]) void
   private static void method_208(int[] var0) {
      if (var0[6] > 24) {
         var0[0] = 0;
      }

   }

   // $FF: renamed from: g (int[]) void
   private void method_209(int[] var1) {
      var1[2] += var1[10];
      var1[3] += var1[11];
      var1[15] = this.field_32 >> 1;
      int var2 = var1[11];
      int var3 = var1[2] / 100;
      int var4 = var1[3] / 100;
      if (this.method_194(var3, var4, 12, 12, false) != 0) {
         this.method_199(5, var3, var4, 0, 0, 0, 0);
         ++this.field_106;
         var1[0] = 0;
      } else {
         int var5;
         if (var2 > 0) {
            if (this.method_62(var3, var4 + 4)) {
               var5 = (this.field_232[this.field_271] & 255) << 4;
               var4 = (var4 & -16) + (16 - Math.abs(this.field_187[var5 + (var3 & 15)]));
               var2 = -(var2 >> 1);
            } else {
               var2 += 6;
               if (var2 > 500) {
                  var2 = 500;
               }
            }
         } else if (this.method_62(var3, var4 - 4)) {
            for(var5 = 0; var5 < 3; ++var5) {
               ++var4;
               if (!this.method_62(var3, var4 - 4)) {
                  break;
               }
            }

            var2 = -(var2 >> 1);
         } else {
            var2 += 6;
            if (var2 > 500) {
               var2 = 500;
            }
         }

         if (var4 < 0) {
            var4 = 0;
         } else if (var4 > 99999) {
            var1[0] = 0;
         }

         var1[3] = var4 * 100;
         var1[11] = var2;
         if (var1[6] > 300) {
            var1[0] = 0;
         }

      }
   }

   // $FF: renamed from: h (int[]) void
   private static void method_210(int[] var0) {
      var0[15] = var0[6] / 8;
      if (var0[15] > 3) {
         var0[0] = 0;
      }

   }

   // $FF: renamed from: i (int[]) void
   private static void method_211(int[] var0) {
      var0[3] -= 100;
      if (var0[6] > 50) {
         var0[0] = 0;
      }

   }

   // $FF: renamed from: j (int[]) void
   private void method_212(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100, 8, 8, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      var1[15] = 2 + (this.field_32 & 1);
   }

   // $FF: renamed from: k (int[]) void
   private void method_213(int[] var1) {
      if (var1[6] > 10) {
         if (this.method_194(var1[2] / 100, var1[3] / 100, 10, 10, false) != 0) {
            this.method_104();
         }

         var1[2] += var1[10];
         var1[3] += var1[11];
      }

      var1[15] = 2 + (this.field_32 & 1);
   }

   // $FF: renamed from: l (int[]) void
   private void method_214(int[] var1) {
      if (var1[6] > 5) {
         if (this.method_194(var1[2] / 100, var1[3] / 100, 10, 10, false) != 0) {
            this.method_104();
         }

         var1[2] += var1[10];
         var1[3] += var1[11];
         var1[11] += 10;
         if (var1[11] > 600) {
            var1[11] = 600;
         }
      }

      var1[15] = 4 + (this.field_32 & 1);
   }

   // $FF: renamed from: m (int[]) void
   private void method_215(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
         this.method_104();
      }

      int var2 = var1[2];
      int var3 = var1[3];
      int var4 = var1[10];
      int var5 = var1[11];
      var5 += 10;
      if (var5 > 300) {
         var5 = 300;
      }

      var2 += var4;
      var3 += var5;
      if (var5 > 0 && this.method_62(var2 / 100, var3 / 100 + 5)) {
         boolean var6 = false;

         int var7;
         do {
            var7 = this.method_108(var2 / 100, var3 / 100 + 5);
            var3 -= 100;
         } while(this.method_62(var2 / 100, var3 / 100 + 5));

         if (var7 > 270) {
            var4 = -Math.abs(var4);
         } else if (var7 > 15) {
            var4 = Math.abs(var4);
         }

         var5 = -var5;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 > 999900) {
         var1[0] = 0;
      }

      var1[15] = 8 + (this.field_32 & 1);
      var1[2] = var2;
      var1[3] = var3;
      var1[10] = var4;
      var1[11] = var5;
      if (var1[6] > 300) {
         this.method_199(1, var1[2] / 100, var1[3] / 100, 0, 0, 0, 0);
         var1[0] = 0;
      }

   }

   // $FF: renamed from: n (int[]) void
   private void method_216(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100, 8, 8, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      var1[11] += 10;
      if (var1[11] > 800) {
         var1[11] = 800;
      }

      var1[15] = 12 + (this.field_32 & 1);
   }

   // $FF: renamed from: o (int[]) void
   private void method_217(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      var1[15] = 7;
   }

   // $FF: renamed from: p (int[]) void
   private void method_218(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
         this.method_104();
      }

      var1[15] = 11;
      int var2 = var1[2];
      int var3 = var1[3];
      int var4 = var1[10];
      int var5 = var1[11];
      var5 += 10;
      if (var5 > 400) {
         var5 = 400;
      }

      var2 += var4;
      var3 += var5;
      if (var5 > 0 && this.method_62(var2 / 100, var3 / 100 + 4)) {
         do {
            var3 -= 100;
         } while(this.method_62(var2 / 100, var3 / 100 + 4));

         var5 = -var5;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 > 999900) {
         var1[0] = 0;
      }

      var1[2] = var2;
      var1[3] = var3;
      var1[10] = var4;
      var1[11] = var5;
      if (var1[6] > 180) {
         var1[0] = 0;
      }

   }

   // $FF: renamed from: q (int[]) void
   private static void method_219(int[] var0) {
      if (var0[6] > 30) {
         var0[0] = 0;
      }

   }

   // $FF: renamed from: r (int[]) void
   private void method_220(int[] var1) {
      switch (var1[14]) {
         case 2:
            var1[15] = 4;
            var1[5] = 8;
            int var10002 = var1[14]++;
         case 3:
            if (var1[5] > 0) {
               return;
            }

            var1[0] = 0;
            return;
         default:
            if (var1[6] > 4) {
               if (this.method_194(var1[2] / 100, var1[3] / 100, 12, 12, false) != 0) {
                  this.method_104();
               }

               var1[2] += var1[10];
               var1[3] += var1[11];
               if (var1[8] == 1) {
                  var1[11] += 6;
                  if (var1[11] > 1000) {
                     var1[11] = 1000;
                  }
               }
            }

            if (var1[10] > 0) {
               var1[18] = 3;
               if (this.method_62(var1[2] / 100 + 15, var1[3] / 100)) {
                  var1[14] = 2;
                  return;
               }
            } else if (var1[10] < 0) {
               var1[18] = 1;
               if (this.method_62(var1[2] / 100 - 15, var1[3] / 100)) {
                  var1[14] = 2;
                  return;
               }
            } else {
               if (var1[11] < 0) {
                  var1[18] = 2;
                  return;
               }

               if (var1[11] > 0) {
                  var1[18] = 0;
                  if (this.method_62(var1[2] / 100, var1[3] / 100 + 16)) {
                     var1[14] = 2;
                  }
               }
            }

      }
   }

   // $FF: renamed from: s (int[]) void
   private void method_221(int[] var1) {
      int var2 = var1[2] / 100;
      int var3 = var1[3] / 100 + 6;
      if (this.method_194(var2, var3, 10, 10, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      switch (var1[14]) {
         default:
            var1[10] = 0;
            var1[11] = 20;
            var1[18] = 0;
            var1[19] = 0;
            var1[14] = 1;
         case 1:
            var1[11] += 4;
            if (var1[11] > 300) {
               var1[11] = 300;
            }

            if (!this.method_62(var1[2] / 100, var1[3] / 100 + 14)) {
               return;
            } else {
               this.method_199(18, var1[2] / 100, var1[3] / 100, 0, 0, 0, 0);
               this.method_199(18, var1[2] / 100, var1[3] / 100, 0, 0, 1, 0);
               var1[11] = 0;
               var1[5] = 13;
               int var10002 = var1[14]++;
            }
         case 2:
            var1[15] = 4;
            if (var1[5] <= 0) {
               var1[0] = 0;
            }
      }
   }

   // $FF: renamed from: t (int[]) void
   private void method_222(int[] var1) {
      int var2 = var1[2] / 100;
      int var3 = var1[3] / 100 + 6;
      if (this.method_194(var2, var3, 12, 12, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      switch (var1[14]) {
         default:
            var1[10] = var1[19] == 1 ? 64 : -64;
            var1[11] = 100;
            var1[5] = 100;
            switch (var1[8]) {
               case 1:
                  var1[5] = 140;
                  var1[9] = 8;
                  break;
               default:
                  var1[5] = 100;
                  var1[9] = 5;
            }

            var1[18] = 0;
            var1[15] = 0;
            var1[14] = 1;
         case 1:
            if (this.method_62(var1[2] / 100, var1[3] / 100 + 14)) {
               var1[3] -= 200;
            }

            int var10002;
            if (var1[6] % 24 == 0 && var1[9] > 0) {
               var10002 = var1[9]--;
               if (var1[8] == 0) {
                  this.method_199(19, var1[2] / 100, var1[3] / 100, 0, 0, 0, 0);
               } else if (var1[8] == 1) {
                  this.method_199(19, var1[2] / 100, var1[3] / 100, 0, 0, 0, 999);
               }
            }

            if (var1[5] > 0) {
               return;
            } else {
               var1[5] = 12;
               var10002 = var1[14]++;
            }
         case 2:
            var1[15] = 4;
            if (var1[5] <= 0) {
               var1[0] = 0;
            }
      }
   }

   // $FF: renamed from: u (int[]) void
   private void method_223(int[] var1) {
      int var2 = var1[2] / 100;
      int var3 = var1[3] / 100 + 6;
      if (this.method_194(var2, var3, 12, 12, false) != 0) {
         this.method_104();
      }

      switch (var1[14]) {
         default:
            var1[14] = 1;
         case 1:
            if (var1[8] == 0) {
               var1[8] = 100;
            }

            var1[5] = 0;
            var1[18] = 0;
            var1[15] = 0;
            var1[14] = 1;
         case 2:
            if (var1[8] > 998) {
               return;
            } else if (var1[6] < var1[8]) {
               return;
            } else {
               var1[15] = 4;
               var1[5] = 8;
               int var10002 = var1[14]++;
            }
         case 3:
            if (var1[5] <= 0) {
               var1[0] = 0;
            }
      }
   }

   // $FF: renamed from: v (int[]) void
   private void method_224(int[] var1) {
      int var3 = var1[2] / 100;
      int var4 = var1[3] / 100 + (var1[18] == 0 ? 6 : -6);
      if (this.method_194(var3, var4, 10, 12, false) != 0) {
         this.method_104();
      }

      switch (var1[14]) {
         default:
            var1[14] = 1;
         case 1:
            if (var1[8] == 0) {
               var1[8] = 64;
            }

            var1[5] = 0;
            var1[9] = 0;
            var1[18] = 0;
            var1[15] = 0;
            var1[17] = var1[3];
            int var10002 = var1[14]++;
         case 2:
            var1[9] += 140;
            var1[15] = this.field_32 & 1;
            int var2 = var1[9] / 100 % 180;
            var1[3] = var1[17] - Math.abs(method_5(var2)) * var1[8];
            if (var2 < 90) {
               var1[18] = 2;
            } else {
               var1[18] = 0;
            }

            if (var1[9] >= 18000) {
               var1[0] = 0;
            }

      }
   }

   // $FF: renamed from: w (int[]) void
   private void method_225(int[] var1) {
      if (this.method_194(var1[2] / 100, var1[3] / 100 + 2, 10, 10, false) != 0) {
         this.method_104();
      }

      var1[2] += var1[10];
      var1[3] += var1[11];
      if (this.method_62(var1[2] / 100, var1[3] / 100)) {
         var1[0] = 0;
      }

   }

   // $FF: renamed from: x (int[]) void
   private static void method_226(int[] var0) {
      var0[15] = var0[8];
      var0[2] += var0[10];
      var0[3] += var0[11];
      var0[11] += 20;
      if (var0[11] > 800) {
         var0[11] = 800;
      }

   }

   // $FF: renamed from: y (int[]) void
   private static void method_227(int[] var0) {
      int var1 = var0[6] / 4 % 5;
      if (var0[1] != 2) {
         var1 += 5;
      }

      method_130(var0[2] / 100, var0[3] / 100, 97, var1, field_35[0]);
   }

   // $FF: renamed from: z (int[]) void
   private void method_228(int[] var1) {
      int[] var2 = new int[]{field_35[0], field_35[0], field_35[0], field_35[4]};
      int[] var3 = new int[]{0, 12, 24, 12};
      method_126(0, 0, var3[this.field_32 & 3], 12, 12, var2[this.field_32 & 3], var1[2] / 100, var1[3] / 100);
   }

   // $FF: renamed from: A (int[]) void
   private static void method_229(int[] var0) {
      if (var0[15] >= 0 && var0[15] <= 3) {
         method_126(0, 12, var0[15] * 12, 12, 12, 0, var0[2] / 100, var0[3] / 100);
      }
   }

   // $FF: renamed from: B (int[]) void
   private static void method_230(int[] var0) {
      int var6 = (var0[2] / 100 - field_226[0]) * 3 >> 2;
      int var7 = (var0[3] / 100 - field_226[1]) * 3 >> 2;
      int var1;
      if ((var1 = var0[8]) >= 0) {
         if (var1 > 6) {
            var1 = 6;
         }

         byte var2;
         byte var3;
         byte var4;
         switch (var1) {
            case 1:
               var4 = 8;
               var2 = 2;
               var3 = 0;
               break;
            case 2:
               var4 = 8;
               var2 = 2;
               var3 = 12;
               break;
            case 3:
               var4 = 11;
               var2 = 2;
               var3 = 0;
               break;
            case 4:
               var4 = 11;
               var2 = 2;
               var3 = 6;
               break;
            case 5:
               var4 = 11;
               var2 = 2;
               var3 = 12;
               break;
            case 6:
               var4 = 15;
               var2 = 2;
               var3 = 0;
               break;
            default:
               var4 = 4;
               var2 = 6;
               var3 = 0;
         }

         method_132(field_26, field_28[3], var2, var3, var4, 6, 0, var6, var7, 3, true);
      }
   }

   // $FF: renamed from: C (int[]) void
   private static void method_231(int[] var0) {
      method_130(var0[2] / 100, var0[3] / 100, 96, var0[15], field_35[0]);
   }

   // $FF: renamed from: D (int[]) void
   private static void method_232(int[] var0) {
      method_130(var0[2] / 100, var0[3] / 100, 49, var0[8] == 0 ? 0 : 2, var0[19] == 0 ? field_35[0] : field_35[4]);
   }

   // $FF: renamed from: E (int[]) void
   private void method_233(int[] var1) {
      byte var2;
      if (var1[6] < 5) {
         var2 = 3;
      } else if (var1[6] < 10) {
         var2 = 4;
      } else {
         if (var1[6] >= 15) {
            return;
         }

         var2 = 5;
      }

      if ((this.field_32 & 1) == 0) {
         method_130(var1[2] / 100, var1[3] / 100, 41, var2, field_35[0]);
      }

   }

   // $FF: renamed from: F (int[]) void
   private void method_234(int[] var1) {
      int var2;
      if ((var2 = var1[15] % 5) == 0) {
         var2 += this.field_32 & 3;
      }

      int var7 = var1[18];
      int var4 = var2 * 24;
      method_126(101, 0, var4, 16, 24, method_183(var7), var1[2] / 100, var1[3] / 100);
   }

   // $FF: renamed from: G (int[]) void
   private static void method_235(int[] var0) {
      int var1 = var0[15] & 3;
      byte var6;
      if (var0[1] == 23) {
         var6 = 102;
      } else if (var0[1] == 24) {
         var6 = 18;
      } else {
         var6 = 27;
      }

      short var2 = field_192[var1][0];
      short var3 = field_192[var1][1];
      method_126(var6, var2, var3, 12, 12, 0, var0[2] / 100, var0[3] / 100);
   }

   // $FF: renamed from: H (int[]) void
   private static void method_236(int[] var0) {
      byte var1;
      switch (var0[8]) {
         case 1:
            var1 = 12;
            break;
         case 2:
            var1 = 24;
            break;
         default:
            var1 = 0;
      }

      method_126(18, var1, 0, 12, 12, 0, var0[2] / 100, var0[3] / 100);
   }

   // $FF: renamed from: I (int[]) void
   private void method_237(int[] var1) {
      int var2 = (var1[1] - 28) % 7;
      if (var1[14] > 2) {
         var1[2] += var1[10];
         var1[3] += var1[11];
         var1[11] += 10;
         if (var1[11] > 800) {
            var1[11] = 800;
         }
      }

      int var10002;
      switch (var1[14]) {
         default:
            var1[14] = 1;
         case 1:
            var1[10] = 0;
            var1[15] = 0;
            var1[5] = var1[8];
            var10002 = var1[14]++;
         case 2:
            if (var1[5] > 0) {
               break;
            }

            var10002 = var1[14]++;
         case 3:
            var1[15] = 0;
            if (!this.method_62(var1[2] / 100, var1[3] / 100 + 8)) {
               break;
            }

            var1[10] = field_193[var2][0];
            var1[11] = field_193[var2][1];
            if (var1[19] == 1) {
               var1[10] = -var1[10];
            }

            var1[6] = 0;
            var10002 = var1[14]++;
         case 4:
            var1[15] = 1;
            if (this.method_62(var1[2] / 100, var1[3] / 100 + 8)) {
               for(int var3 = 0; var3 < 3; ++var3) {
                  var1[3] -= 200;
                  if (!this.method_62(var1[2] / 100, var1[3] / 100 + 8)) {
                     break;
                  }
               }

               var1[11] = field_193[var2][1];
            }
      }

      if (var1[3] < 0) {
         var1[3] = 0;
      } else {
         if (var1[3] > 999900) {
            var1[0] = 0;
         }

      }
   }

   // $FF: renamed from: J (int[]) void
   private static void method_238(int[] var0) {
      int var1;
      if ((var1 = var0[15] % 3) >= 0) {
         int var2;
         switch (var0[19]) {
            case 1:
               var2 = field_35[4];
               break;
            case 2:
               var2 = field_35[6];
               break;
            case 3:
               var2 = field_35[2];
               break;
            default:
               var2 = 0;
         }

         method_130(var0[2] / 100, var0[3] / 100, 100, var1, var2);
      }
   }

   // $FF: renamed from: aF () void
   private void method_239() {
      this.field_166 = this.field_221;
      this.field_167 = 0;
      this.field_168 = 0;
      this.field_169 = 0;
      this.field_170 = 0;
      this.field_171 = 0;
      this.field_172 = 0;
      this.field_173 = 0;
      this.field_174 = this.field_175 = 0;
      this.field_176 = this.field_177 = 0;
      this.field_180 = 0;
      this.field_181 = 0;
      this.field_182 = 0;
      this.field_183 = 0;
      this.field_184 = 0;
      this.field_185 = 0;
      if (this.field_221 != 3 && this.field_221 != 4) {
         switch (this.field_296[0]) {
            case 1:
               this.field_186 = 6;
               break;
            case 2:
               this.field_186 = 8;
               break;
            default:
               this.field_186 = 4;
         }
      } else {
         switch (this.field_296[0]) {
            case 1:
               this.field_186 = 5;
               break;
            case 2:
               this.field_186 = 6;
               break;
            default:
               this.field_186 = 4;
         }
      }

      if (this.field_221 < 5) {
         this.field_36.method_380(11, -1);
      }

   }

   // $FF: renamed from: aG () void
   private void method_240() {
      try {
         int[] var1 = new int[25];
         this.method_239();
         this.method_180();
         switch (this.field_221) {
            case 0:
               field_29[120] = method_134("/boss.png");
               field_29[121] = method_134("/bossball.png");
               var1[1] = 120;
               this.field_178 = 10752;
               this.field_179 = 808;
            case 1:
            case 3:
            default:
               break;
            case 2:
               field_29[120] = method_134("/boss.png");
               field_29[131] = method_134("/fire.png");
               var1[1] = 130;
               this.field_178 = 6304;
               this.field_179 = 608;
               this.field_174 = (6640 - this.field_178) * 100;
               this.field_175 = (544 - this.field_179) * 100;
               break;
            case 4:
               this.method_7();
               field_29[120] = method_134("/boss.png");
               var1[1] = 140;
               this.field_174 = 0;
               this.field_175 = 0;
         }

         field_29[55] = method_134("/masin.png");
         var1[0] = 1;
         var1[2] = var1[16] = field_226[0] + 256 + 46;
         var1[3] = var1[17] = field_226[1] + 46;
         var1[4] = 0;
         var1[14] = 0;
         var1[20] = this.field_197.length - 1;
         this.field_197[var1[20]] = true;
         this.field_198[var1[20]] = false;
         this.method_119(var1);
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: O () void
   public final void method_241() {
      field_29[120] = null;
      switch (this.field_221) {
         case 0:
            field_29[121] = null;
            return;
         case 2:
            field_29[131] = null;
         default:
      }
   }

   // $FF: renamed from: aH () void
   private void method_242() {
      this.field_240 = true;
      this.method_240();
   }

   // $FF: renamed from: P () void
   public final void method_243() {
      this.field_241 = true;
      this.field_240 = false;
      this.field_239 = 1;
   }

   // $FF: renamed from: e (int[]) boolean
   public final boolean method_244(int[] var1) {
      var1[2] = (this.field_174 + this.field_176) / 100 + this.field_178;
      var1[3] = (this.field_175 + this.field_177) / 100 + this.field_179;
      if (this.field_182 > 0) {
         --this.field_182;
      }

      if (this.field_185 > 0 && --this.field_185 == 0) {
         this.field_184 = 0;
      }

      if (this.field_183 > 0) {
         --this.field_183;
         return true;
      } else {
         if (this.field_180 > 0) {
            --this.field_180;
         }

         ++this.field_181;
         return false;
      }
   }

   // $FF: renamed from: b () boolean
   public final boolean method_245() {
      label53: {
         int var1 = this.field_179 + (this.field_175 + this.field_177) / 100;
         switch (this.field_167) {
            case 100:
               this.field_168 = 3;
               this.field_180 = 120;
               ++this.field_167;
            case 101:
               if (this.field_172 > 0) {
                  --this.field_172;
               }

               if (this.field_180 > 0) {
                  break;
               }

               this.field_168 = 4;
               this.field_180 = 80;
               ++this.field_167;
            case 102:
               this.field_168 = 4;
               this.field_175 += 200;
               if (var1 < field_141[this.field_221]) {
                  break;
               }

               this.field_180 = 40;
               ++this.field_167;
            case 103:
               if (this.field_180 > 0) {
                  break;
               }

               this.method_243();
               this.field_180 = 24;
               ++this.field_167;
            case 104:
               this.field_175 -= 80;
               if (this.field_180 > 0) {
                  break;
               }

               this.field_180 = 40;
               ++this.field_167;
            case 105:
               if (this.field_180 > 0) {
                  break;
               }

               ++this.field_167;
            case 106:
               this.field_168 = 5;
               this.field_169 = 1;
               this.field_174 += 100;
               this.field_175 -= 50;
               if (this.field_180 > 0) {
                  break;
               }

               this.field_180 = 120;
               ++this.field_167;
            case 107:
               this.field_168 = 6;
               this.field_169 = 1;
               this.field_174 += 500;
               this.field_175 -= 50;
               if (this.field_180 <= 0) {
                  ++this.field_167;
                  break label53;
               }
               break;
            case 108:
               break label53;
         }

         return false;
      }

      this.field_168 = -1;
      return true;
   }

   // $FF: renamed from: c (int[]) void
   public final void method_246(int[] var1) {
      var1[2] = this.field_178 + (this.field_174 + this.field_176) / 100;
      var1[3] = this.field_179 + (this.field_175 + this.field_177) / 100;
   }

   // $FF: renamed from: c (int, int, int, int) void
   public final void method_247(int var1, int var2, int var3, int var4) {
      int var5;
      if ((var5 = method_136(var1, var2, var1, var2, var3, var4)) >= 0) {
         if (var5 == 0) {
            field_116[1] = var2 - var4 << 8;
            this.method_107(-1);
         } else if (var5 == 1) {
            field_116[0] = var1 - var3 - 12 << 8;
            field_116[10] = 0;
         } else if (var5 == 2) {
            field_116[0] = var1 + var3 + 12 + 1 << 8;
            field_116[10] = 0;
         } else if (var5 == 3) {
            field_116[1] = var2 + var4 + 12 + 12 + 1 << 8;
         }
      }

      if (this.field_203 && var5 != 0) {
         this.field_203 = false;
      }

   }

   // $FF: renamed from: c () boolean
   public final boolean method_248() {
      if (this.field_167 >= 50) {
         return false;
      } else if (field_122 && field_118) {
         return false;
      } else if (this.field_297 > 0) {
         return false;
      } else {
         int var1 = (this.field_174 + this.field_176) / 100 + this.field_178;
         int var2 = (this.field_175 + this.field_177) / 100 + this.field_179 - 16;
         int var3 = var1 - method_102();
         int var4 = var2 - (method_103() - 16);
         if (var3 * var3 + var4 * var4 < 1024) {
            if (field_124) {
               this.field_297 = 1;
               return true;
            } else {
               if (this.field_101 == 0) {
                  this.method_104();
               }

               this.field_297 = 1;
               return false;
            }
         } else {
            return false;
         }
      }
   }

   // $FF: renamed from: d (int, int) void
   public static void method_249(int var0, int var1) {
      int var3 = method_102();
      int var4 = method_103() - 16;
      short var2;
      if (var1 >= var4) {
         if (var0 <= var3) {
            var2 = 45;
         } else {
            var2 = 315;
         }
      } else if (var0 <= var3) {
         var2 = 135;
      } else {
         var2 = 225;
      }

      field_116[3] = method_5(var2) * 8;
      field_116[5] = method_6(var2) * 8;
   }

   // $FF: renamed from: Q () void
   public final void method_250() {
      int[] var1 = this.field_199;
      this.field_176 = 0;
      this.field_177 = method_5(this.field_171 / 100) * 8;
      this.method_244(var1);
      if (this.method_248()) {
         method_249(var1[2], var1[3]);
         if (this.field_182 == 0 && this.field_167 < 100) {
            if (--this.field_186 <= 0) {
               this.field_167 = 100;
               return;
            }

            this.field_184 = 3;
            this.field_182 = this.field_185 = 60;
         }
      }

      if (this.field_167 < 100) {
         int var4;
         for(var4 = this.field_170 / 100; var4 < 0; var4 += 360) {
         }

         int var5 = 180 + method_5(var4) * 90 / 100;
         int var2 = (this.field_174 + this.field_176) / 100 + method_5(var5) * this.field_172 / 100 + field_207[120][15][4];
         int var3 = (this.field_175 + this.field_177) / 100 + method_6(var5) * this.field_172 / 100 + field_207[120][15][5];
         if (method_193(this.field_178 + var2, this.field_179 + var3, 28)) {
            this.method_104();
            this.field_184 = 1;
            this.field_185 = 60;
         }
      }

      switch (this.field_167) {
         case 6:
            this.field_168 = 2;
            this.field_174 -= 100;
            this.field_170 += this.field_173;
            this.field_171 += 100;
            if (this.field_174 > -3200) {
               return;
            }

            this.field_174 = -3200;
            ++this.field_167;
         case 7:
            this.field_168 = 0;
            this.field_169 = 1;
            this.field_171 += 100;
            if (this.field_173 < 0) {
               this.field_170 += this.field_173;
               if (this.field_170 < -9000) {
                  this.field_173 = -this.field_173;
                  this.field_170 = -9000;
                  return;
               }
               break;
            } else {
               this.field_170 += this.field_173;
               if (this.field_170 < 9000) {
                  return;
               }

               this.field_170 = 9000;
               this.field_173 = -this.field_173;
               this.field_180 = 64;
               ++this.field_167;
            }
         case 8:
            this.field_168 = 2;
            this.field_174 += 100;
            this.field_170 += this.field_173;
            this.field_171 += 100;
            if (this.field_174 < 3200) {
               return;
            }

            if (this.field_180 > 0) {
               return;
            }

            this.field_174 = 3200;
            ++this.field_167;
         case 9:
            this.field_168 = 0;
            this.field_169 = 0;
            this.field_171 += 100;
            if (this.field_173 <= 0) {
               this.field_170 += this.field_173;
               if (this.field_170 > -9000) {
                  return;
               }

               this.field_170 = -9000;
               this.field_173 = -this.field_173;
               this.field_180 = 64;
               this.field_167 = 6;
               return;
            }

            this.field_170 += this.field_173;
            if (this.field_170 > 9000) {
               this.field_173 = -this.field_173;
               this.field_170 = 9000;
               return;
            }
            break;
         case 100:
            this.field_168 = 3;
            this.field_180 = 40;
            ++this.field_167;
         case 101:
            if (this.field_180 > 0) {
               return;
            }

            this.field_180 = 180;
            ++this.field_167;
         case 102:
            if (this.field_172 > 0) {
               --this.field_172;
            }

            if (this.field_180 > 0) {
               return;
            }

            this.field_168 = 4;
            this.field_180 = 80;
            ++this.field_167;
         case 103:
            this.field_168 = 4;
            this.field_175 += 200;
            this.method_246(var1);
            if (var1[3] < field_141[this.field_221]) {
               return;
            }

            this.field_180 = 40;
            ++this.field_167;
         case 104:
            if (this.field_180 > 0) {
               return;
            }

            this.method_243();
            this.field_180 = 16;
            ++this.field_167;
         case 105:
            this.field_168 = 5;
            this.field_169 = 1;
            this.field_174 += 200;
            this.field_175 -= 50;
            if (this.field_180 > 0) {
               return;
            }

            this.field_180 = 120;
            ++this.field_167;
         case 106:
            this.field_168 = 6;
            this.field_169 = 1;
            this.field_174 += 600;
            this.field_175 -= 50;
            if (this.field_180 > 0) {
               return;
            }

            ++this.field_167;
         case 107:
            this.field_168 = -1;
            this.field_199[0] = 0;
            this.method_241();
            break;
         default:
            this.field_167 = 1;
         case 1:
            this.field_174 = 10000;
            this.field_175 = -12000;
            this.field_172 = -32;
            this.field_173 = -100;
            this.field_170 = 0;
            this.field_171 = 0;
            this.field_180 = 80;
            ++this.field_167;
         case 2:
            this.field_168 = 0;
            this.field_175 += 80;
            if (this.field_175 < 0) {
               return;
            }

            this.field_175 = 0;
            this.field_180 = 100;
            ++this.field_167;
         case 3:
            this.field_168 = 2;
            this.field_174 -= 100;
            if (this.field_180 > 0) {
               return;
            }

            ++this.field_167;
         case 4:
            this.field_168 = 1;
            if (++this.field_172 < 96) {
               return;
            }

            this.field_180 = 32;
            ++this.field_167;
         case 5:
            this.field_168 = 2;
            this.field_174 -= 50;
            this.field_170 += this.field_173;
            this.field_171 += 100;
            if (this.field_174 > -3200) {
               return;
            }

            this.field_174 = -3200;
            this.field_167 = 6;
            return;
      }

   }

   // $FF: renamed from: R () void
   public final void method_251() {
      int[] var1 = this.field_199;
      if (!this.method_244(this.field_199)) {
         this.field_171 += 100;
         this.field_176 = 0;
         this.field_177 = method_5(this.field_171 / 100) * 10;
         if (this.field_167 > 99) {
            if (this.method_245()) {
               var1[0] = 0;
            }

         } else {
            if (this.method_248() && this.field_167 > 3) {
               method_249(var1[2], var1[3]);
               if (this.field_182 == 0 && this.field_167 < 100) {
                  if (--this.field_186 <= 0) {
                     this.field_142 = 0;
                     this.field_167 = 100;
                     return;
                  }

                  this.field_184 = 3;
                  this.field_182 = this.field_185 = 60;
                  this.field_183 = 20;
               }
            }

            if (this.field_142 > 0 && --this.field_142 == 0) {
               this.field_142 = 150 + method_58(150);
               this.method_199(16, this.field_178 + method_58(40) - 20, this.field_179 + 130, 0, -300, 0, 1);
            }

            switch (this.field_167) {
               case 4:
                  this.field_168 = 2;
                  this.field_169 = 0;
                  ++this.field_167;
               case 5:
                  this.field_168 = 2;
                  this.field_169 = 0;
                  this.field_174 -= 150;
                  this.field_175 -= 12;
                  if (this.field_174 > -10400) {
                     return;
                  } else {
                     this.field_174 = -10400;
                     ++this.field_167;
                  }
               case 6:
                  this.field_175 += 50;
                  if (this.field_175 <= 1200) {
                     return;
                  } else {
                     this.field_175 = 1200;
                     ++this.field_167;
                  }
               case 7:
                  this.field_184 = 1;
                  this.field_185 = 60;
                  this.field_180 = 48;
                  ++this.field_167;
               case 8:
                  if (this.field_180 == 8) {
                     this.method_199(17, var1[2], var1[3] + 16, 0, 0, 0, 0);
                  }

                  if (this.field_180 > 0) {
                     return;
                  }

                  this.method_246(var1);
                  ++this.field_167;
                  return;
               case 9:
                  this.field_168 = 2;
                  this.field_169 = 1;
                  ++this.field_167;
               case 10:
                  this.field_168 = 2;
                  this.field_169 = 1;
                  this.field_174 += 150;
                  this.field_175 -= 12;
                  if (this.field_174 < 10400) {
                     return;
                  } else {
                     this.field_174 = 10400;
                     ++this.field_167;
                  }
               case 11:
                  this.field_175 += 50;
                  if (this.field_175 <= 1200) {
                     return;
                  } else {
                     this.field_175 = 1200;
                     ++this.field_167;
                  }
               case 12:
                  this.field_184 = 1;
                  this.field_185 = 60;
                  this.field_180 = 48;
                  ++this.field_167;
               case 13:
                  if (this.field_180 == 8) {
                     this.method_199(17, var1[2], var1[3] + 16, 0, 0, 0, 0);
                  }

                  if (this.field_180 > 0) {
                     return;
                  } else {
                     this.method_246(var1);
                     ++this.field_167;
                  }
               case 14:
                  this.field_175 -= 100;
                  if (this.field_175 > 0) {
                     return;
                  }

                  this.field_175 = 0;
                  this.field_167 = 4;
                  return;
               default:
                  this.field_167 = 1;
               case 1:
                  this.field_184 = 0;
                  this.field_168 = 2;
                  this.field_174 = 31200;
                  this.field_175 = 4800;
                  this.field_170 = 0;
                  this.field_171 = 0;
                  this.field_142 = 0;
                  this.field_180 = 30;
                  ++this.field_167;
               case 2:
                  if (this.field_180 > 0) {
                     return;
                  } else {
                     ++this.field_167;
                  }
               case 3:
                  this.field_168 = 2;
                  this.field_174 -= 150;
                  this.field_175 -= 20;
                  if (this.field_174 <= 10400) {
                     if (this.field_180 <= 0) {
                        this.field_174 = 10400;
                        this.field_168 = 0;
                        this.field_184 = 1;
                        this.field_185 = 60;
                        this.field_180 = 60;
                        this.field_142 = 120;
                        ++this.field_167;
                     }
                  }
            }
         }
      }
   }

   // $FF: renamed from: aI () void
   private void method_252() {
      this.field_52 = 0;
      this.field_220 = 6;
      this.field_201 = true;
   }

   // $FF: renamed from: S () void
   public final void method_253() {
      if (this.field_322) {
         if (this.field_57 > 0 && this.field_52 < 4) {
            --this.field_57;
         }

         switch (this.field_52) {
            case 2:
               this.field_55 = 0;
               this.field_54 += 4;
               if (this.field_54 >= this.field_59) {
                  this.field_54 = this.field_59;
                  this.field_55 = 1;
                  this.field_52 = 3;
               }
               break;
            case 3:
               if (this.field_57 == 0) {
                  this.method_142(false);
                  this.field_52 = 999;
               } else if (this.field_30[0]) {
                  this.field_55 = 2;
                  this.field_56 = 0;
                  this.method_11();
                  this.field_52 = 4;
               }
               break;
            case 4:
               ++this.field_56;
               if (this.field_56 > 8) {
                  ++this.field_53;
               }

               if (this.field_56 > 12) {
                  this.field_53 += 20;
               }

               if (this.field_56 >= 45) {
                  this.field_52 = 5;
               }
               break;
            case 5:
               this.field_36.method_383();
               this.method_142(true);
               this.field_52 = 999;
            case 999:
               break;
            default:
               this.field_52 = 1;
            case 1:
               this.field_53 = this.field_58;
               this.field_54 = 0;
               this.field_57 = 659;
               this.field_55 = -1;
               this.field_56 = -1;
               field_29[121] = method_134("/continue.png");
               this.field_36.method_380(15, -1);
               this.field_52 = 2;
         }

         this.field_322 = false;
      }
   }

   // $FF: renamed from: T () void
   public final void method_254() {
      this.field_322 = true;
      int var1;
      int var2 = (var1 = field_22 >> 1) + 6;
      int var3 = field_22 >> 2;
      int var4 = field_18 >> 1;
      field_26.setColor(0);
      field_26.setClip(0, field_23, field_18, field_22);
      field_26.fillRect(0, field_23, field_18, field_22);
      if (field_29[121] != null) {
         if (this.field_52 != 1) {
            int var5;
            int var6;
            short var7;
            boolean var8;
            boolean var9;
            if (this.field_55 == 0) {
               method_123(121, 0, 0, 36, 24, 0, var4, this.field_59);
               var5 = this.field_32 % 5;
               var6 = field_60[var5][0];
               var7 = field_60[var5][1];
               var8 = false;
               var9 = false;
               method_123(151, var6, var7, 36, 18, 0, var4, this.field_54);
            } else if (this.field_55 == 1) {
               var5 = this.field_32 >> 2 & 3;
               var6 = field_61[var5][0];
               var7 = field_61[var5][1];
               var8 = false;
               var9 = false;
               method_123(121, var6, var7, 36, 24, 0, var4, this.field_59);
            } else if (this.field_55 == 2) {
               boolean var10 = false;
               byte var11;
               byte var12;
               byte var13;
               if (this.field_56 < 1) {
                  var6 = 36;
                  var11 = 90;
                  var12 = 36;
                  var13 = 18;
               } else {
                  if (this.field_56 < 12) {
                     var5 = (this.field_56 >> 1) % 6;
                  } else {
                     var5 = 6 + (this.field_56 - 12) % 4;
                  }

                  var6 = var5 * 30;
                  var11 = 30;
                  var12 = 30;
                  var13 = 30;
               }

               method_123(121, 0, 0, 36, 24, 0, var4, this.field_59);
               method_123(151, var6, var11, var12, var13, 0, this.field_53, this.field_59);
            }

            if (this.field_55 < 2) {
               method_123(121, 72, 0, 12, 12, 0, var4 - 12, var2);
               method_123(121, 72, 0, 12, 12, 0, var4 + 12, var2);
               method_39(var4 - 7, var1, this.field_57 / 60, 2);
            }

            method_123(121, 0, 48, 90, 12, 0, var4, var3);
         }
      }
   }

   // $FF: renamed from: U () void
   public final void method_255() {
      switch (this.field_41) {
         case 0:
            this.field_42 = 0;
            this.field_41 = 2;
            return;
         case 2:
            ++this.field_42;
            if (this.field_42 > 360) {
               this.method_42();
            }
         default:
      }
   }

   // $FF: renamed from: V () void
   public final void method_256() {
      int var1 = field_29[154].getWidth() / 6;
      int var2 = field_28[10].getWidth();
      this.method_155();
      field_26.setColor(16777215);
      field_26.fillRect(0, field_23, field_18, field_22);
      method_132(field_26, field_28[10], 0, 108, var2, var1, field_35[0], field_24, 10, 17, true);

      for(int var4 = 0; var4 < this.field_40 - 1; ++var4) {
         method_132(field_26, field_29[154], var4 * var1, 0, var1, var1, field_35[0], this.field_43[var4] >> 16, this.field_43[var4] & '\uffff', 0, true);
      }

      switch (this.field_41) {
         case 2:
            if ((this.field_32 >> 1 & 1) == 0) {
               method_132(field_26, field_29[154], (this.field_40 - 1) * var1, 0, var1, var1, field_35[0], this.field_43[this.field_40 - 1] >> 16, this.field_43[this.field_40 - 1] & '\uffff', 0, true);
            }
         default:
      }
   }

   // $FF: renamed from: W () void
   public final void method_257() throws Exception {
      switch (this.field_44) {
         case 1:
            ++this.field_46;
            if (this.field_46 > 480) {
               this.field_44 = 2;
               return;
            }

            if (this.field_46 > 360) {
               this.field_45 = 2;
               return;
            }

            if (this.field_46 > 240) {
               this.field_45 = 1;
               return;
            }
            break;
         case 2:
            ++this.field_47;
            if (this.field_47 > 240) {
               if (this.field_40 == 6) {
                  this.field_44 = 3;
                  return;
               }

               this.field_44 = 4;
               this.field_51 = 3;
               this.field_50 = 0;
               return;
            }

            if (this.field_47 > 32) {
               this.field_48 = 2;
               return;
            }

            if (this.field_47 > 16) {
               this.field_48 = 1;
               return;
            }
            break;
         case 3:
            ++this.field_49;
            if (this.field_49 > 240) {
               if (this.method_258()) {
                  this.field_220 = 9;
                  this.field_249 = true;
                  return;
               }

               this.method_161(false);
               this.field_220 = 1;
               return;
            }
            break;
         case 4:
            ++this.field_49;
            switch (this.field_51) {
               case 0:
                  if (this.field_323 + (6 - this.field_40) * 16 <= 0) {
                     this.field_323 = 0;
                     this.field_49 = 0;
                     ++this.field_50;
                     this.field_51 = 3;
                  } else {
                     this.field_323 -= 2;
                  }
                  break;
               case 1:
                  if (this.field_49 > 24) {
                     this.field_51 = 0;
                     this.field_323 = 145;
                  }
                  break;
               case 2:
                  if (this.field_323 - (6 - this.field_40) * 16 >= 180) {
                     this.field_323 = 180;
                     this.field_49 = 0;
                     ++this.field_50;
                     this.field_51 = 1;
                  } else {
                     this.field_323 += 2;
                  }
                  break;
               case 3:
                  if (this.field_49 > 24) {
                     this.field_51 = 2;
                     this.field_323 = 35;
                  }
            }

            if (this.field_50 > 4) {
               if (this.method_258()) {
                  this.field_220 = 9;
                  this.field_249 = true;
                  return;
               }

               this.field_220 = 1;
               this.field_249 = true;
               this.field_250 = 10;
               field_29 = new Image[160];
               this.method_161(false);
            }
            break;
         default:
            this.field_44 = 0;
         case 0:
            field_27 = null;
            method_133(field_29);
            field_29[155] = method_134("/ED3.png");
            field_29[154] = method_134("/emeralds.png");
            if (this.field_40 == 6) {
               field_29[157] = method_134("/endegg_b.png");
               this.field_44 = 1;
               this.field_45 = 0;
               this.field_48 = 0;
            } else {
               field_29[157] = method_134("/endegg_a.png");
               this.field_48 = 0;
               this.field_44 = 2;
            }

            field_27 = method_134("/zone1.png");
            this.field_221 = 0;
            this.method_55();
            this.method_29();
            this.field_236[0][0] = 3;
            this.field_236[1][0] = 1;
            this.field_236[2][0] = 1;
            this.field_236[3][0] = 1;
            this.field_236[4][0] = 1;
            this.field_236[1][0] = 9;
            this.field_236[1][1] = 9;
            this.field_236[1][2] = 9;
            this.field_236[1][3] = 9;
            this.field_236[1][4] = 9;
            this.field_236[2][0] = 9;
            this.field_236[2][1] = 9;
            this.field_236[2][2] = 9;
            this.field_236[2][3] = 9;
            this.field_236[2][4] = 9;
            field_226[0] = 0;
            field_226[1] = 28;
            this.field_46 = 0;
            this.field_47 = 0;
            this.field_49 = 0;
            return;
      }

   }

   // $FF: renamed from: d () boolean
   public final boolean method_258() {
      for(int var1 = 0; var1 < field_10.length; ++var1) {
         if (field_10[var1] < this.field_107) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: X () void
   public final void method_259() {
      field_26.setClip(0, 0, field_17, field_16);
      field_26.setColor(0);
      field_26.fillRect(0, 0, field_17, field_16);
      if (this.field_44 == 2 || this.field_44 == 1) {
         this.method_160(false, false);
      }

      this.method_155();
      int var1;
      if (field_21 < field_17) {
         var1 = field_17 - field_21 >> 1;
         field_26.translate(var1, 0);
      }

      int var2;
      int var3;
      int var4;
      int var5;
      label72:
      switch (this.field_44) {
         case 1:
            field_26.setClip(0, field_23, field_17, field_22);
            this.method_34(field_26, false);
            switch (this.field_45) {
               case 0:
                  var1 = this.field_46 >> 1 & 1;
                  field_26.drawRegion(field_29[157], var1 * 24, 72, 24, 30, field_35[0], field_24, field_23 + field_22 - 5, 33);
                  break label72;
               case 1:
                  field_26.drawRegion(field_29[157], 48, 72, 24, 30, field_35[0], field_24, field_23 + field_22 - 5, 33);
                  if ((this.field_46 >> 1 & 1) == 0) {
                     for(var2 = 0; var2 < 6; ++var2) {
                        var4 = (var3 = Math.min(60, this.field_46 - 240) / 4 * 3) * method_6(var2 * 36) / 100;
                        var5 = var3 * method_5(var2 * 36) / 100;
                        field_26.drawRegion(field_29[154], var2 * 12, 0, 12, 12, field_35[0], field_24 + var4, field_23 + field_22 - 22 - (var3 >> 1) - var5, 3);
                     }
                  }
                  break label72;
               case 2:
                  var1 = 3 + (this.field_46 >> 5 & 1);
                  field_26.drawRegion(field_29[157], var1 * 24, 72, 24, 30, field_35[0], field_24, field_23 + field_22 - 5, 33);

                  for(var2 = 0; var2 < 6; ++var2) {
                     var4 = 45 * method_6(var2 * 36) / 100;
                     var5 = 45 * method_5(var2 * 36) / 100;
                     field_26.drawRegion(field_29[154], var2 * 12, 0, 12, 12, field_35[0], field_24 + var4, field_23 + field_22 - 22 - 22 - var5, 3);
                  }
               default:
                  break label72;
            }
         case 2:
            field_26.setClip(0, field_23, field_17, field_22);
            this.method_34(field_26, false);
            switch (this.field_48) {
               case 0:
                  field_26.drawRegion(field_29[155], 0, 0, 24, 30, field_35[0], field_24, field_23 + field_22 - 10, 33);
                  break label72;
               case 1:
                  field_26.drawRegion(field_29[155], 0, 30, 36, 54, field_35[0], field_24, field_23 + field_22 - 20, 33);
                  break label72;
               case 2:
                  field_26.drawRegion(field_29[155], 36, 0, 132, 100, field_35[0], field_24, field_23 + field_22 - 20, 33);
               default:
                  break label72;
            }
         case 3:
            field_26.setColor(0);
            field_26.fillRect(0, field_23, field_17, field_22);
            var1 = this.field_49 / 15 % 3;
            field_26.drawRegion(field_29[157], var1 * 48, 0, 48, 72, field_35[0], field_24, field_25, 3);
            break;
         case 4:
            field_26.setColor(0);
            field_26.fillRect(0, field_23, field_17, field_22);
            label54:
            switch (this.field_51) {
               case 0:
                  field_26.drawRegion(field_29[157], 96, 0, 96, 84, field_35[0], field_24, field_25, 3);
                  var4 = 0;

                  while(true) {
                     if (var4 >= 6 - this.field_40) {
                        break label54;
                     }

                     var5 = Math.max(Math.min(145, this.field_323 + var4 * 16), 0);
                     var2 = field_24 + 40 * method_6(var5) / 100;
                     var3 = field_25 - 15 - 40 * method_5(var5) / 100;
                     field_26.drawRegion(field_29[154], (5 - var4) * 12, 0, 12, 12, field_35[0], var2, var3, 3);
                     ++var4;
                  }
               case 1:
                  var2 = field_24 + 40;
                  var3 = field_25 - 20;
                  field_26.drawRegion(field_29[157], 0, 0, 96, 84, field_35[0], field_24, field_25, 3);
                  field_26.drawRegion(field_29[154], 0, 0, 12, 12, field_35[0], var2, var3, 3);
                  break;
               case 2:
                  field_26.drawRegion(field_29[157], 96, 0, 96, 84, field_35[4], field_24, field_25, 3);
                  var4 = 0;

                  while(true) {
                     if (var4 >= 6 - this.field_40) {
                        break label54;
                     }

                     var5 = Math.min(Math.max(35, this.field_323 - var4 * 16), 180);
                     var2 = field_24 + 40 * method_6(var5) / 100;
                     var3 = field_25 - 15 - 40 * method_5(var5) / 100;
                     field_26.drawRegion(field_29[154], (5 - var4) * 12, 0, 12, 12, field_35[0], var2, var3, 3);
                     ++var4;
                  }
               case 3:
                  var2 = field_24 - 40;
                  var3 = field_25 - 20;
                  field_26.drawRegion(field_29[157], 0, 0, 96, 84, field_35[0], field_24, field_25, 3);
                  field_26.drawRegion(field_29[154], 0, 0, 12, 12, field_35[0], var2, var3, 3);
            }

            field_26.drawRegion(field_29[157], 0, 86, 190, 26, field_35[0], field_24, field_23 + field_22, 33);
      }

      if (field_21 < field_17) {
         field_26.translate(-(field_17 - field_21 >> 1), 0);
      }

   }

   // $FF: renamed from: Y () void
   public final void method_260() {
      if (this.field_30[4]) {
         ++this.field_325;
         if (this.field_325 > 2) {
            this.field_325 = 0;
            return;
         }
      } else if (this.field_30[3]) {
         --this.field_325;
         if (this.field_325 < 0) {
            this.field_325 = 2;
            return;
         }
      } else {
         int var10002;
         if (this.field_30[2]) {
            var10002 = this.field_326[this.field_325]--;
            if (this.field_326[this.field_325] < 0) {
               this.field_326[this.field_325] = field_324.length - 1;
               return;
            }
         } else if (this.field_30[1]) {
            var10002 = this.field_326[this.field_325]++;
            if (this.field_326[this.field_325] >= field_324.length) {
               this.field_326[this.field_325] = 0;
               return;
            }
         } else if (this.field_30[0]) {
            this.method_261();
         }
      }

   }

   // $FF: renamed from: aJ () void
   private void method_261() {
      int var1;
      label26:
      for(var1 = 0; var1 < field_10.length; ++var1) {
         if (field_10[var1] < this.field_107) {
            int var2 = field_10.length - 1;

            while(true) {
               if (var2 <= var1) {
                  break label26;
               }

               field_10[var2] = field_10[var2 - 1];
               field_11[var2] = field_11[var2 - 1];
               --var2;
            }
         }
      }

      if (var1 < field_10.length) {
         field_10[var1] = this.field_107;
         field_11[var1] = this.field_296[0];
         field_9[var1] = new String(new char[]{field_324[this.field_326[0]], field_324[this.field_326[1]], field_324[this.field_326[2]]});
         this.method_18();
      }

      this.field_220 = 1;
      this.method_161(false);
      this.field_66 = 5;
      this.method_164(1);
      this.field_107 = 0;
   }

   // $FF: renamed from: Z () void
   public final void method_262() {
      this.method_155();
      field_26.setColor(0);
      field_26.fillRect(0, field_23, field_18, field_22);
      switch (this.field_296[2]) {
         case 0:
            this.method_158("ENTER NAME", false);
            break;
         case 1:
            this.method_158("NAMEN EINGEBEN", false);
            break;
         case 2:
            this.method_158("ENTREZ VOTRE NOM", false);
            break;
         case 3:
            this.method_158("INTRODUCE TU NOMBRE", false);
            break;
         case 4:
            this.method_158("INSERISCI NOME", false);
      }

      field_26.setColor(16777215);
      int var1 = field_17 / (this.field_326.length + 1);

      int var2;
      for(var2 = 0; var2 < this.field_326.length; ++var2) {
         field_26.drawString(String.valueOf(field_324[this.field_326[var2]]), (var2 + 1) * var1, field_25 + (field_26.getFont().getHeight() >> 1), 65);
      }

      field_26.setColor(16386570);
      var2 = field_26.getFont().getHeight() * 3 >> 1;
      field_26.drawRect((this.field_325 + 1) * var1 - (var2 >> 1), field_25 - (var2 >> 1), var2, var2);
   }

   // $FF: renamed from: e (int) int
   public final int method_263(int var1) {
      try {
         switch (var1) {
            case -7:
               return 13;
            case -6:
               return 12;
            case 35:
               return 10;
            case 42:
               return 11;
            case 48:
               return 0;
            case 49:
               return 1;
            case 50:
               return 2;
            case 51:
               return 3;
            case 52:
               return 4;
            case 53:
               return 5;
            case 54:
               return 6;
            case 55:
               return 7;
            case 56:
               return 8;
            case 57:
               return 9;
            default:
               switch (this.getGameAction(var1)) {
                  case 1:
                     return 14;
                  case 2:
                     return 16;
                  case 3:
                  case 4:
                  case 7:
                  default:
                     break;
                  case 5:
                     return 17;
                  case 6:
                     return 15;
                  case 8:
                     return 18;
               }
         }
      } catch (Exception var3) {
      }

      return 19;
   }

   static {
      field_15 = field_14.getHeight();
      field_16 = 0;
      field_17 = 0;
      field_18 = field_17;
      field_19 = field_16;
      field_21 = field_17;
      field_22 = field_16;
      field_28 = new Image[20];
      field_29 = new Image[160];
      field_34 = new Random();
      field_35 = new int[]{0, 5, 3, 6, 2, 7, 1, 4};
      field_37 = new String[]{"/greenhill_loop", "/labyrinth_loop", "/marble_loop", "/starlight_loop", "/springyard_loop", "/scrapbrain", "/invincible", "/1up", "/specialstage", "/maintitle", "/ending", "/bossstage", "/bossstagefinal_loop", "/stageclear", "/gameover", "/continue", "/credits", "/hurry", "/chaosemerald"};
      field_60 = new short[][]{{0, 90, 0}, {36, 90, 0}, {72, 90, 0}, {72, 90, 1}, {36, 90, 1}};
      field_61 = new short[][]{{36, 0}, {0, 24}, {36, 24}, {0, 24}};
      field_81 = new int[][]{{0, 1, 83, 10}, {84, 1, 40, 10}, {0, 13, 55, 10}, {61, 13, 36, 10}, {98, 12, 6, 12}, {104, 12, 10, 12}, {116, 12, 10, 12}, {0, 25, 94, 10}, {98, 24, 17, 5}, {0, 37, 94, 10}, {96, 30, 30, 30}, {0, 49, 86, 10}, {0, 61, 78, 10}, {78, 60, 30, 30}, {0, 74, 77, 10}, {0, 85, 51, 10}, {0, 96, 112, 10}, {0, 108, 130, 10}};
      field_95 = new int[2];
      field_116 = new int[16];
      field_134 = new int[][]{{80, 944, 80, 252, 80, 944, 128, 168}, {96, 108, 80, 236, 80, 748, 2944, 0}, {48, 614, 48, 614, 48, 358, 128, 168}, {64, 716, 64, 332, 64, 332, 128, 168}, {48, 957, 48, 445, 48, 236, 128, 168}, {48, 1164, 48, 1868, 8512, 1452, 128, 168, 304, 168}, {1568, 363, 3808, 364, 128, 168, 128, 168}};
      field_140 = new byte[]{1, 2, 3, 2};
      field_141 = new int[]{912, 224, 656, 672, 1360, -16};
      field_145 = new int[]{32, 32, 32, 32, 32, 32, 32, 32, 33, 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 39, 39, 40, 40, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 46, 46, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};
      field_147 = new int[]{1296, 3632, 752, 4880};
      field_148 = new int[]{1168, 1104, 1680, 1360};
      field_149 = new int[]{1263, 3598, 785, 4845};
      field_150 = new int[]{1216, 1136, 1728, 1392};
      field_151 = new int[]{-1, -1, 1, -1};
      field_153 = new int[]{4, 7, 5, 6, 0, 3, 2, 1};
      field_154 = new int[]{0, 5, 8, 17, 20, 28, 32, 34};
      int[] var10000 = new int[]{16, 16, 8, 8, 8};
      var10000 = new int[]{32, 32, 24, 24, 16};
      var10000 = new int[]{32, 32, 16, 24, 16};
      field_156 = new int[]{0, 10000, 1000, 100};
      field_157 = new int[]{-8, -16, -12, 12, 16, 8};
      field_158 = new int[]{22, 25, 13, 22, 25, 13};
      field_159 = new int[]{2, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 1, 0, 1};
      int[][] var0 = new int[][]{{-1, 1}, {1, -1}};
      var10000 = new int[]{40, 40, 16, 16, 0};
      var0 = new int[][]{{0, 4}, {4, 0}, {2, 6}, {0, 0}};
      var0 = new int[][]{{2, 6}, {2, 6}, {4, 0}, {2, 6}};
      field_160 = new int[]{8, 0, 4, 3, 2, 1, 0};
      field_161 = new int[]{field_35[0], field_35[1], field_35[7], field_35[4]};
      field_162 = new int[]{8, 0, 40, 24, 10, 40, 30, 24, 41, 6};
      field_163 = new int[]{8, 16, 8, 30, 23, 24, 18, 16, 18, 8};
      field_164 = new int[]{0, 24, 48, 72, 96, 126, 156};
      field_165 = new int[][]{{44, 44, 44, 44, 44, 44, 44, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 44, 44, 44, 44, 44, 44, 44}, {52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52}, {37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53}};
      field_192 = new short[][]{{0, 0}, {12, 0}, {0, 12}, {12, 12}};
      short[][] var1 = new short[][]{{88, 56, 16, 16}, {64, 56, 24, 24}, {88, 72, 16, 16}, {88, 88, 16, 16}, {64, 80, 24, 24}};
      field_193 = new short[][]{{-250, -360}, {-80, -100}, {-160, -250}, {-200, -300}, {-120, -225}, {-150, -250}, {-100, -165}};
      field_206 = new byte[][]{{28, 31}, {32, 29}, {33, 29}, {28, 34}, {34, 30}, {31, 30}, {33, 33}, {31, 31}};
      field_213 = new short[][]{{9312, 7776}, {6736, 4176, 8208}, {6224, 6224}, {8288, 8032}, {8800, 10336}, {8544, 7648}};
      field_215 = new int[]{0, 2, 7, 12, 11, 9, 1};
      field_216 = new int[][]{{0, 0, 0}, {2, 2, 2}, {4, 4, 4}, {1, 1, 1}, {3, 3, 3}, {5, 5, 1}, {5, 0}};
      field_217 = new int[][]{{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 3}, {3, 3}};
      field_225 = new int[2];
      field_226 = new int[2];
      field_238 = new int[][][]{{{4, 0, 9407, 0, 768, 96}, {4, 0, 7871, 0, 768, 96}, {4, 0, 10496, 0, 768, 96}, {4, 0, 10943, 0, 768, 96}}, new int[0][], {{4, 0, 6079, 0, 464, 96}, {4, 0, 6079, 0, 1312, 96}, {4, 0, 6048, 0, 1824, 96}, {4, 0, 5823, 0, 1824, 96}}, new int[0][], {{4, 0, 8896, 0, 1056, 96}, {4, 0, 10432, 0, 1312, 96}, {4, 0, 11264, 0, 1568, 96}, {4, 0, 11968, 0, 1568, 96}}, new int[0][]};
      field_255 = true;
      field_256 = true;
      field_257 = true;
      field_303 = new int[]{0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};
      var10000 = new int[]{0, 0, 0, 2};
      field_320 = new int[][]{{0, 0, 142, 81}, {0, 120, 36, 42}, {0, 81, 42, 37}, {80, 141, 39, 27}, {46, 81, 45, 41}, {37, 124, 41, 42}, {95, 82, 26, 42}, {122, 81, 20, 43}, {95, 82, 26, 42}, {101, 125, 19, 15}, {122, 125, 20, 43}, {122, 82, 20, 43}, {0, 168, 142, 42}};
      field_324 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '9', '8', '7', '6', '5', '4', '3', '2', '1', '@', '?', '!', ',', '.', ' '};
   }
}
