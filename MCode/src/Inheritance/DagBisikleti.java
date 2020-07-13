package Inheritance;

class DagBisikleti extends Bisiklet {

	public int koltukYuksekligi;

	public DagBisikleti(int vites, int hiz, int baslang�cYuksekligi) {
		super(vites, hiz);
		koltukYuksekligi = baslang�cYuksekligi;
	}

	public void setYukseklik(int newValue) {
		koltukYuksekligi = newValue;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nkoltuk y�ksekli�i : " + koltukYuksekligi);
	}

}