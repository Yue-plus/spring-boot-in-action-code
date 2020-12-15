package readinglist

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var reader: String? = null
    var isbn: String? = null
    var title: String? = null
    var author: String? = null
    var description: String? = null

}