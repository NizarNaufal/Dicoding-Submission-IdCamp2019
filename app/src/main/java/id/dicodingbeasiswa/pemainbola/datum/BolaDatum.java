package id.dicodingbeasiswa.pemainbola.datum;

import java.util.ArrayList;

import id.dicodingbeasiswa.pemainbola.R;
import id.dicodingbeasiswa.pemainbola.model.BolaModule;

public class BolaDatum {
    private static String[] bolaNames = {
            "Lionel Messi",
            "Cristian Ronaldo",
            "Neymar",
            "Paul Pogba",
            "Mohammed Salah",
            "Antoine Grazmann",
            "Zlatan Ibrahimovic",
            "Jadon Sacho",
            "Mauro Icardi",
            "Sergio Aguero",
            "Erling Braut",
            "James Rodriguez",
            "Luis Suarez",
            "Ole Gunnar Solskjaer",
            "Lautaro Martinez"
    };
    private static String [] detailsBola = {
            "Lionel Andrés \"Leo\" Messi adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentina dan FC Barcelona, bermain sebagai penyerang. Ia adalah pencetak gol terbanyak Barcelona sepanjang sejarah",
            "Cristiano Ronaldo dos Santos Aveiro, OIH atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal. Ia dapat berposisi sebagai sayap kiri atau kanan serta penyerang tengah. Saat ini ia bermain untuk tim Italia, Juventus dan untuk tim nasional Portugal. ",
            "Neymar da Silva Santos Júnior yang umumnya dikenal sebagai Neymar atau Neymar Jr, adalah pemain sepak bola profesional Brasil yang bermain untuk klub Prancis Paris Saint-Germain. Dia bermain sebagai penyerang atau pemain sayap.",
            "Paul Labilé Pogba adalah seorang pemain sepak bola profesional Prancis yang bermain untuk klub Liga Utama Inggris, Manchester United dan tim nasional Prancis. Ia berposisi sebagai gelandang tengah dan nyaman dalam bermain baik menyerang dan bertahan.",
            "Mohamed Salah Ghaly adalah pemain sepak bola profesional Mesir yang bermain sebagai penyerang untuk klub Inggris Liverpool dan timnas Mesir. Salah memulai karier seniornya di klub tempat lahirnya, El Mokawloon di Liga Premier Mesir tahun 2010, langsung bergabung dengan Basel untuk harga dirahasiakan",
            "Antoine Griezmann adalah seorang pemain sepak bola Prancis yang saat ini bermain untuk klub Barcelona sebagai pemain sayap kiri atau penyerang. Terkenal karena akselerasi dan larinya yang cepat, ia saat ini mewakili Tengger di level senior dan masuk dalam skuat Piala Dunia 2014 silam",
            "Zlatan Ibrahimović adalah seorang pemain sepak bola asal Swedia yang bermain sebagai penyerang untuk AC Milan. Ibrahimović mengawali karier sepak dengan klub kota kelahirannya Malmö FF pada akhir 1990-an. Ia kemudian bergabung ke Ajax Amsterdam dan namanya mulai terkenal saat dilatih Ronald Koeman.",
            "Jadon Malik Sancho adalah pemain sepak bola profesional Inggris yang bermain sebagai pemain sayap untuk klub Inggris Manchester United F.C. tim nasional Inggris. Sebelumnya menjadi pemain muda bersama Watford dan Manchester City, Sancho menandatangani kontrak senior pertamanya dengan Dortmund pada 2017.",
            "Mauro Emanuel Icardi Rivero adalah seorang pemain sepak bola berkewarganegaraan Argentina yang bermain untuk klub Internazionale biasa bermain pada posisi penyerang. Icardi memulai karier juniornya di klub Vecindario dan Barcelona kemudian memulai karier seniornya di klub Sampdoria.",
            "Sergio Leonel \"Kun\" Agüero del Castillo adalah pemain sepak bola berkebangsaan Argentina yang bermain sebagai Striker untuk Manchester City di Liga Primer Inggris dan tim nasional Argentina. Agüero bermain untuk Independiente sejak tahun 2003 hingga tahun 2006.",
            "Erling Braut Haaland adalah pemain sepak bola profesional Norwegia yang bermain sebagai striker untuk klub Jerman Borussia Dortmund dan tim nasional Norwegia. Haaland memulai kariernya di klub kota asalnya Bryne FK pada 2016, dan pindah ke Molde FK tahun berikutnya selama dua tahun.",
            "James David Rodríguez Rubio cukup dikenal dengan nama James Rodríguez atau James adalah pemain sepak bola Kolombia yang bermain untuk klub asal Spanyol, Real Madrid C.F. Dia diakui sebagai salah satu pemain muda terbaik di dunia.",
            "Luis Alberto Suárez Díaz adalah seorang pemain sepak bola professional Uruguay yang bermain di posisi striker untuk klub FC Barcelona Dia juga anggota tim nasional Uruguay. Pada tahun 2006, Suárez pindah ke Belanda untuk bermain bagi Groningen di Eredivisie. Suárez ditransfer ke Ajax pada tahun 2007.",
            "Ole Gunnar Solskjær adalah mantan pemain sepak bola Norwegia, yang menghabiskan sebagian besar kariernya bermain untuk Manchester United F.C. terutama sebagai striker, tetapi juga sebagai pemain sayap. Dia sekarang seorang manajer sepak bola, saat ini bertanggung jawab atas Manchester United.",
            "Inggris-Lautaro Javier Martínez adalah pemain sepak bola profesional Argentina yang bermain sebagai striker untuk klub Italia Inter Milan dan tim nasional Argentina. Dia memulai karir sepakbolanya di negara asalnya Argentina di mana ia melakukan debut seniornya pada tahun 2015 bersama Racing Club."
    };

    private static int[] bola_image = {
            R.drawable.messi,
            R.drawable.ronaldo,
            R.drawable.neymar,
            R.drawable.pogba,
            R.drawable.salah,
            R.drawable.antonie,
            R.drawable.zlatan,
            R.drawable.jadon,
            R.drawable.mauro,
            R.drawable.aguero,
            R.drawable.erling,
            R.drawable.james,
            R.drawable.luis,
            R.drawable.ole,
            R.drawable.lautaro
    };
    public static ArrayList<BolaModule> getListData(){
        ArrayList<BolaModule> list = new ArrayList<>();
        for (int position = 0; position<bolaNames.length;position++){
            BolaModule bolaModule = new BolaModule();
            bolaModule.setName(bolaNames[position]);
            bolaModule.setDetail(detailsBola[position]);
            bolaModule.setPhoto(bola_image[position]);
            list.add(bolaModule);
        }
        return list;
    }
}
