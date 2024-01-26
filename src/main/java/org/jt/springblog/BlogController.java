package org.jt.springblog;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/home")
    public String displayPage(Model model) {
        return "home";
    }

     @GetMapping("/studentdetails")
    public String displayStudentDetails(Model model) {
        
        List<Student> detailsList = new ArrayList<>();
        detailsList.add(new Student("Sravani Nayak", "09/05/2023", "Java Fullstack", 30000.98));
        detailsList.add(new Student("Monalissha Sahoo", "09/05/2023", "Java Fullstack", 30000.98));
        detailsList.add(new Student("Atiba Anwar", "09/05/2023", "Java Fullstack", 30000.98));
        model.addAttribute("detailsList", detailsList);
        return "studentdetails";
    }
    


    
}
