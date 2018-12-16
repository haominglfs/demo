package club.haominglfs.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	fun contextLoads() {
        val log = LoggerFactory.getLogger(this.javaClass);
        log.trace("....trace...")
        log.debug("....debug....")
        log.info("...info...")
        log.warn("....warn....")
        log.error(".....error...")

	}

    @Test
    fun testRange(){
        var range:IntRange = 1..200 //[1,1024]
        var range1:IntRange = 1 until 1024 //[1,1024)

        var emptyRange:IntRange = 0..-1

        println(emptyRange.isEmpty())

        println(5 in range)

        for(i in range){
            println("$i")
        }
    }

    @Test
    fun testArray(){
        var array:IntArray = intArrayOf(1,3,4,7,9);
        var array1:CharArray = charArrayOf('h','w');

        var array2:Array<String> = arrayOf("我","是","码农")

        println(array.size)

        for (i in array){
            println(i)
        }

        println(array1.joinToString())

        println(array2.sliceArray(1..3))

        array.forEach({ e-> println(e) })

        array.forEach (){ e-> println(e) } //最后一个参数是lambda表达式，括号可以放到前面
        array.forEach { e-> println(e) } //最后一个参数是lambda表达式，括号可以放到前面，可以省略

        array1.forEach (::println )

        array2.forEach { println(it) }



    }

    @Test
    fun testValr(){

          val FINAL_HELLO = "HELLO"
//        val FINAL_HELLO1:String = "hello"

    }

    @Test
    fun testfun(){
        var sum = { a1:Int,a2:Int ->
            a1+a2
        }
        var printHello = { println("hello")}

        println(sum(1,4))

        println(sum.invoke(1,8))




    }

}
