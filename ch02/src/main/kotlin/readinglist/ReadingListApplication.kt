package readinglist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReadingListApplication

fun main(args: Array<String>) {
    runApplication<ReadingListApplication>(*args)
}
