package fuenfineinemboot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class testbutton extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
		
	static JTextField fieldx = new JTextField();
	static JTextField fieldy = new JTextField();
	static JTextField fieldzone = new JTextField();
	static JTextField fieldzonez = new JTextField();
	static JTextField figure = new JTextField(Var.currentplayer);
	static JButton button = new JButton("Start");
	
	public testbutton() {
	
		setLayout(null);
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setBounds(150, 100, 200, 50);
		fieldx.setBounds(150, 25, 100, 20);
		fieldy.setBounds(250, 25, 100, 20);
		fieldzone.setBounds(150, 50, 100, 20);
		fieldzonez.setBounds(250, 50, 100, 20);
		figure.setBounds(150, 75, 200, 20);
		button.addActionListener(this);
		add(button);
		add(fieldx);
		add(fieldy);
		add(fieldzone);
		add(fieldzonez);
		add(figure);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			Gui.Start();
			//Var.gui.repaint();
		
		}
	}
}
