package fuenfineinemboot;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame{
	private static final long serialVersionUID = 1L;

	//Menu
	public Gui() {
		Start();
	}
	
	public static void Start() {
		Var.two1.setBounds(45, 165, 120, 40 );
	    Var.four1.setBounds(170, 165, 120, 40 );
	    Var.two2.setBounds(295, 165, 120, 40 );
	    Var.four2.setBounds(420, 165, 120, 40 );
	    Var.four3.setBounds(545, 165, 120, 40 );
	    Var.gui.setLayout(null);
		Var.gui.setSize(720,300);
		Var.gui.setLocationRelativeTo(null);
		Var.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.gui.setContentPane(new GuiArea());
		Var.gui.add(new GuiArea());
		Var.gui.setVisible(true);
		Var.gui.setResizable(false);
		Var.gui.setTitle("5 in einem Boot");
		Var.two1.addActionListener(new GuiListener());
		Var.two2.addActionListener(new GuiListener());
		Var.four1.addActionListener(new GuiListener());
		Var.four2.addActionListener(new GuiListener());
		Var.four3.addActionListener(new GuiListener());
		Var.gui.add(Var.two1);
		Var.gui.add(Var.two2);
		Var.gui.add(Var.four1);
		Var.gui.add(Var.four2);
		Var.gui.add(Var.four3);
		
		}
}
class GuiArea extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public GuiArea() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Var.guihintergrund.paintIcon(this, g, 0, 0);
		
	}
}

class GuiListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Var.two1) {
			Var.play("Alpha");
		}
		if(e.getSource() == Var.four1) {
			Var.play("Beta");
		}
		if(e.getSource() == Var.two2) {
			Var.play("Gamma");
		}
		if(e.getSource() == Var.four2) {
			Var.play("Delta");
		}
		if(e.getSource() == Var.four3) {
			Var.start=true;
			Var.play("Omega");
			
		}

		
	}
}




