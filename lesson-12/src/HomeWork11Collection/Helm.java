package HomeWork11Collection;

public class Helm {
	private int helmDiametr;
	private String helmMaterial;
	
//	public Helm(int helmDiametr, String helmMaterial) {
//		super();
//		this.helmDiametr = helmDiametr;
//		this.helmMaterial = helmMaterial;
//	}
	public int getHelmDiametr() {
		return helmDiametr;
	}
	public void setHelmDiametr(int helmDiametr) {
		this.helmDiametr = helmDiametr;
	}
	public String getHelmMaterial() {
		return helmMaterial;
	}
	public void setHelmMaterial(String helmMaterial) {
		this.helmMaterial = helmMaterial;
	}
	@Override
	public String toString() {
		return "Helm [helmDiametr=" + helmDiametr + ", helmMaterial=" + helmMaterial + "]";
	}
	
}
