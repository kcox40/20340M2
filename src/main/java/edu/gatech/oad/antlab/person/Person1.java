package edu.gatech.oad.antlab.person;

/**
 * DID THIS WORK YOOO heller IS THE KRAKEN WORKING?
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
        char[] charArray = input.toCharArray();
        char[] temp = new char[charArray.length];
        char first = charArray[0];
        char second = charArray[1];
        for (int i = 0; i < charArray.length - 2; i++) {
            temp[i] = charArray[i + 2];
        }
        temp[temp.length - 2] = first;
        temp[temp.length - 1] = second;
      //Person 1 put your implementation here HELLLER jhsfowurghwrghworghjoe
        String reorder = "";
        for (char c : temp) {
            reorder += c;
        }
      return reorder;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
