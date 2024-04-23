package devices;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);

	}

	@Override
	public void print(String doc) {
		System.out.println("Combo Impressora" + doc);

	}

	@Override
	public String scan() {

		return "Combo Scan resultado";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Processado: " + doc);

	}

}
