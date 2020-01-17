package fuenfineinemBoot;

import java.awt.Graphics;
//import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Label {
	
	public Label() {
		Start();
	}

	public static void Start() {
		Var.frame.setSize(1000,1025);
		Var.frame.setLocationRelativeTo(null);
		Var.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Var.gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Var.frame.add(new DrawArea());
		//Var.frame.setContentPane(new DrawArea());
		Var.frame.setVisible(true);
		Var.frame.setResizable(false);
		Var.frame.repaint();
		Var.frame.requestFocus();
	}
	public static void startpos2() {
 		Var.Blau1.setLocation(Var.XY[4],Var.XY[11]);
		Var.Blau2.setLocation(Var.XY[4],Var.XY[9]);
		Var.Blau3.setLocation(Var.XY[4],Var.XY[7]);
		Var.Blau4.setLocation(Var.BlauZoneX[0],Var.BlauZoneY[0]);
 		Var.Blau5.setLocation(Var.BlauZoneX[1],Var.BlauZoneY[1]);
		Var.Blau6.setLocation(Var.BlauZoneX[2],Var.BlauZoneY[2]);
		Var.Blau7.setLocation(Var.BlauZoneX[3],Var.BlauZoneY[3]);
		Var.Blau8.setLocation(Var.BlauZoneX[4],Var.BlauZoneY[4]);
		Var.BlauBoot.setLocation(Var.BootZoneX[0],Var.BootZoneY[0]);
		///
		Var.Rot1.setLocation(Var.XY[11],Var.XY[4]);
		Var.Rot2.setLocation(Var.XY[11],Var.XY[6]);
		Var.Rot3.setLocation(Var.XY[11],Var.XY[8]);
		Var.Rot4.setLocation(Var.RotZoneX[0],Var.RotZoneY[0]);
		Var.Rot5.setLocation(Var.RotZoneX[1],Var.RotZoneY[1]);
		Var.Rot6.setLocation(Var.RotZoneX[2],Var.RotZoneY[2]);
		Var.Rot7.setLocation(Var.RotZoneX[3],Var.RotZoneY[3]);
		Var.Rot8.setLocation(Var.RotZoneX[4],Var.RotZoneY[4]);
		Var.RotBoot.setLocation(Var.BootZoneX[1],Var.BootZoneY[1]);
	}
	public static void startpos4() {
 		Var.Blau1.setLocation(Var.XY[4],Var.XY[11]);
		Var.Blau2.setLocation(Var.XY[4],Var.XY[9]);
		Var.Blau3.setLocation(Var.XY[4],Var.XY[7]);
		Var.Blau4.setLocation(Var.BlauZoneX[0],Var.BlauZoneY[0]);
 		Var.Blau5.setLocation(Var.BlauZoneX[1],Var.BlauZoneY[1]);
		Var.Blau6.setLocation(Var.BlauZoneX[2],Var.BlauZoneY[2]);
		Var.Blau7.setLocation(Var.BlauZoneX[3],Var.BlauZoneY[3]);
		Var.Blau8.setLocation(Var.BlauZoneX[4],Var.BlauZoneY[4]);
		Var.BlauBoot.setLocation(Var.BootZoneX[0],Var.BootZoneY[0]);
		///
		Var.Rot1.setLocation(Var.XY[11],Var.XY[4]);
		Var.Rot2.setLocation(Var.XY[11],Var.XY[6]);
		Var.Rot3.setLocation(Var.XY[11],Var.XY[8]);
		Var.Rot4.setLocation(Var.RotZoneX[0],Var.RotZoneY[0]);
		Var.Rot5.setLocation(Var.RotZoneX[1],Var.RotZoneY[1]);
		Var.Rot6.setLocation(Var.RotZoneX[2],Var.RotZoneY[2]);
		Var.Rot7.setLocation(Var.RotZoneX[3],Var.RotZoneY[3]);
		Var.Rot8.setLocation(Var.RotZoneX[4],Var.RotZoneY[4]);
		Var.RotBoot.setLocation(Var.BootZoneX[1],Var.BootZoneY[1]);
		///
		Var.Gruen1.setLocation(Var.XY[4],Var.XY[4]);
		Var.Gruen2.setLocation(Var.XY[6],Var.XY[4]);
		Var.Gruen3.setLocation(Var.XY[8],Var.XY[4]);
		Var.Gruen4.setLocation(Var.GruenZoneX[0],Var.GruenZoneY[0]);
		Var.Gruen5.setLocation(Var.GruenZoneX[1],Var.GruenZoneY[1]);
		Var.Gruen6.setLocation(Var.GruenZoneX[2],Var.GruenZoneY[2]);
		Var.Gruen7.setLocation(Var.GruenZoneX[3],Var.GruenZoneY[3]);
		Var.Gruen8.setLocation(Var.GruenZoneX[4],Var.GruenZoneY[4]);
		Var.GruenBoot.setLocation(Var.BootZoneX[2],Var.BootZoneY[2]);
		///
		Var.Gelb1.setLocation(Var.XY[11],Var.XY[11]);
		Var.Gelb2.setLocation(Var.XY[9],Var.XY[11]);
		Var.Gelb3.setLocation(Var.XY[7],Var.XY[11]);
		Var.Gelb4.setLocation(Var.GelbZoneX[0],Var.GelbZoneY[0]);
		Var.Gelb5.setLocation(Var.GelbZoneX[1],Var.GelbZoneY[1]);
		Var.Gelb6.setLocation(Var.GelbZoneX[2],Var.GelbZoneY[2]);
		Var.Gelb7.setLocation(Var.GelbZoneX[3],Var.GelbZoneY[3]);
		Var.Gelb8.setLocation(Var.GelbZoneX[4],Var.GelbZoneY[4]);
		Var.GelbBoot.setLocation(Var.BootZoneX[3],Var.BootZoneY[3]);
	}
}

class DrawArea extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public DrawArea() {
		if (Var.playmode.equals("Alpha") || Var.playmode.equals("Gamma")) {
		Label.startpos2();
		}else if (Var.playmode.equals("Beta") || Var.playmode.equals("Delta") || Var.playmode.equals("Omega")) {
		Label.startpos4();
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//Graphics2D g2 = (Graphics2D) g;
		
		Var.hintergrund.paintIcon(this, g, 0, 0);
		if (Var.playmode=="Beta" || Var.playmode=="Delta" || Var.playmode=="Omega") {
			//CurrentPlayer
			if (Var.currentplayer=="blue") {Var.blue.paintIcon(this, g, 480,480);}else
			if (Var.currentplayer=="red") {Var.red.paintIcon(this, g, 480,480);}else
			if (Var.currentplayer=="yellow") {Var.yellow.paintIcon(this, g, 480,480);}else
			if (Var.currentplayer=="green") {Var.green.paintIcon(this, g, 480,480);}
	
			//Boote
			if (Var.BootBlau1d==true) {Var.BootBlau1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootBlau2d==true) {Var.BootBlau2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootBlau3d==true) {Var.BootBlau3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootBlau4d==true) {Var.BootBlau4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
			
			if (Var.BootRot1d==true) {Var.BootRot1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootRot2d==true) {Var.BootRot2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootRot3d==true) {Var.BootRot3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootRot4d==true) {Var.BootRot4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
			
			if (Var.BootGruen1d==true) {Var.BootGruen1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootGruen2d==true) {Var.BootGruen2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootGruen3d==true) {Var.BootGruen3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootGruen4d==true) {Var.BootGruen4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
			
			if (Var.BootGelb1d==true) {Var.BootGelb1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootGelb2d==true) {Var.BootGelb2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootGelb3d==true) {Var.BootGelb3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootGelb4d==true) {Var.BootGelb4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
			
			//Figuren
			
			Var.blue1.paintIcon(this, g, Var.Blau1.x, Var.Blau1.y);
			Var.blue2.paintIcon(this, g, Var.Blau2.x, Var.Blau2.y);
			Var.blue3.paintIcon(this, g, Var.Blau3.x, Var.Blau3.y);
			Var.blue4.paintIcon(this, g, Var.Blau4.x, Var.Blau4.y);
			Var.blue5.paintIcon(this, g, Var.Blau5.x, Var.Blau5.y);
			
			Var.blue6.paintIcon(this, g, Var.Blau6.x, Var.Blau6.y);
			Var.blue7.paintIcon(this, g, Var.Blau7.x, Var.Blau7.y);
			Var.blue8.paintIcon(this, g, Var.Blau8.x, Var.Blau8.y);
			Var.red1.paintIcon(this, g, Var.Rot1.x, Var.Rot1.y);
			Var.red2.paintIcon(this, g, Var.Rot2.x, Var.Rot2.y);
			Var.red3.paintIcon(this, g, Var.Rot3.x, Var.Rot3.y);
			Var.red4.paintIcon(this, g, Var.Rot4.x, Var.Rot4.y);
			Var.red5.paintIcon(this, g, Var.Rot5.x, Var.Rot5.y);
			Var.red6.paintIcon(this, g, Var.Rot6.x, Var.Rot6.y);
			Var.red7.paintIcon(this, g, Var.Rot7.x, Var.Rot7.y);
			Var.red8.paintIcon(this, g, Var.Rot8.x, Var.Rot8.y);
			Var.green1.paintIcon(this, g, Var.Gruen1.x, Var.Gruen1.y);
			Var.green2.paintIcon(this, g, Var.Gruen2.x, Var.Gruen2.y);
			Var.green3.paintIcon(this, g, Var.Gruen3.x, Var.Gruen3.y);
			Var.green4.paintIcon(this, g, Var.Gruen4.x, Var.Gruen4.y);
			Var.green5.paintIcon(this, g, Var.Gruen5.x, Var.Gruen5.y);
			Var.green6.paintIcon(this, g, Var.Gruen6.x, Var.Gruen6.y);
			Var.green7.paintIcon(this, g, Var.Gruen7.x, Var.Gruen7.y);
			Var.green8.paintIcon(this, g, Var.Gruen8.x, Var.Gruen8.y);
			Var.yellow1.paintIcon(this, g, Var.Gelb1.x, Var.Gelb1.y);
			Var.yellow2.paintIcon(this, g, Var.Gelb2.x, Var.Gelb2.y);
			Var.yellow3.paintIcon(this, g, Var.Gelb3.x, Var.Gelb3.y);
			Var.yellow4.paintIcon(this, g, Var.Gelb4.x, Var.Gelb4.y);
			Var.yellow5.paintIcon(this, g, Var.Gelb5.x, Var.Gelb5.y);
			Var.yellow6.paintIcon(this, g, Var.Gelb6.x, Var.Gelb6.y);
			Var.yellow7.paintIcon(this, g, Var.Gelb7.x, Var.Gelb7.y);
			Var.yellow8.paintIcon(this, g, Var.Gelb8.x, Var.Gelb8.y);
			
		}else if (Var.playmode=="Alpha" || Var.playmode=="Gamma"){
			
			//CurrentPlayer
			if (Var.currentplayer=="blue") {Var.blue.paintIcon(this, g, 480,480);}else
			if (Var.currentplayer=="red") {Var.red.paintIcon(this, g, 480,480);}
			
			if (Var.BootBlau1d==true) {Var.BootBlau1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootBlau2d==true) {Var.BootBlau2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootBlau3d==true) {Var.BootBlau3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootBlau4d==true) {Var.BootBlau4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
		
			if (Var.BootRot1d==true) {Var.BootRot1.paintIcon(this, g, Var.BootZoneX[0], Var.BootZoneY[0]);} 
				else if (Var.BootRot2d==true) {Var.BootRot2.paintIcon(this, g, Var.BootZoneX[1], Var.BootZoneY[1]);} 
				else if (Var.BootRot3d==true) {Var.BootRot3.paintIcon(this, g, Var.BootZoneX[2], Var.BootZoneY[2]);} 
				else if (Var.BootRot4d==true) {Var.BootRot4.paintIcon(this, g, Var.BootZoneX[3], Var.BootZoneY[3]);}
			
			Var.blue1.paintIcon(this, g, Var.Blau1.x, Var.Blau1.y);
			Var.blue2.paintIcon(this, g, Var.Blau2.x, Var.Blau2.y);
			Var.blue3.paintIcon(this, g, Var.Blau3.x, Var.Blau3.y);
			Var.blue4.paintIcon(this, g, Var.Blau4.x, Var.Blau4.y);
			Var.blue5.paintIcon(this, g, Var.Blau5.x, Var.Blau5.y);
			Var.blue6.paintIcon(this, g, Var.Blau6.x,Var.Blau6.y);
			Var.blue7.paintIcon(this, g, Var.Blau7.x, Var.Blau7.y);
			Var.blue8.paintIcon(this, g, Var.Blau8.x, Var.Blau8.y);
			Var.red1.paintIcon(this, g, Var.Rot1.x, Var.Rot1.y);
			Var.red2.paintIcon(this, g, Var.Rot2.x, Var.Rot2.y);
			Var.red3.paintIcon(this, g, Var.Rot3.x, Var.Rot3.y);
			Var.red4.paintIcon(this, g, Var.Rot4.x, Var.Rot4.y);
			Var.red5.paintIcon(this, g, Var.Rot5.x, Var.Rot5.y);
			Var.red6.paintIcon(this, g, Var.Rot6.x, Var.Rot6.y);
			Var.red7.paintIcon(this, g, Var.Rot7.x, Var.Rot7.y);
			Var.red8.paintIcon(this, g, Var.Rot8.x, Var.Rot8.y);
		
		}
				
	}
}
