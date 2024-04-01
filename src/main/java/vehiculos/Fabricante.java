package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int renault = 0;
		ArrayList<Fabricante> renaultn = new ArrayList<Fabricante>();
		int chevrolet = 0;
		ArrayList<Fabricante> chevroletn = new ArrayList<Fabricante>();
		int tesla = 0;
		ArrayList<Fabricante> teslan = new ArrayList<Fabricante>();
		int volvo = 0;
		ArrayList<Fabricante> volvon = new ArrayList<Fabricante>();
		
		for (Vehiculo vehiculoa: Vehiculo.getLista()) {
			switch (vehiculoa.getFabricante().getNombre()) {
			case "Renault":
				renault++;
				renaultn.add(vehiculoa.getFabricante());
				break;
			case "Chevrolet":
				chevrolet++;
				chevroletn.add(vehiculoa.getFabricante());
				break;
			case "Tesla":
				tesla++;
				teslan.add(vehiculoa.getFabricante());
				break;
			case "Volvo":
				volvo++;
				volvon.add(vehiculoa.getFabricante());
				break;
			default:
			}									
		}
		
		int maximo = Math.max(Math.max(renault, chevrolet), Math.max(tesla, volvo));
		
		if (maximo==renault) {
			return renaultn.get(0);
		} else if (maximo==chevrolet) {
			return chevroletn.get(0);
		} else if (maximo==tesla) {
			return teslan.get(0);
		} else if (maximo==volvo) {
			return volvon.get(0);
		} else{
			return null;
		}
	}
	
}
