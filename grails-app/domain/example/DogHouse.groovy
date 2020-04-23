package example

class DogHouse {

    String name
    static hasMany = [dogs: Dog]

    static constraints = {
    }
}
