import java.util.Arrays;

/***
 * A test class to show how we can retrieve the data for different landing pages and cross sell
 * based on the request param. Ideally there would be another layer that processes the request params and create 
 * the appropriate filtering params either for coffee machines or coffee pods. The idea is each requestParam 
 * is composed of filtering entity, aka pods or machines, product types, flavors, models, size, and water compatibility.
 * @author maryammoslemi
 *
 */
public class CrossSellTest {
	
	public static void main(String args[]) {
		
		String[] requestParams = new String[] {"AllMachines"};
		System.out.println("All Machines");
		System.out.println(PageServiceProvider.filterMachines(null) + "\n---------\n");
		
		requestParams = new String[] {"AllMachines", "LARGE", "ALL", "ALL"};
		System.out.println("All Large Machines");
		MachineFilterParams machineParams = new MachineFilterParams(ProductType.valueOf(requestParams[1]), null, null);
		System.out.println(PageServiceProvider.filterMachines(machineParams) + "\n---------\n");

		
		requestParams = new String[] {"CROSS-SELL", "LARGE", "ALL", "1"};
		PodFilterParams crossParams = new PodFilterParams(ProductType.valueOf(requestParams[1]), null, Integer.valueOf(requestParams[3]));
		System.out.println("All cross-sell for large machine, smallest per flavor");
		System.out.println(PageServiceProvider.filterPods(crossParams).toString() + "\n---------\n");
		
		requestParams = new String[] {"AllPODS", "ESPRESSO","VANILLA", "ALL" };
		crossParams = new PodFilterParams(ProductType.valueOf(requestParams[1]), CoffeePod.Flavor.valueOf(requestParams[2]), null);
		System.out.println("All choices on espresso vanilla landing page");
		System.out.println(PageServiceProvider.filterPods(crossParams).toString() + "\n---------\n");
		

		requestParams = new String[] {"ALLMACHINES", "ESPRESSO", "ALL", "ALL"};
		System.out.println("All espresso machines");
		machineParams = new MachineFilterParams(ProductType.valueOf(requestParams[1]), null, null);
		System.out.println(PageServiceProvider.filterMachines(machineParams).toString() + "\n---------\n");
		
		requestParams = new String[] {"CROSS-SELL", "ESPRESSO", "ALL", "3"};
		System.out.println("All cross-sell for espresso machine, smallest per flavor");
		crossParams = new PodFilterParams(ProductType.valueOf(requestParams[1]), null, Integer.valueOf(requestParams[3]));
		System.out.println(PageServiceProvider.filterPods(crossParams).toString() + "\n---------\n");
		

		requestParams = new String[] {"ALLPODS", "SMALL", "VANILLA", "ALL"};
		System.out.println("All choices on general vanilla landing page, smallest per product type");
		crossParams = new PodFilterParams(ProductType.valueOf(requestParams[1]), CoffeePod.Flavor.valueOf(requestParams[2]), null);
		System.out.println(PageServiceProvider.filterPods(crossParams).toString() + "\n---------\n");
	}

}
