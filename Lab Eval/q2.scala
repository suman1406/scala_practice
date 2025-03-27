// Question: 
// Fix the bugs in the Playerinventory class so that when a user starts 
// a new account, Playerinventory is initialized with basic items. It should also 
// be possible to add and drop items from the inventory, with duplicate items added 
// and removed separately. For example, if "lumber" was added to the inventory and 
// "stone" was removed, getItems() should return a Vector containing "lumber", "magic potion", 
// and "lumber", in any order.
class PlayerInventory {
  private var items: Vector[String] = Vector("lumber", "magic potion", "stone")

  def addItem(item: String): Unit = {
    items = items :+ item 
  }

  def dropItem(item: String): Unit = {
    val index = items.indexOf(item)
    if (index >= 0) {
      items = items.patch(index, Nil, 1)
    }
  }

  def getItems(): Vector[String] = items
}

object InventoryDemo extends App {
  val inventory = new PlayerInventory()
  
  println("Initial inventory: " + inventory.getItems())
  
  inventory.addItem("lumber")
  println("After adding lumber: " + inventory.getItems())
  
  inventory.dropItem("stone")
  println("After dropping stone: " + inventory.getItems())
}