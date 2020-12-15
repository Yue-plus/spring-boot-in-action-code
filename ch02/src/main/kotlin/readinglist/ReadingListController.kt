package readinglist

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/readingList")
class ReadingListController @Autowired constructor(readingListRepository: ReadingListRepository) {
    private val readingListRepository: ReadingListRepository = readingListRepository

    @RequestMapping(method = [RequestMethod.GET])
    fun readersBooks(model: Model): String {
        val readingList: List<Book> = readingListRepository.findByReader(reader)
        model.addAttribute("books", readingList)
        return "readingList"
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun addToReadingList(book: Book): String {
        book.reader = reader
        readingListRepository.save(book)
        return "redirect:/readingList"
    }

    companion object {
        private const val reader = "craig"
    }

}