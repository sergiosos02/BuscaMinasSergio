package modelo;

public class Casilla {
	private boolean mina;
	private int minasAlrededor;

	public Casilla() {
		super();
		this.mina = false;
		this.minasAlrededor = 0;
	}

	public boolean isMina() {
		return mina;
	}

	public void setMina(boolean mina) {
		this.mina=mina;
		
	}

	public void setMinasAlrededor(int minasAlrededor) {
		// TODO Auto-generated method stub
		
	}

}
