package br.edu.univas.six;

public class SerialFactory extends AbstractTransferObject {

	@Override
	public ObjectTransfer createObjectTransfer() {
		return new SerialObjectTransfer();
	}

	@Override
	public StringTransfer createStringTransfer() {
		return new SerialStringTranfer();
	}

}
