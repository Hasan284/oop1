package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("aws.jpg");
		product1.setUnitsInStocks(755);
		product1.setUnitPrice(322);

		Product product2 = new Product();
		product2.setName("SB Kahve Makinesi");
		product2.setDiscount(6);
		product2.setImageUrl("aws1.jpg");
		product2.setUnitsInStocks(125);
		product2.setUnitPrice(312);

		Product product3 = new Product();

		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(8);
		product3.setImageUrl("aws2.jpg");
		product3.setUnitsInStocks(188);
		product3.setUnitPrice(128);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer invidualCustomer = new IndividualCustomer();
		invidualCustomer.setId(1);
		invidualCustomer.setPhone("0565644");
		invidualCustomer.setCustomerNumber("213213");
		invidualCustomer.setName("Hasan");
		invidualCustomer.setSurname("Kaya");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Zamazingo");
		corporateCustomer.setPhone("454654");
		corporateCustomer.setTaxNumber("321321310");
		corporateCustomer.setCustomerNumber("3213213");

//		Customer[] customers = { invidualCustomer, corporateCustomer };
		
	

	}
}