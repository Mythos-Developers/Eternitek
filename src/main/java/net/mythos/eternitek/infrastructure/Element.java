package net.mythos.eternitek.infrastructure;

public enum Element {

	HYDROGEN("Hydrogen", "H", 1, 1.008, Group.NONMETAL),
	HELIUM("Helium", "He", 2, 4.0026, Group.NOBLE_GAS),

	LITHIUM("Lithium", "Li", 3, 6.94, Group.ALKALI_METAL),
	BERYLLIUM("Beryllium", "Be", 4, 9.0122, Group.ALKALINE_EARTH_METAL),
	BORON("Boron", "B", 5, 10.81, Group.METALLOID),
	CARBON("Carbon", "C", 6, 12.011, Group.NONMETAL),
	NITROGEN("Nitrogen", "N", 7, 14.007, Group.NONMETAL),
	OXYGEN("Oxygen", "O", 8, 15.999, Group.NONMETAL),
	FLUORINE("Fluorine", "F", 9, 18.998, Group.NONMETAL),
	NEON("Neon", "Ne", 10, 20.180, Group.NOBLE_GAS),

	SODIUM("Sodium", "Na", 11, 22.990, Group.ALKALI_METAL),
	MAGNESIUM("Magnesium", "Mg", 12, 24.305, Group.ALKALINE_EARTH_METAL),
	ALUMINUM("Aluminum", "Al", 13, 26.982, Group.POST_TRANSITION_METAL),
	SILICON("Silicon", "Si", 14, 28.085, Group.METALLOID),
	PHOSPHORUS("Phosphorus", "P", 15, 30.974, Group.NONMETAL),
	SULFUR("Sulfur", "S", 16, 32.06, Group.NONMETAL),
	CHLORINE("Chlorine", "Cl", 17, 35.45, Group.HALOGEN),
	ARGON("Argon", "Ar", 18, 39.948, Group.NOBLE_GAS),

// Need to fix the atomic mass on all these

//	POTASSIUM("Potassium", "K", 19, 39.0983, Group.ALKALI_METAL),
//	CALCIUM("Calcium", "Ca", 20, 40.08, Group.ALKALINE_EARTH_METAL),
//	SCANDIUM("Scandium", "Sc", 21, 44.95591, Group.TRANSITION_METAL),
//	TITANIUM("Titanium", "Ti", 22, 47.867, Group.TRANSITION_METAL),
//	VANADIUM("Vanadium", "V", 23, 50.9415, Group.TRANSITION_METAL),
//	CHROMIUM("Chromium", "Cr", 24, 51.996, Group.TRANSITION_METAL),
//	MANGANESE("Manganese", "Mn", 25, 54.93804, Group.TRANSITION_METAL),
//	IRON("Iron", "Fe", 26, 55.84, Group.TRANSITION_METAL),
//	COBALT("Cobalt", "Co", 27, 58.93319, Group.TRANSITION_METAL),
//	NICKEL("Nickel", "Ni", 28, 58.693, Group.TRANSITION_METAL),
//	COPPER("Copper", "Cu", 29, 63.55, Group.TRANSITION_METAL),
//	ZINC("Zinc", "Zn", 30, 65.4, Group.TRANSITION_METAL),
//	GALLIUM("Gallium", "Ga", 31, 69.723, Group.POST_TRANSITION_METAL),
//	GERMANIUM("Germanium", "Ge", 32, 72.63, Group.METALLOID),
//	ARSENIC("Arsenic", "As", 33, 74.92159, Group.METALLOID),
//	SELENIUM("Selenium", "Se", 33, 78.97, Group.NONMETAL),
//	BROMINE("Bromine", "Br", 35, 79.90, Group.HALOGEN),
//	KRYPTON("Krypton", "Kr", 36, 83.80, Group.NOBLE_GAS);

	RUBIDIUM("Rubidium", "Rb", 37, 85.468, Group.ALKALI_METAL);

	private String name;
	private String symbol;
	private int number;
	private double mass;
	private Group chemicalGroup;

	private Element(String name, String symbol, int number, double mass, Group group) {
		this.name = name;
		this.symbol = symbol;
		this.number = number;
		this.mass = mass;
		this.chemicalGroup = group;
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getNumber() {
		return number;
	}

	public double getMass() {
		return mass;
	}

	public Group getGroup() {
		return chemicalGroup;
	}

	public int getProtons() {
		return number;
	}

	public int getNeutrons() {
		return (int) (Math.round(mass) - number);
	}

	public int getElectrons() {
		return number;
	}

	public enum Group {
		NONMETAL,
		ALKALI_METAL,
		ALKALINE_EARTH_METAL,
		TRANSITION_METAL,
		LANTHANIDE,
		ACTINIDE,
		METALLOID,
		NOBLE_GAS,
		HALOGEN,
		POST_TRANSITION_METAL
	}

}


