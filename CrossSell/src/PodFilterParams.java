public class PodFilterParams {
	ProductType type;
	CoffeePod.Flavor flavor;
	Integer size;

	public PodFilterParams(ProductType type, CoffeePod.Flavor flavor, Integer size) {
		this.type = type;
		this.flavor = flavor;
		this.size = size;
	}
}
