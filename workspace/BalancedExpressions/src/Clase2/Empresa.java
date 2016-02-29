package Clase2;

public class Empresa {
	private Double sueldoBase;
	private int cantidadEmpleados;
	
	public Empresa (Double mSueldoBase, int mCantidadEmpleados){
		this.sueldoBase = mSueldoBase;
		this.cantidadEmpleados = mCantidadEmpleados;
	}
	
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double mSueldoBase) {
		this.sueldoBase = mSueldoBase;
	}
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
}
