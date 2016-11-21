public enum CoffeePod {
	
	CP001(ProductType.SMALL, Flavor.VANILLA, 1),
    CP003(ProductType.SMALL, Flavor.VANILLA, 3),
    CP011(ProductType.SMALL, Flavor.CARAMEL, 1),
    CP013(ProductType.SMALL, Flavor.CARAMEL, 3),
    CP021(ProductType.SMALL, Flavor.PSL, 1),
    CP023(ProductType.SMALL, Flavor.PSL, 3),
    CP031(ProductType.SMALL, Flavor.MOCHA, 1),
    CP033(ProductType.SMALL, Flavor.MOCHA, 3),
    CP041(ProductType.SMALL, Flavor.HAZELNUT, 1),
    CP043(ProductType.SMALL, Flavor.HAZELNUT, 3),
    CP101(ProductType.LARGE, Flavor.VANILLA, 1),
    CP103(ProductType.LARGE, Flavor.VANILLA, 3),
    CP111(ProductType.LARGE, Flavor.CARAMEL, 1),
    CP113(ProductType.LARGE, Flavor.CARAMEL, 3),
    CP121(ProductType.LARGE, Flavor.PSL, 1),
    CP123(ProductType.LARGE, Flavor.PSL, 3),
    CP131(ProductType.LARGE, Flavor.MOCHA, 1),
    CP133(ProductType.LARGE, Flavor.MOCHA, 3),
    CP141(ProductType.LARGE, Flavor.HAZELNUT, 1),
    CP143(ProductType.LARGE, Flavor.HAZELNUT, 3),
    EP003(ProductType.ESPRESSO, Flavor.VANILLA, 3),
    EP005(ProductType.ESPRESSO, Flavor.VANILLA, 5),
    EP007(ProductType.ESPRESSO, Flavor.VANILLA, 7),
    EP013(ProductType.ESPRESSO, Flavor.CARAMEL, 3),
    EP015(ProductType.ESPRESSO, Flavor.CARAMEL, 5),
    EP017(ProductType.ESPRESSO, Flavor.CARAMEL, 7);
    
	private Flavor flavor;
	private int size;
	private ProductType productType;

	CoffeePod(ProductType type, Flavor flavor, int size) {
		this.setFlavor(flavor);
		this.setSize(size);
		this.setProductType(type);
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	enum Flavor {
		VANILLA, CARAMEL, MOCHA, HAZELNUT, PSL;
	}

}