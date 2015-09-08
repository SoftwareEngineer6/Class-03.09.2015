package br.edu.univas.six;

public class TCPFactory extends AbstractTransferObject{

	@Override
	public ObjectTransfer createObjectTransfer() {
		return new TCPObjectTransfer();
	}

	@Override
	public StringTransfer createStringTransfer() {
		return new TCPStringTranfer();
	}

}
