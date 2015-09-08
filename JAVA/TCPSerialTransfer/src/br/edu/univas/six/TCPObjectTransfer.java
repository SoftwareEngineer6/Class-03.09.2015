package br.edu.univas.six;

public class TCPObjectTransfer implements ObjectTransfer{

	@Override
	public void sendData(Object data) {
		System.out.println("Enviando objetos via TCP");
		System.out.println(data);
		
	}

	@Override
	public Object receiveData() {
		System.out.println("Recebendo Objetos via TCP");
		return new Object();
	}

}
