package se.liu.hamed;

public class main {
	public static void main(String[] args) {
		/** Your code here */
		Storage<BankAccount> aStorage = new Storage<BankAccount>();
		Storage<String> sStorage = new Storage<String>();

		// Class baCls = BankAccount.class;
		// Class baCls = String.class;
		Class<BankAccount> baCls = BankAccount.class;
		try {
			// Object myAccount = baCls.newInstance();
			BankAccount myAccount = (BankAccount) baCls.newInstance();
			aStorage.setValue(myAccount);
			// Deposit
			myAccount.deposit(15);
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		// Do a simple output
		System.out.println(aStorage.getValue().showSaldo());
		// Now try to compare
		if (aStorage.getClass() == sStorage.getClass()) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}

		// DataCarrier Test Program

		DataCarrier dt = new DataCarrier(0, 0, 0, 0, 0, "This is Hamed!");
		dt.setState(0, 0, 0, 1, 1);
        dt.setValue("There is something crazy!");
        dt.setState(0, 0, 0, 1, 1);
        DataCarrier dt1 = new DataCarrier(-1, 0, 2, 1, 0, "Test invalid states");
		System.out.println(dt.getValue());
		System.out.println(dt1.getValue());
		
	}
}
