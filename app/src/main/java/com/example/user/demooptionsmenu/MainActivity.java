package com.example.user.demooptionsmenu;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2,editText3;
    ConstraintLayout lay3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        lay3 = findViewById(R.id.lay3);
        editText3 = findViewById(R.id.editText3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    String text;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_copy:
                text = editText.getText().toString();
                break;
            case R.id.item_paste:
                editText2.setText(text);
                break;
            case R.id.item_about:

                break;
            case R.id.item_exit:

                break;

        }

        return super.onOptionsItemSelected(item);
    }


    public  void onClick(View v){
        String text =editText3.getText().toString();
        if(text.equals(editText3.getText().toString())){
           System.out.println("恭喜搜尋到了");
        }
    }
}
