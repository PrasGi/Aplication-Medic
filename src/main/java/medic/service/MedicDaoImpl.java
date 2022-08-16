package medic.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MedicDaoImpl implements MedicDao {

    @Override
    public int analityc(String keluhan) {
        int nilai = 0;

        if (headSection(keluhan) && symthom(keluhan)) {

            if (check(keluhan) == 1) {
                nilai = 1;
            }else if (check(keluhan) == 2){
                nilai = 2;
            }else if (check(keluhan) == 3){
                nilai = 3;
            }else if (check(keluhan) == 4){
                nilai = 4;
            }else{
                nilai = 5;
            }

        }else if(headSection(keluhan) == true && symthom(keluhan) == false){
            nilai = 9;
        }else if(headSection(keluhan) == false && symthom(keluhan) == true){
            nilai = 8;
        }else{

        }

        return nilai;
    }

    //    HeadSection
    public boolean headSection(String a) {
        boolean nilai = false;

        if (
//                Tension Type Headache
                a.contains("depan") || a.contains("di depan") || a.contains("didepan") || a.contains("bagian depan") || a.contains("arah depan")
                        || a.contains("dahi") || a.contains("pelipis") || a.contains("belakang mata") || a.contains("didahi") || a.contains("dipelipis")

//                Migraine
                        || a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("sebagian") || a.contains("disebagian") || a.contains("hanya sebelah kiri") || a.contains("bagian hanya sebelah kanan")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("belakang") || a.contains("di belakang") || a.contains("dibelakang") || a.contains("bagian belakang") || a.contains("arah belakang")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")

//                Vertigo
                        || a.contains("keliling") || a.contains("mengelilingi") || a.contains("menyeluruh")
                        || a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")

//                Cluster
                        || a.contains("belakang") || a.contains("di belakang") || a.contains("dibelakang") || a.contains("bagian belakang") || a.contains("arah belakang")
                        || a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("keliling") || a.contains("mengelilingi") || a.contains("menyeluruh")
                        || a.contains("depan") || a.contains("di depan") || a.contains("didepan") || a.contains("bagian depan") || a.contains("arah depan")

        ) {
            nilai = true;
        }

        return nilai;
    }

    public boolean symthom(String a) {
        boolean nilai = false;

        if (
//                Tension Type Headache
                a.contains("ikat") || a.contains("di ikat") || a.contains("diikat") || a.contains("seperti di ikat") || a.contains("seperti diikat")
                        || a.contains("dahi") || a.contains("di dahi") || a.contains("didahi") || a.contains("bagian dahi") || a.contains("arah dahi")
                        || a.contains("pelipis") || a.contains("di pelipis") || a.contains("dipelipis") || a.contains("bagian pelipis") || a.contains("arah pelipis")
                        || a.contains("belakang mata") || a.contains("di belakang mata") || a.contains("dibelakang mata") || a.contains("bagian belakang mata") || a.contains("arah belakang mata")
                        || a.contains("tertekan") || a.contains("di tekan") || a.contains("ditekan") || a.contains("ter tekan") || a.contains("seperti ditekan")
                        || a.contains("meledak") || a.contains("hancur") || a.contains("pres") || a.contains("mau meledak") || a.contains("di pres")

//                Cluster
                        || a.contains("mual") || a.contains("rasa mual") || a.contains("melihat cahaya") || a.contains("cahaya") || a.contains("lampu")
                        || a.contains("melihat lampu") || a.contains("silau") || a.contains("mendengar suara") || a.contains("berisik") || a.contains("bising")
                        || a.contains("ramai") || a.contains("ketika ramai") || a.contains("menangis") || a.contains("air mata")

//                Migraine
                        || a.contains("nyeri") || a.contains("berdenyut") || a.contains("melihat cahaya") || a.contains("kena cahaya") || a.contains("terkena cahaya")
                        || a.contains("berdetak")

//                Vertigo
                        || a.contains("berputar") || a.contains("di putar") || a.contains("diputar") || a.contains("melayang") || a.contains("seperti berputar")
                        || a.contains("berubah posisi") || a.contains("posisi") || a.contains("berubah posisi duduk") || a.contains("posisi duduk") || a.contains("posisi tidur")
                        || a.contains("bergerak") || a.contains("berubah tempat") || a.contains("di gerakan")

        ) {
            nilai = true;
        }

        return nilai;
    }

    public int check(String a){
        int nilai = 0;

        if (
//                Tension Type Headache
                (a.contains("depan") || a.contains("di depan") || a.contains("didepan") || a.contains("bagian depan") || a.contains("arah depan")
                        || a.contains("dahi") || a.contains("pelipis") || a.contains("belakang mata") || a.contains("didahi") || a.contains("dipelipis"))

                        &&

                        (a.contains("ikat") || a.contains("di ikat") || a.contains("diikat") || a.contains("seperti di ikat") || a.contains("seperti diikat")
                                || a.contains("dahi") || a.contains("di dahi") || a.contains("didahi") || a.contains("bagian dahi") || a.contains("arah dahi")
                                || a.contains("pelipis") || a.contains("di pelipis") || a.contains("dipelipis") || a.contains("bagian pelipis") || a.contains("arah pelipis")
                                || a.contains("belakang mata") || a.contains("di belakang mata") || a.contains("dibelakang mata") || a.contains("bagian belakang mata") || a.contains("arah belakang mata")
                                || a.contains("tertekan") || a.contains("di tekan") || a.contains("ditekan") || a.contains("ter tekan") || a.contains("seperti ditekan")
                                || a.contains("meledak") || a.contains("hancur") || a.contains("pres") || a.contains("mau meledak") || a.contains("di pres"))

        ) {

            nilai = 1;

        }else if(
//                Cluster
                a.contains("belakang") || a.contains("di belakang") || a.contains("dibelakang") || a.contains("bagian belakang") || a.contains("arah belakang")
                        || a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("keliling") || a.contains("mengelilingi") || a.contains("menyeluruh")
                        || a.contains("depan") || a.contains("di depan") || a.contains("didepan") || a.contains("bagian depan") || a.contains("arah depan")

                        &&

                        a.contains("mual") || a.contains("rasa mual") || a.contains("melihat cahaya") || a.contains("cahaya") || a.contains("lampu")
                        || a.contains("melihat lampu") || a.contains("silau") || a.contains("mendengar suara") || a.contains("berisik") || a.contains("bising")
                        || a.contains("ramai") || a.contains("ketika ramai") || a.contains("menangis") || a.contains("air mata")

        ){

            nilai = 2;

        }else if(
//                Migraine
                a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("sebagian") || a.contains("disebagian") || a.contains("hanya sebelah kiri") || a.contains("bagian hanya sebelah kanan")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("belakang") || a.contains("di belakang") || a.contains("dibelakang") || a.contains("bagian belakang") || a.contains("arah belakang")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")

                        &&

                        a.contains("nyeri") || a.contains("berdenyut") || a.contains("melihat cahaya") || a.contains("kena cahaya") || a.contains("terkena cahaya")
                        || a.contains("berdetak")

        ){

            nilai = 3;

        }else if(
//                Vertigo
                a.contains("keliling") || a.contains("mengelilingi") || a.contains("menyeluruh")
                        || a.contains("kanan") || a.contains("di kanan") || a.contains("dikanan") || a.contains("bagian kanan") || a.contains("arah kanan")
                        || a.contains("kiri") || a.contains("di kiri") || a.contains("dikiri") || a.contains("bagian kiri") || a.contains("arah kiri")
                        || a.contains("seluruh") || a.contains("di seluruh") || a.contains("diseluruh") || a.contains("seluruh bagian") || a.contains("semua")

                        &&

                        a.contains("berputar") || a.contains("di putar") || a.contains("diputar") || a.contains("melayang") || a.contains("seperti berputar")
                        || a.contains("berubah posisi") || a.contains("posisi") || a.contains("berubah posisi duduk") || a.contains("posisi duduk") || a.contains("posisi tidur")
                        || a.contains("bergerak") || a.contains("berubah tempat") || a.contains("di gerakan")

        ){

            nilai = 4;

        }

        return nilai;
    }

}
