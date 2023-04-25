package BibliotecaProy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class libros extends JFrame{
	private String titulo;
	private String ISBN;
	private String autor;
	private ArrayList[] listalibros;
	
	public libros(String titulo,String ISBN, String autor) {
		this.titulo=titulo;
		this.ISBN=ISBN;
		this.autor=autor;
	}
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public static void librosGUI(){
		libros libro=new libros("lo que el viento se llevo","","");
		
		
		JFrame frame= new JFrame();
		
		JMenuBar menuBar= new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu opcion1 =new JMenu("Formato");
		JMenu opcion2 =new JMenu("Ayuda");
		JMenu opcion3 =new JMenu("Salir");
		
		JMenuItem digital= new JMenuItem("Digital");
		JMenuItem fisico= new JMenuItem("Físico");
		
		menuBar.add(opcion1);
		menuBar.add(opcion2);
		menuBar.add(opcion3);
		opcion1.add(digital);
		opcion1.add(fisico);
		
		JButton buscar = new JButton("Buscar");
		frame.add(buscar);
		buscar.setFocusable(false);
		buscar.setBounds(30, 13, 100, 30);
		buscar.addActionListener(null);
		
		JTextField textField= new JTextField("Buscar libro...");
		textField.setBounds(135, 13, 200, 30);
		frame.add(textField);
	
		
		frame.setTitle("Libros");
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1080, 960);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.getContentPane().setBackground(new Color (32, 33, 36, 1) );
	}
}
