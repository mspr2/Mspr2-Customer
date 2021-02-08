package customerUser;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {

	private List<User> myList;

	public UserCollection() {
		myList = new ArrayList<User>();
	}

	public boolean add(User user) {

		return myList.add(user);
	}

	public int indexOf(User user) {
		//Customer c = (Customer) user;
		return myList.indexOf(user);
	}

	public boolean remove(User user) {
		return myList.remove(user);
	}
	
	public User remove(int index) {
		return myList.remove(index);
	}

	public int size() {
		return myList.size();
	}

	public User get(int index) {
		return myList.get(index);
	}

}