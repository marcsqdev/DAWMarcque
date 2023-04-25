package BibliotecaProy;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class peliculas {

	private int duracion;
	private String director;
	private String actores;
	private String premios;
	private String genero;
	private ArrayList <peliculas> listaPelis;
	
	public peliculas(int duracion,String director, String actores,String premios,String genero) {
		this.duracion=duracion;
		this.director=director;
		this.actores=actores;
		this.premios=premios;
		this.genero=genero;
		}
	
	public static void GUIpeliculas() {
		JFrame frame= new JFrame();
		
		JMenuBar menuBar= new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu opcion1 =new JMenu("Filtrar por:");
		JMenu opcion2 =new JMenu("Ayuda");
		JMenu opcion3 =new JMenu("Salir");
		
		JMenuItem dura= new JMenuItem("Duracion");
		JMenuItem dire= new JMenuItem("Director");
		JMenuItem actor= new JMenuItem("Actores");
		JMenuItem premios= new JMenuItem("Premios");
		JMenuItem genero= new JMenuItem("Genero");
		
		menuBar.add(opcion1);
		menuBar.add(opcion2);
		menuBar.add(opcion3);
		opcion1.add(dura);
		opcion1.add(dire);
		opcion1.add(actor);
		opcion1.add(premios);
		opcion1.add(genero);
		
		JButton buscar = new JButton("Buscar");
		frame.add(buscar);
		buscar.setFocusable(false);
		buscar.setBounds(30, 13, 100, 30);
		buscar.addActionListener(null);
		
		JTextField textField= new JTextField("Buscar pelicula...");
		textField.setBounds(135, 13, 200, 30);
		frame.add(textField);
	
		
		frame.setTitle("Peliculas");
		
		/*frame.setDefaultCloseOperation(EXIT_ON_CLOSE);*/
		frame.setSize(1080, 960);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.getContentPane().setBackground(new Color (32, 33, 36, 1) );
	}
}
