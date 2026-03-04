package modelo;

public enum Densidad {
	FACIL(10),DIFICIL(20);
	int porcentaje;

	private Densidad(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getPorcentaje() {
		return porcentaje;
	}
	
}
