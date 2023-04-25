package BibliotecaProy;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login{

	public static void loginGUI() {
		JFrame  marco= new JFrame("Login");
		JLabel user, pwd;
		user= new JLabel("Usuario:");
		user.setBounds(30, 13, 100, 30);
		
		pwd=new JLabel("Contraseña:");
		pwd.setBounds(30, 52, 100, 30);
		
		JTextField F_user=new JTextField();
		F_user.setBounds(110, 18, 200, 30);
		
		JTextField F_pwd=new JTextField();
		F_pwd.setBounds(110, 54, 200, 30);
		
		JButton logBut=new JButton("Login");
		logBut.setBounds(130,90,80,25);
		logBut.addActionListener(null);
		
		marco.add(user);
		marco.add(pwd);
		marco.add(F_user);
		marco.add(F_pwd);
		marco.add(logBut);
		marco.setSize(400,180);
		marco.setLayout(null);
		marco.setVisible(true);
		marco.setLocationRelativeTo(null);
	}

}
