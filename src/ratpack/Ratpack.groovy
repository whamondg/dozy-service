import static ratpack.groovy.Groovy.ratpack
import java.util.Random

def rand = new Random()
ratpack {
    handlers {
        get {
            def powernap = rand.nextInt(5000)
            println "Sleepy time: $powernap"
            sleep(powernap)
            response.send "Rested for: ${powernap}ms"
        }
    }
}
