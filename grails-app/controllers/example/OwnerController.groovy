package example

class OwnerController {

    def index() {
        CatBox.withNewTransaction {
            println("Performing setup")
            DogHouse dogOwner = new DogHouse(name: "Wooden").save()
            CatBox catOwner = new CatBox(box: "The Rolling Bears").save()

            println("Owners: ${dogOwner}, ${catOwner}")

            Dog dog = new Dog(name: "Rover", description: "Brown", petType: PetType.DOG, dogHouse: dogOwner)
            println("Dog: ${dog}")
            dogOwner.addToDogs(dog)
            dog.save()
            dogOwner.save()


            Cat cat = new Cat(name: "Kitty", description: "Tabby", petType: PetType.CAT, catHouse: catOwner).save(flush: true)
            catOwner.addToCats(cat)
            catOwner.save()
            println("Cat ${cat}")


            render "Dog: ${dog}<br/>Cat: ${cat}"
        }
    }
}
