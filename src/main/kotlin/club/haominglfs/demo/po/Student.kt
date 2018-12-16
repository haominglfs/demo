package club.haominglfs.demo.po

import java.util.*
import javax.persistence.*

@Entity
@Table(name="test_student")
data class Student(@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
                   var id:Long?=null,
                   var name :String? = null,
                   var passwd:String? = null) {

    override fun toString(): String {
        return "Student(id='$id', name=$name, passwd=$passwd)"
    }

}