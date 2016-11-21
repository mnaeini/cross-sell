public enum CoffeeMachine {
	
	CM001(ProductType.SMALL, Model.BASE, false),
    CM002(ProductType.SMALL, Model.PREMIUM, false),
    CM003(ProductType.SMALL, Model.DELUX, true),
	CM101(ProductType.LARGE, Model.BASE, false),
    CM102(ProductType.LARGE, Model.PREMIUM, false),
    CM103(ProductType.LARGE, Model.DELUX, true),
	EM001(ProductType.ESPRESSO, Model.BASE, false),
    EM002(ProductType.ESPRESSO, Model.PREMIUM, false),
    EM003(ProductType.ESPRESSO, Model.DELUX, true);
	
	private Model model;
	private boolean waterLineCompatible;
	private ProductType productType;

	CoffeeMachine(ProductType type, Model model, boolean waterLineCompatible) {
		this.setModel(model);
		this.setWaterLineCompatible(waterLineCompatible);
		this.setProductType(type);
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public boolean isWaterLineCompatible() {
		return waterLineCompatible;
	}

	public void setWaterLineCompatible(boolean waterLineCompatible) {
		this.waterLineCompatible = waterLineCompatible;
	}

	enum Model {
		BASE, DELUX, PREMIUM;
	}

}
