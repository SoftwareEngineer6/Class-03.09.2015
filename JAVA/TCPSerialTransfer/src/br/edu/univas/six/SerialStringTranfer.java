package br.edu.univas.six;

public class SerialStringTranfer implements StringTransfer{

	@Override
	public void sendData(String data) {
		System.out.println("Enviando string via Serial...");
		System.out.println(data);
		
	}

	@Override
	public String receiveData() {
		System.out.println("Recendo String via Serial");
		return new String();
	}

}
