public class User implements Comparable<User> {
    private String name;
    private String surname;
    private int age;
    private Personal subordinates = new Personal();
    

    public void addSubordinators(Personal personal){
        subordinates = personal;
    }

    public void addOneUser(User user){
        subordinates.addUser(user);
    }


    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String result = String.format("Name: %s, surname: %s, age: %d\n", name, surname, age);
        for (User user : subordinates) {
            result = result + String.format("Boss: %s, %s", name, user.toString());
        }

        return result;
    }

    @Override
    public int compareTo(User other) {

        int surname1 = this.getSurname().compareTo(other.getSurname());
        if (surname1 != 0){
            return surname1;
        }

        int name1 = this.getName().compareTo(other.getName());
        if (name1 != 0 ){
            return name1;
        }
        
        return this.getAge()- other.getAge();
    }




}
