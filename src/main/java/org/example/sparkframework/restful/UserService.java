package org.example.sparkframework.restful;

import java.util.Collection;


//Interface que diz quais metodos a service vai ter
public interface UserService {
    void addUser(UserEntity user);

    Collection<UserEntity> getUsers();

    UserEntity getUser(String id);

    UserEntity editUser(UserEntity user)
            throws UserException;

    void deleteUser(String id);

    boolean userExist(String id);
}
