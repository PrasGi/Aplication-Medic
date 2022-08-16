package medic.service;

public class MedicHeadacheImpl implements MedicHeadache{
    @Override
    public String cluster() {

        return cluster;
    }

    @Override
    public String migraine() {
        return migraine;
    }

    @Override
    public String tension() {
        return tension;
    }

    @Override
    public String vertigo() {
        return vertigo;
    }

    private String cluster = "Sakit kepala cluster dapat terjadi pada siapa saja,\n"
            + "tetapi lebih sering dialami oleh pria usia 30–40 tahun. \n"
            + "Sakit kepala ini datang pada periode tertentu dan biasanya\n"
            + "periode ini terjadi pada waktu tertentu di tiap tahunnya.\n" +
            "Periode terjadinya sakit kepala cluster bisa berlangsung selama\n"
            + " beberapa hari hingga bulan. Periode ini akan dikuti dengan periode \n"
            + "remisi atau periode tanpa gejala, yang bisa berlangsung\n"
            + "selama beberapa bulan hingga tahun.\nCara Mengatasi : Oksigen murni yang dihirup selama 15 menit, Obat sumatriptan, \\n\"\n" +
            "            + \"Dihydroergotamine dan Anestesi (bius) local.";

    private String migraine = "Migrain adalah sakit kepala yang terasa berdenyut \n"
            + "dan biasanya terjadi pada salah satu sisi kepala. \n"
            + "Migrain dapat berlangsung selama beberapa jam atau bahkan beberapa hari.\n" +
            "Gejala utama migrain adalah nyeri kepala hebat di salah satu sisi kepala. \n"
            + "Nyeri yang dirasakan umumnya nyeri berdenyut dengan intensitas \n"
            + "sedang hingga berat, yang makin terasa ketika bergerak, melihat cahaya \n"
            + "terang, atau mendengar suara bising.\nCara Mengatasi : Tidak ada metode khusus untuk mengatasi migrain, \\n\"\n" +
            "            + \"tetapi gejala penyakit ini bisa diredakan dengan \\n\"\n" +
            "            + \"mengombinasikan perawatan mandiri, penggunaan obat, serta perubahan gaya hidup.";

    private String tension = "Sakit kepala tegang terasa di seluruh bagian kepala. "
            + "Namun, rasa sakit biasanya dimulai dari bagian depan kepala, \n"
            + "pelipis, atau belakang mata sebelum menjalar ke bagian lain dari kepala.\n" +
            "Sakit ini ditandai dengan sensasi seperti kepala sedang diikat dengan erat "
            + "hingga menimbulkan rasa seperti tertekan.\n" +
            "Gejala tersebut juga didampingi dengan gejala lain seperti kepala, "
            + "kulit kepala, dan otot di sekitar leher, wajah\n, "
            + "dan bahu terasa lunak.\nCara Mengatasi : Minum obat  atau bahkan resep dokter, Sesuaikan kebiasaan \"\n" +
            "            + \"kerja Anda dan atur workstation Anda dengan benar, \\n\"\n" +
            "            + \"Luangkan waktu jauh dari stress, Dapatkan kualitas tidur yang baik, \\n\"\n" +
            "            + \"Lakukan olahraga secara teratur dan minum air.";

    private String vertigo = "Vertigo adalah kondisi yang membuat penderitanya \n"
            + "mengalami pusing hingga merasa dirinya atau sekelilingnya berputar.\n"
            + " Meski sering kali dianggap sebagai suatu penyakit, vertigo sebenarnya \n"
            + "merupakan gejala dari penyakit atau kondisi lain.\nCara Mengatasi : Tidak banyak bergerak, Duduk atau berbaring ketika \\n\"\n" +
            "            + \"vertigo terjadi, Tidak mengubah posisi tubuh secara tiba-tiba,\\n\"\n" +
            "            + \" Tidak membaca tulisan apa pun dan Menghindari sinar yang terlalu terang";
}
