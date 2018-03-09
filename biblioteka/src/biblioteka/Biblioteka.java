package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private LinkedList<Knjiga> knjige = new LinkedList<>();

	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
	}

	public void obrisiKnjigu(Knjiga k) {
		knjige.remove(k);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		if (naslov == null)
			return null;

		LinkedList<Knjiga> novaLista = new LinkedList<>();

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov))
				novaLista.add(knjige.get(i));
		}
		return novaLista;
	}

}
