package cms


class Insertion_orders_salespersons extends Insertion_orders_persons {
    static mapping ={
        discriminator value: "Salesperson"
    }
}

