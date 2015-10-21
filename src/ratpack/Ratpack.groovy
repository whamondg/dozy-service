import static ratpack.groovy.Groovy.ratpack
import java.util.concurrent.ThreadLocalRandom
import ratpack.exec.Blocking;

ratpack {
    handlers {
        get {
            def powernap = ThreadLocalRandom.current().nextInt(5000)
            Blocking.get {
                println "Sleepy time: $powernap"
                sleep(powernap)
            } then { Integer result ->
                context.response.send "Rested for: ${powernap}ms"
            }
        }
    }
}
