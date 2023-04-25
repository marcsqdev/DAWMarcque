package BibliotecaProy;

import javax.swing.JButton;
import javax.swing.JFrame;

public class admin_menu {

	public static void adminMenu() {
		JFrame frame=new JFrame("Funciones Administrador");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton crearBD= new JButton("Crear/Reiniciar BD");
		crearBD.setBounds(450,60,120,25);	
		
		JButton VerLibros= new JButton("Ver Libros");
		VerLibros.setBounds(20,20,120,25);
		
		JButton Usuarios= new JButton("Ver usuarios");
		Usuarios.setBounds(150,20,120,25);
		
		JButton altaUsuario= new JButton("Añadir usuario");
		altaUsuario.setBounds(20,60,120,25);
		
		JButton añadirLibro= new JButton("Añadir libro");
		añadirLibro.setBounds(150,60,120,25);
		
		JButton liReser= new JButton("Reservados");
		liReser.setBounds(450,20,120,25);
		
		JButton deLibro= new JButton("Devolucion");
		deLibro.setBounds(280,60,120,25);
		
		JButton reLibro= new JButton("Reserva libro");
		reLibro.setBounds(280,20,120,25);
		
		frame.add(crearBD);
		frame.add(VerLibros);
		frame.add(Usuarios);
		frame.add(altaUsuario);
		frame.add(añadirLibro);
		frame.add(liReser);
		frame.add(deLibro);
		frame.add(reLibro);
		frame.setSize(1080,960);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
		
}
