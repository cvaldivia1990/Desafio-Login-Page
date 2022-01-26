package cl.desafiolatam.desafiouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import cl.desafiolatam.desafiouno.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Picasso.get().load("https://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png").into(binding.imgPrincipal);

        binding.btnIngresar.setOnClickListener(view -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });

        binding.btnRegistrese.setOnClickListener(view -> {
            Intent intent = new Intent(this,ActivityRegistroUsuario.class);
            startActivity(intent);
        });


    }
}