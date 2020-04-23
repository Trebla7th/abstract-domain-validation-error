package example

class Cat extends PetObject {
  CatBox box
  static belongsTo = CatBox



  static constraints = {
    name(blank: false, unique: 'box', maxSize: 255)
    box(nullable: false)
  }

  String toString() {
    "${box.name}-${name}"
  }

}
