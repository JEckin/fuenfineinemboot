package fuenfineinemboot;

import javax.swing.JButton;

public class Feld {

	static JButton btn[] = new JButton[113];
	
	public Feld() {
		Start();
	}
	public static void Start() {
		
		for(int i = 0; i<btn.length; i++){
			btn[i] = new JButton();
			btn[i].setVisible(true);
			if (Var.debug==true) {btn[i].setText(Integer.toString(i));}
			btn[i].addActionListener(new FeldListener());
			btn[i].setFocusPainted(false);
			btn[i].setContentAreaFilled(false);
			btn[i].setBorder(null);
			//btn[i].setBounds(Var.Feldlocx[i],Var.Feldlocy[i],40,40);
			Var.frame.add(btn[i]);
			//Var.frame.setContentPane(btn[i]);
			Var.frame.repaint();
		}
		
		
		btn[0].setBounds(Var.XY[6],Var.XY[0],40,40);
		btn[1].setBounds(Var.XY[7],Var.XY[0],40,40);
		btn[2].setBounds(Var.XY[8],Var.XY[0],40,40);
		btn[3].setBounds(Var.XY[9],Var.XY[0],40,40);
		btn[4].setBounds(Var.XY[7],Var.XY[1],40,40);
		btn[5].setBounds(Var.XY[8],Var.XY[1],40,40);
		btn[6].setBounds(Var.XY[7],Var.XY[2],40,40);
		btn[7].setBounds(Var.XY[8],Var.XY[2],40,40);
		btn[8].setBounds(Var.XY[7],Var.XY[3],40,40);
		btn[9].setBounds(Var.XY[8],Var.XY[3],40,40);
		btn[10].setBounds(Var.XY[4],Var.XY[4],40,40);
		btn[11].setBounds(Var.XY[5],Var.XY[4],40,40);
		btn[12].setBounds(Var.XY[6],Var.XY[4],40,40);
		btn[13].setBounds(Var.XY[7],Var.XY[4],40,40);
		btn[14].setBounds(Var.XY[8],Var.XY[4],40,40);
		btn[15].setBounds(Var.XY[9],Var.XY[4],40,40);
		btn[16].setBounds(Var.XY[10],Var.XY[4],40,40);
		btn[17].setBounds(Var.XY[11],Var.XY[4],40,40);
		btn[18].setBounds(Var.XY[4],Var.XY[5],40,40);
		btn[19].setBounds(Var.XY[5],Var.XY[5],40,40);
		btn[20].setBounds(Var.XY[6],Var.XY[5],40,40);
		btn[21].setBounds(Var.XY[7],Var.XY[5],40,40);
		btn[22].setBounds(Var.XY[8],Var.XY[5],40,40);
		btn[23].setBounds(Var.XY[9],Var.XY[5],40,40);
		btn[24].setBounds(Var.XY[10],Var.XY[5],40,40);
		btn[25].setBounds(Var.XY[11],Var.XY[5],40,40);
		btn[26].setBounds(Var.XY[0],Var.XY[6],40,40);
		btn[27].setBounds(Var.XY[4],Var.XY[6],40,40);
		btn[28].setBounds(Var.XY[5],Var.XY[6],40,40);
		btn[29].setBounds(Var.XY[10],Var.XY[6],40,40);
		btn[30].setBounds(Var.XY[11],Var.XY[6],40,40);
		btn[31].setBounds(Var.XY[15],Var.XY[6],40,40);
		btn[32].setBounds(Var.XY[0],Var.XY[7],40,40);
		btn[33].setBounds(Var.XY[1],Var.XY[7],40,40);
		btn[34].setBounds(Var.XY[2],Var.XY[7],40,40);
		btn[35].setBounds(Var.XY[3],Var.XY[7],40,40);
		btn[36].setBounds(Var.XY[4],Var.XY[7],40,40);
		btn[37].setBounds(Var.XY[5],Var.XY[7],40,40);
		btn[38].setBounds(Var.XY[10],Var.XY[7],40,40);
		btn[39].setBounds(Var.XY[11],Var.XY[7],40,40);
		btn[40].setBounds(Var.XY[12],Var.XY[7],40,40);
		btn[41].setBounds(Var.XY[13],Var.XY[7],40,40);
		btn[42].setBounds(Var.XY[14],Var.XY[7],40,40);
		btn[43].setBounds(Var.XY[15],Var.XY[7],40,40);
		btn[44].setBounds(Var.XY[0],Var.XY[8],40,40);
		btn[45].setBounds(Var.XY[1],Var.XY[8],40,40);
		btn[46].setBounds(Var.XY[2],Var.XY[8],40,40);
		btn[47].setBounds(Var.XY[3],Var.XY[8],40,40);
		btn[48].setBounds(Var.XY[4],Var.XY[8],40,40);
		btn[49].setBounds(Var.XY[5],Var.XY[8],40,40);
		btn[50].setBounds(Var.XY[10],Var.XY[8],40,40);
		btn[51].setBounds(Var.XY[11],Var.XY[8],40,40);
		btn[52].setBounds(Var.XY[12],Var.XY[8],40,40);
		btn[53].setBounds(Var.XY[13],Var.XY[8],40,40);
		btn[54].setBounds(Var.XY[14],Var.XY[8],40,40);
		btn[55].setBounds(Var.XY[15],Var.XY[8],40,40);
		btn[56].setBounds(Var.XY[0],Var.XY[9],40,40);
		btn[57].setBounds(Var.XY[4],Var.XY[9],40,40);
		btn[58].setBounds(Var.XY[5],Var.XY[9],40,40);
		btn[59].setBounds(Var.XY[10],Var.XY[9],40,40);
		btn[60].setBounds(Var.XY[11],Var.XY[9],40,40);
		btn[61].setBounds(Var.XY[15],Var.XY[9],40,40);
		btn[62].setBounds(Var.XY[4],Var.XY[10],40,40);
		btn[63].setBounds(Var.XY[5],Var.XY[10],40,40);
		btn[64].setBounds(Var.XY[6],Var.XY[10],40,40);
		btn[65].setBounds(Var.XY[7],Var.XY[10],40,40);
		btn[66].setBounds(Var.XY[8],Var.XY[10],40,40);
		btn[67].setBounds(Var.XY[9],Var.XY[10],40,40);
		btn[68].setBounds(Var.XY[10],Var.XY[10],40,40);
		btn[69].setBounds(Var.XY[11],Var.XY[10],40,40);
		btn[70].setBounds(Var.XY[4],Var.XY[11],40,40);
		btn[71].setBounds(Var.XY[5],Var.XY[11],40,40);
		btn[72].setBounds(Var.XY[6],Var.XY[11],40,40);
		btn[73].setBounds(Var.XY[7],Var.XY[11],40,40);
		btn[74].setBounds(Var.XY[8],Var.XY[11],40,40);
		btn[75].setBounds(Var.XY[9],Var.XY[11],40,40);
		btn[76].setBounds(Var.XY[10],Var.XY[11],40,40);
		btn[77].setBounds(Var.XY[11],Var.XY[11],40,40);
		btn[78].setBounds(Var.XY[7],Var.XY[12],40,40);
		btn[79].setBounds(Var.XY[8],Var.XY[12],40,40);
		btn[80].setBounds(Var.XY[7],Var.XY[13],40,40);
		btn[81].setBounds(Var.XY[8],Var.XY[13],40,40);
		btn[82].setBounds(Var.XY[7],Var.XY[14],40,40);
		btn[83].setBounds(Var.XY[8],Var.XY[14],40,40);
		btn[84].setBounds(Var.XY[6],Var.XY[15],40,40);
		btn[85].setBounds(Var.XY[7],Var.XY[15],40,40);
		btn[86].setBounds(Var.XY[8],Var.XY[15],40,40);
		btn[87].setBounds(Var.XY[9],Var.XY[15],40,40);
		//Blaue Zone
		btn[88].setBounds(Var.BlauZoneX[0],Var.BlauZoneY[0],40,40);
		btn[89].setBounds(Var.BlauZoneX[1],Var.BlauZoneY[1],40,40);
		btn[90].setBounds(Var.BlauZoneX[2],Var.BlauZoneY[2],40,40);
		btn[91].setBounds(Var.BlauZoneX[3],Var.BlauZoneY[3],40,40);
		btn[92].setBounds(Var.BlauZoneX[4],Var.BlauZoneY[4],40,40);
		//Rote Zone
		btn[93].setBounds(Var.RotZoneX[0],Var.RotZoneY[0],40,40);
		btn[94].setBounds(Var.RotZoneX[1],Var.RotZoneY[1],40,40);
		btn[95].setBounds(Var.RotZoneX[2],Var.RotZoneY[2],40,40);
		btn[96].setBounds(Var.RotZoneX[3],Var.RotZoneY[3],40,40);
		btn[97].setBounds(Var.RotZoneX[4],Var.RotZoneY[4],40,40);
		//Gruene Zone
		btn[98].setBounds(Var.GruenZoneX[0],Var.GruenZoneY[0],40,40);
		btn[99].setBounds(Var.GruenZoneX[1],Var.GruenZoneY[1],40,40);
		btn[100].setBounds(Var.GruenZoneX[2],Var.GruenZoneY[2],40,40);
		btn[101].setBounds(Var.GruenZoneX[3],Var.GruenZoneY[3],40,40);
		btn[102].setBounds(Var.GruenZoneX[4],Var.GruenZoneY[4],40,40);
		//Gelbe Zone
		btn[103].setBounds(Var.GelbZoneX[0],Var.GelbZoneY[0],40,40);
		btn[104].setBounds(Var.GelbZoneX[1],Var.GelbZoneY[1],40,40);
		btn[105].setBounds(Var.GelbZoneX[2],Var.GelbZoneY[2],40,40);
		btn[106].setBounds(Var.GelbZoneX[3],Var.GelbZoneY[3],40,40);
		btn[107].setBounds(Var.GelbZoneX[4],Var.GelbZoneY[4],40,40);
		//Erste Boot Zone
		btn[108].setBounds(Var.BootZoneX[0],Var.BootZoneY[0],100,200);
		btn[109].setBounds(Var.BootZoneX[1],Var.BootZoneY[1],200,100);
		btn[110].setBounds(Var.BootZoneX[2],Var.BootZoneY[2],100,200);
		btn[111].setBounds(Var.BootZoneX[3],Var.BootZoneY[3],200,100);
			
	}


}

