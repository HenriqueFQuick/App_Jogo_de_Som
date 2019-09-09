package pucminas.br.appjogos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class tela2 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageape;
    private MediaPlayer mediaPlayerape;
    private ImageView imagecat;
    private MediaPlayer mediaPlayercat;
    private ImageView imagecow;
    private MediaPlayer mediaPlayercow;
    private ImageView imagedog;
    private MediaPlayer mediaPlayerdog;
    private ImageView imageduck;
    private MediaPlayer mediaPlayerduck;
    private ImageView imageelephant;
    private MediaPlayer mediaPlayerelephant;
    private ImageView imagehorse;
    private MediaPlayer mediaPlayerhorse;
    private ImageView imagelion;
    private MediaPlayer mediaPlayerlion;
    private ImageView imagemoose;
    private MediaPlayer mediaPlayermoose;
    private ImageView imageowl;
    private MediaPlayer mediaPlayerowl;
    private ImageView imagepig;
    private MediaPlayer mediaPlayerpig;
    private ImageView imagerooster;
    private MediaPlayer mediaPlayerrooster;
    private ImageView imagesheep;
    private MediaPlayer mediaPlayersheep;
    private ImageView imagetiger;
    private MediaPlayer mediaPlayertiger;
    private ImageView imageturkey;
    private MediaPlayer mediaPlayerturkey;
    private ImageView imagezebra;
    private MediaPlayer mediaPlayerzebra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        imageape = findViewById(R.id.image_ape);
        mediaPlayerape = MediaPlayer.create(tela2.this, R.raw.ape);

        imagecat = findViewById(R.id.image_cat);
        mediaPlayercat = MediaPlayer.create(tela2.this, R.raw.cat);

        imagecow = findViewById(R.id.image_cow);
        mediaPlayercow = MediaPlayer.create(tela2.this, R.raw.cow);

        imagedog = findViewById(R.id.image_dog);
        mediaPlayerdog = MediaPlayer.create(tela2.this, R.raw.dog);

        imageduck = findViewById(R.id.image_duck);
        mediaPlayerduck = MediaPlayer.create(tela2.this, R.raw.duck);

        imageelephant = findViewById(R.id.image_elephant);
        mediaPlayerelephant = MediaPlayer.create(tela2.this, R.raw.elephant);

        imagehorse = findViewById(R.id.image_horse);
        mediaPlayerhorse = MediaPlayer.create(tela2.this, R.raw.horse);

        imagelion = findViewById(R.id.image_lion);
        mediaPlayerlion = MediaPlayer.create(tela2.this, R.raw.lion);

        imagemoose = findViewById(R.id.image_moose);
        mediaPlayermoose = MediaPlayer.create(tela2.this, R.raw.moose);

        imageowl = findViewById(R.id.image_owl);
        mediaPlayerowl = MediaPlayer.create(tela2.this, R.raw.owl);

        imagepig = findViewById(R.id.image_pig);
        mediaPlayerpig = MediaPlayer.create(tela2.this, R.raw.pig);

        imagerooster = findViewById(R.id.image_rooster);
        mediaPlayerrooster = MediaPlayer.create(tela2.this, R.raw.rooster);

        imagesheep = findViewById(R.id.image_sheep);
        mediaPlayersheep = MediaPlayer.create(tela2.this, R.raw.sheep);

        imagetiger = findViewById(R.id.image_tiger);
        mediaPlayertiger = MediaPlayer.create(tela2.this, R.raw.tiger);

        imageturkey = findViewById(R.id.image_turkey);
        mediaPlayerturkey = MediaPlayer.create(tela2.this, R.raw.turkey);

        imagezebra = findViewById(R.id.image_zebra);
        mediaPlayerzebra = MediaPlayer.create(tela2.this, R.raw.zebra);


        imageape.setOnClickListener(this);
        imagecat.setOnClickListener(this);
        imagecow.setOnClickListener(this);
        imagedog.setOnClickListener(this);
        imageduck.setOnClickListener(this);
        imageelephant.setOnClickListener(this);
        imagehorse.setOnClickListener(this);
        imagelion.setOnClickListener(this);
        imagemoose.setOnClickListener(this);
        imageowl.setOnClickListener(this);
        imagepig.setOnClickListener(this);
        imagerooster.setOnClickListener(this);
        imagesheep.setOnClickListener(this);
        imagetiger.setOnClickListener(this);
        imageturkey.setOnClickListener(this);
        imagezebra.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_ape:
                mediaPlayerape.start();
                break;
            case R.id.image_cat:
                mediaPlayercat.start();
                break;
            case R.id.image_cow:
                mediaPlayercow.start();
                break;
            case R.id.image_dog:
                mediaPlayerdog.start();
                break;
            case R.id.image_duck:
                mediaPlayerduck.start();
                break;
            case R.id.image_elephant:
                mediaPlayerelephant.start();
                break;
            case R.id.image_horse:
                mediaPlayerhorse.start();
                break;
            case R.id.image_lion:
                mediaPlayerlion.start();
                break;
            case R.id.image_moose:
                mediaPlayermoose.start();
                break;
            case R.id.image_owl:
                mediaPlayerowl.start();
                break;
            case R.id.image_pig:
                mediaPlayerpig.start();
                break;
            case R.id.image_rooster:
                mediaPlayerrooster.start();
                break;
            case R.id.image_sheep:
                mediaPlayersheep.start();
                break;
            case R.id.image_tiger:
                mediaPlayertiger.start();
                break;
            case R.id.image_turkey:
                mediaPlayerturkey.start();
                break;
            case R.id.image_zebra:
                mediaPlayerzebra.start();
                break;
            default:
                break;
        }
    }
}
