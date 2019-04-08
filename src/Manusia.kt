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

    //Menampilkan abstract function dari parent class
    override fun bernafas(alatNafas: String) {
        this.alatNafas = alatNafas
        println("Mengambil nafas dengan menggunakan $alatNafas")
    }

}