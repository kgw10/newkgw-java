package adapter_pattern;

public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void targetadapter() {
		adaptee.adapte();
		
	}
}
