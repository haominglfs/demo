package club.haominglfs.demo.controller

import club.haominglfs.demo.po.Student
import club.haominglfs.demo.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/student")
class StudentController {
    @Autowired
    lateinit var studentRepository:StudentRepository;

    @RequestMapping("add")
    fun add(name:String,passwd:String):Student{
        val student = Student(id = null,name =name,passwd = passwd);
        studentRepository.save(student);
        return student;
    }

    @RequestMapping("findByName")
    fun findByName(name:String):Student{
        return studentRepository.findByName(name);
    }

    @RequestMapping("findAll")
    fun findAll(pageable: Pageable):Page<Student>{
        println("-----");
        return studentRepository.findAll(pageable);
    }

    @RequestMapping("deleteById")
    fun delStudent(id:Long){
        studentRepository.deleteById(id);
    }

    //@Modifying
    //@Query("update Student u set u.name = ?1 and passwd=?2 where u.lastname = ?3")
    @RequestMapping("updateStudent")
    fun updateStudent(stu:Student){
        //val stu = Student(id,name,passwd);
        studentRepository.saveAndFlush(stu);
    }
}