package Inheritance;

class DagBisikleti extends Bisiklet {

	public int koltukYuksekligi;

	public DagBisikleti(int vites, int hiz, int baslangýcYuksekligi) {
		super(vites, hiz);
		koltukYuksekligi = baslangýcYuksekligi;
	}

	public void setYukseklik(int newValue) {
		koltukYuksekligi = newValue;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nkoltuk yüksekliði : " + koltukYuksekligi);
	}

}