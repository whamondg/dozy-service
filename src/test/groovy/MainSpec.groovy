import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import ratpack.test.http.TestHttpClient
import ratpack.test.ServerBackedApplicationUnderTest

import spock.lang.Specification

class MainSpec extends Specification {

  ServerBackedApplicationUnderTest aut = new GroovyRatpackMainApplicationUnderTest()
  @Delegate TestHttpClient client = TestHttpClient.testHttpClient(aut)

  def "Check Site Index"() {
    when:
      get("/")

    then:
      response.statusCode == 200
      response.body.text.contains('Rested for: ')
  }
}
