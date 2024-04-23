package devices;

public class ConcreteScanner extends Device implements Scanner {
//Aparelho de  Scannear
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processamento de scanner" + doc);
	}

	@Override
	public String scan() {
		return "Conteúdo digitalizado";
	}

}
