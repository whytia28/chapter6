package com.example.chapter6.model

import com.example.chapter6.R

object ForbesData {
    private val forbesName = arrayOf(
        "Budi & Michael Hartono",
        "Keluarga Widjaja",
        "Prajogo Pangestu",
        "Susilo Wonowidjojo",
        "Sri Prakash Lohia",
        "Anthoni Salim",
        "Dato Sri Tahir",
        "Boenjamin Setiawan",
        "Chairul Tanjung",
        "Jogi Hendra Atmadja",
        "Mochtar Riady",
        "Martua Sitorus"
    )

    private val forbeDesc = arrayOf(
        "Hartono bersaudara memiliki kekayaan sebanyak USD37,3 miliar atau Rp525,3 triliun (Kurs Rp14.000/USD). Akar kekayaan keluarga berasal dari pembuat rokok kretek Djarum, dimulai oleh ayahnya dan sekarang dijalankan oleh putra Budi, Victor.",
        "Keluarga konglomerat ini mengantongi kekayaan senilai USD9,6 miliar atau Rp135,2 triliun. Saat ini Sinar Mas mereka memiliki minat di bidang kertas, real estat, jasa keuangan, agribisnis dan telekomunikasi.",
        "Pada posisi ketiga, Prajogo memiliki kekayaan sebesar USD7,6 miliar atau Rp107,03 triliun. Perusahaannya PT Barito Pacific Timber go public pada tahun 1993 dan berganti nama menjadi Barito Pacific setelah mengurangi bisnis kayu pada tahun 2007.",
        "Dengan nilai kekayaan USD6,6 miliar atau Rp92,9 triliun, Susilo berhasil menorehkan diri diposisi keempat. Ayahnya Surya, yang tampaknya mulai bekerja untuk bisnis tembakau pamannya, mendirikan Gudang Garam pada tahun 1958.",
        "Pengusaha berusia 67 tahun itu memiliki kekayaan senilai USD5,6 miliar atau Rp 78,9 triliun. Pada tahun 1970-an ia dan ayahnya pindah dari India ke Indonesia, di mana mereka mendirikan Indorama sebagai pembuat benang pintal. Sekarang menjadi pembangkit tenaga listrik petrokimia, membuat produk industri termasuk poliolefin pupuk, bahan baku tekstil dan sarung tangan medis.",
        "Menempatkan dirinya di posisi keenam nilai kekayaan senilai USD5,5 miliar atau Rp77,5 triliun. Salim adalah CEO Indofood, salah satu pembuat mie instan terbesar di dunia.",
        "Tahir memiliki kekayaan USD4,8 miliar atau Rp67,6 triliun. Tahir, yang dikenal dengan satu nama, adalah pendiri Mayapada Group, sebuah perusahaan dengan minat di bidang perbankan, rantai rumah sakit dan, yang paling menonjol, real estat.",
        "Mengantongi kekayaan sebesar USD4,35 miliar atau Rp61,3 triliun. Ia mendapatkan kekayaannya dari bisnis obat-obatan. Boenjamin Setiawan, yang memiliki gelar doktor di bidang farmakologi, mendirikan Kalbe Farma di sebuah garasi pada tahun 1966 dengan lima saudara kandungnya.",
        "Anak singkong ini memiliki kekayaan sebesar USD3,6 miliar atau Rp50,7 triliun. Chairul Tanjung CT Corp. terkenal karena menerbitkan kartu kredit, mengoperasikan hypermarket, dan menjalankan stasiun TV. Trans Retail-nya memiliki toko kelontong di bawah merek Carrefour dan Transmart.",
        "Pendiri Mayora Grup ini mengantongi kekayaan sebesar USD3 miliar atau Rp42,2 triliun. Jogi Hendra Atmadja adalah kepala Mayora Group, salah satu perusahaan makanan terbesar di Indonesia; menjual kopi, sereal, permen, biskuit, dan lainnya.",
        "Ia yang berbisnis di berbagai sektor ini memiliki kekayaan sebanyak USD2,1 miliar atau Rp29,4 triliun. Mochtar Riady adalah pendiri Lippo Group, sekarang dijalankan oleh putra James dan Stephen. Dilahirkan di Jawa Timur, Riady membuka toko sepeda pada usia 22 dan terus membangun karier perbankan yang sukses hingga krisis keuangan 1997. Saat ini, minat Lippo Group meliputi real estat, ritel, perawatan kesehatan, media dan pendidikan.",
        "Dengan mengantongi kekayaan sebesar USD2 miliar atau Rp28 triliun, pengusaha berusia 59 tahun ini menempati peringkat ke-12. Sitorus mundur dari Wilmar, tapi sekarang menjadi pedagang minyak sawit terbesar di dunia, pada Juli 2018."
    )

    private val forbesImage = intArrayOf(
        R.drawable.hartono,
        R.drawable.widjaja,
        R.drawable.pangestu,
        R.drawable.susilo,
        R.drawable.lohia,
        R.drawable.salim,
        R.drawable.dato,
        R.drawable.boenjamin,
        R.drawable.tanjung,
        R.drawable.atmadja,
        R.drawable.riady,
        R.drawable.sitorus
    )

    val listData: ArrayList<Forbes>
        get() {
            val list = arrayListOf<Forbes>()
            for (position in forbesName.indices) {
                val forbes = Forbes()
                forbes.name = forbesName[position]
                forbes.description = forbeDesc[position]
                forbes.photo = forbesImage[position]
                list.add(forbes)
            }
            return list
        }
}