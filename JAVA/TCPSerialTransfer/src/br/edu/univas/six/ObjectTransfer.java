package br.edu.univas.six;

public interface ObjectTransfer {
	
	//Operações a serem implementadas nas classes TCPObjectTransfer e TCPStringTransfer
	public void sendData(Object data);
	
	public Object receiveData();

}
