package club.haominglfs.demo.repository

import club.haominglfs.demo.po.Student
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository


interface StudentRepository :JpaRepository<Student,Long> {
    fun findByName(name:String):Student
}