package fuenfineinemboot;

import javax.swing.JOptionPane;

public class comrules {

	public static void Start() {
		

		Var.movecorrect=true;
		Var.fieldmove=false;
				
		
				
		Var.debug("------------------");

		if (Var.currentx!=404) {
			Var.posX=Var.XY[Var.currentx];
			Var.posY=Var.XY[Var.currenty];
		}else if (Var.currentzone!=null) {
			if (Var.currentzone!=null) {
				switch(Var.currentzone){
				case "Blau":
					Var.posX=Var.BlauZoneX[Var.currentzonez];
					Var.posY=Var.BlauZoneY[Var.currentzonez];
					break;
				case "Rot":
					Var.posX=Var.RotZoneX[Var.currentzonez];
					Var.posY=Var.RotZoneY[Var.currentzonez];
					break;
				case "Gruen":
					Var.posX=Var.GruenZoneX[Var.currentzonez];
					Var.posY=Var.GruenZoneY[Var.currentzonez];
					break;
				case "Gelb":
					Var.posX=Var.GelbZoneX[Var.currentzonez];
					Var.posY=Var.GelbZoneY[Var.currentzonez];
					break;
				}
			}
			
		}else if (Var.currentboat!=404) {
			Var.debug(Integer.toString(Var.currentboat));
			Var.posX=Var.BootZoneX[Var.currentboat-1];
			Var.posY=Var.BootZoneY[Var.currentboat-1];
		}
		
		
		///
		if (Var.currentx != 404) {
			Var.fieldmove=true;
		}else {
			Var.fieldmove=false;
		}
		

			
		
		Var.movecorrect=true;
		if (Var.currentboat!=404) {
			Var.debug( "Current Boat: "+ Integer.toString(Var.currentboat));
			Var.debug("Comrules.Boat");
			comrules.boat();
		}else {
			Var.debug("Comrules.ValidPos");
			comrules.availablePos();
			if (Var.movecorrect==false) {
				Var.debug("Comrules.Move");
				comrules.move();
			}else {
				Var.debug("Comrules.availablePos");
				//System.out.println(Var.Acurrentpos.x);
				//System.out.println(Var.Acurrentpos.y);
				comrules.availableMoves();
				if (Var.movecorrect==false) {
					comrules.move();
				}else {
					Var.debug("Comrules.AvailableMoves");
					comrules.validPos();
					if (Var.movecorrect==false) {
						comrules.move();
					}else {
						comrules.move();
					}
				}
			}
		}
	}
	public static void availablePos() {
		//Gucke nach ob eine andere Figure auf dem Platz ist
		//Var.debug("Available");
		Var.selc=false;
		
		if (Var.posX == Var.Blau1.x && Var.posY == Var.Blau1.y) {
			if (Var.currentplayer.equals("blue")) {
				 if (Var.debug==true){System.out.println("3");}
				 Var.currentfigure="Blau1";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau2.x && Var.posY == Var.Blau2.y) {
			if (Var.currentplayer=="blue") {
				 Var.currentfigure="Blau2";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau3.x && Var.posY == Var.Blau3.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau3";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau4.x && Var.posY == Var.Blau4.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau4";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau5.x && Var.posY == Var.Blau5.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau5";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau6.x && Var.posY == Var.Blau6.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau6";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau7.x && Var.posY == Var.Blau7.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau7";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Blau8.x && Var.posY == Var.Blau8.y) {
			if (Var.currentplayer.equals("blue")) {
				 Var.currentfigure="Blau8";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		//Rot
		if (Var.posX == Var.Rot1.x && Var.posY == Var.Rot1.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot1";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot2.x && Var.posY == Var.Rot2.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot2";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot3.x && Var.posY == Var.Rot3.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot3";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot4.x && Var.posY == Var.Rot4.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot4";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot5.x && Var.posY == Var.Rot5.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot5";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot6.x && Var.posY == Var.Rot6.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot6";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot7.x && Var.posY == Var.Rot7.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot7";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Rot8.x && Var.posY == Var.Rot8.y) {
			if (Var.currentplayer.equals("red")) {
				 Var.currentfigure="Rot8";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		///Gruen
		if (Var.posX == Var.Gruen1.x && Var.posY == Var.Gruen1.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen1";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen2.x && Var.posY == Var.Gruen2.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen2";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen3.x && Var.posY == Var.Gruen3.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen3";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen4.x && Var.posY == Var.Gruen4.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen4";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen5.x && Var.posY == Var.Gruen5.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen5";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen6.x && Var.posY == Var.Gruen6.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen6";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen7.x && Var.posY == Var.Gruen7.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen7";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gruen8.x && Var.posY == Var.Gruen8.y) {
			if (Var.currentplayer.equals("green")) {
				 Var.currentfigure="Gruen8";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		///Gelb
		if (Var.posX == Var.Gelb1.x && Var.posY == Var.Gelb1.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb1";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb2.x && Var.posY == Var.Gelb2.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb2";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb3.x && Var.posY == Var.Gelb3.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb3";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb4.x && Var.posY == Var.Gelb4.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb4";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb5.x && Var.posY == Var.Gelb5.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb5";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb6.x && Var.posY == Var.Gelb6.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb6";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb7.x && Var.posY == Var.Gelb7.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb7";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.posX == Var.Gelb8.x && Var.posY == Var.Gelb8.y) {
			if (Var.currentplayer.equals("yellow")) {
				 Var.currentfigure="Gelb8";
				 Var.Acurrentpos.x=Var.currentx;
				 Var.Acurrentpos.y=Var.currenty;
				 Var.selc=true;
			}else {
			Var.movecorrect=false;
			}
		}
		if (Var.Acurrentpos.x==0 && Var.Acurrentpos.y==0) {
			Var.movecorrect=false;
		}
	}
	public static void validPos() {
		//Var.debug("ValidPos");
		
		//Gucke nach ob die Position Allgemein Gültig ist
		String[] validmoves = {
				//Feld
				"6x0","7x0","8x0","9x0",
				"7x1","8x1",
				"7x2","8x2",
				"7x3","8x3",
				"4x4","5x4","6x4","7x4","8x4","9x4","10x4","11x4",
				"4x5","5x5","6x5","7x5","8x5","9x5","10x5","11x5",
				"0x6","4x6","5x6","10x6","11x6","15x6",
				"0x7","1x7","2x7","3x7","4x7","5x7","10x7","11x7","12x7","13x7","14x7","15x7",
				"0x8","1x8","2x8","3x8","4x8","5x8","10x8","11x8","12x8","13x8","14x8","15x8",
				"0x9","4x9","5x9","10x9","11x9","15x9",
				"4x10","5x10","6x10","7x10","8x10","9x10","10x10","11x10",
				"4x11","5x11","6x11","7x11","8x11","9x11","10x11","11x11",
				"7x12","8x12",
				"7x13","8x13",
				"7x14","8x14",
				"6x15","7x15","8x15","9x15",
				//zone
				"Gruen","Blau","Rot","Gelb",
				};
		String pos=null;
		if (Var.fieldmove==true) {
			pos=Var.currentx+"x"+Var.currenty;
		}else {
			pos=Var.currentzone;
		}
		for (int i = 0; i < validmoves.length; i++) {
			if (pos.equals(validmoves[i])) {
				Var.movecorrect=true;
				i=validmoves.length+5;
			}else {
				Var.movecorrect=false;
			}
			
		}
		
	}
	public static void availableMoves() {
		if (Var.debug==true) {System.out.println("AvailableMoves: 1");}
		if (Var.debug==true) {System.out.println("1. X: "+Var.Acurrentpos.x +" 1. Y: "+ Var.Acurrentpos.y);System.out.println("2. X: "+Var.currentx +" 2. Y: "+ Var.currenty);}
		
		if (Var.selc==false) {
			//Var.debug("AvailableMoves: 2");
				//Var.debug("AvailableMoves: 3");
				
					//Hier keinen weiteren Regeln
					
					//Nur einzelne Felder
					if (Var.currentx==Var.Acurrentpos.x-1 && Var.currenty==Var.Acurrentpos.y-1) {
					}else if (Var.currentx==Var.Acurrentpos.x && Var.currenty==Var.Acurrentpos.y-1) {
					}else if (Var.currentx==Var.Acurrentpos.x+1 && Var.currenty==Var.Acurrentpos.y-1) {
					}else if (Var.currentx==Var.Acurrentpos.x-1 && Var.currenty==Var.Acurrentpos.y) {
					}else if (Var.currentx==Var.Acurrentpos.x+1 && Var.currenty==Var.Acurrentpos.y) {
					}else if (Var.currentx==Var.Acurrentpos.x-1 && Var.currenty==Var.Acurrentpos.y+1) {
					}else if (Var.currentx==Var.Acurrentpos.x && Var.currenty==Var.Acurrentpos.y+1) {
					}else if (Var.currentx==Var.Acurrentpos.x+1 && Var.currenty==Var.Acurrentpos.y+1) {
					}else if (Var.currentzone!="") {
						if (Var.currentplayer=="blue") {
							Var.debug(Integer.toString(Var.currentx)+" Currentx");
								if (Var.currentx==4 && Var.currenty==11) {Var.debug("BlauZone");}else {Var.movecorrect=false;}
							}else if (Var.currentplayer=="red") {
								if (Var.currentx==11 && Var.currenty==4) {Var.debug("RotZone");}else {Var.movecorrect=false;}
							}else if (Var.currentplayer=="green") {
								if (Var.currentx==4 && Var.currenty==4) {Var.debug("GruenZone");}else {Var.movecorrect=false;}
							}else if (Var.currentplayer=="yellow") {
								if (Var.currentx==11 && Var.currenty==11) {Var.debug("GelbZone");}else {Var.movecorrect=false;}
							}else {Var.movecorrect=false;}
						
						}else {
							Var.movecorrect=false;
							Var.checkloc(Var.Acurrentpos.x-1, Var.Acurrentpos.y-1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x-2 && Var.currenty==Var.Acurrentpos.y-2) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x, Var.Acurrentpos.y-1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x && Var.currenty==Var.Acurrentpos.y-2) {
									Var.debug("Springen");
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x+1, Var.Acurrentpos.y-1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x+2 && Var.currenty==Var.Acurrentpos.y-2) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x-1, Var.Acurrentpos.y);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x-2 && Var.currenty==Var.Acurrentpos.y) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x+1, Var.Acurrentpos.y);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x+2 && Var.currenty==Var.Acurrentpos.y) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x-1, Var.Acurrentpos.y+1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x-2 && Var.currenty==Var.Acurrentpos.y+2) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x, Var.Acurrentpos.y+1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x && Var.currenty==Var.Acurrentpos.y+2) {
									Var.movecorrect=true;
								}
							}
							Var.checkloc(Var.Acurrentpos.x+1, Var.Acurrentpos.y+1);
							if (Var.tempcheckloc==true) {
								if (Var.currentx==Var.Acurrentpos.x+2 && Var.currenty==Var.Acurrentpos.y+2) {
									Var.movecorrect=true;
								}
							}
				
						}
					//Feld Blockieren
					if (Var.currentplayer!="blue") {
						if (Var.currentx==4 && Var.currenty==11) {
							Var.movecorrect=false;
						}
					}
					if (Var.currentplayer!="green") {
						if (Var.currentx==4 && Var.currenty==4) {
							Var.movecorrect=false;
						}
					}
					if (Var.currentplayer!="red") {
						if (Var.currentx==11 && Var.currenty==4) {
							Var.movecorrect=false;
						}
					}
					if (Var.currentplayer!="yellow") {
						if (Var.currentx==11 && Var.currenty==11) {
							Var.movecorrect=false;
						}
					}
		}
		
	}
	public static void boat() {
		Var.selc=false;
		Var.movecorrect=true;
		//Var.debug(Var.currentfigure);
		if (Var.currentfigure!=null){
			Var.debug("Boat: 1");
			Var.debug("Current X: " +Integer.toString(Var.currentx));
			if (Var.currentx==0) {
				Var.debug("Boat: 2");
				Var.debug("Current Y: " +  Integer.toString(Var.currenty));
				if (Var.currenty==6 || Var.currenty==7 || Var.currenty==8 || Var.currenty==9) {
					Var.debug("Boat: 3");
					Var.currentboatloc();
					if (Var.debug==true) {System.out.println(Var.bootmovepass);}
					if (Var.bootmovepass==true) {
						Var.debug("Boat: Move");
						Var.Boatspace();
						Var.rotateboat=true;
					}else {Var.movecorrect=false;}
				}else {Var.movecorrect=false;}
			}else if (Var.currenty==0) {
				if (Var.currentx==6 || Var.currentx==7 || Var.currentx==8 || Var.currentx==9) {
					Var.currentboatloc();
					if (Var.debug==true) {System.out.println(Var.bootmovepass);}
					if (Var.bootmovepass==true) {
						Var.debug("Boat: Move");
						Var.Boatspace();
						Var.rotateboat=true;
						if (Var.debug==true) {System.out.println("posX: "+Var.posX+" posY :"+Var.posY);}
					}else {Var.movecorrect=false;}
				}else {Var.movecorrect=false;}
			}else if (Var.currenty==15) {
				if (Var.currentx==6 || Var.currentx==7 || Var.currentx==8 || Var.currentx==9) {
					Var.currentboatloc();
					if (Var.debug==true) {System.out.println(Var.bootmovepass);}
					if (Var.bootmovepass==true) {
						Var.debug("Boat: Move");
						Var.Boatspace();
						Var.rotateboat=true;
					}else {Var.movecorrect=false;}
				}else {Var.movecorrect=false;}
			}else if (Var.currentx==15) {
				if (Var.currenty==6 || Var.currenty==7 || Var.currenty==8 || Var.currenty==9) {
					Var.currentboatloc();
					if (Var.debug==true) {System.out.println(Var.bootmovepass);}
					if (Var.bootmovepass==true) {
						Var.debug("Boat: Move");
						Var.Boatspace();
						Var.rotateboat=true;
					}else {Var.movecorrect=false;}
				}else {Var.movecorrect=false;}
			}else {Var.movecorrect=false;}
		}else {
			Var.debug("Boat: No Figure");
			Var.movecorrect=false;
		}
		comrules.move();
	}
	private static void move() {
		if (Var.selc==false) {
		if (Var.movecorrect==true) {

			if (Var.debug==true) {System.out.println("Move: ");}
			
			if (Var.currentfigure!="") {
			switch(Var.currentfigure) {
			//Blau
			case "Blau1":
				Var.Blau1.setLocation(Var.posX,Var.posY);
				break;
			case "Blau2":
				Var.Blau2.setLocation(Var.posX,Var.posY);
				break;
			case "Blau3":
				Var.Blau3.setLocation(Var.posX,Var.posY);
				break;
			case "Blau4":
				Var.Blau4.setLocation(Var.posX,Var.posY);
				break;
			case "Blau5":
				Var.Blau5.setLocation(Var.posX,Var.posY);
				break;
			case "Blau6":
				Var.Blau6.setLocation(Var.posX,Var.posY);
				break;
			case "Blau7":
				Var.Blau7.setLocation(Var.posX,Var.posY);
				break;
			case "Blau8":
				Var.Blau8.setLocation(Var.posX,Var.posY);
				break;
			//Rot
			case "Rot1":
				Var.Rot1.setLocation(Var.posX,Var.posY);
				break;
			case "Rot2":
				Var.Rot2.setLocation(Var.posX,Var.posY);
				break;
			case "Rot3":
				Var.Rot3.setLocation(Var.posX,Var.posY);
				break;
			case "Rot4":
				Var.Rot4.setLocation(Var.posX,Var.posY);
				break;
			case "Rot5":
				Var.Rot5.setLocation(Var.posX,Var.posY);
				break;
			case "Rot6":
				Var.Rot6.setLocation(Var.posX,Var.posY);
				break;
			case "Rot7":
				Var.Rot7.setLocation(Var.posX,Var.posY);
				break;
			case "Rot8":
				Var.Rot8.setLocation(Var.posX,Var.posY);
				break;
			//Gruen
			case "Gruen1":
				Var.Gruen1.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen2":
				Var.Gruen2.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen3":
				Var.Gruen3.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen4":
				Var.Gruen4.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen5":
				Var.Gruen5.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen6":
				Var.Gruen6.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen7":
				Var.Gruen7.setLocation(Var.posX,Var.posY);
				break;
			case "Gruen8":
				Var.Gruen8.setLocation(Var.posX,Var.posY);
				break;
			//Gelb
			case "Gelb1":
				Var.Gelb1.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb2":
				Var.Gelb2.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb3":
				Var.Gelb3.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb4":
				Var.Gelb4.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb5":
				Var.Gelb5.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb6":
				Var.Gelb6.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb7":
				Var.Gelb7.setLocation(Var.posX,Var.posY);
				break;
			case "Gelb8":
				Var.Gelb8.setLocation(Var.posX,Var.posY);
				break;
			}
			
			if (Var.rotateboat==true) {
				Var.rotateboat();
			}
			
			if (Var.BootRotCount>4) {
				JOptionPane.showMessageDialog(Var.frame,

					    "Rot hat Gewonnen!",
					    "Gewonnen",
					    JOptionPane.WARNING_MESSAGE);
				//Var.restart();
				System.exit(0);
			}else if (Var.BootBlauCount>4) {
				JOptionPane.showMessageDialog(Var.frame,
					    "Blau hat Gewonnen!",
					    "Gewonnen",
					    JOptionPane.WARNING_MESSAGE);
				//Var.restart();
				System.exit(0);
			}else if (Var.BootGruenCount>4) {
				JOptionPane.showMessageDialog(Var.frame,
						"Grün hat Gewonnen!",
						"Gewonnen",
						JOptionPane.WARNING_MESSAGE);
				//Var.restart();
				System.exit(0);
			}else if (Var.BootGelbCount>4) {
				JOptionPane.showMessageDialog(Var.frame,
						"Gelb hat Gewonnen!",
						"Gewonnen",
						JOptionPane.WARNING_MESSAGE);
				//Var.restart();
				System.exit(0);
			}
			
			
			Var.changeplayer();
			Var.currentzone="";
			Var.currentzonez=404;
			}else {
				Var.debug("No Selected");
			}
			 



			Var.currentfigure="";
			Var.frame.repaint();
			if (Var.playmode=="Gamma" || Var.playmode=="Delta" || Var.playmode=="Omega") {
				Var.com.move();
			}
		}else {
		}
			
		
		}
		
		if (Var.debug==true) {System.out.println("Player: "+Var.currentplayer);}
		//Var.currentfigure=null;
		//Var.currentplayer=null;
		//Var.currentboat=5;
		//Var.posX=404;
		//Var.posY=404;
		
	}
}
