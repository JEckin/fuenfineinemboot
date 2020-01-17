package fuenfineinemBoot;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Gui2 extends JFrame implements ActionListener{
		private static final long serialVersionUID = 1L;
			
		//Menu
		static JButton twoplayer = new JButton("2 Player");
		static JButton fourplayer = new JButton("4 Player");
		static JButton oneplayer1 = new JButton("1P & 1COM");
		static JButton oneplayer2 = new JButton("1P & 3COM");
		static JButton fourcom = new JButton("4COM");
		//Einzelspieler
		//static JButton es1 = new JButton("1 Player & COM");
		//static JButton es2 = new JButton("1 Player & 3xCOM");
		//Mehrspieler
		//static JButton ms2player = new JButton("2 Player");
		//static JButton ms4player = new JButton("4 Player");
		//Extras
		//static JButton e1 = new JButton("4xCOM");
		//Optionen
		//Credits
		
		public Gui2() {
		
			setTitle("5 in einem Boot");
			setLayout(null);
			setSize(720,300);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setContentPane(new Gui2Area());
			
			twoplayer.setBounds(45, 165, 120, 40 );
			fourplayer.setBounds(170, 165, 120, 40 );
			oneplayer1.setBounds(295, 165, 120, 40 );
			oneplayer2.setBounds(420, 165, 120, 40 );
			fourcom.setBounds(545, 165, 120, 40 );
			
			//ms2player.setBounds(150,165 , 120, 40);
			//ms4player.setBounds(450,165 , 120, 40);
			
			twoplayer.addActionListener(this);
			fourplayer.addActionListener(this);
			oneplayer1.addActionListener(this);
			oneplayer2.addActionListener(this);
			fourcom.addActionListener(this);
			//es1.addActionListener(this);
			//es2.addActionListener(this);
			//ms2player.addActionListener(this);
			//ms4player.addActionListener(this);
			//e1.addActionListener(this);
			
			//if (Var.menu=="start") {
				add(twoplayer);
				add(fourplayer);
				add(oneplayer1);
				add(oneplayer2);
				add(fourcom);
			//}else if (Var.menu=="einzelspieler") {
				//add(es1);
				//add(es2);
			//}else if (Var.menu=="mehrspieler") {
				//add(ms2player);
				//add(ms4player);
			//}else if (Var.menu=="extras") {
				//add(e1);
			//}else if (Var.menu=="option") {
			//}else if (Var.menu=="credits") {
			//}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == twoplayer) {
				//Var.playmode="Alpha";
				//new Feld();
				//Label.Start();
				
			}
			if (e.getSource() == fourplayer) {
				//Var.menu="mehrspieler";
				Var.playmode="Beta";
				new Feld();
				Label.Start();
			}
			if (e.getSource() == oneplayer1) {
				Var.playmode="Gamma";
				//new Feld();
				//label.Start();
			}
			if (e.getSource() == oneplayer2) {
				Var.playmode="Delta";
				//new Feld();
				//label.Start();
			}
			if (e.getSource() == fourcom) {
				Var.playmode="Omega";
				//new Feld();
				//label.Start();
			}			
		}
	}
class Gui2Area extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Gui2Area() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Var.guihintergrund.paintIcon(this, g, 0, 0);
	}
}
