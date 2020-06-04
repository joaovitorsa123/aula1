package Listas;

public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	
	
	
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}






	public void increaseSalary(double percentage) {
		salary += salary*percentage/100;
		
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
