#Prenda.java

public class Prenda {
	private Double precio;
	private String color;
	private String talla;
	private int referencia;

	public Prenda
(int referencia, Double precio, String color, String talla) {
		this.precio = precio;
		this.color = color;
		this.talla = talla;
		this.referencia = referencia;
	}
	
	@Override
	public String toString() {
		return "referencia: " + this.referencia + "\n\tprecio: " + this.precio + "\n\tcolor: " + this.color + "\n\ttalla: " + this.talla ;
	}
}

###############################Camiseta.java

public class Camiseta extends Prenda {
	private char manga;

	public Camiseta(int referencia, Double precio, String color, String talla, char manga) {
		super(referencia, precio, color, talla);
		this.manga = manga;
	}

	@Override
	public String toString() {
		return "Prenda Camiseta - " + super.toString() + "\n\tTipo manga:" + this.manga;
	}
}

###############################Leggin.java

public class Leggin extends Prenda {
	private String largo;
	public Leggin (int referencia, Double precio, String color, String talla, String largo) {
		super (referencia, precio, color, talla);
		this.largo=largo;
	}
	@Override
	public String toString() {
		return "Prenda Leggin - " + super.toString() + "\n\tlargo: "+this.largo;
	}
}


###############################VestiDeporTic.java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VestiDeporTic {

private static List<Prenda> prendas=new ArrayList<Prenda>();

public static void agregarPrenda(Prenda prenda) {
	prendas.add(prenda);
}
public static void listarPrenda() {
	System.out.println("***Mi Buen VestiDeporTic***");
	for (int i=0;i<prendas.size();i++) {
		System.out.println("\t"+prendas.get(i));
	}
}
public static void main (String[] args){
		VestiDeporTic vestideportic = new VestiDeporTic ();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String procesarEntrada = in.next();
			String[] comando = procesarEntrada.split("&");
			switch (comando[0]) {
			case "1":
				if (comando[1].equals("Camiseta")) {
				Camiseta camiseta = new Camiseta (Integer.valueOf(comando[2]),Double.valueOf(comando[3]),comando[4],comando[5],comando[6].charAt(0));
				agregarPrenda(camiseta);
				}
				else {
				Leggin leggin = new Leggin (Integer.valueOf(comando[2]),Double.valueOf(comando[3]),comando[4],comando[5],comando[6]);
				agregarPrenda(leggin);
				}
				break;
			case "2":
				listarPrenda();
				break;
			case "3":
				System.exit(0);
				break;
			default:
				break;
			}
		}

}
}


