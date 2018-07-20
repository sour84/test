package my.test.orm;

//import org.osgi.service.useradmin.User;
import my.test.intf.ORMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import my.test.entity.ContactEntity;

import java.util.List;

/**
 * Created for JavaStudy.ru on 28.02.2016.
 */
@Controller
public class ORMController {

    @Autowired
    private ORMService ormService;

    @RequestMapping(value = "/ormFindAllUsers", method= RequestMethod.GET)
    public ModelAndView ormFindAllContacts() {
        System.out.println("ORMController ormFindAllUsers is called");
        List<ContactEntity> contact = ormService.queryFindAllUsersJPA();
        return new ModelAndView("/orm/orm", "resultObject", contact);
    }



//    @RequestMapping(value = "/queryFindByIdUser/{id}", method = RequestMethod.GET)
//    public ModelAndView queryFindByIdUser(@PathVariable("id") int id) {
//        System.out.println("ORMController queryFindByIdUser is called");
//        ContactEntity contact = ormService.queryFindUserById(id);
//        return new ModelAndView("/orm/orm", "resultObject", contact);
//    }
//
//    @RequestMapping(value = "/ormUpdateUser/id/{id}/enabled/{enabled}", method=RequestMethod.GET)
//    public ModelAndView ormUpdateUser(
//            @PathVariable(value="idu") int id,
//            @PathVariable(value="enabled") boolean enabled) {
//        System.out.println("ORMController ormUpdateUser is called");
//        boolean result = ormService.updateUser(id, enabled);
//        return new ModelAndView("/orm/orm", "resultObject", result);
//    }
//    @RequestMapping(value = "/ormDeleteUser/iduser/{iduser}", method=RequestMethod.GET)
//    public ModelAndView ormDeleteUser(@PathVariable(value="iduser") int iduser) {
//        System.out.println("ORMController jdbcDelete is called");
//        boolean result = ormService.deleteUser(iduser);
//        return new ModelAndView("/orm/orm", "resultObject", result);
//    }
//
//    @RequestMapping(value = "/ormInsertUser/first_name/{first_name}/last_name/{last_name}/vrsion/{vrsion}"
//            , method=RequestMethod.GET)
//    public ModelAndView ormInsertUser(
//            @PathVariable(value="first_name") String first_name,
//            @PathVariable(value="last_name") String last_name,
//            @PathVariable(value="vrsion") int vrsion) {
//        System.out.println("ORMController ormInsertUser is called");
//        boolean result = ormService.insertUser(first_name, last_name, vrsion);
//        return new ModelAndView("/orm/orm", "resultObject", result);
//
//    }
}