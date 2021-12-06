package com.techno.linked_list;




	public class Employee implements Comparable<Employee> {
		int empId;
		String name;
		double salary;

		public Employee(int empId, String name, double salary) {
			super();
			if (empId > 0) {
				this.empId = empId;
			}

			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
		}

		@Override
		public int compareTo(Employee o) {
			
			return this.name.compareTo(o.name);
		}
}
