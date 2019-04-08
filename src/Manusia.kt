class Manusia(
    var nama: String,
    var tempatLahir: String,
    var tanggalLahir: String,
    var alamat: String
) : MakhlukHidup() {

    //Menampilkan identitas dari orang tersebut
    fun tampilIdentitas() {
        println("Nama : $nama \n" +
                "Tempat dan Tanggal Lahir : $tempatLahir, $tanggalLahir \n" +
                "Alamat : $alamat \n"
        )
    }

    //Menampilkan abstract function dari parent class (polymorphisme overriding)
    override fun bernafas(alatNafas: String) {
        this.alatNafas = alatNafas
        println("Mengambil nafas dengan menggunakan $alatNafas")
    }

    //Overloading polymorphism
    fun berjalan() {
        println("$nama berjalan menyusuri jalan")
    }

    fun berjalan(tujuan: String) {
        println("$nama berjalan menyusuri jalan menuju $tujuan")
    }
}