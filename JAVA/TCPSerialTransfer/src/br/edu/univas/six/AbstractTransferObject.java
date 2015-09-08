package br.edu.univas.six;
import java.io.InputStream;
import java.util.Properties;


public abstract class AbstractTransferObject {
	
	/*
	Criando opera��es abstratas para serem implementadas 
	nas classes SerialFactory e TCPFactory
	*/
	public abstract ObjectTransfer createObjectTransfer();
	public abstract StringTransfer createStringTransfer();
	
	public static AbstractTransferObject getFactory(){
		
		String filename = "transferfactory.properties";
		
		InputStream is = AbstractTransferObject.class.getClassLoader()
		.getResourceAsStream(filename);
		
		if(is==null){
			throw new RuntimeException("Recurso n�o encontrado!");
		}
		
		Properties props = new Properties();
		try {
			props.load(is);
			String type = props.getProperty("tranferfactory.factorytype");
			if("TCP".equalsIgnoreCase(type)){
				return new TCPFactory();
			}else if("Serial".equalsIgnoreCase(type)){
				return new SerialFactory();
			}else {
				throw new RuntimeException("Tipo n�o suportado: " + type);
			}
		} catch (Exception e) {
			throw new RuntimeException("N�o foi possivel ler as propriedades!", e);
		}
	}

}
