package BibliotecaProy;

public class Main {

	public static void main(String[] args) {
	libros libro=new libros("","","",0,"","","");
	peliculas peli=new peliculas(0,"","","","");
	documentales docu=new documentales(0,"","","");
	login log=new login();
	admin_menu amenu= new admin_menu();
	GUIusuario umenu= new GUIusuario();
	libro.librosGUI();
	log.loginGUI();
	amenu.adminMenu();
	umenu.GUIusuario();
	peli.GUIpeliculas();
	docu.GUIdocumentales();
	}

}
