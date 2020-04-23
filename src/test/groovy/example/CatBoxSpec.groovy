package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CatBoxSpec extends Specification implements DomainUnitTest<CatBox> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
