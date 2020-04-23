package example

abstract class PetObject {
  String name
  String description

  PetType petType

  static constraints = {
    petType(blank:false)
  }
}
