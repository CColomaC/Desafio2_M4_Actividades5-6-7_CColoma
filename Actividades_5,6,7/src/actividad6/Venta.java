package actividad6;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Venta {
	
	//ATRIBUTOS
	private LocalDateTime fecha;
	private ArrayList<LineaDetalle> lineasDetalle = new ArrayList<>();
	
	//CONSTRUCTORES
	public Venta() {
		
	}
	public Venta(LocalDateTime fecha, ArrayList<LineaDetalle> lineasDetalle) {
		this.fecha = fecha;
		this.lineasDetalle = lineasDetalle;
	}
	
	//GETTERS, SETTERS, CALCULOS
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public ArrayList<LineaDetalle> getLineasDetalle() {
		return lineasDetalle;
	}
	public void setLineasDetalle(ArrayList<LineaDetalle> lineasDetalle) {
		this.lineasDetalle = lineasDetalle;
	}
	
	public void agregarLineaDetalle(LineaDetalle lineaDetalle) {
		this.lineasDetalle.add(lineaDetalle);
		this.fecha = LocalDateTime.now();
	}

	public int calcularTotal() {
		int total = 0;	
		for (LineaDetalle l: this.lineasDetalle) {
			total = total + l.calcularSubtotal();
		}
		return total;
	}
	public String productosTotales() {
		String productos = " Productos comprados: ";		
		for (LineaDetalle l: this.lineasDetalle) {
			productos = productos+ " | " +l.getCantidad() +" "+ l.getProducto().getNombre()+ " | ";
		}	
		return productos;
	}
}
