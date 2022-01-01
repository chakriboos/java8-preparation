package learn.comparable.and.comparator;

public class EmployeeWithComparable implements Comparable<EmployeeWithComparable> {
	
	private String fName;

	private String lName;

	private int id;

	public EmployeeWithComparable(String fName, String lName, int id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWithComparable other = (EmployeeWithComparable) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (id != other.id)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", id=" + id + "]";
	}

	@Override
	public int compareTo(EmployeeWithComparable o) {
		//Evaluation
		//this 11  o 10
		/**
		 * [Employee [fName=chek, lName=Dwar, id=1], Employee [fName=John, lName=End, id=5], Employee [fName=Man, lName=Red, id=19], Employee [fName=John, lName=Doe, id=22]]
		 */
		//return this.id - o.id;
		/**
		 * [Employee [fName=John, lName=Doe, id=22], Employee [fName=Man, lName=Red, id=19], Employee [fName=John, lName=End, id=5], Employee [fName=chek, lName=Dwar, id=1]]
		 */
		return o.id - this.id;
	}

}
