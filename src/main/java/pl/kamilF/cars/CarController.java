package pl.kamilF.cars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
public class CarController {

    private CarDao carDao = new CarStaticDao();

    @GetMapping("/")
    public String addCar(){
        return"add";
    }
    @GetMapping("/add")
    public String show(@ModelAttribute Car car, ModelMap modelMap){
       carDao.addCar(car);
        modelMap.put("car",car);
        return "show";
    }
    @GetMapping("/all")
    public String findAll(ModelMap modelMap){
        modelMap.put("cars",carDao.findAll());
        return "all";
    }

}
