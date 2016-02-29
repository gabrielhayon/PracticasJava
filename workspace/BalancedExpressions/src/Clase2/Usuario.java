package Clase2;

import java.util.ArrayList;

public class Usuario {
	private ArrayList<Empresa> historialEmpresa;
	private Empresa empresaActual;
	private Double sueldoActual;
	private Categoria categoria;
	private int aniosExp;
	
	public Usuario(Categoria mCategoria, int mAniosExp){
		this.categoria = mCategoria;
		this.aniosExp = mAniosExp;
	}
	
	public Double CalcularSueldo(Empresa mEmpresa){
		return this.categoria.sueldoPromedio(mEmpresa,this);
	}
	
	public int getAniosExp() {
		return aniosExp;
	}
	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	public Empresa getEmpresa() {
		return empresaActual;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresaActual = empresa;
	}
	public Double getSueldoActual() {
		return sueldoActual;
	}
	public void setSueldoActual(Double sueldoActual) {
		this.sueldoActual = sueldoActual;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void AceptarTrabajo(Empresa mEmpresa){
		historialEmpresa.add(empresaActual);
		this.setEmpresa(mEmpresa);
		this.setSueldoActual(this.CalcularSueldo(mEmpresa));
	}
}
