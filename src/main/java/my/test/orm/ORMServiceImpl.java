package my.test.orm;

import my.test.entity.ContactEntity;
import my.test.intf.ORMService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

//import org.osgi.service.useradmin.User;

/**
 * Created for JavaStudy.ru on 28.02.2016.
 */
@Repository
@Transactional //need to update\delete queries. Don't forget <tx:annotation-driven/>
public class ORMServiceImpl implements ORMService {

    @PersistenceContext
    private EntityManager entityManager;
public List<ContactEntity> queryFindAllUsersJPA() {
        System.out.println("ORMService queryfindAllUsersJPA is called");
        String query = "from ContactEntity order by firstName";
        TypedQuery<ContactEntity> typedQuery = entityManager.createQuery(query, ContactEntity.class);
        return typedQuery.getResultList();
    }

   /* public ContactEntity queryFindUserById(int id) {
        System.out.println("ORMService queryFindUserById is called");
        return entityManager.find(ContactEntity.class, id);
    }

    public boolean updateUser(int id, boolean enabled) {
        System.out.println("ORMService updateUser is called");

        String query = "update contact set enabled = ? where id = ?";
        Query nativeQuery = entityManager.createNativeQuery(query);
        nativeQuery.setParameter(1, enabled);
        nativeQuery.setParameter(2, id);
        int result = nativeQuery.executeUpdate();
        return result > 0; // result show how many rows was updated.
    }

    public boolean insertUser(String first_name, String last_name, Integer vrsion) {
        System.out.println("ORMExample insertUser is called");

        String qlString = "insert into contact (first_name,last_name,vrsion) values (?,?,?)";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, first_name);
        query.setParameter(2, last_name);
        query.setParameter(3, vrsion);
        int result = query.executeUpdate();

        return result > 0;
    }

    public boolean deleteUser(int id) {
        System.out.println("ORMExample deleteUser is called");

        String qlString = "delete from contact where id=?";
        Query query = entityManager.createNativeQuery(qlString);
        query.setParameter(1, id);
        int result = query.executeUpdate();

        return result > 0;
    }*/
}