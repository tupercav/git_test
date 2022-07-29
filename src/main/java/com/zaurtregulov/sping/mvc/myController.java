package com.zaurtregulov.sping.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller

public class myController {

    @RequestMapping("/")
    public String showFirstView () {

        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        String empLastName = request.getParameter("employeeLastName");
//        empName = "Da ti pidorok " + empName + " MR " + empLastName;
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String name,
//                                 @RequestParam("employeeLastName") String lastName,
//                                 Model model) {
//        name = "Da ti pidorok " + name + " MR " + lastName;
//        model.addAttribute("nameAttribute", name);
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee) {

        return "show-emp-details-view";
    }


}
