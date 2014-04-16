package cms


class Insertion_orders_traffickers extends Insertion_orders_persons {
    static mapping ={
        discriminator value: "Traffickers"
    }
}
