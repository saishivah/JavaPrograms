import java.util.HashMap;
import java.util.Map ;
class User {

    private long id;
    private String name;
    private String email;

    // standard getters/setters/constructors
        
   
//   @Override
// public int hashCode() {
//     return (int) id * name.hashCode() * email.hashCode();
// }
    
  @Override
public int hashCode() {
    return 1;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id 
          && (name.equals(user.name) 
          && email.equals(user.email));
    }

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
// getters and setters here
}

class IntergerHash{
    
        @Override
    public int hashCode() {
        return 10;
    }
}

public class UserHashCode {

    public static void main(String[] args) {
        Map<User, User> users = new HashMap<>();
        User user1 = new User(1L, "John", "john@domain.com");
        User user2 = new User(2L, "Jennifer", "jennifer@domain.com");
        User user3 = new User(3L, "Mary", "mary@domain.com");
        User user4 = new User(1L, "John", "john@domain.com");
        
        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);
        users.put(user4, user4);
  
        System.out.println("hashCode of"+ user1.hashCode());
           System.out.println("hashCode of"+ user2.hashCode());
              System.out.println("hashCode of"+ user3.hashCode());
        if (users.containsKey(user1)) {
            System.out.print("User found in the collection");
        }
        System.out.println();
        System.out.println(user1==user4);
          System.out.println(user1==user1);
        System.out.println(user1.getClass());
    }
}
