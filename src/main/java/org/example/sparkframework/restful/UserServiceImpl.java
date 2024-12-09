package org.example.sparkframework.restful;

import java.util.Collection;
import java.util.HashMap;

//Essa classe esta fingindo ser uma persistencia de dados utilizando um hashmap

public class UserServiceImpl implements UserService {
    private HashMap<String, UserEntity> userMap;

    public UserServiceImpl() {
        this.userMap = new HashMap<>();
    }

    @Override
    public void addUser(UserEntity user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public Collection<UserEntity> getUsers() {
        return userMap.values();
    }

    @Override
    public UserEntity getUser(String id) {
        return userMap.get(id);
    }

    @Override
    public UserEntity editUser(UserEntity forEdit) throws UserException {
        try {
            if (forEdit.getId() == null)
                throw new UserException("ID cannot be blank");

            UserEntity toEdit = userMap.get(forEdit.getId());

            if (toEdit == null)
                throw new UserException("User not found");

            if (forEdit.getEmail() != null) {
                toEdit.setEmail(forEdit.getEmail());
            }
            if (forEdit.getFirstName() != null) {
                toEdit.setFirstName(forEdit.getFirstName());
            }
            if (forEdit.getLastName() != null) {
                toEdit.setLastName(forEdit.getLastName());
            }
            if (forEdit.getId() != null) {
                toEdit.setId(forEdit.getId());
            }

            return toEdit;
        } catch (Exception ex) {
            throw new UserException(ex.getMessage());
        }
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }

    @Override
    public boolean userExist(String id) {
        return userMap.containsKey(id);
    }
}
