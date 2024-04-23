package devices;

public class ConcretePrinter extends Device implements Printer {
//Aparelho de impressão
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processamento de impressora" + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Impressão: " + doc);
	}
}
