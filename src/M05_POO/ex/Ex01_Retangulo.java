package M05_POO;

public class Ex01_Retangulo{
	public double hR, lR;
	
	public double areaRet() {
		return hR * lR;
	}
	
	public double perimRet() {
		return (2 * hR) + (2 * lR);
	}
	
	public double diagRet() {
		return Math.sqrt(Math.pow(hR, hR) + Math.pow(lR, hR));
	}
}
