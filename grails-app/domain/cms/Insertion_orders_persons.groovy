package cms

class Insertion_orders_persons {
    Insertion_orders insertion_order
    Type type
    String toString() {
        "${person}: ${type}"
    }

    enum Type {
        Trafficker, Salesperson, Advertiser, Agency
    }

    static constraints = {
    }
    static mapping = {
        version false
        id column: 'insertion_order_person_id'
    }

}


