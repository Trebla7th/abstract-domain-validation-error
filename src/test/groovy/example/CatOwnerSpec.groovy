package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CatOwnerSpec extends Specification implements DomainUnitTest<CatOwner> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
