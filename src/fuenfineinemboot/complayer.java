package fuenfineinemboot;

import java.util.Arrays;
import java.util.Random;

public class complayer {

	static String color;
	static String name;
	private static String[] figure = new String[8];
	
	private static int[] figurelocX = new int[8];
	private static int[] figurelocY = new int[8];
	
	//Alle freien plätze
	private static int[] tempfreelocX = new int[16];
	private static int[] tempfreelocY = new int[16];
	private static int tempcounter=0;
	//Sortierte plätze
	private static int[] tempY= new int[12];
	private static int[] tempX= new int[12];
	
	private static boolean boot=false;
	private static boolean start=false;
	private static int random=0;
	
	private static String cfigure="";
	private static int cfigureX=0;
	private static int cfigureY=0;
	private static int countf=0;
	
	private static int X;
	private static int Y;
	
	public complayer() {

	}
	private void setplayer() {
		switch(color) {
			case "blue":
				figure[0]="Blau1";
				figure[1]="Blau2";
				figure[2]="Blau3";
				figure[3]="Blau4";
				figure[4]="Blau5";
				figure[5]="Blau6";
				figure[6]="Blau7";
				figure[7]="Blau8";
				break;
			case "red":
				figure[0]="Rot1";
				figure[1]="Rot2";
				figure[2]="Rot3";
				figure[3]="Rot4";
				figure[4]="Rot5";
				figure[5]="Rot6";
				figure[6]="Rot7";
				figure[7]="Rot8";
				break;
			case "green":
				figure[0]="Gruen1";
				figure[1]="Gruen2";
				figure[2]="Gruen3";
				figure[3]="Gruen4";
				figure[4]="Gruen5";
				figure[5]="Gruen6";
				figure[6]="Gruen7";
				figure[7]="Gruen8";
				break;
			case "yellow":
				figure[0]="Gelb1";
				figure[1]="Gelb2";
				figure[2]="Gelb3";
				figure[3]="Gelb4";
				figure[4]="Gelb5";
				figure[5]="Gelb6";
				figure[6]="Gelb7";
				figure[7]="Gelb8";
				break;
			default:
				Var.debug("Wrong Color");
				break;
		}
		Var.findfigure(figure[0]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[1]);
		figurelocX[1] = Var.tempfigureloc.x;
		figurelocY[1] = Var.tempfigureloc.y;
		Var.findfigure(figure[2]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[3]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[4]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[5]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[6]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
		Var.findfigure(figure[7]);
		figurelocX[0] = Var.tempfigureloc.x;
		figurelocY[0] = Var.tempfigureloc.y;
	}
	public void move() {
		reset();
		if (color!=null) {
			setplayer();
		}
		
		Var.debug(name+": CurrentPlayer: "+ Var.currentplayer + " Farbe: "+ color);
		///
			if (Var.currentplayer==color) {
				choosefigure();
				boot(cfigure);
				if (boot==false) {
					if (start==false) {
						Var.debug("Figure: "+cfigure);
						places(cfigure);
						int random=0;
						if (random==404) {Var.debug("not possible");Var.changeplayer();}else {
							Var.currentx=tempX[random];
							Var.currenty=tempY[random];
							comrules.Start();
							reset();
						}
					}else {
						int tY=0;
						int tX=0;
						
						switch(color) {
						case "blue":
							tY=11;
							tX=4;
							break;
						case "red":
							tY=4;
							tX=11;
							break;
						case "green":
							tY=4;
							tX=4;
							break;
						case "yellow":
							tY=11;
							tX=11;
							break;
						}
						Var.changefigurepos(cfigure, tX, tY);
						Var.currentzone="";
						Var.currentzonez=404;
						start=false;
						Var.changeplayer();

					}
				}else {
					Var.debug("Zum Boot");
					Var.Acurrentpos.x=X;
					Var.Acurrentpos.y=Y;
					Var.currentx=X;
					Var.currenty=Y;
					Var.currentzone=null;
					//Var.currentboat = Var.findboot(color);
					//comrules.boat();
					comrules.Start();
					Var.currentboat = 404;
				}
			}else {
				Var.debug(name + ": Ich bin nicht dran");
			}
		
		///
	}
	public static void places(String Figure) {
		//Plätze die neben den Figuren frei ist
		
		//prüfe ob es schon möglich ist auf das Boot zu gehen
		
		Var.currentfigure=Figure;
		Var.Acurrentpos.x=X;
		Var.Acurrentpos.y=Y;

		Var.debug("X: "+ Integer.toString(X));
		Var.debug("Y: "+ Integer.toString(Y));
		
		Var.currentx=X-1;
		Var.currenty=Y-1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X-2;
			Var.currenty=Y-2;
			Var.movecorrect=true;
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			comrules.validPos();
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X;
		Var.currenty=Y-1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			Var.debug("Complayer: 1 Oben Frei");
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.debug("Tempcheckloc = True");
			Var.currentx=X;
			Var.currenty=Y-2;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				Var.debug("Complayer: 2 Oben Frei");
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X+1;
		Var.currenty=Y-1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X+2;
			Var.currenty=Y-2;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X+1;
		Var.currenty=Y;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X+2;
			Var.currenty=Y;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X+1;
		Var.currenty=Y+1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X+2;
			Var.currenty=Y+2;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X;
		Var.currenty=Y+1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X;
			Var.currenty=Y+2;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X-1;
		Var.currenty=Y+1;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X-2;
			Var.currenty=Y+2;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.currentx=X-1;
		Var.currenty=Y;
		Var.movecorrect=true;
		comrules.validPos();
		Var.checkloc(Var.currentx,Var.currenty);
		if (Var.tempcheckloc==true) {Var.movecorrect=false;}
		//comrules.availableMoves();
		spawn();
		if (Var.movecorrect==true) {
			tempfreelocX[tempcounter] = Var.currentx;
			tempfreelocY[tempcounter] = Var.currenty;
			tempcounter++;
		}else if (Var.tempcheckloc==true) {
			Var.currentx=X-2;
			Var.currenty=Y;
			Var.movecorrect=true;
			comrules.validPos();
			Var.checkloc(Var.currentx,Var.currenty);
			if (Var.tempcheckloc==true) {Var.movecorrect=false;}
			//comrules.availableMoves();
			spawn();
			if (Var.movecorrect==true) {
				tempfreelocX[tempcounter] = Var.currentx;
				tempfreelocY[tempcounter] = Var.currenty;
				tempcounter++;
			}
		}
		Var.debug(Arrays.toString(tempfreelocX));
		Var.debug(Arrays.toString(tempfreelocY));	
		
		
		switch (color) {
			case "blue":
				if (Var.lastlocblueX==0 && Var.lastlocblueY==0) {}else {
					for (int i=0;i<tempfreelocX.length;i++) {
						if (Var.lastlocblueX==tempfreelocX[i] && Var.lastlocblueY==tempfreelocY[i]) {
							tempfreelocX[i]=0;
							tempfreelocY[i]=0;
							for (int a=i;a<tempfreelocX.length-1;a++) {
								tempfreelocX[a]=tempfreelocX[a+1];
								tempfreelocY[a]=tempfreelocY[a+1];
								tempfreelocX[a+1]=0;
								tempfreelocY[a+1]=0;
							}
						}
					}
				}
				break;
			case "red":
				if (Var.lastlocredX==0 && Var.lastlocredY==0) {}else {
					for (int i=0;i<tempfreelocX.length;i++) {
						if (Var.lastlocredX==tempfreelocX[i] && Var.lastlocredY==tempfreelocY[i]) {
							tempfreelocX[i]=0;
							tempfreelocY[i]=0;
							for (int a=i;a<tempfreelocX.length-1;a++) {
								tempfreelocX[a]=tempfreelocX[a+1];
								tempfreelocY[a]=tempfreelocY[a+1];
								tempfreelocX[a+1]=0;
								tempfreelocY[a+1]=0;
							}
						}
					}
				}
				break;
			case "green":
				if (Var.lastlocgreenX==0 && Var.lastlocgreenY==0) {}else {
					for (int i=0;i<tempfreelocX.length;i++) {
						if (Var.lastlocgreenX==tempfreelocX[i] && Var.lastlocgreenY==tempfreelocY[i]) {
							tempfreelocX[i]=0;
							tempfreelocY[i]=0;
							for (int a=i;a<tempfreelocX.length-1;a++) {
									tempfreelocX[a]=tempfreelocX[a+1];
									tempfreelocY[a]=tempfreelocY[a+1];
									tempfreelocX[a+1]=0;
									tempfreelocY[a+1]=0;
							}
						}
					}
				}
				break;
			case "yellow":
				if (Var.lastlocyellowX==0 && Var.lastlocyellowY==0) {}else {
					for (int i=0;i<tempfreelocX.length;i++) {
						if (Var.lastlocyellowX==tempfreelocX[i] && Var.lastlocyellowY==tempfreelocY[i]) {
							tempfreelocX[i]=0;
							tempfreelocY[i]=0;
							for (int a=i;a<tempfreelocX.length-1;a++) {
								tempfreelocX[a]=tempfreelocX[a+1];
								tempfreelocY[a]=tempfreelocY[a+1];
								tempfreelocX[a+1]=0;
								tempfreelocY[a+1]=0;
							}
						}
					}
				}
				break;
		}
		//System.out.println("X: "+ Arrays.toString(tempfreelocX));
		//System.out.println("Y: "+ Arrays.toString(tempfreelocY));
		
		if (Var.bootpos[0]==color) {
			//System.out.println("Bootpos0");
			int tempc = 0;
			tempY[0] = tempfreelocY[0];
			tempX[0] = tempfreelocX[0];
			for (int i=1;i<tempfreelocX.length;i++) {
				if (tempfreelocX[i]==0 && tempfreelocY[i]==0){} else{
					if (tempfreelocY[i]<3) {
						if (tempfreelocY[i]>tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]>tempY[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else if (tempfreelocY[i]>12) {
						if (tempfreelocY[i]<tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]<tempY[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else {
						if (tempfreelocX[i]<tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]<tempX[tempc-1]) {
									//System.out.println("Test1");
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}
				}
			}
		}
		if (Var.bootpos[1]==color) {
			//System.out.println("Bootpos0");
			int tempc = 0;
			tempY[0] = tempfreelocY[0];
			tempX[0] = tempfreelocX[0];
			for (int i=1;i<tempfreelocX.length;i++) {
				if (tempfreelocX[i]==0 && tempfreelocY[i]==0){}else {
					if (tempfreelocX[i]<3) {
						if (tempfreelocX[i]>tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]>tempX[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else if (tempfreelocX[i]>12) {
						if (tempfreelocX[i]<tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]<tempX[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else {
						if (tempfreelocY[i]<tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]<tempY[tempc-1]) {
									//System.out.println("Test1");
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}
				}
			}
		}
		if (Var.bootpos[2]==color) {
			//System.out.println("Bootpos0");
			int tempc = 0;
			tempY[0] = tempfreelocY[0];
			tempX[0] = tempfreelocX[0];
			for (int i=1;i<tempfreelocX.length;i++) {
				if (tempfreelocX[i]==0 && tempfreelocY[i]==0){}else {
					if (tempfreelocY[i]<3) {
						if (tempfreelocY[i]>tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]>tempY[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else if (tempfreelocY[i]>12) {
						if (tempfreelocY[i]<tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]<tempY[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else {
						if (tempfreelocX[i]>tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]>tempX[tempc-1]) {
									//System.out.println("Test1");
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}
				}
			}
		}
		if (Var.bootpos[3]==color) {
			//System.out.println("Bootpos0");
			int tempc = 0;
			tempY[0] = tempfreelocY[0];
			tempX[0] = tempfreelocX[0];
			for (int i=1;i<tempfreelocX.length;i++) {
				if (tempfreelocX[i]==0 && tempfreelocY[i]==0){}else {
					if (tempfreelocX[i]<3) {
						if (tempfreelocX[i]>tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]>tempX[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else if (tempfreelocX[i]>12) {
						if (tempfreelocX[i]<tempX[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempX[tempc]<tempX[tempc-1]) {
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocX[i]==tempX[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}else {
						if (tempfreelocY[i]>tempY[tempc]) {
							tempY[tempc]=tempfreelocY[i];
							tempX[tempc]=tempfreelocX[i];
							if (tempc>=1) {
								if (tempY[tempc]>tempY[tempc-1]) {
									//System.out.println("Test1");
									for (int a=0;a<=tempc;a++) {
										tempY[a]=tempfreelocY[i];
										tempX[a]=tempfreelocX[i];
									}
									tempY[0]=tempfreelocY[i];
									tempX[0]=tempfreelocX[i];
								}
							}else if (tempfreelocY[i]==tempY[tempc]) {
								tempc++;
								tempY[tempc]=tempfreelocY[i];
								tempX[tempc]=tempfreelocX[i];
							}
						}
					}
				}
			}
		}
		
		Var.debug(Arrays.toString(tempX));
		Var.debug(Arrays.toString(tempY));
		
		//System.out.println(color);
		//System.out.println("X: "+ Arrays.toString(tempX));
		//System.out.println("Y: "+ Arrays.toString(tempY));
		//System.out.println("---------------------------------");
		
		random= rloc();
		if (random==404) {
			System.out.println("Random Number is 404");
			Var.changeplayer();
		}
		
		switch (color) {
			case "blue":
				if (Var.lastlocblueX==0 && Var.lastlocblueX==0) {
					Var.lastlocblueX=tempX[random];
					Var.lastlocblueY=tempY[random];
				}
				break;
			case "red":
				if (Var.lastlocredX==0 && Var.lastlocredX==0) {
					Var.lastlocredX=tempX[random];
					Var.lastlocredY=tempY[random];
				}
				break;
			case "green":
				if (Var.lastlocgreenX==0 && Var.lastlocgreenX==0) {
					Var.lastlocgreenX=tempX[random];
					Var.lastlocgreenY=tempY[random];
				}
				break;
			case "yellow":
				if (Var.lastlocyellowX==0 && Var.lastlocyellowX==0) {
					Var.lastlocyellowX=tempX[random];
					Var.lastlocyellowY=tempY[random];
				}
				break;
		}
		
	}
	public static void choosefigure() {
		
		start=false;
		cfigure="";
		cfigureX=0;
		cfigureY=0;
		countf=0;
		int tX=0;
		int tY=0;
		for (int i=0;i<figure.length;i++) {
			Var.findfigure(figure[i]);
			tX=Var.getXY(Var.tempfigureloc.x);
			tY=Var.getXY(Var.tempfigureloc.y);
			if (tX==404 && tY==404) {}else {
				countf++;
				if (cfigureX!=0 || cfigureY!=0) {
					if (Var.bootpos[0]==color) {
						if (cfigureX>=tX) {
							if (cfigureX==0 && cfigureY==0) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
							if (tY>2 && tY<13) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;	
							}
						}
					}else if (Var.bootpos[1]==color) {
						if (cfigureY>=tY) {
							if (cfigureX==0 && cfigureY==0) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
							if (tX>2 && tX<13) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
						}
					}else if (Var.bootpos[2]==color) {
						if (cfigureX<tX) {
							if (cfigureX==0 && cfigureY==0) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
							if (tY>2 && tY<13) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
							
						}
					}else if (Var.bootpos[3]==color) {
						if (cfigureY<tY) {
							if (cfigureX==0 && cfigureY==0) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
							if (tX>2 && tX<13) {
								cfigure=figure[i];
								cfigureX=tX;
								cfigureY=tY;
							}
						}
					}		
				}else {
					cfigure=figure[i];
					cfigureX=tX;
					cfigureY=tY;
				}
			}	
		}
		//System.out.println(countf);
		int r=0;
		Random rand = new Random();
		if (countf>2) {
			r = rand.nextInt(5);
			
		}
		switch(color) {
		case "blue":
			if (Var.zonebluec==5) {r=2;}
			break;
		case "red":
			if (Var.zoneredc==5) {r=2;}
			break;
		case "green":
			if (Var.zonegreenc==5) {r=2;}
			break;
		case "yellow":
			if (Var.zoneyellowc==5) {r=2;}
			break;
		}
		if (r==0) {
			switch(color){
			case "blue":
				Var.checkloc(4,11);
				if (Var.tempcheckloc==false) {
					start=true;
					cfigure=Var.zoneblue[Var.zonebluec];
					Var.zonebluec++;
				}
				break;
			case "red":
				Var.checkloc(11,4);
				if (Var.tempcheckloc==false) {
					start=true;
					cfigure=Var.zonered[Var.zoneredc];
					Var.zoneredc++;
				}
				break;
			case "green":
				Var.checkloc(4,4);
				if (Var.tempcheckloc==false) {
					start=true;
					cfigure=Var.zonegreen[Var.zonegreenc];
					Var.zonegreenc++;
				}
				break;
			case "yellow":
				Var.checkloc(11,11);
				if (Var.tempcheckloc==false) {
					start=true;
					cfigure=Var.zoneyellow[Var.zoneyellowc];
					Var.zoneyellowc++;
				}
				break;
			}
		}
		//System.out.println(cfigure);

	}
	private static void reset() {
		for (int i=0;i<tempfreelocX.length;i++) {
			tempfreelocX[i]=0;
			tempfreelocY[i]=0;
		}
		for (int i=0;i<tempX.length;i++) {
			tempX[i]=0;
			tempY[i]=0;
		}
		tempcounter=0;
	}
	private static void spawn() {
		//if (Var.currentplayer!="blue") {
			if (Var.currentx==4 && Var.currenty==11) {
				Var.movecorrect=false;
			}
		//}
		//if (Var.currentplayer!="green") {
			if (Var.currentx==4 && Var.currenty==4) {
				Var.movecorrect=false;
			}
		//}
		//if (Var.currentplayer!="red") {
			if (Var.currentx==11 && Var.currenty==4) {
				Var.movecorrect=false;
			}
		//}
		//if (Var.currentplayer!="yellow") {
			if (Var.currentx==11 && Var.currenty==11) {
				Var.movecorrect=false;
			}
		//}
	}
	
	private static void boot(String Figure) {
		boot=false;
		Var.currentboat=404;
		Var.debug(Figure);
		Var.findfigure(Figure);
		Var.currentfigure=Figure;
		int PosX= Var.tempfigureloc.x;
		int PosY= Var.tempfigureloc.y;
		X = Var.getXY(PosX);
		Y = Var.getXY(PosY);
		
		//int x = Var.findboot(color);
		
		if (Var.bootpos[0]==color) {
			if (X==0) {
				if (Y==6 || Y==7 || Y==8 || Y==9 ) {
					boot=true;
					Var.currentboat=1;
				}
			}
		}else if (Var.bootpos[1]==color) {
			if (Y==0) {
				if (X==6 || X==7 || X==8 || X==9 ) {
					boot=true;
					Var.currentboat=2;
				}
			}
		}else if (Var.bootpos[2]==color) {
			if (X==15) {
				if (Y==6 || Y==7 || Y==8 || Y==9 ) {
					boot=true;
					Var.currentboat=3;
				}
			}
		}else if (Var.bootpos[3]==color) {
			if (Y==15) {
				if (X==6 || X==7 || X==8 || X==9 ) {
					boot=true;
					Var.currentboat=4;
				}
			}
		}
		
		
	}
	private static int rloc() {
		Random rand = new Random();
		int r=0;
		int n=404;
		for (int i=0;i<tempY.length;i++) {
			if (tempY[i]==0 && tempX[i]==0) {
			}else {
				r++;
			}
		}
		if (r>0) {
			Var.debug("Random von:"+ Integer.toString(r));
			// Obtain a number between [0 - 49].
			n = rand.nextInt(r);
			
			Var.debug("Random:"+ Integer.toString(n));
		}
		return n;
	}
}
