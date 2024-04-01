package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
		
	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int colombia = 0;
		ArrayList<Pais> colombian = new ArrayList<Pais>();
		int ecuador = 0;
		ArrayList<Pais> ecuadorn = new ArrayList<Pais>();
		int usa = 0;
		ArrayList<Pais> usan = new ArrayList<Pais>();
		int canada = 0;
		ArrayList<Pais> canadan = new ArrayList<Pais>();
		
		for (Vehiculo vehiculoa: Vehiculo.getLista()) {
			switch (vehiculoa.getFabricante().getPais().getNombre()) {
			case "Colombia":
				colombia++;
				colombian.add(vehiculoa.getFabricante().getPais());
				break;
			case "Ecuador":
				ecuador++;
				ecuadorn.add(vehiculoa.getFabricante().getPais());
				break;
			case "USA":
				usa++;
				usan.add(vehiculoa.getFabricante().getPais());
				break;
			case "Canada":
				canada++;
				canadan.add(vehiculoa.getFabricante().getPais());
				break;
			default:
			}									
		}
		
		int maximo = Math.max(Math.max(colombia, ecuador), Math.max(usa, canada));
		
		if (maximo==colombia) {
			return colombian.get(0);
		} else if (maximo==ecuador) {
			return ecuadorn.get(0);
		} else if (maximo==usa) {
			return usan.get(0);
		} else if (maximo==canada) {
			return canadan.get(0);
		} else{
			return null;
		}
	}
	
}
