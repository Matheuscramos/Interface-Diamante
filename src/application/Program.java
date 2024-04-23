package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ConcretePrinter print = new ConcretePrinter("1080");
		print.processDoc("My Letter");
		print.print("My Letter");
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		System.out.println();
		ComboDevice c = new ComboDevice("720");

		c.processDoc("Minha Dissertação");
		c.print("Minha Dissertação");
		System.out.println("Scan resultado");

	}

}
