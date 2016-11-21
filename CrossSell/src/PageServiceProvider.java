import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * A service that to filter Coffee Pods or Coffee Machines based on the request parmeters
 * 
 * @author maryamnaeini
 *
 */
public class PageServiceProvider {

	/**
	 * Filter Coffee Machines. This is to retrieve Coffee Machines
	 * 
	 * @param params filter parameters to retrieve a set of machines for a specific landing page
	 * @return
	 */
	public static List<CoffeeMachine> filterMachines(MachineFilterParams params) {
		ArrayList<CoffeeMachine> machines = new ArrayList<CoffeeMachine>(Arrays.asList(CoffeeMachine.values()));
	
		if (params == null)
			return machines;
		
		if (params.type != null)
			filterMachinesByProductType(params.type, machines);

		if (params.waterLineCompatibility != null)
			filterMachinesByWaterLineCompatibility(params.waterLineCompatibility, machines);

		if (params.model != null)
			filterMachinesByModel(params.model, machines);

		return machines;
	}

	/**
	 * Filter Machines by waterline compatibility
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeeMachine> filterMachinesByWaterLineCompatibility(boolean waterLineCompatibility,
			List<CoffeeMachine> machines) {
		Iterator<CoffeeMachine> it = machines.iterator();
		while (it.hasNext()) {
			CoffeeMachine machine = it.next();
			if (machine.isWaterLineCompatible() != waterLineCompatibility)
				it.remove();
		}
		return machines;
	}

	/**
	 * Filter Machines By Product Type
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeeMachine> filterMachinesByProductType(ProductType type, List<CoffeeMachine> machines) {
		Iterator<CoffeeMachine> it = machines.iterator();
		while (it.hasNext()) {
			CoffeeMachine machine = it.next();
			if (machine.getProductType() != type)
				it.remove();
		}
		return machines;
	}

	/**
	 * Filter Machines By Model
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeeMachine> filterMachinesByModel(CoffeeMachine.Model model, List<CoffeeMachine> machines) {
		Iterator<CoffeeMachine> it = machines.iterator();
		while (it.hasNext()) {
			CoffeeMachine machine = it.next();
			if (machine.getModel() != model)
				it.remove();
		}
		return machines;
	}

/*------------------------------------------------------- Filter Pods and Cross Sell ---------------------------------------------------------------------------------------------------*/
	
/**
 * Retrieve Coffee Pods on their landing page or for cross sell	
 * @param params filter pods based on the corss sell parameters specified. Coffee pods and Coffee Machines are connected based the product type filter parameter
 * @return
 */
	public static List<CoffeePod> filterPods(PodFilterParams params) {
		List<CoffeePod> pods = new ArrayList<CoffeePod>(Arrays.asList(CoffeePod.values()));

		if (params == null)
			return pods;

		if (params.type != null)
			filterPodsByProductType(params.type, pods);

		if (params.flavor != null)
			filterPodsByFlavor(params.flavor, pods);

		if (params.size != null)
			filterPodsBySize(params.size, pods);

		return pods;
	}

	/**
	 * Filter Pods By ProductType
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeePod> filterPodsByProductType(ProductType type, List<CoffeePod> pods) {
		Iterator<CoffeePod> it = pods.iterator();
		while (it.hasNext()) {
			CoffeePod pod = it.next();
			if (pod.getProductType() != type)
				it.remove();
		}
		return pods;
	}

	/**
	 * Filter Pods By Flavor
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeePod> filterPodsByFlavor(CoffeePod.Flavor flavor, List<CoffeePod> pods) {
		Iterator<CoffeePod> it = pods.iterator();
		while (it.hasNext()) {
			CoffeePod pod = it.next();
			if (pod.getFlavor() != flavor)
				it.remove();
		}
		return pods;
	}

	/**
	 * Filter Machines By Model
	 * 
	 * @param model
	 * @param input
	 * @return
	 */
	private static List<CoffeePod> filterPodsBySize(Integer size, List<CoffeePod> pods) {
		Iterator<CoffeePod> it = pods.iterator();
		while (it.hasNext()) {
			CoffeePod pod = it.next();
			if (pod.getSize() != size)
				it.remove();
		}
		return pods;
	}
}
