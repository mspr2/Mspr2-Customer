package customerUser;

public class MyUserController {
	private UserCollection allUsers = null;

	public MyUserController() {
		allUsers = new UserCollection();

	}

	public boolean add(User u) {

		return allUsers.add(u);

	}

	public boolean remove(User user) {

		return allUsers.remove(user);

	}

	public User remove(int index) {

		return allUsers.remove(index);

	}
	
	public int indexOf(Customer user) {
		return allUsers.indexOf(user);
	}

	public UserCollection getAll() {
		return allUsers;
	}

	public int size() {
		return allUsers.size();
	}

	public User get(int index) {
		return allUsers.get(index);
	}

//	public UserCollection find(Filter f) {
//		UserCollection result = new UserCollection(allMedias.size());
//		for (int i = 0; i < allMedias.size(); i++) {
//			if (f.filter(allMedias.get(i))) {
//				result.add(allMedias.get(i));
//			}
//		}
//		return result;
//	}

}