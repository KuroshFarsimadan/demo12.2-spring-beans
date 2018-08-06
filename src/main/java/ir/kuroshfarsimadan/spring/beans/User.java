package ir.kuroshfarsimadan.spring.beans;

public class User {

	private int id;

	private String name;

	private String tester = "I am a user";

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tester
	 */
	public String getTester() {
		return tester;
	}

	/**
	 * @param tester
	 *            the tester to set
	 */
	public void setTester(String tester) {
		this.tester = tester;
	}

	public void whoIsUser() {
		System.out.println(this.tester);
	}

}
