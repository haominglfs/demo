package club.haominglfs.demo.controller

import club.haominglfs.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.util.StringUtils
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class LoginController {

    @Autowired
    lateinit var studentRepository: StudentRepository;

    @PostMapping(value = "/user/login")
    fun login(@RequestParam("username") username:String,
              @RequestParam("password") password:String,
              map:HashMap<String,String>
              ):String{
        if(!StringUtils.isEmpty(username)){
            val student = studentRepository.findByName(username);
            if(password != student.passwd){
                map.put("msg","用户名密码错误!")
                return "login"
            }
        }else{
            map.put("msg","用户名密码错误!")
            return "login"
        }
        return "dashboard";
    }

}