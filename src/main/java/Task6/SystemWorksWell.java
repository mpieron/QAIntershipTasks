package main.java.Task6;

import java.util.HashSet;
import java.util.Set;

public class SystemWorksWell {

    static class User {
        private String name;
        int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int hashCode(){
            return this.age;
        }

        @Override
        public boolean equals(Object other){
            if(this == other)
                return true;
            if(other == null || other.getClass()!= this.getClass())
                return false;

            User user = (User) other;
            return (user.age == this.age && user.name.equals(this.name));
        }
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Max", 27));
        users.add(new User("Veronika", 20));
        users.add(new User("Denis", 30));
        users.add(new User("Max", 27));

        if (users.size() == 3) {
            System.out.println("System works well!");
        } else {
            throw new RuntimeException("Users set size should be 3!!!!");
        }
    }
}
