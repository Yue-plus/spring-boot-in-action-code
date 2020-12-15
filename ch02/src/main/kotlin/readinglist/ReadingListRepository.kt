package readinglist

import org.springframework.data.jpa.repository.JpaRepository

interface ReadingListRepository : JpaRepository<Book, Long> {

    fun findByReader(reader: String): List<Book>

}