public class MachineFilterParams {
	ProductType type;
	CoffeeMachine.Model model;
	Boolean waterLineCompatibility;

	public MachineFilterParams(ProductType type, CoffeeMachine.Model model, Boolean waterLineCompatibility) {
		this.type = type;
		this.model = model;
		this.waterLineCompatibility = waterLineCompatibility;
	}
}
