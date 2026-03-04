package modelo;

public enum Dificultad {
	FACIL(5), NORMAL(8), DIFICIL(12);

	int size;

	private Dificultad(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
