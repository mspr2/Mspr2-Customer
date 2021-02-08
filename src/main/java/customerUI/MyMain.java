package customerUI;

import consoleutils.*;

public class MyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int option;
		MyUserView myMedia = new MyUserView();
		do {
			String[] menuItems = new String[] { "Ins�rer un Utilisateur", "Eliminer User", "Visualiser user",
					"Rechercher" };

			Menu menu = new Menu("Gestion Financiere", menuItems);
			option = menu.showAndGetOption();

			switch (option) {
			case 1:
				myMedia.addMedia();
				break;
			case 2:
				myMedia.removeMedia();
				break;
			case 3:
				myMedia.showAll();
				break;

			}
		} while (option != 0);

		// MyFrame f = new MyFrame();

	}
}