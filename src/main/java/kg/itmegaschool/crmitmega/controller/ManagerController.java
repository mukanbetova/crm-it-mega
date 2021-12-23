package kg.itmegaschool.crmitmega.controller;

import kg.itmegaschool.crmitmega.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // Response to Requests
public class ManagerController {

    @Autowired
    CourseTypeRepository courseTypeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage() {
        return "main-page-manager";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String mainPage(@RequestParam String firstName,
                           @RequestParam String lastName,
                           @RequestParam String email,
                           @RequestParam String phoneNumber,
                           @RequestParam String dob,
                           @RequestParam String salary) {

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(dob);
        System.out.println(salary);

        return "main-page-manager";
    }

    @RequestMapping("/add-mentor")
    public String addMentor() {
        return "add-mentor-form";
    }
}
