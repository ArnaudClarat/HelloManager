package be.ifosupwavre.info.poo.geometrie;

public final class Square extends Rectangle {
	@Override
	public void setLength(float length) {
		super.setLength(length);
		super.setLength(length);
	}
	
	@Override
	public void setWidth(float width) {
		this.setLength(width);
	}
}
