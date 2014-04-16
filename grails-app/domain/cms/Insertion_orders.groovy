package cms

class Insertion_orders {
    String insertion_order_name
    String po_number
    String notes
    String toString() {
        "${insertion_order_name} - ${id}"
    }

    static hasMany = [trafficker: Insertion_orders_traffickers, salesperson: Insertion_orders_salespersons]

    static constraints = {
        insertion_order_name(blank:false)
        po_number()
        notes(widget: 'textarea', nullable:true)
    }
    static mapping ={
        version false
        id column: 'insertion_order_id'
        notes sqlType: 'text'
    }
}
