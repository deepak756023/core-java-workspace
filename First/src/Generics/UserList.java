package Generics;

public class UserList {
    private User[] users = new User[10];
    private int count;

    public void add(User user){
        users[count++] = user;
    }
    public User show(int index){
        return users[index];
    }
}
