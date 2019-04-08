fun main() {

    //Pemanggilan Object Manusia
    val manusia1 = Manusia("Irfan", "Bogor", "19 Mei 1995" , "Jogja" )
    val manusia2 = Manusia("Donny", "Sleman", "20 Mei 1993" , "Jogja" )

    manusia1.bernafas("Paru-paru")
    manusia1.berjalan("Kantor")

    manusia2.tampilIdentitas()
    manusia2.berjalan()
}