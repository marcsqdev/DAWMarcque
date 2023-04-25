package BibliotecaProy;

public class Main {

	public static void main(String[] args) {
	libros libro=new libros("","","");
	login log=new login();
	admin_menu amenu= new admin_menu();
	GUIusuario umenu= new GUIusuario();
	libro.librosGUI();
	log.loginGUI();
	amenu.adminMenu();
	umenu.GUIusuario();
	}

}
