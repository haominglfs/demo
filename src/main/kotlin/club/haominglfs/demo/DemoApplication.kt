package club.haominglfs.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication //标注一个主程序类，说明这是一个springboot应用
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
