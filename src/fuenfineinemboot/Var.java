package fuenfineinemboot;

import java.awt.Point;
import java.awt.TextArea;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Var {

	static String playmode="null";
	static JFrame frame = new JFrame();
	static JFrame gui = new JFrame();
	static JButton two1 = new JButton("2 Player");
	static JButton four1 = new JButton("4 Player");
	static JButton two2 = new JButton("1P & 1COM");
	static JButton four2 = new JButton("1P & 3COM");
	static JButton four3 = new JButton("4COM");
	static TextArea cplayer = new TextArea();
	
	
	static complayer com = new complayer();
	
	static Random r = new Random();
	
	//Temp
	static String currentplayer="";
	static String currentfigure;
	static int currentx=404;
	static int currenty=404;
	static int posX;
	static int posY;
	static String currentzone="";
	static int currentzonez;
	static boolean movecorrect=true;
	static boolean bootmovepass=false;
	static boolean fieldmove=true;
	static String menu="start";
	static boolean rotateboat=false;
	static int re=0;
	
	static int lastlocblueX=0;
	static int lastlocblueY=0;
	static int lastlocredX=0;
	static int lastlocredY=0;
	static int lastlocgreenX=0;
	static int lastlocgreenY=0;
	static int lastlocyellowX=0;
	static int lastlocyellowY=0;

	static boolean start=false;
	
	static String[] zoneblue= new String[] {"Blau4","Blau5","Blau6","Blau7","Blau8",};
	static int zonebluec = 0;
	static String[] zonered=new String[] {"Rot4","Rot5","Rot6","Rot7","Rot8"};
	static int zoneredc = 0;
	static String[] zonegreen=new String[] {"Gruen4","Gruen5","Gruen6","Gruen7","Gruen8"};
	static int zonegreenc = 0;
	static String[] zoneyellow=new String[] {"Gelb4","Gelb5","Gelb6","Gelb7","Gelb8"};
	static int zoneyellowc = 0;
	
	static String[] bootpos = new String[] {"yellow","blue","green","red"};
	
	static boolean tempcheckloc=false;
	static Point tempfigureloc = new Point();
	static boolean tempfigureonplace=false;
	static int temp=0;
	
	static int YellowBootLoc=1;
	static int BlueBootLoc=2;
	static int GreenBootLoc=3;
	static int RedBootLoc=4;
	//Boat
	static boolean toboat=false;
	//ausgewählter boot
	static int currentboat=404; 
	//comrules: ob in der runde selected wurde
	static boolean selc=false;
	static boolean debug;
	
	static Point Acurrentpos = new Point();
	static boolean Afield=true;
	static boolean Bfield=true;
	
	static int BootBlauCount=0;
	static int BootRotCount=0;
	static int BootGelbCount=0;
	static int BootGruenCount=0;
	
	
	
	static String[] BlauBootFiguren = new String[5];
	static String[] RotBootFiguren = new String[5];
	static String[] GelbBootFiguren = new String[5];
	static String[] GruenBootFiguren = new String[5];
	
	
	//Die Zone im Start
	static int[] BlauZoneX = new int[] {298,258,225,270,238};
	static int[] BlauZoneY = new int[] {722,735,702,690,662};
	static int[] RotZoneX = new int[] {722,735,702,690,662};
	static int[] RotZoneY = new int[] {298,258,225,270,238};
	static int[] GruenZoneX = new int[] {238,225,258,270,298};
	static int[] GruenZoneY = new int[] {298,258,225,270,238};
	static int[] GelbZoneX = new int[] {722,733,688,703,662};
	static int[] GelbZoneY = new int[] {662,703,688,733,722};
	//Die Zone im Boot
	static int[] BootZoneX1 = new int[] {35,75,35,75,55};
	static int[] BootZoneY1 = new int[] {475,475,515,515,440};
	static int[] BootZoneX2 = new int[] {515,440,440,480,480};
	static int[] BootZoneY2 = new int[] {55,75,35,75,35};
	static int[] BootZoneX3 = new int[] {905,885,925,885,925};
	static int[] BootZoneY3 = new int[] {515,440,440,480,480};
	static int[] BootZoneX4 = new int[] {440,515,515,475,475};
	static int[] BootZoneY4 = new int[] {905,885,925,885,925};
	//Boot Plätze
	static int[] BootZoneX = new int[] {25,405,875,400};
	static int[] BootZoneY = new int[] {400,25,400,875};
	//Im Boot
	static int BootBlau = 0;
	static int BootRot = 0;
	static int BootGruen = 0;
	static int BootGelb = 0;
	//							  0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15
	static int[] XY = new int[] {157,200,243,286,329,372,415,458,501,544,587,630,673,716,759,802};
	
	
	static Point Blau1 = new Point();
	static Point Blau2 = new Point();
	static Point Blau3 = new Point();
	static Point Blau4 = new Point();
	static Point Blau5 = new Point();
	static Point Blau6 = new Point();
	static Point Blau7 = new Point();
	static Point Blau8 = new Point();
	static Point BlauBoot = new Point();
	static Point Rot1 = new Point();
	static Point Rot2 = new Point();
	static Point Rot3 = new Point();
	static Point Rot4 = new Point();
	static Point Rot5 = new Point();
	static Point Rot6 = new Point();
	static Point Rot7 = new Point();
	static Point Rot8 = new Point();
	static Point RotBoot = new Point();
	static Point Gruen1 = new Point();
	static Point Gruen2 = new Point();
	static Point Gruen3 = new Point();
	static Point Gruen4 = new Point();
	static Point Gruen5 = new Point();
	static Point Gruen6 = new Point();
	static Point Gruen7 = new Point();
	static Point Gruen8 = new Point();
	static Point GruenBoot = new Point();
	static Point Gelb1 = new Point();
	static Point Gelb2 = new Point();
	static Point Gelb3 = new Point();
	static Point Gelb4 = new Point();
	static Point Gelb5 = new Point();
	static Point Gelb6 = new Point();
	static Point Gelb7 = new Point();
	static Point Gelb8 = new Point();
	static Point GelbBoot = new Point();
	static Point currentloc = new Point();
	
	static boolean Blau1Zone = false;
	static boolean Blau2Zone = false;
	static boolean Blau3Zone = false;
	static boolean Blau4Zone = false;
	static boolean Blau5Zone = false;
	static boolean Blau6Zone = false;
	static boolean Blau7Zone = false;
	static boolean Blau8Zone = false;
	static boolean Rot1Zone = false;
	static boolean Rot2Zone = false;
	static boolean Rot3Zone = false;
	static boolean Rot4Zone = false;
	static boolean Rot5Zone = false;
	static boolean Rot6Zone = false;
	static boolean Rot7Zone = false;
	static boolean Rot8Zone = false;
	
	static ImageIcon blue = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon red = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon yellow = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon green = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	
	static ImageIcon guihintergrund = new ImageIcon(Var.class.getClassLoader().getResource("Gui.png"));
	//static ImageIcon hintergrund = new ImageIcon(Var.class.getResource("files/hintergrund.png"));
	static ImageIcon hintergrund = new ImageIcon(Var.class.getClassLoader().getResource("hintergrund1.png"));
	static ImageIcon blue1 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue2 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue3 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue4 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue5 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue6 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue7 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	static ImageIcon blue8 = new ImageIcon(Var.class.getClassLoader().getResource("Blau.png"));
	///
	static ImageIcon red1 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red2 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red3 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red4 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red5 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red6 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red7 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	static ImageIcon red8 = new ImageIcon(Var.class.getClassLoader().getResource("Rot.png"));
	///
	static ImageIcon green1 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green2 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green3 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green4 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green5 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green6 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green7 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	static ImageIcon green8 = new ImageIcon(Var.class.getClassLoader().getResource("Gruen.png"));
	///
	static ImageIcon yellow1 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow2 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow3 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow4 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow5 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow6 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow7 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	static ImageIcon yellow8 = new ImageIcon(Var.class.getClassLoader().getResource("Gelb.png"));
	
	static boolean BootBlau1d=false;
	static boolean BootBlau2d=true;
	static boolean BootBlau3d=false;
	static boolean BootBlau4d=false;
	static boolean BootRot1d=false;
	static boolean BootRot2d=false;
	static boolean BootRot3d=false;
	static boolean BootRot4d=true;
	static boolean BootGruen1d=false;
	static boolean BootGruen2d=false;
	static boolean BootGruen3d=true;
	static boolean BootGruen4d=false;
	static boolean BootGelb1d=true;
	static boolean BootGelb2d=false;
	static boolean BootGelb3d=false;
	static boolean BootGelb4d=false;

	static ImageIcon BootBlau1 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Blau/1.png"));
	static ImageIcon BootBlau2 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Blau/2.png"));
	static ImageIcon BootBlau3 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Blau/3.png"));
	static ImageIcon BootBlau4 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Blau/4.png"));
	static ImageIcon BootRot1 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Rot/1.png"));
	static ImageIcon BootRot2 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Rot/2.png"));
	static ImageIcon BootRot3 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Rot/3.png"));
	static ImageIcon BootRot4 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Rot/4.png"));
	static ImageIcon BootGruen1 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gruen/1.png"));
	static ImageIcon BootGruen2 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gruen/2.png"));
	static ImageIcon BootGruen3 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gruen/3.png"));
	static ImageIcon BootGruen4 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gruen/4.png"));
	static ImageIcon BootGelb1 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gelb/1.png"));
	static ImageIcon BootGelb2 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gelb/2.png"));
	static ImageIcon BootGelb3 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gelb/3.png"));
	static ImageIcon BootGelb4 = new ImageIcon(Var.class.getClassLoader().getResource("Boot/Gelb/4.png"));
	
	@SuppressWarnings("static-access")
	public static void changeplayer() {

		if (Var.playmode.equals("Beta")) {
			if (Var.currentplayer.equals("green")){
				Var.currentplayer="red";
				
			}else
			if (Var.currentplayer.equals("red")){
				Var.currentplayer="yellow";
			}else
			if (Var.currentplayer.equals("yellow")){
				Var.currentplayer="blue";
			}else
			if (Var.currentplayer.equals("blue")){
				Var.currentplayer="green";
			}else {
				Var.debug("Error");
			}
		
			Var.debug("Player Changed");
			
		}else if (Var.playmode.equals("Alpha")) {
			if (Var.currentplayer.equals("red")){
				Var.currentplayer="blue";
			}else
			if (Var.currentplayer.equals("blue")){
				Var.currentplayer="red";
			}
			Var.debug("Player Changed");
		}else if (Var.playmode.equals("Gamma")) {
			if (Var.currentplayer.equals("red")){
				Var.currentplayer="blue";
			}else
			if (Var.currentplayer.equals("blue")){
				Var.currentplayer="red";
				Var.com.color="red";
			}
			Var.debug("Player Changed");
		}else if (Var.playmode.equals("Delta")) {
			if (Var.currentplayer.equals("green")){
				Var.currentplayer="red";
				Var.com.color="red";
			}else
			if (Var.currentplayer.equals("red")){
				Var.currentplayer="yellow";
				Var.com.color="yellow";
			}else
			if (Var.currentplayer.equals("yellow")){
				Var.currentplayer="blue";
			}else
			if (Var.currentplayer.equals("blue")){
				Var.currentplayer="green";
				Var.com.color="green";
			}else {
				Var.debug("Error");
			}
			Var.debug("Player Changed");
		}else if (Var.playmode.equals("Omega")) {
			if (Var.currentplayer.equals("green")){
				Var.currentplayer="red";
				Var.com.color="red";
			}else
			if (Var.currentplayer.equals("red")){
				Var.currentplayer="yellow";
				Var.com.color="yellow";
			}else
			if (Var.currentplayer.equals("yellow")){
				Var.currentplayer="blue";
				Var.com.color="blue";
			}else
			if (Var.currentplayer.equals("blue")){
				Var.currentplayer="green";
				Var.com.color="green";
			}else {
				Var.debug("Error");
			}
			Var.debug("Player Changed");
		}
		Var.currentfigure="";
		Var.currentboat=404;
		Var.currentx=404;
		Var.currenty=404;
		Var.frame.repaint();
		if (Var.playmode=="Gamma" || Var.playmode=="Delta" || Var.playmode=="Omega") {
			if (Var.playmode=="Omega") {
				Var.temp++;
				if (Var.temp==4) {
					Var.warten(1);
					Var.temp=0;
				}
			}
			Var.com.move();
		}

	}
	public static void debug(String Satz) {
		if (Var.debug==true) {
			System.out.println(Satz);
		}
	}
	public static void rotateboat() {
		//Boot Drehen
		if (Var.playmode=="Alpha" || Var.playmode=="Gamma") {
			if (Var.BootBlau2d==true) {
				Var.debug("Change Boot 1");
				Var.BootBlau2d=false;
				Var.BootBlau4d=true;
				Var.BootRot4d=false;
				Var.BootRot2d=true;
				Var.RedBootLoc=4;
				Var.BlueBootLoc=2;
				Var.bootpos[1] = "red";
				Var.bootpos[3] = "blue";
			}else if (Var.BootRot2d==true) {
				Var.debug("Change Boot 2");
				Var.BootRot2d=false;
				Var.BootRot4d=true;
				Var.BootBlau4d=false;
				Var.BootBlau2d=true;
				Var.RedBootLoc=2;
				Var.BlueBootLoc=4;
				Var.bootpos[1] = "blue";
				Var.bootpos[3] = "red";
			}
			if (Var.BlauBootFiguren[0]!="") {
				switch (Var.BlueBootLoc) {
					case 2:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
						}
						break;
					case 4:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
						}
						break;
					}	
				}
				if (Var.RotBootFiguren[0]!="") {
					switch (Var.RedBootLoc) {
						case 2:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
							}
							break;
						case 4:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
							}
							break;
						}	
					}
		}else if (Var.playmode=="Beta" || Var.playmode=="Delta" || Var.playmode=="Omega") {
			
			if (Var.BootBlau1d==true) {
				Var.BootBlau1d=false;
				Var.BootBlau2d=true;
				Var.BootGruen2d=false;
				Var.BootGruen3d=true;
				Var.BootRot3d=false;
				Var.BootRot4d=true;
				Var.BootGelb4d=false;
				Var.BootGelb1d=true;
				Var.RedBootLoc=3;
				Var.BlueBootLoc=1;
				Var.YellowBootLoc=4;
				Var.GreenBootLoc=2;
				Var.bootpos[0] = "yellow";
				Var.bootpos[1] = "blue";
				Var.bootpos[2] = "green";
				Var.bootpos[3] = "red";
			}else if (Var.BootGruen1d==true) {
				Var.BootGruen1d=false;
				Var.BootGruen2d=true;
				Var.BootRot2d=false;
				Var.BootRot3d=true;
				Var.BootGelb3d=false;
				Var.BootGelb4d=true;
				Var.BootBlau4d=false;
				Var.BootBlau1d=true;
				Var.RedBootLoc=2;
				Var.BlueBootLoc=4;
				Var.YellowBootLoc=3;
				Var.GreenBootLoc=1;
				Var.bootpos[0] = "blue";
				Var.bootpos[1] = "green";
				Var.bootpos[2] = "red";
				Var.bootpos[3] = "yellow";
			}else if (Var.BootRot1d==true) {
				Var.BootRot1d=false;
				Var.BootRot2d=true;
				Var.BootGelb2d=false;
				Var.BootGelb3d=true;
				Var.BootBlau3d=false;
				Var.BootBlau4d=true;
				Var.BootGruen4d=false;
				Var.BootGruen1d=true;
				Var.RedBootLoc=1;
				Var.BlueBootLoc=3;
				Var.YellowBootLoc=2;
				Var.GreenBootLoc=4;
				Var.bootpos[0] = "green";
				Var.bootpos[1] = "red";
				Var.bootpos[2] = "yellow";
				Var.bootpos[3] = "blue";
			}else if (Var.BootGelb1d==true) {
				Var.BootGelb1d=false;
				Var.BootGelb2d=true;
				Var.BootBlau2d=false;
				Var.BootBlau3d=true;
				Var.BootGruen3d=false;
				Var.BootGruen4d=true;
				Var.BootRot4d=false;
				Var.BootRot1d=true;
				Var.RedBootLoc=4;
				Var.BlueBootLoc=2;
				Var.YellowBootLoc=1;
				Var.GreenBootLoc=3;
				Var.bootpos[0] = "red";
				Var.bootpos[1] = "yellow";
				Var.bootpos[2] = "blue";
				Var.bootpos[3] = "green";
			}
			if (Var.BlauBootFiguren[0]!="") {
				switch (Var.BlueBootLoc) {
					case 1:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
						}
						break;
					case 2:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX3[i],Var.BootZoneY3[i] );
						}
						break;
					case 3:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
						}
						break;
					case 4:
						for (int i=0;i<Var.BootBlauCount;i++) {
							Var.changefigurepos(Var.BlauBootFiguren[i], Var.BootZoneX1[i],Var.BootZoneY1[i] );
						}
						break;
					}	
				}
				if (Var.RotBootFiguren[0]!="") {
					switch (Var.RedBootLoc) {
						case 1:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
							}
							break;
						case 2:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX3[i],Var.BootZoneY3[i] );
							}
							break;
						case 3:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
							}
							break;
						case 4:
							for (int i=0;i<Var.BootRotCount;i++) {
								Var.changefigurepos(Var.RotBootFiguren[i], Var.BootZoneX1[i],Var.BootZoneY1[i] );
							}
							break;
						}	
					}
				if (Var.GruenBootFiguren[0]!="") {
					switch (Var.GreenBootLoc) {
						case 1:
							for (int i=0;i<Var.BootGruenCount;i++) {
								Var.changefigurepos(Var.GruenBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
							}
							break;
						case 2:
							for (int i=0;i<Var.BootGruenCount;i++) {
								Var.changefigurepos(Var.GruenBootFiguren[i], Var.BootZoneX3[i],Var.BootZoneY3[i] );
							}
							break;
						case 3:
							for (int i=0;i<Var.BootGruenCount;i++) {
								Var.changefigurepos(Var.GruenBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
							}
							break;
						case 4:
							for (int i=0;i<Var.BootGruenCount;i++) {
								Var.changefigurepos(Var.GruenBootFiguren[i], Var.BootZoneX1[i],Var.BootZoneY1[i] );
							}
							break;
						}	
					}
				if (Var.GelbBootFiguren[0]!="") {
					switch (Var.YellowBootLoc) {
						case 1:
							for (int i=0;i<Var.BootGelbCount;i++) {
								Var.changefigurepos(Var.GelbBootFiguren[i], Var.BootZoneX2[i],Var.BootZoneY2[i] );
							}
							break;
						case 2:
							for (int i=0;i<Var.BootGelbCount;i++) {
								Var.changefigurepos(Var.GelbBootFiguren[i], Var.BootZoneX3[i],Var.BootZoneY3[i] );
							}
							break;
						case 3:
							for (int i=0;i<Var.BootGelbCount;i++) {
								Var.changefigurepos(Var.GelbBootFiguren[i], Var.BootZoneX4[i],Var.BootZoneY4[i] );
							}
							break;
						case 4:
							for (int i=0;i<Var.BootGelbCount;i++) {
								Var.changefigurepos(Var.GelbBootFiguren[i], Var.BootZoneX1[i],Var.BootZoneY1[i] );
							}
							break;
						}	
					}
		}
		//Var.frame.repaint();
		

		Var.frame.repaint();
		Var.rotateboat=false;
		
	}
	public static void Boatspace() {
		
		switch(Var.currentplayer) {
		case "blue":
			if (Var.BootBlauCount<5) {
				if (Var.BootBlau1d==true) {
					Var.BlueBootLoc=1;
					Var.debug("Boot ist bei 1");
					Var.posX=Var.BootZoneX1[Var.BootBlauCount];
					Var.posY=Var.BootZoneY1[Var.BootBlauCount];
					Var.BootBlauCount++;
				}else if (Var.BootBlau2d==true) {
					Var.BlueBootLoc=2;
					Var.debug("Boot ist bei 2");
					Var.posX=Var.BootZoneX2[Var.BootBlauCount];
					Var.posY=Var.BootZoneY2[Var.BootBlauCount];
					Var.BootBlauCount++;
				}else if (Var.BootBlau3d==true) {
					Var.BlueBootLoc=3;
					Var.debug("Boot ist bei 3");
					Var.posX=Var.BootZoneX3[Var.BootBlauCount];
					Var.posY=Var.BootZoneY3[Var.BootBlauCount];
					Var.BootBlauCount++;
				}else if (Var.BootBlau4d==true) {
					Var.BlueBootLoc=4;
					Var.debug("Boot ist bei 4");
					Var.posX=Var.BootZoneX4[Var.BootBlauCount];
					Var.posY=Var.BootZoneY4[Var.BootBlauCount];
					Var.BootBlauCount++;
				}
				Var.BlauBootFiguren[Var.BootBlauCount-1] = Var.currentfigure;
			}else {
				Var.debug("Boot ist Voll");
				if (Var.debug==true) {Var.BootBlauCount=0;}else {
				}
			}
			break;
		case "red":
			if (Var.BootRotCount<5) {
				if (Var.BootRot1d==true) {
					Var.RedBootLoc=1;
					Var.posX=Var.BootZoneX1[Var.BootRotCount];
					Var.posY=Var.BootZoneY1[Var.BootRotCount];
					Var.BootRotCount++;
				}else if (Var.BootRot2d==true) {
					Var.RedBootLoc=2;
					Var.posX=Var.BootZoneX2[Var.BootRotCount];
					Var.posY=Var.BootZoneY2[Var.BootRotCount];
					Var.BootRotCount++;
				}else if (Var.BootRot3d==true) {
					Var.RedBootLoc=3;
					Var.posX=Var.BootZoneX3[Var.BootRotCount];
					Var.posY=Var.BootZoneY3[Var.BootRotCount];
					Var.BootRotCount++;
				}else if (Var.BootRot4d==true) {
					Var.RedBootLoc=4;
					Var.posX=Var.BootZoneX4[Var.BootRotCount];
					Var.posY=Var.BootZoneY4[Var.BootRotCount];
					Var.BootRotCount++;
				}
				Var.RotBootFiguren[Var.BootRotCount-1] = Var.currentfigure;
			}else {
				Var.debug("Boot ist Voll");
				if (Var.debug==true) {Var.BootRotCount=0;}else {
				}
			}
			break;
		case "green":
			if (Var.BootGruenCount<5) {
				if (Var.BootGruen1d==true) {
					Var.GreenBootLoc=1;
					Var.posX=Var.BootZoneX1[Var.BootGruenCount];
					Var.posY=Var.BootZoneY1[Var.BootGruenCount];
					Var.BootGruenCount++;
				}else if (Var.BootGruen2d==true) {
					Var.GreenBootLoc=2;
					Var.posX=Var.BootZoneX2[Var.BootGruenCount];
					Var.posY=Var.BootZoneY2[Var.BootGruenCount];
					Var.BootGruenCount++;
				}else if (Var.BootGruen3d==true) {
					Var.GreenBootLoc=3;
					Var.posX=Var.BootZoneX3[Var.BootGruenCount];
					Var.posY=Var.BootZoneY3[Var.BootGruenCount];
					Var.BootGruenCount++;
				}else if (Var.BootGruen4d==true) {
					Var.GreenBootLoc=4;
					Var.posX=Var.BootZoneX4[Var.BootGruenCount];
					Var.posY=Var.BootZoneY4[Var.BootGruenCount];
					Var.BootGruenCount++;
				}
					Var.GruenBootFiguren[Var.BootGruenCount-1] = Var.currentfigure;
			}else {
				Var.debug("Boot ist Voll");
				if (Var.debug==true) {Var.BootGruenCount=0;}else {
				}
			}
			break;
		case "yellow":
			if (Var.BootGelbCount<5) {
				if (Var.BootGelb1d==true) {
					Var.YellowBootLoc=1;
					Var.posX=Var.BootZoneX1[Var.BootGelbCount];
					Var.posY=Var.BootZoneY1[Var.BootGelbCount];
					Var.BootGelbCount++;
				}else if (Var.BootGelb2d==true) {
					Var.YellowBootLoc=2;
					Var.posX=Var.BootZoneX2[Var.BootGelbCount];
					Var.posY=Var.BootZoneY2[Var.BootGelbCount];
					Var.BootGelbCount++;
				}else if (Var.BootGelb3d==true) {
					Var.YellowBootLoc=3;
					Var.posX=Var.BootZoneX3[Var.BootGelbCount];
					Var.posY=Var.BootZoneY3[Var.BootGelbCount];
					Var.BootGelbCount++;
				}else if (Var.BootGelb4d==true) {
					Var.YellowBootLoc=4;
					Var.posX=Var.BootZoneX4[Var.BootGelbCount];
					Var.posY=Var.BootZoneY4[Var.BootGelbCount];
					Var.BootGelbCount++;
			}
				Var.GelbBootFiguren[Var.BootGelbCount-1] = Var.currentfigure; 
		}else {
			Var.debug("Boot ist Voll");
			if (Var.debug==true) {Var.BootGelbCount=0;}else {
			}
		}
			break;
			
		}
		//Var.rotateboat();
			
	}
	public static void currentboatloc() {
		Var.bootmovepass=true;
		
		if (Var.currentplayer=="blue") {
			switch(Var.currentboat) {
				case 1:
					Var.debug("CurrentBoat:Blue Case1");
					if (Var.BootBlau1d==false) {Var.bootmovepass=false;}
					break;
				case 2:
					Var.debug("CurrentBoat:Blue Case2");
					if (Var.BootBlau2d==false) {Var.bootmovepass=false;}
					break;
				case 3:
					Var.debug("CurrentBoat:Blue Case3");
					if (Var.BootBlau3d==false) {Var.bootmovepass=false;}
					break;
				case 4:
					Var.debug("CurrentBoat:Blue Case4");
					if (Var.BootBlau4d==false) {Var.bootmovepass=false;}
					break;
			}
		}else if (Var.currentplayer=="red") {
			switch(Var.currentboat) {
			case 1:
				if (Var.BootRot1d==false) {Var.bootmovepass=false;}
				break;
			case 2:
				if (Var.BootRot2d==false) {Var.bootmovepass=false;}
				break;
			case 3:
				if (Var.BootRot3d==false) {Var.bootmovepass=false;}
				break;
			case 4:
				if (Var.BootRot4d==false) {Var.bootmovepass=false;}
				break;
			}
		}else if (Var.currentplayer=="green") {
			switch(Var.currentboat) {
			case 1:
				if (Var.BootGruen1d==false) {Var.bootmovepass=false;}
				break;
			case 2:
				if (Var.BootGruen2d==false) {Var.bootmovepass=false;}
				break;
			case 3:
				if (Var.BootGruen3d==false) {Var.bootmovepass=false;}
				break;
			case 4:
				if (Var.BootGruen4d==false) {Var.bootmovepass=false;}
				break;
			}
		}else if (Var.currentplayer=="yellow") {
			switch(Var.currentboat) {
			case 1:
				if (Var.BootGelb1d==false) {Var.bootmovepass=false;}
				break;
			case 2:
				if (Var.BootGelb2d==false) {Var.bootmovepass=false;}
				break;
			case 3:
				if (Var.BootGelb3d==false) {Var.bootmovepass=false;}
				break;
			case 4:
				if (Var.BootGelb4d==false) {Var.bootmovepass=false;}
				break;
			}
		}
	}
	public static void changefigurepos(String figure,int posX,int posY) {
		if (posX < 16 && posY < 16) {
			switch(figure) {
			//Blau
			case "Blau1":
				Var.Blau1.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau2":
				Var.Blau2.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau3":
				Var.Blau3.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau4":
				Var.Blau4.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau5":
				Var.Blau5.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau6":
				Var.Blau6.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau7":
				Var.Blau7.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Blau8":
				Var.Blau8.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			//Rot
			case "Rot1":
				Var.Rot1.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot2":
				Var.Rot2.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot3":
				Var.Rot3.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot4":
				Var.Rot4.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot5":
				Var.Rot5.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot6":
				Var.Rot6.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot7":
				Var.Rot7.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Rot8":
				Var.Rot8.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			//Gruen
			case "Gruen1":
				Var.Gruen1.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen2":
				Var.Gruen2.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen3":
				Var.Gruen3.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen4":
				Var.Gruen4.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen5":
				Var.Gruen5.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen6":
				Var.Gruen6.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen7":
				Var.Gruen7.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gruen8":
				Var.Gruen8.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			//Gelb
			case "Gelb1":
				Var.Gelb1.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb2":
				Var.Gelb2.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb3":
				Var.Gelb3.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb4":
				Var.Gelb4.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb5":
				Var.Gelb5.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb6":
				Var.Gelb6.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb7":
				Var.Gelb7.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			case "Gelb8":
				Var.Gelb8.setLocation(Var.XY[posX],Var.XY[posY]);
				break;
			default:
				Var.debug("ChangeFigureLoc: Keine Figure");
				break;
			}
		}else {
			switch(figure) {
			//Blau
			case "Blau1":
				Var.Blau1.setLocation(posX,posY);
				break;
			case "Blau2":
				Var.Blau2.setLocation(posX,posY);
				break;
			case "Blau3":
				Var.Blau3.setLocation(posX,posY);
				break;
			case "Blau4":
				Var.Blau4.setLocation(posX,posY);
				break;
			case "Blau5":
				Var.Blau5.setLocation(posX,posY);
				break;
			case "Blau6":
				Var.Blau6.setLocation(posX,posY);
				break;
			case "Blau7":
				Var.Blau7.setLocation(posX,posY);
				break;
			case "Blau8":
				Var.Blau8.setLocation(posX,posY);
				break;
			//Rot
			case "Rot1":
				Var.Rot1.setLocation(posX,posY);
				break;
			case "Rot2":
				Var.Rot2.setLocation(posX,posY);
				break;
			case "Rot3":
				Var.Rot3.setLocation(posX,posY);
				break;
			case "Rot4":
				Var.Rot4.setLocation(posX,posY);
				break;
			case "Rot5":
				Var.Rot5.setLocation(posX,posY);
				break;
			case "Rot6":
				Var.Rot6.setLocation(posX,posY);
				break;
			case "Rot7":
				Var.Rot7.setLocation(posX,posY);
				break;
			case "Rot8":
				Var.Rot8.setLocation(posX,posY);
				break;
			//Gruen
			case "Gruen1":
				Var.Gruen1.setLocation(posX,posY);
				break;
			case "Gruen2":
				Var.Gruen2.setLocation(posX,posY);
				break;
			case "Gruen3":
				Var.Gruen3.setLocation(posX,posY);
				break;
			case "Gruen4":
				Var.Gruen4.setLocation(posX,posY);
				break;
			case "Gruen5":
				Var.Gruen5.setLocation(posX,posY);
				break;
			case "Gruen6":
				Var.Gruen6.setLocation(posX,posY);
				break;
			case "Gruen7":
				Var.Gruen7.setLocation(posX,posY);
				break;
			case "Gruen8":
				Var.Gruen8.setLocation(posX,posY);
				break;
			//Gelb
			case "Gelb1":
				Var.Gelb1.setLocation(posX,posY);
				break;
			case "Gelb2":
				Var.Gelb2.setLocation(posX,posY);
				break;
			case "Gelb3":
				Var.Gelb3.setLocation(posX,posY);
				break;
			case "Gelb4":
				Var.Gelb4.setLocation(posX,posY);
				break;
			case "Gelb5":
				Var.Gelb5.setLocation(posX,posY);
				break;
			case "Gelb6":
				Var.Gelb6.setLocation(posX,posY);
				break;
			case "Gelb7":
				Var.Gelb7.setLocation(posX,posY);
				break;
			case "Gelb8":
				Var.Gelb8.setLocation(posX,posY);
				break;
			default:
				Var.debug("ChangeFigureLoc: Keine Figure");
				break;
			}
		}
	}
	public static void checkloc(int posX,int posY) {
		//Var.tempcheckloc=false;
		if (posX>15 || posY>15 || posX<0 || posY<0) { Var.tempcheckloc=false;}else {
			if (Var.Blau1.x == Var.XY[posX] && Var.Blau1.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau2.x == Var.XY[posX] && Var.Blau2.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau3.x == Var.XY[posX] && Var.Blau3.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau4.x == Var.XY[posX] && Var.Blau4.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau5.x == Var.XY[posX] && Var.Blau5.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau6.x == Var.XY[posX] && Var.Blau6.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau7.x == Var.XY[posX] && Var.Blau7.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Blau8.x == Var.XY[posX] && Var.Blau8.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot1.x == Var.XY[posX] && Var.Rot1.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot2.x == Var.XY[posX] && Var.Rot2.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot3.x == Var.XY[posX] && Var.Rot3.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot4.x == Var.XY[posX] && Var.Rot4.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot5.x == Var.XY[posX] && Var.Rot5.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot6.x == Var.XY[posX] && Var.Rot6.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot7.x == Var.XY[posX] && Var.Rot7.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Rot8.x == Var.XY[posX] && Var.Rot8.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen1.x == Var.XY[posX] && Var.Gruen1.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen2.x == Var.XY[posX] && Var.Gruen2.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen3.x == Var.XY[posX] && Var.Gruen3.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen4.x == Var.XY[posX] && Var.Gruen4.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen5.x == Var.XY[posX] && Var.Gruen5.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen6.x == Var.XY[posX] && Var.Gruen6.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen7.x == Var.XY[posX] && Var.Gruen7.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gruen8.x == Var.XY[posX] && Var.Gruen8.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb1.x == Var.XY[posX] && Var.Gelb1.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb2.x == Var.XY[posX] && Var.Gelb2.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb3.x == Var.XY[posX] && Var.Gelb3.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb4.x == Var.XY[posX] && Var.Gelb4.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb5.x == Var.XY[posX] && Var.Gelb5.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb6.x == Var.XY[posX] && Var.Gelb6.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb7.x == Var.XY[posX] && Var.Gelb7.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else if (Var.Gelb8.x == Var.XY[posX] && Var.Gelb8.y == Var.XY[posY]) {
				Var.tempcheckloc=true;
			}else {
				Var.tempcheckloc=false;
			}
			
		}
		
	}
	/*public static int findboot(String Color) {
		int bootloc=404;
		
		switch(Color) {
			case "blue":
				if (BootBlau1d=true) {bootloc=1;}else
				if (BootBlau2d=true) {bootloc=2;}else
				if (BootBlau3d=true) {bootloc=3;}else
				if (BootBlau4d=true) {bootloc=4;}
				break;
			case "red":
				if (BootRot1d=true) {bootloc=1;}else
				if (BootRot2d=true) {bootloc=2;}else
				if (BootRot3d=true) {bootloc=3;}else
				if (BootRot4d=true) {bootloc=4;}
				break;
			case "green":
				if (BootGruen1d=true) {bootloc=1;}else
				if (BootGruen2d=true) {bootloc=2;}else
				if (BootGruen3d=true) {bootloc=3;}else
				if (BootGruen4d=true) {bootloc=4;}
				break;
			case "yellow":
				if (BootGelb1d=true) {bootloc=1;}else
				if (BootGelb2d=true) {bootloc=2;}else
				if (BootGelb3d=true) {bootloc=3;}else
				if (BootGelb4d=true) {bootloc=4;}
				break;
		}
		
		
		return bootloc;
	}*/
	public static void findfigure(String Figure) {
		Var.tempfigureloc.x=404;
		Var.tempfigureloc.y=404;
		
		switch(Figure) {
			case "Blau1":
				Var.tempfigureloc.x=Var.Blau1.x;
				Var.tempfigureloc.y=Var.Blau1.y;
				break;
			case "Blau2":
				Var.tempfigureloc.x=Var.Blau2.x;
				Var.tempfigureloc.y=Var.Blau2.y;
				break;
			case "Blau3":
				Var.tempfigureloc.x=Var.Blau3.x;
				Var.tempfigureloc.y=Var.Blau3.y;
				break;
			case "Blau4":
				Var.tempfigureloc.x=Var.Blau4.x;
				Var.tempfigureloc.y=Var.Blau4.y;
				break;
			case "Blau5":
				Var.tempfigureloc.x=Var.Blau5.x;
				Var.tempfigureloc.y=Var.Blau5.y;
				break;
			case "Blau6":
				Var.tempfigureloc.x=Var.Blau6.x;
				Var.tempfigureloc.y=Var.Blau6.y;
				break;
			case "Blau7":
				Var.tempfigureloc.x=Var.Blau7.x;
				Var.tempfigureloc.y=Var.Blau7.y;
				break;
			case "Blau8":
				Var.tempfigureloc.x=Var.Blau8.x;
				Var.tempfigureloc.y=Var.Blau8.y;
				break;
			case "Rot1":
				Var.tempfigureloc.x=Var.Rot1.x;
				Var.tempfigureloc.y=Var.Rot1.y;
				break;
			case "Rot2":
				Var.tempfigureloc.x=Var.Rot2.x;
				Var.tempfigureloc.y=Var.Rot2.y;
				break;
			case "Rot3":
				Var.tempfigureloc.x=Var.Rot3.x;
				Var.tempfigureloc.y=Var.Rot3.y;
				break;
			case "Rot4":
				Var.tempfigureloc.x=Var.Rot4.x;
				Var.tempfigureloc.y=Var.Rot4.y;
				break;
			case "Rot5":
				Var.tempfigureloc.x=Var.Rot5.x;
				Var.tempfigureloc.y=Var.Rot5.y;
				break;
			case "Rot6":
				Var.tempfigureloc.x=Var.Rot6.x;
				Var.tempfigureloc.y=Var.Rot6.y;
				break;
			case "Rot7":
				Var.tempfigureloc.x=Var.Rot7.x;
				Var.tempfigureloc.y=Var.Rot7.y;
				break;
			case "Rot8":
				Var.tempfigureloc.x=Var.Rot8.x;
				Var.tempfigureloc.y=Var.Rot8.y;
				break;
			case "Gruen1":
				Var.tempfigureloc.x=Var.Gruen1.x;
				Var.tempfigureloc.y=Var.Gruen1.y;
				break;
			case "Gruen2":
				Var.tempfigureloc.x=Var.Gruen2.x;
				Var.tempfigureloc.y=Var.Gruen2.y;
				break;
			case "Gruen3":
				Var.tempfigureloc.x=Var.Gruen3.x;
				Var.tempfigureloc.y=Var.Gruen3.y;
				break;
			case "Gruen4":
				Var.tempfigureloc.x=Var.Gruen4.x;
				Var.tempfigureloc.y=Var.Gruen4.y;
				break;
			case "Gruen5":
				Var.tempfigureloc.x=Var.Gruen5.x;
				Var.tempfigureloc.y=Var.Gruen5.y;
				break;
			case "Gruen6":
				Var.tempfigureloc.x=Var.Gruen6.x;
				Var.tempfigureloc.y=Var.Gruen6.y;
				break;
			case "Gruen7":
				Var.tempfigureloc.x=Var.Gruen7.x;
				Var.tempfigureloc.y=Var.Gruen7.y;
				break;
			case "Gruen8":
				Var.tempfigureloc.x=Var.Gruen8.x;
				Var.tempfigureloc.y=Var.Gruen8.y;
				break;
			case "Gelb1":
				Var.tempfigureloc.x=Var.Gelb1.x;
				Var.tempfigureloc.y=Var.Gelb1.y;
				break;
			case "Gelb2":
				Var.tempfigureloc.x=Var.Gelb2.x;
				Var.tempfigureloc.y=Var.Gelb2.y;
				break;
			case "Gelb3":
				Var.tempfigureloc.x=Var.Gelb3.x;
				Var.tempfigureloc.y=Var.Gelb3.y;
				break;
			case "Gelb4":
				Var.tempfigureloc.x=Var.Gelb4.x;
				Var.tempfigureloc.y=Var.Gelb4.y;
				break;
			case "Gelb5":
				Var.tempfigureloc.x=Var.Gelb5.x;
				Var.tempfigureloc.y=Var.Gelb5.y;
				break;
			case "Gelb6":
				Var.tempfigureloc.x=Var.Gelb6.x;
				Var.tempfigureloc.y=Var.Gelb6.y;
				break;
			case "Gelb7":
				Var.tempfigureloc.x=Var.Gelb7.x;
				Var.tempfigureloc.y=Var.Gelb7.y;
				break;
			case "Gelb8":
				Var.tempfigureloc.x=Var.Gelb8.x;
				Var.tempfigureloc.y=Var.Gelb8.y;
				break;
		}
	}
	@SuppressWarnings({ "static-access", "deprecation" })
	public static void play(String playmode) {
		Var.playmode=playmode;
		if (playmode=="Beta" || playmode=="Alpha") {
			int n = r.nextInt(2);
			if (n==0) {Var.currentplayer="blue";}else {Var.currentplayer="red";}
	        new Feld();
	        new Label();
		}else if (playmode=="Gamma") {
			int n = r.nextInt(2);
			if (n==0) {Var.currentplayer="blue";}else {Var.currentplayer="red";}
	        new Feld();
	        new Label();
	        Var.com.color=Var.currentplayer;
	        Var.com.move();
		}else if (playmode=="Delta") {
			int n = r.nextInt(4);
			if (n==0) {Var.currentplayer="blue";}else if (n==1){Var.currentplayer="red";}else if (n==3){Var.currentplayer="yellow";}else {Var.currentplayer="green";}
	        new Feld();
	        new Label();
	        Var.com.color=Var.currentplayer;
	        Var.com.move();
		}else if (playmode=="Omega") {
	        Thread t1 = new Thread(new Runnable() {
		        @Override
	            public void run() {
	            	Var.start=true;
	    	        Var.com.color=Var.currentplayer;
	    	        Var.com.move();
	            }
	        });
			int n = r.nextInt(4);
			if (n==0) {Var.currentplayer="blue";}else if (n==1){Var.currentplayer="red";}else if (n==3){Var.currentplayer="yellow";}else {Var.currentplayer="green";}
			//Feld.Start();
	        //Label.Start();
	        new Feld();
	        new Label();

	        t1.start();
		}
		Var.frame.requestFocus();
	}
	
	public static int getXY(int XY) {
		int loc=404;
		for (int i=0;i<Var.XY.length;i++) {
			if (XY==Var.XY[i]) {
				loc=i;
				i=Var.XY.length;
			}
		}
		
		return loc;
	}
	
	public static void warten(int sec) {
		try {
			TimeUnit.SECONDS.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void restart() {
		Var.currentplayer="";
		Var.currentzone="";
		Var.currentx=404;
		Var.currenty=404;
		Var.zonebluec = 0;
		Var.zoneredc = 0;
		Var.zonegreenc = 0;
		Var.zoneyellowc = 0;
		
		Var.YellowBootLoc=1;
		Var.BlueBootLoc=2;
		Var.GreenBootLoc=3;
		Var.RedBootLoc=4;
		
		Var.BootBlauCount=0;
		Var.BootRotCount=0;
		Var.BootGelbCount=0;
		Var.BootGruenCount=0;
		
		Var.play(Var.playmode);
	}
}







