package example

class Dog extends PetObject
{

  DogHouse dogHouse
  static belongsTo = DogHouse

  static constraints = {
    name(blank:false,unique:'dogHouse', maxSize:255)
  }


  String toString()
  {
    "${dogHouse}-${name}"
  }
}
