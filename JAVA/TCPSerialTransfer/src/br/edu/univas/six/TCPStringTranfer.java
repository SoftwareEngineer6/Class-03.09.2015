package br.edu.univas.six;

public class TCPStringTranfer implements StringTransfer{

	@Override
	public void sendData(String data) {
		System.out.println("Enviando string via TCP");
		System.out.println(data);
		
	}

	@Override
	public String receiveData() {
		System.out.println("Recebendo String via TCP");
		return new String();
	}

}
