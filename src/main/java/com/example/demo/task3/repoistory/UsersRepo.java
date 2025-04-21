package com.example.demo.task3.repoistory;

import com.example.demo.task3.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@Repository
@AllArgsConstructor
public class UsersRepo {
    private final List<User> userList;
    private int idCount;
    public UsersRepo (){
    this.userList = new ArrayList<>();
    this.idCount = 1;
    }


    public void addUser(String firstName, String lastName, String email){
        userList.add(new User(idCount++, firstName, lastName, email));
    }
    public List<User> getUserList(){
        return List.copyOf(userList);
    }
}
