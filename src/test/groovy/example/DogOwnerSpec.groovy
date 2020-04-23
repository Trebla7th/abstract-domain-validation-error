package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class DogOwnerSpec extends Specification implements DomainUnitTest<DogOwner> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
