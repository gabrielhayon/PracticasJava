package Clase2;

public class Junior implements Categoria{
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsario){
		double sueldoActual = unUsario.getSueldoActual();
		double sueldoBase = unaEmpresa.getSueldoBase();
		return Math.max(sueldoActual, sueldoBase);
	}
}
