package com.example.sayuran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> jbNames = new ArrayList<>();
    private ArrayList<String> jbDescription = new ArrayList<>();
    private ArrayList<String> imageUrl = new ArrayList<>();
    private ArrayList<String> vgDescriptionDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        imageUrl.add("https://cdn.pixabay.com/photo/2017/06/09/16/39/carrots-2387394_1280.jpg");
        jbNames.add("Wortel");
        jbDescription.add("Sayuran Akar");
        vgDescriptionDetail.add("Wortel adalah tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar untuk tumbuhan tersebut berbunga pada tahun kedua. Batang bunga tumbuh setinggi sekitar 1 m, dengan bunga berwarna putih, dan rasa yang manis langu. Bagian yang dapat dimakan dari wortel adalah bagian umbi atau akarnya. Wortel mengandung vitamin A yang baik untuk kesehatan mata. Mengkonsumsi wortel baik untuk penglihatan pada mata, terutama bisa meningkatkan pandangan jarak jauh. Selain vitamin A, wortel juga mengandung vitamin B1, B2, B3, B6, B9, dan C, kalsium, zat besi, magnesium, fosfor, kalium, dan sodium.");

        imageUrl.add("https://cdn.pixabay.com/photo/2014/08/06/20/32/potatoes-411975_1280.jpg");
        jbNames.add("Kentang");
        jbDescription.add("Sayuran Akar");
        vgDescriptionDetail.add("Kentang (Solanum tuberosum L.) adalah tanaman dari suku Solanaceae yang memiliki umbi batang yang dapat dimakan dan disebut \"kentang\" pula. Umbi kentang sekarang telah menjadi salah satu makanan pokok penting di Eropa walaupun pada awalnya didatangkan dari Amerika Selatan. Kentang mengandung sejumlah vitamin dari A, B-kompleks, hingga C, hingga asam folat. Juga mineral, protein, karbohidrat, karotenoid, dan polifenol. Dalam tubuh kentang ini, juga ada zat solanin yang dikenal sebagai obat penenang, antikejang, antijamur, dan pestisidal.[Vitamin C yang terkandung dalam kentang setiap 100 g adalah 17 mg. Selain terkandung karbohidrat dan serat-serat, mineral yang ada padanya antara lain adalah zat besi, fosfor, dan kalium.");

        imageUrl.add("https://s.republika.co.id/uploads/images/inpicture_slide/vitamin-a-dalam-buah-tomat-dan-mineral-biotin-di-_150817114444-343.jpg");
        jbNames.add("Tomat");
        jbDescription.add("Sayuran Buah");
        vgDescriptionDetail.add("Tomat (Solanum lycopersicum syn. Lycopersicum esculentum) adalah tumbuhan dari keluarga Solanaceae, tumbuhan asli Amerika Tengah dan Selatan, dari Meksiko sampai Peru. Tomat merupakan tumbuhan siklus hidup singkat, dapat tumbuh setinggi 1 sampai 3 meter. Tumbuhan ini memiliki buah berawarna hijau, kuning, dan merah yang biasa dipakai sebagai sayur dalam masakan atau dimakan secara langsung tanpa diproses. Tomat memiliki batang dan daun yang tidak dapat dikonsumsi karena masih sekeluarga dengan kentang dan Terung yang mengadung Alkaloid.");

        imageUrl.add("https://cdn.utakatikotak.com/20170602/20170602_085150Paprika.jpg");
        jbNames.add("Paprika");
        jbDescription.add("Sayuran Buah");
        vgDescriptionDetail.add("Paprika (Capsicum annuum L.) adalah tumbuhan penghasil buah yang berasa manis dan sedikit pedas dari suku terong-terongan atau Solanaceae). Buahnya yang berwarna hijau, kuning, merah, atau ungu sering digunakan sebagai campuran salad. Dalam pengertian internasional, paprika dipakai untuk menyatakan hampir semua varietas C. annuum, termasuk yang pedas. Nama-nama tertentu, seperti pepperoni, diberikan untuk paprika dengan ciri penampilan, penggunaan, atau rasa yang khas. Tanaman ini berasal dari Amerika Selatan, sekarang tersebar luas dan dibudidayakan di hampir semua daerah tropika dan subtropika.");

        imageUrl.add("https://1.bp.blogspot.com/-yNWv1_l0ySw/UQNLLxl32eI/AAAAAAAACEg/LLN3Xh2j1WQ/s1600/Kubis+1.jpg");
        jbNames.add("Kubis");
        jbDescription.add("Sayuran Daun");
        vgDescriptionDetail.add("Kubis, kol, kobis, atau kobis bulat (terdiri dari beberapa kelompok kultivar dari Brassica oleracea) adalah tanaman dua tahunan hijau atau ungu berdaun, ditanam sebagai tanaman tahunan sayuran untuk kepala padat berdaunnya. Erat kaitannya dengan tanaman cole lainnya, seperti brokoli, kembang kol, dan kubis brussel, itu diturunkan dari B. oleraceavar. oleracea, kubis lapangan liar. Kepala kubis umumnya berkisar 0,5 hingga 4 kilogram (1 hingga 9 lb), dan dapat berwarna hijau, ungu dan putih. Kubis hijau berkepala keras berdaun halus adalah yang paling umum, dengan kubis merah berdaun halus dan kubis savoy berdaun crinkle dari kedua warna terlihat lebih jarang. Kubis adalah sayuran yang berlapis-lapis. Dalam kondisi hari diterangi matahari panjang seperti yang ditemukan di garis lintang utara di musim panas, kubis dapat tumbuh jauh lebih besar.");

        imageUrl.add("https://cdn.pixabay.com/photo/2015/03/18/08/00/water-spinach-678919_1280.jpg");
        jbNames.add("Kangkung");
        jbDescription.add("Sayuran Daun");
        vgDescriptionDetail.add("Kangkung (Ipomoea aquatica Forsk.) adalah tumbuhan yang termasuk jenis sayur-sayuran dan ditanam sebagai makanan. Kangkung banyak dijual di pasar-pasar. Kangkung banyak terdapat di kawasan Asia dan merupakan tumbuhan yang dapat dijumpai hampir di mana-mana terutama di kawasan berair.");

        imageUrl.add("https://www.kampustani.com/wp-content/uploads/2018/01/sayur-bayam.jpg");
        jbNames.add("Bayam");
        jbDescription.add("Sayuran Daun");
        vgDescriptionDetail.add("Bayam (Amaranthus spp.) merupakan tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh.");

        setActionBarTitle("Mode List");
        initRecyclerList();

    }

    private void initRecyclerList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter adapter = new ListAdapter(this, jbNames, imageUrl, jbDescription, vgDescriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridAdapter adapter = new GridAdapter(this, jbNames, imageUrl, jbDescription, vgDescriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter adapter = new CardViewAdapter(this, jbNames, imageUrl, jbDescription, vgDescriptionDetail);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                initRecyclerList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                showRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}