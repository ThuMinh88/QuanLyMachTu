  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.User;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface UserReponsitory {
    User getUserById(int userId);
    boolean addUser(User user);
    List<User> getUsers(String username);
    List<User> getListUsers();
}
