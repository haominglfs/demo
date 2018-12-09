package club.haominglfs.demo.controller

import club.haominglfs.demo.po.Student
import club.haominglfs.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {
    @Autowired
    lateinit var studentRepository:StudentRepository;

    @RequestMapping("add")
    fun add(name:String):Student{
        val student = Student(id = null,name =name);
        studentRepository.save(student);
        return student;
    }

    @RequestMapping("findByName")
    fun findByName(name:String):List<Student>{
        return studentRepository.findByName(name);
    }

    @RequestMapping("findAll")
    fun findAll():List<Student>{
        return studentRepository.findAll();
    }

    @RequestMapping("deleteById")
    fun delStudent(id:Long){
        studentRepository.deleteById(id);
    }
}