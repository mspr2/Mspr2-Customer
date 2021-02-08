package customerUI;

public class MediaEditorFactory {
	private String[] mediaTypes = new String[] {"Client","Fournisseur"};

	public String[] getMediaTypes() {
		return mediaTypes;
	}

	public UserEditor getEditor(String tipo) {
		if (tipo.equals("Client"))
			return new CustomerEditor();
//		if (tipo.equals("Fournisseur"))
//			return new SongEditor();
//		if (tipo.equals("Foto"))
//			return new PhotoEditor();
//		if (tipo.equals("Ebook"))
//			return new EbookEditor();
		return null;
	}

}

