package customerUI;

import consoleutils.*;

import customerUser.*;

public class MyUserView {

	private MyUserController myUserController = null;

	public MyUserView() {
		myUserController = new MyUserController();
	}

	public void addMedia() {
		MediaEditorFactory mediaEditorFactory = new MediaEditorFactory();
		String[] mediaTypes = mediaEditorFactory.getMediaTypes();
		Menu menu = new Menu("Selectioner un type d'Utilisateur", mediaTypes);
		int option = menu.showAndGetOption();
		if (option > 0) {
			UserEditor e = mediaEditorFactory
					.getEditor(mediaTypes[option - 1]);
			if (e == null) {
				System.out
						.println("Erreur lors de la creation d'un nouvel utilisateur");
				return;
			}

			User u = e.create();
			if (u == null) {
				System.out
						.println("Erreur lors de la creation d'un nouvel utilisateur");
				return;
			}

			boolean ok = myUserController.add(u);
			if (ok)
				System.out
						.println("compte client cree avec succes");
			else
				System.out
						.println("probleme lors de la creation du compte client");
		}
	}

	public void removeMedia() {
		UserCollection user = myUserController.getAll();
		String[] menuItems = new String[user.size()];
		for (int i = 0; i < user.size(); i++) {
			menuItems[i] = user.get(i).toString();
		}
		Menu menu = new Menu("Suppresion d'un Utilisateur", menuItems);
		int option = menu.showAndGetOption();
		if (option > 0) {
			//System.out.println("voici " + option);	
			User u1 = myUserController.remove(option-1);
			//if (myUserController.remove(user.get(option -1)) == true)
			if(u1!=null)
				System.out.println("Compte client supprime avec succes");
			else
				System.out
						.println("Probleme lors de la suppresion, operation annulee");
		}
	}

	public void showAll() {
		UserCollection medias = myUserController.getAll();
		print(medias);
	}

//	public void find() {
//		FilterEditorFactory filterEditorFactory = new FilterEditorFactory();
//		String[] filterTypes = filterEditorFactory.getFilterTypes();
//		Menu menu = new Menu("Seleziona il tipo di Ricerca", filterTypes);
//		int option = menu.showAndGetOption();
//		if (option > 0) {
//			String filterType = filterTypes[option - 1];
//			FilterEditor filterEditor = filterEditorFactory
//					.getFilterEditor(filterType);
//			Filter filter = filterEditor.create();
//			UserCollection medias = myUserController.find(filter);
//			print(medias);
//		}
//	}

	private void print(UserCollection medias) {
		for (int i = 0; i < medias.size(); i++) {
			System.out.println(medias.get(i));
		}
	}
}
