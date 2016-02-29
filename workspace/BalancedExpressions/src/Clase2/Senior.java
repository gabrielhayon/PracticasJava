package Clase2;

public class Senior implements Categoria{
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsario){
		double salarioActual = unUsario.getSueldoActual();
		double sueldoDeseado = salarioActual * 2;
		return sueldoDeseado;
	}
}
