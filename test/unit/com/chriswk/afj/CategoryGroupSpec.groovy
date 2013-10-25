package com.chriswk.afj

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(CategoryGroup)
class CategoryGroupSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        def c = new CategoryGroup(title: "Hello").save()
        def o = CategoryGroup.findByTitle("Hello")
        assert o == c
    }
}
