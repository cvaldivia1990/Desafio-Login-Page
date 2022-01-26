package cl.desafiolatam.desafiouno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.picasso.Picasso;

import cl.desafiolatam.desafiouno.databinding.ActivityRegistroUsuarioBinding;

public class ActivityRegistroUsuario extends AppCompatActivity {

    private ActivityRegistroUsuarioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistroUsuarioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}