package kg.itmegaschool.crmitmega.controller;

import kg.itmegaschool.crmitmega.repository.CourseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CourseTypeController {
    @Autowired
    CourseTypeRepository courseTypeRepository;
    @RequestMapping("/course-type") //localhost:8080/course-type
    @PostMapping("/add-new")
    public String addCourseType(@RequestParam String typeName,
                                @RequestParam Integer)
}
