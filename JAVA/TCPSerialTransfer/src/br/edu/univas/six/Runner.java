package br.edu.univas.six;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractTransferObject transfer = AbstractTransferObject.getFactory();
		
		StringTransfer st = transfer.createStringTransfer();
		ObjectTransfer ot = transfer.createObjectTransfer();
		
		String str = new String("String");
		Object obj = new Object();
		

		st.receiveData();
		ot.receiveData();
		
		st.sendData(str);
		ot.sendData(obj);
		
		
	}

}
