package br.edu.univas.six;

public class SerialObjectTransfer implements ObjectTransfer{

	@Override
	public void sendData(Object data) {
		System.out.println("Enviando objeto via Serial...");
		System.out.println(data);
		
	}

	@Override
	public Object receiveData() {
		System.out.println("Recendo Objeto via Serial");
		return new Object();
	}

}
