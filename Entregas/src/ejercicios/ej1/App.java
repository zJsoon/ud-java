package ejercicios.ej1;

public class App {
	private String[] listaApps;
	private String nombre;
	private String tipo = "Utilidad";
	private String fechaDescarga = "Hoy";
	private String dispositivos;
	private int precio = 0;
	private int valoracion = -1;
	private int numApps = 0;
	private int numDiasUsada = 0;
	private int numDiasInstaladas = 0;
	private float porcentajeUso = 0;
	private byte usoMemoria = 0;
	private byte usoTotalMemoria = 0;

	public App() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public App(String nombre) {
		super();
		this.nombre = nombre;
	}

	public App(String nombre, String tipo, int precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}

	public App(String nombre, String tipo, String fechaDescarga, String dispositivos, int precio, int valoracion,
			int numDiasUsada, int numDiasInstaladas, float porcentajeUso, byte usoMemoria, byte usoTotalMemoria) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaDescarga = fechaDescarga;
		this.dispositivos = dispositivos;
		this.precio = precio;
		this.valoracion = valoracion;
		this.numDiasUsada = numDiasUsada;
		this.numDiasInstaladas = numDiasInstaladas;
		this.porcentajeUso = porcentajeUso;
		this.usoMemoria = usoMemoria;
		this.usoTotalMemoria = usoTotalMemoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String[] getListaApps() {
		return listaApps;
	}
	public void setListaApps(String[] listaApps) {
		this.listaApps = listaApps;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFechaDescarga() {
		return fechaDescarga;
	}
	public void setFechaDescarga(String fechaDescarga) {
		this.fechaDescarga = fechaDescarga;
	}
	public String getDispositivos() {
		return dispositivos;
	}
	public void setDispositivos(String dispositivos) {
		this.dispositivos = dispositivos;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public int getNumApps() {
		return numApps;
	}
	public void setNumApps(int numApps) {
		this.numApps = numApps;
	}
	public int getNumDiasUsada() {
		return numDiasUsada;
	}
	public void setNumDiasUsada(int numDiasUsada) {
		this.numDiasUsada = numDiasUsada;
	}
	public int getNumDiasInstaladas() {
		return numDiasInstaladas;
	}
	public void setNumDiasInstaladas(int numDiasInstaladas) {
		this.numDiasInstaladas = numDiasInstaladas;
	}
	public float getPorcentajeUso() {
		return porcentajeUso;
	}
	public void setPorcentajeUso(float porcentajeUso) {
		this.porcentajeUso = porcentajeUso;
	}
	public byte getUsoMemoria() {
		return usoMemoria;
	}
	public void setUsoMemoria(byte usoMemoria) {
		this.usoMemoria = usoMemoria;
	}
	public byte getUsoTotalMemoria() {
		return usoTotalMemoria;
	}
	public void setUsoTotalMemoria(byte usoTotalMemoria) {
		this.usoTotalMemoria = usoTotalMemoria;
	}
}