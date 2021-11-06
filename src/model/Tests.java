package model;

public class Tests {

	public static void main(String[] args) {
		System.out.println("Crear Productores:");
		
		Producer ana = new Producer("Ana");
		Producer jose = new Producer("José");
		
		System.out.println("Agregando cultivos.. ");
		
		ana.addCrop(new Crop("Zanahorias", 3, "Campo", false));
		ana.addCrop(new Crop("Papa", 1, "Campo", false));
		ana.addCrop(new Crop("Lechuga", 2, "Invernaculo", true));
		ana.addCrop(new Crop("Cale", 3, "Campo", true));

		jose.addCrop(new Crop("Zanahorias", 3, "Campo", false));
		jose.addCrop(new Crop("Papa", 1, "Campo", false));
		jose.addCrop(new Crop("Lechuga", 2, "Invernaculo", true));
		jose.addCrop(new Crop("Cale", 3, "Campo", true));

		System.out.println("Cultivos: " + ana.getHarvestingCrops());
	}

}
