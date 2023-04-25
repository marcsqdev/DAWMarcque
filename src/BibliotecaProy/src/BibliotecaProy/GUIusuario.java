package BibliotecaProy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class GUIusuario {
	
	public static void GUIusuario() {
	JFrame frame=new JFrame("Usuario");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JMenuBar menuBar= new JMenuBar();
	JMenu opcion1 =new JMenu("Formato");
	JMenu opcion2 =new JMenu("Ayuda");
	JMenu opcion3 =new JMenu("Salir");
	frame.setJMenuBar(menuBar);
	menuBar.add(opcion1);
	menuBar.add(opcion2);
	menuBar.add(opcion3);
	
	JButton cd= new JButton("CD's");
	cd.setBounds(450,60,120,25);	
	
	JButton VerLibros= new JButton("Libros");
	VerLibros.setBounds(20,20,120,25);
	
	JButton Peliculas= new JButton("Peliculas");
	Peliculas.setBounds(150,20,120,25);
	
	JButton altaUsuario= new JButton("Documentales");
	altaUsuario.setBounds(20,60,120,25);
	
	JButton Revistas= new JButton("Revistas");
	Revistas.setBounds(150,60,120,25);
	
	JButton liReser= new JButton("Reservados");
	liReser.setBounds(450,20,120,25);
	
	JButton deLibro= new JButton("Devolucion");
	deLibro.setBounds(280,60,120,25);
	
	JButton reserva= new JButton("Reservar");
	reserva.setBounds(280,20,120,25);
	
	frame.add(cd);
	frame.add(VerLibros);
	frame.add(Peliculas);
	frame.add(altaUsuario);
	frame.add(Revistas);
	frame.add(liReser);
	frame.add(deLibro);
	frame.add(reserva);
	frame.setSize(1080,960);
	frame.setLayout(null);
	frame.setVisible(true);
	}
}
