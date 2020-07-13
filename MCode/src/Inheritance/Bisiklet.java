package Inheritance;

class Bisiklet {
	public int vites;
	public int hiz;

	public Bisiklet(int vites, int hiz) {
		this.vites = vites;
		this.hiz = hiz;
	}

	public void fren(int decrement) {
		hiz -= decrement;
	}

	public void hizUp(int increment) {
		hiz += increment;
	}

	public String toString() {
		return ("vites :" + vites + "\n" + "hiz : " + hiz);
	}
}