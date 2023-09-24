package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String displayLanguages(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +

                "</ol>" +

                        "</h2>" +
                "<a href = /form>Click here for the form!</a>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form action ='/results' method = 'POST'>" +
                "<h2>Name: <br>" +
                "<input type ='text'  name = 'name'> " +
                "<h2>My Favorite Language: <br>" +
                "<select name = 'fav1'>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<h2>My second favorite language: <br>" +
                "<select name = 'fav2'>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<h2>My third favorite language: <br>" +
                "<select name = 'fav3'>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select> <br />" +
                "<input type = 'submit'>"+
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("/results")
    public String languageChoices(@RequestParam String name, String fav1, String fav2, String fav3){
        return "<html>" +
                "<body>" +
                "<table>" +
                "<th>Skills Tracker Language Form</th>" +
                "<tr><td>Name: " + name + "</td>" +
                "<tr><td>1. " + fav1 + "</tr>" +
                "<tr><td>2. " + fav2 + "</tr>" +
                "<tr><td>3. " + fav3 + "</tr>" +
                "</table>" +

//                "<h1>" +name +"</h1>" +
//                "<h2><ol>" +
//                "<li>"+fav1+"</li>" +
//                "<li>"+fav2+"</li>" +
//                "<li>"+fav3+"</li>" +
                "</body>" +
                "</html>"
                ;

    }


}
