/**
 * 目前 Spring Boot CLI 的 `spring run` 命令不支持 Kotlin
 */
@RestController
class HelloController {

    @RequestMapping("/")
    fun hello() {
        "Hello World"
    }

}