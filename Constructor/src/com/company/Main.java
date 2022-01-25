package com.company;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Main {

    public static void main(String[] args) {
//	Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bob@email.com",
//			"999912342");
//	System.out.println(bobsAccount.getNumber());
//	System.out.println(bobsAccount.getBalance());
//
//	bobsAccount.withdrawal(100);
//
//	bobsAccount.deposit(50);
//	bobsAccount.withdrawal(100);
//
//	bobsAccount.deposit(51.0);
//	bobsAccount.withdrawal(100.0);
//
//	Account naqeebsAccount = new Account("Naqeeb", "naqeeb@email.com", "9999991344");
//	System.out.println(naqeebsAccount.getNumber() + " name " + naqeebsAccount.getCustomerName());

		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());

		VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
		System.out.println(customer2.getName());

		VipCustomer customer3 = new VipCustomer("Naqeeb", 12000, "naqeeb@email.com");
		System.out.println(customer3.getName());
    }
}
