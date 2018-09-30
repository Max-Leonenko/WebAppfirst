package main;

import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileReader;

@Controller
public class MainController {

    @GetMapping()
    public String view(@RequestParam(value = "name" ,required = false,defaultValue = " незнакомец") String name, org.springframework.ui.Model model)
    {

System.out.println("qwert");
     model.addAttribute("msg" , "Hello World");
        int x =23;
        return "index";
    }

    @PostMapping()
    public String calcInfo(@RequestParam(value = "date" ) String date, org.springframework.ui.Model model)
    {
  //  @Value("proj.version@")
            String version="";
        int age =0;
        int dayToNextBithday =0;
            DateWork dateWork =new DateWork();
            dateWork.setStringDate(date);
            dateWork.convertDate();
       age=            dateWork.GetAge();
        dayToNextBithday=  dateWork.GetDayrToNextBithday();

        model.addAttribute("age" ,age);
        model.addAttribute("dayToNextBithday" , dayToNextBithday);
        model.addAttribute("version" , version);
        return "index";
    }
}
