package main;

public interface Entregable {
	
	public void delivered();
	
	public void returned();
	
	public boolean isDelivered();
	
	public void compareTo(Object object);
	
}
