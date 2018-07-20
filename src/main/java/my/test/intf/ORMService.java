package my.test.intf;

import my.test.entity.ContactEntity;

import java.util.List;

public interface ORMService {
    List<ContactEntity> queryFindAllUsersJPA();

//    ContactEntity queryFindUserById(int id);
//
//    boolean updateUser(int id, boolean enabled);
//
//    boolean insertUser(String first_name, String last_name, Integer vrsion);
//
//    boolean deleteUser(int id);
}
