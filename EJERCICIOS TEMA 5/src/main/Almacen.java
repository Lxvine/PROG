package main;

public class Almacen {

	private Bebida[][] estanteria;

	// Método para calcular el precio de todas las bebidas:

	public double totalPrice() {

		double finalPrice = 0;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[i].length; j++) {
				finalPrice += estanteria[i][j].getPrice();
			}
		}
		return finalPrice;
	}

	// Método para calcular el precio total de una marca de bebida en concreto:

	public double totalBrandPrice(String brand) {

		double finalPrice = 0;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[i].length; j++) {
				if (estanteria[i][j].getBrand().equals(brand)) {
					finalPrice += estanteria[i][j].getPrice();
				}
			}
		}
		return finalPrice;
	}

	// Método para calcular el precio total de una de las columnas:

	public double totalPriceColumn(int num) {

		double finalPrice = 0;

		for (int i = 0; i < estanteria.length; i++) {
			finalPrice += estanteria[i][num].getPrice();
		}
		return finalPrice;
	}

	// Método para añadir un producto:

	public void addProduct(Bebida a) {

		boolean found = false;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[i].length; j++) {
				if (estanteria[i][j] == null) {
					estanteria[i][j] = a;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("Bebida añadida correctamente.");
		} else
			System.out.println("La bebida no ha podido ser añadida.");
	}

	// Método para eliminar un producto:

	public void deleteProduct() {

		boolean found = false;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[i].length; j++) {
				if (estanteria[i][j] != null) {
					estanteria[i][j] = null;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("Bebida eliminada correctamente.");
		} else
			System.out.println("La bebida no ha podido ser eliminada.");
	}

	public void showProduct() {

		for (int i = 0; i < estanteria.length; i++) {
			System.out.println("");
			for (int j = 0; j < estanteria[i].length; j++) {
				System.out.println(estanteria[i][j].toString());
			}
		}
	}
}
