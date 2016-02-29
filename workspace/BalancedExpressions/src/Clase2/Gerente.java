package Clase2;

public class Gerente implements Categoria{
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsario){
		int cantEmpleados = unaEmpresa.getCantidadEmpleados();
		double salarioActual = unUsario.getSueldoActual();
		double sueldoDeseado = (cantEmpleados / 10) * salarioActual;
		return sueldoDeseado;
	}
	
}
