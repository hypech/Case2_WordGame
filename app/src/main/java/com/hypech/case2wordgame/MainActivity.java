/*
 * Copyright 2021 The Learning Android with Cases Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hypech.case2wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=14;
    public void enlargeSize(View v){  //onclick event of btnEnlarge
        TextView txtViewHelloWorld; //TextView ID
        txtViewHelloWorld = findViewById(R.id.txtViewHelloWorld); //find it based on ID
        txtViewHelloWorld.setTextSize(++size);   // increase the size
    }

    public void newWord(View v){     //onclick event of btnEnter
        EditText txtEnter = (EditText) findViewById(R.id.editTxtEnter);  //ID
        TextView txtHW = (TextView) findViewById(R.id.txtViewHelloWorld);
        txtHW.setText(txtEnter.getText().toString()); //change textview to the new word
    }
}