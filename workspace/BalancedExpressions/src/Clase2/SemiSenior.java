package Clase2;

public class SemiSenior implements Categoria{
	
	public Double sueldoPromedio(Empresa unaEmpresa, Usuario unUsario){
		int aniosExp = unUsario.getAniosExp();
		double sueldoDeseado = aniosExp * 2000;
		return sueldoDeseado;
	}
}
