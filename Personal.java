import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    private class UserIterator implements Iterator<User> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return  users.size() > currentIndex;
        }

        @Override
        public User next() {
            return users.get(currentIndex++);
        }
    }

    @Override
    public Iterator<User> iterator() {
       
        return new UserIterator();
    }

    


}
