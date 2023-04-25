package BibliotecaProy;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class documentales {
private int duracion;
private String productora;
private String premios;
private String tematica;
private ArrayList <documentales> listaDocu;

	public documentales(int duracion,String productora,String premios, String tematica) {
		this.duracion=duracion;
		this.productora=productora;
		this.premios=premios;
		this.tematica=tematica;
	}
	
	public static void GUIdocumentales() {
			JFrame frame= new JFrame();
			
			JMenuBar menuBar= new JMenuBar();
			frame.setJMenuBar(menuBar);
			JMenu opcion1 =new JMenu("Filtrar por:");
			JMenu opcion2 =new JMenu("Ayuda");
			JMenu opcion3 =new JMenu("Salir");
			
			JMenuItem dura= new JMenuItem("Duracion");
			JMenuItem prod= new JMenuItem("Productora");
			JMenuItem premios= new JMenuItem("Premios");
			JMenuItem tematica= new JMenuItem("Tematica");
			
			menuBar.add(opcion1);
			menuBar.add(opcion2);
			menuBar.add(opcion3);
			opcion1.add(dura);
			opcion1.add(prod);
			opcion1.add(premios);
			opcion1.add(tematica);
			
			JButton buscar = new JButton("Buscar");
			frame.add(buscar);
			buscar.setFocusable(false);
			buscar.setBounds(30, 13, 100, 30);
			buscar.addActionListener(null);
			
			JTextField textField= new JTextField("Buscar documental...");
			textField.setBounds(135, 13, 200, 30);
			frame.add(textField);
		
			
			frame.setTitle("Documentales");
			
			/*frame.setDefaultCloseOperation(EXIT_ON_CLOSE);*/
			frame.setSize(1080, 960);
			frame.setLayout(null);
			frame.setVisible(true);
			
			frame.getContentPane().setBackground(new Color (32, 33, 36, 1) );
		
	}

}
