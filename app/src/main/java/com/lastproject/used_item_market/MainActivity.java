package com.lastproject.used_item_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //기본 나의 정보
    String email = "";
    String mykey = "";
    String nickname = "";
    String myUniv = "";
    String myimg = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lobby);


        //기본세팅
        email = getIntent().getStringExtra("email");
        mykey = getIntent().getStringExtra("mykey");
        nickname = getIntent().getStringExtra("nickname");
        myUniv = getIntent().getStringExtra("myUniv");
        myimg = getIntent().getStringExtra("myimg");

        //System.out.println("이미지 결과: " + myimg);     //null값으로 가져온다.

        /*
        //기본세팅
        email = "test";
        mykey = "io2IeEjLYV5ERxhyBqdd";
        nickname = "admin1234";
        myUniv = "선문대학교";
        myimg = "io2IeEjLYV5ERxhyBqdd";
        */


        Sell();
        Share();
        All();
        chat();
        Post();
        Setting();
    }

    void Sell(){ //판매 버튼 클릭 시 화면 이동
        ImageButton sell = (ImageButton)findViewById(R.id.Sell);

        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SellPage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("email", email);
                intent.putExtra("mykey", mykey);
                intent.putExtra("nickname", nickname);
                intent.putExtra("myUniv", myUniv);
                intent.putExtra("myimg", myimg);
                startActivity(intent);
                finish();
            }
        });
    }

    void Share(){ //무료나눔 버튼 클릭 시 화면 이동
        ImageButton share = (ImageButton)findViewById(R.id.Share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SharePage.class);
                startActivity(intent);
            }
        });
    }
    void All(){ //모두보기 버튼 클릭 시 화면 이동
        ImageButton all = (ImageButton)findViewById(R.id.Show);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AllPage.class);
                startActivity(intent);
            }
        });
    }
    void Post(){ //작성 버튼 클릭 시 화면 이동
        ImageButton post = (ImageButton)findViewById(R.id.addbtn);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PostPage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("email", email);
                intent.putExtra("mykey", mykey);
                intent.putExtra("nickname", nickname);
                intent.putExtra("myUniv", myUniv);
                intent.putExtra("myimg", myimg);
                startActivity(intent);
                finish();
            }
        });
    }

    void chat(){    //채팅 목록 화면으로 이동한다.


    }

    void Setting(){ //설정 버튼 클릭 시 화면 이동
        ImageButton set = (ImageButton)findViewById(R.id.setbtn);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingPage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("email", email);
                intent.putExtra("mykey", mykey);
                intent.putExtra("nickname", nickname);
                intent.putExtra("myUniv", myUniv);
                intent.putExtra("myimg", myimg);
                startActivity(intent);
                finish();
            }
        });
    }
}