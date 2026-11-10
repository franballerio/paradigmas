public class CarritoDeCompras {
    private List<Item> items;

    public void agregarItem(Item item) {
    	Item items = this.getItems();
	if !(items.add(item)) {
	  throw new Exception("El item no se pudo agregar al carrito");
	}
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.agregarItem(item);
    }
}
