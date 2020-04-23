package example

class CatBox {
    String name
    static hasMany = [cats: Cat]

    static constraints = {
    }
}
