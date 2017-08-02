package memory.alex.com.memory;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Home extends AppCompatActivity {

    final String iconeescondeimagem = (String.valueOf(R.drawable.estrela));
    ImageView bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10,
            bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20,
            bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28, bt29, bt30;
    Button btReiniciar;
    ImageButton btnSobre;
    int Acerto = 0, Erro = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btReiniciar = (Button) findViewById(R.id.btnReiniciar);
        btnSobre = (ImageButton) findViewById(R.id.btSobre);
        bt1 = (ImageView) findViewById(R.id.btn1);
        bt2 = (ImageView) findViewById(R.id.btn2);
        bt3 = (ImageView) findViewById(R.id.btn3);
        bt4 = (ImageView) findViewById(R.id.btn4);
        bt5 = (ImageView) findViewById(R.id.btn5);
        bt6 = (ImageView) findViewById(R.id.btn6);
        bt7 = (ImageView) findViewById(R.id.btn7);
        bt8 = (ImageView) findViewById(R.id.btn8);
        bt9 = (ImageView) findViewById(R.id.btn9);
        bt10 = (ImageView) findViewById(R.id.btn10);
        bt11 = (ImageView) findViewById(R.id.btn11);
        bt12 = (ImageView) findViewById(R.id.btn12);
        bt13 = (ImageView) findViewById(R.id.btn13);
        bt14 = (ImageView) findViewById(R.id.btn14);
        bt15 = (ImageView) findViewById(R.id.btn15);
        bt16 = (ImageView) findViewById(R.id.btn16);
        bt17 = (ImageView) findViewById(R.id.btn17);
        bt18 = (ImageView) findViewById(R.id.btn18);
        bt19 = (ImageView) findViewById(R.id.btn19);
        bt20 = (ImageView) findViewById(R.id.btn20);
        bt21 = (ImageView) findViewById(R.id.btn21);
        bt22 = (ImageView) findViewById(R.id.btn22);
        bt23 = (ImageView) findViewById(R.id.btn23);
        bt24 = (ImageView) findViewById(R.id.btn24);
        bt25 = (ImageView) findViewById(R.id.btn25);
        bt26 = (ImageView) findViewById(R.id.btn26);
        bt27 = (ImageView) findViewById(R.id.btn27);
        bt28 = (ImageView) findViewById(R.id.btn28);
        bt29 = (ImageView) findViewById(R.id.btn29);
        bt30 = (ImageView) findViewById(R.id.btn30);

        final ImageView[] imgBotoes = new ImageView[]{bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10,
                bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20,
                bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28, bt29, bt30};

        final String[] ArrayImagens = new String[]{String.valueOf(R.drawable.elefante), String.valueOf(R.drawable.elefante), String.valueOf(R.drawable.cao), String.valueOf(R.drawable.cao),
                String.valueOf(R.drawable.coelho), String.valueOf(R.drawable.coelho), String.valueOf(R.drawable.passaro), String.valueOf(R.drawable.passaro),
                String.valueOf(R.drawable.cavalo), String.valueOf(R.drawable.cavalo), String.valueOf(R.drawable.tartaruga), String.valueOf(R.drawable.tartaruga),
                String.valueOf(R.drawable.lagosta), String.valueOf(R.drawable.lagosta), String.valueOf(R.drawable.pinguim), String.valueOf(R.drawable.pinguim),
                String.valueOf(R.drawable.macaco), String.valueOf(R.drawable.macaco), String.valueOf(R.drawable.cavalomarinho), String.valueOf(R.drawable.cavalomarinho),
                String.valueOf(R.drawable.porco), String.valueOf(R.drawable.porco), String.valueOf(R.drawable.sapo), String.valueOf(R.drawable.sapo),
                String.valueOf(R.drawable.urso), String.valueOf(R.drawable.urso), String.valueOf(R.drawable.vaca), String.valueOf(R.drawable.vaca),
                String.valueOf(R.drawable.caramujo), String.valueOf(R.drawable.caramujo)};

        Collections.shuffle(Arrays.asList(ArrayImagens));

        for (int i = 0; i < ArrayImagens.length; i++) {
            final int finalI = i;
            imgBotoes[finalI].setBackgroundResource(Integer.parseInt(ArrayImagens[finalI]));
            imgBotoes[finalI].setTag(ArrayImagens[finalI]);

            imgBotoes[i].postDelayed(new Runnable() {
                public void run() {
                    imgBotoes[finalI].setImageResource(Integer.parseInt(iconeescondeimagem));
                }
            }, 5000);
        }

        final List ListaValoresBotaoClicado = new ArrayList();

        for (int j = 0; j < imgBotoes.length; j++) {
            final int finalJ = j;
            imgBotoes[j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ListaValoresBotaoClicado.add(imgBotoes[finalJ].getTag().toString());
                        for (int k = 0; k < imgBotoes.length; k++) {
                            if (imgBotoes[finalJ].getTag().equals(ListaValoresBotaoClicado.get(0))||imgBotoes[finalJ].getTag().equals(ListaValoresBotaoClicado.get(1))) {
                                imgBotoes[finalJ].setImageResource(Integer.parseInt(ArrayImagens[finalJ]));
                            }
                        }
                        if (ListaValoresBotaoClicado.size() == 2) {
                            for (int i=0;i<imgBotoes.length;i++){
                                if (ListaValoresBotaoClicado.get(0).equals(ListaValoresBotaoClicado.get(1))) {
                                    for (i = 0; i < imgBotoes.length; i++) {
                                        if (imgBotoes[i].getTag().equals(ListaValoresBotaoClicado.get(0)) && imgBotoes[i].getTag().equals(ListaValoresBotaoClicado.get(1))) {
                                            final int finalI = i;
                                            imgBotoes[i].postDelayed(new Runnable() {
                                                public void run() {
                                                    imgBotoes[finalI].setImageResource(Integer.parseInt(ArrayImagens[finalJ]));
                                                    imgBotoes[finalI].setClickable(false);
                                                    imgBotoes[finalI].setTag("ok");
                                                }
                                            }, 1000);
                                        }
                                    }
                                    Acerto = Acerto + 1;
                                } else {
                                    for (i = 0; i < imgBotoes.length; i++) {
                                        if (imgBotoes[i].getTag()!="ok") {
                                            final int finalI = i;
                                            imgBotoes[i].postDelayed(new Runnable() {
                                                public void run() {
                                                    imgBotoes[finalI].setImageResource(Integer.parseInt(iconeescondeimagem));
                                                    imgBotoes[finalI].setClickable(true);
                                                }
                                            }, 1000);
                                        }
                                    }
                                    Erro = Erro + 1;
                                }
                            }
                            ListaValoresBotaoClicado.clear();
                        }

                        if (Acerto == 15) {
                            AlertDialog.Builder alertDialog = new AlertDialog.Builder(Home.this);
                            alertDialog.setTitle("Memory...");
                            alertDialog.setMessage("Parabéns! Você Terminou."+"\nAcertos: "+Acerto+"\nErros: "+Erro);
                            alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                            alertDialog.setIcon(R.drawable.icone);
                            alertDialog.show();
                            btReiniciar.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        btReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btReiniciar.setVisibility(View.INVISIBLE);
                Acerto = 0;
                Erro = 0;
                ListaValoresBotaoClicado.clear();

                final String[] ArrayImagens = new String[]{String.valueOf(R.drawable.elefante), String.valueOf(R.drawable.elefante), String.valueOf(R.drawable.cao), String.valueOf(R.drawable.cao),
                        String.valueOf(R.drawable.coelho), String.valueOf(R.drawable.coelho), String.valueOf(R.drawable.passaro), String.valueOf(R.drawable.passaro),
                        String.valueOf(R.drawable.cavalo), String.valueOf(R.drawable.cavalo), String.valueOf(R.drawable.tartaruga), String.valueOf(R.drawable.tartaruga),
                        String.valueOf(R.drawable.lagosta), String.valueOf(R.drawable.lagosta), String.valueOf(R.drawable.pinguim), String.valueOf(R.drawable.pinguim),
                        String.valueOf(R.drawable.macaco), String.valueOf(R.drawable.macaco), String.valueOf(R.drawable.cavalomarinho), String.valueOf(R.drawable.cavalomarinho),
                        String.valueOf(R.drawable.porco), String.valueOf(R.drawable.porco), String.valueOf(R.drawable.sapo), String.valueOf(R.drawable.sapo),
                        String.valueOf(R.drawable.urso), String.valueOf(R.drawable.urso), String.valueOf(R.drawable.vaca), String.valueOf(R.drawable.vaca),
                        String.valueOf(R.drawable.caramujo), String.valueOf(R.drawable.caramujo)};

                Collections.shuffle(Arrays.asList(ArrayImagens));

                for (int i=0;i<imgBotoes.length;i++){
                    imgBotoes[i].setBackground(null);
                    imgBotoes[i].setClickable(true);
                }

                for (int i = 0; i < ArrayImagens.length; i++) {
                    final int finalI = i;
                    imgBotoes[i].setBackgroundResource(Integer.parseInt(ArrayImagens[i]));
                    imgBotoes[i].setTag(ArrayImagens[i]);

                    imgBotoes[i].postDelayed(new Runnable() {
                        public void run() {
                            imgBotoes[finalI].setImageResource(Integer.parseInt(iconeescondeimagem));
                        }
                    }, 5000);
                }


            }
        });

    }
}


