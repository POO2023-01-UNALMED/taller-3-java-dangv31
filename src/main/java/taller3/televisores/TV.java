package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public void canalUp() {
		if (estado==true) {
			if (canal<120) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if (estado==true) {
			if (canal>1) {
				canal--;
			}
		}
	}
	public void volumenUp() {
		if (estado==true) {
			if (volumen<7) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if (estado==true) {
			if (volumen>1) {
				volumen--;
			}
		}
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (estado==true && 0<canal && canal<7) {
			this.volumen = volumen;
		}
		
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (estado==true && 1<=canal && canal<=120) {
			this.canal = canal;
		}
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	
}
