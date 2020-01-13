package com.example.anggiat.wondersoftheworld;

import java.util.ArrayList;

class ObjectData {

    private static final String[] objectName = {
            "Tembok Besar Cina",
            "Piramid",
            "Koloseum Roma",
            "Petra",
            "Machu Picchu",
            "Taj Mahal",
            "Chichen Itza",
            "Rio de Janeiro",
            "Menara Eiffel",
            "Patung Liberty"
    };

    private static final String[] objectCountry = {
            "Cina",
            "Mesir",
            "Itali",
            "Yordania",
            "Peru",
            "India",
            "Meksiko",
            "Brazil",
            "Paris",
            "Amerika"
    };

    private static final String[] objectDetail = {
            "Siapa yang tidak mengetaui salah satu keajaiban dunia ini, tembok besar cina merupakan bangunan terpanjang di dunia bahkan bangunan terpanjang yang pernah dibangun oleh manusia hingga saat ini. Tembok besar cina ini panjangnya sekitar 6.400 meter dengan tinggi 8 meter, dengan lebar atasnya 5 meter. Salah satu tujuan pembuatan tembok ini adalah untuk mencegah bangsa mongol dari utara masuk pada masanya.\n\n Keunikan dan keindahannya bukan hanya karena panjangnya, namun sejenis menara pengintai juga menambah keindahan dari bangunan terpanjang didunia ini. Sejenis menara pemantau dibangun di setiap 180 meter hingga 270 meter, tinggi menara pengintai ini sepanjang 11-12 meter.",
            "Piramid adalah bangunan yang berbentuk segitiga yang terdapat di daerah sekitar sungai nil. Piramid sendir ada beberapa di dunia, namun yang terbesarlah yang menjadi salah satu dari 10 keajaiban dunia. Piramid ini dinmai Piramida Agung Giza yang juga merupakan bagian utama dari kompleks bangunan piramid, terdiri dari dua kuil yang konon untuk menghormati Khufu. Tiga piramida yang lebih kecil untu istri Khufu, dan sebuah paramida yang lebih kecil lagi seperti lintasan yang ditinggikan, dan lainnya adalah makam mastaba yang berukuran kecil di sekeliling piramida.\n\n Salah satu dari beberapa piramid tersebut merupakan makam dari ratu Hetepheres. Juga ditemukan kota yang termasuk sebuah pemakaman, pabrik, dan kompleks peleburan tembaga. Salah satu penerus Khufu yang juga dianggap sebagai orang yang membangun Sphinx Agung adalah Khafre juga terdapat piramidanya yang berukuran lebih kecil.\n Bagi Anda yang ingin melihat kemegahan dan kekohon tembok yang bertahan lama ini, sangat direkomendasikan mengunjungi salah satu keajaiban dunia ini.",
            "Peninggalan bersejarah ini masuk salah satu keajaiban dunia selain bentuknya yang unik bangunan ini terbayang sangat megah pada zamannya. Bangunan koloseum digunakan sebagai arena gladiator pada zamannya. Bangunan yang menjadi salah satu keajaiban dunia ini juga menjadi sebuah karya arsitektur terbesar pada kerajaan romawi yang pernah dibangun. Koloseum ini bangunan yang sangat megah dan besar pada masanya, karena dapat menampung hingga 50.000 penonton.\n\n Bangunan ini dibangun pada tahun 72 masehi dalam pemerintahan Vespasian, dan selesai 8 tahun setelahnya pada pemerintahan anaknya pada tahun 80 Masehi. Selain bangunan ini yang megah, tidak jauh dari bangunan ini juga terdapat istana megah yang bernama Domus Aurea.\n\n Kolesum memiliki sejarah yang sangat menarik untuk dipelajari, salah satunya fungsi dari koloseum pada masa itu adalah untuk sebuah pertunjukan yang spektakuler, karena pertarungan antara binatang buas dengan tahanan. Pertarungan yang sudah berlangsung selama ratusan tahun ini diperkirakan telah melibatkan ribuan binatang dan juga orang mati dalam pertunjukan koloseum,\n\n Koloseum diketahui memiliki tinggi 48 meter dan juga panjang 188 meter dengan lebar 156 meter dan luas untuk seluruh bangunan berkisar 2.5 hektar membuat bangunan ini terlihat besar dan megah, bisa dibayangkan betapa besar dan megahnya bangunan ini pada zamannya.",
            "Salah satu keajaiban dunia yang baru terpilih adalah petra dari Yordania. Petra ini dipilih sebagai salah satu keajaiban dunia setelah dipilih oleh 100 juta orang di seluruh dunia melalui website online, via SMS dan juga telepon selular yang diadakan di Lisbon, Portugal.\n\n Jika kita melihat kota ini memang membuat takjub dan juga setuju kalau kota ini menjadi salah satu keajaiban dunia, karena kota ini dibuat dengan cara di pahat di dinding-dinding batu di Yordania. Petra berasal dari bahasa Yunani yang berarti Batu.\n\n Bangunan ini memang terbuat dari batu, diukir dan di pahat dengan sangat luar biasa sehingga membentuk bangunan-bangunan yang sangat cantik. Kota ini dibuat dengan cara memahat dinding batu setinggi 40 meter, Petra merupakan ibukota dari kerajaan Nabatean. Kota ini konon sudah ada pada 9 tahun sebelum Masehi sampai ke tahun 40 Masehi oleh raja Aretas ke 4. Kota ini menjadi kota yang sulit ditembus musuh dan aman dari bencara sekitar seperti badai pasir.\n\n Meskipun kota ini terbuat dari batu, namun kota ini memiliki sistem pengairan yang luar basa bahkan bisa disebut rumit. Terdapat terowongan air khusus yang menyalurkan air bersih ke pusat kota, dan dapat mencegah terjadinya banjir mendadak.\n\n Selain itu teknologi hidrolik sudah digunakan oleh mereka untuk mengangkat air Terdapat juga ruangan teater yang diperkirakan mampu menampung 4.000 orang. Selain itu istana Makam Hellenistis dengan tinggi 42 meter masih berdiri kokoh di dalam kota.",
            "Jika sebelumnya Petra adalah kota yang terbuat dari batu, Machu Pichu adalah salah satu keajaiban dunia yang juga masih betemakan kota. Machu Pichu adalah kota cantik yang berada di ketinggian sekitar 2.350 meter di atas permukaan laut. Machu pichu berada di Peru tepatnya di lembah Urubamba.\n\n Machu Pichu merupakan simbol kerajaan yang paling terkenal saat itu yaitu kerajaan Inka. Diperkirakan machu pichu dibangun pada tahun 1450, namun seratus tahun kemudia bangsa spanyol berhasil menaklukan kerajaan Inka. Tempat ini sempat tidak diperhatikan atau bahkan terlupakan oleh dunia internasional, kemudian ditemukan kembali pada tahun 1911, dan sejak itu pula machu pichu menjadi objek wisata yang sangat menarik wisatawan lokal dan manca negara.",
            "Taj Mahal adalah sebuah monumen yang terletak di India tepatnya di Agra, dibangun pada tahun 1630 sampai 1653 membutuhkan waktu 23 tahun atas keinginan kaisar Mughal Shah Jahan, sebagai musoleum untuk istri persianya. Monumen ini merupakan peringatan dan persembahan dari sultan untuk istrinya sebelum meninggal yang disebabkan kelahiran anak mereka yang ke 14 pada tahun 1630.",
            "Candi ini merupakan peninggalan suku Maya yang masih terawat hingga sekarang dan juga menjadi salah satu yang paling lengkap. Situr peradaban maya di Meksiko ini dipilih sebagai salah satu keajaiban dunia pada tahun 2007. Kompleks candi ini diperkirakan di bangun antara tahun 502-522 Masehi.  Sebelum berpindah ke pantai Campeche suku maya mendiami tempat ini selama 200 tahun.",
            "Keajaiban dunia berikutnya adalah patung kristus yang berada di Brazil tepatnya di Ri de Janeiro. Patung yang memiliki tinggi 38 meter ini terletak di puncak gunung Corcovado yang tinggi gunung sendiri 710 m di taman nasional hutan tijuca yang menghadap persis ke kota.\n\n Patung ini menjadi simbol kebanggaan kota dan juga simbol bagi umat kristen, bentuk tangan patung yang terbuka mengisyarakatkan kehangatan bagi penduduk Brazil",
            "Keajaiban dunia yang satu ini memang sudah sangat terkenal karena berada dikota megah yang terkenal akan dunia fashionnya. Menara yang dikunjungi lebih dari 200 juta orang sejak tahun 1889 ini menjadikan menara yang paling banyak dikunjungi didunia.\n\n Menara ini juga pernah menjadi menara tertinggi didunia saat selesai dibangun pada tahun 1889 dan masih menjadi menara tertinggi didunia hingga 1930.",
            "Sebuah karya seni pahat yang monumental dan melambangkan kebebasan ini memang sebuah patung dan juga monumen yang megah dan menjadi tujuan wisatawan dunia. Patung yagn memegang obor api yang menyala ini melambangkan kebebasan, dan tangan kiri yang memegang buku merupakan hari kemerdekaan Amerika."
    };

    private static final String[] objectPhoto = {
            "https://wisatabaru.com/wp-content/uploads/2018/04/china-great-wall-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/piramid-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/koloseum-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/petra-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/machu-picchu-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/tajmahal-630x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/itza-600x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/rio-618x380.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/menara-eiffel-630x366.jpg",
            "https://wisatabaru.com/wp-content/uploads/2018/04/liberty-630x380.jpg"
    };

    private static final String[] objectCoordinate = {
            "40.432185, 116.570461",
            "29.979448, 31.134642",
            "41.890466, 12.492456",
            "31.975204, 35.894077",
            "-13.162870, -72.544866",
            "27.175412, 78.042282",
            "20.679404, -88.568327",
            "-22.951723, -43.211223",
            "48.858478, 2.294431",
            "40.689274, -74.044500"
    };

    private static final String[] objectRate = {
            "4.8",
            "4.7",
            "4.8",
            "4.8",
            "4.8",
            "4.6",
            "5.0",
            "4.8",
            "4.6",
            "4.7"
    };

    static ArrayList<Object> getListData() {
        ArrayList<Object> list = new ArrayList<>();
        for (int position = 0; position < objectName.length; position++) {
            Object object = new Object();
            object.setName(objectName[position]);
            object.setCountry(objectCountry[position]);
            object.setDetail(objectDetail[position]);
            object.setPhoto(objectPhoto[position]);
            object.setCoordinate(objectCoordinate[position]);
            object.setRate(objectRate[position]);
            list.add(object);
        }
        return list;
    }

}
