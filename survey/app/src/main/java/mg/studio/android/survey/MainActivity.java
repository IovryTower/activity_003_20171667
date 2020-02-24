package mg.studio.android.survey;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button w_btn,q1_btn,q2_btn,q3_btn,q4_btn,q5_btn,q6_btn,q7_btn,q8_btn
                       ,q9_btn,q10_btn,q11_btn,q12_btn,f_btn;
    protected CheckBox w_b;
    protected RadioGroup q1_rag;
    void w_b(){
        w_btn=findViewById(R.id.button);
        w_b=findViewById(R.id.checkBox);

        w_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w_b.isChecked()) {
                    setContentView(R.layout.question_one);
                    q1_b();
                }
            }
        });
    }

    void q1_b() {
        q1_btn = findViewById(R.id.button2);
        q1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_two);
                q2_b();
            }
        });
    }

    void q2_b() {
        q2_btn = findViewById(R.id.button3);
        q2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_three);
                q3_b();
            }
        });
    }

    void q3_b() {
        q3_btn = findViewById(R.id.button4);
        q3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_four);
                q4_b();
            }
        });
    }

    void q4_b() {
         q4_btn = findViewById(R.id.button5);
        q4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_five);
                q5_b();
            }
        });
    }

    void q5_b() {
        q5_btn = findViewById(R.id.button6);
        q5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_six);
                q6_b();
            }
        });
    }
    void q6_b() {
        q6_btn = findViewById(R.id.button7);
        q6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_seven);
                q7_b();
            }
        });
    }
    void q7_b() {
        q7_btn = findViewById(R.id.button8);
        q7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_eight);
                q8_b();
            }
        });
    }
    void q8_b() {
        q8_btn = findViewById(R.id.button9);
        q8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_nine);
                q9_b();
            }
        });
    }
    void q9_b() {
        q9_btn = findViewById(R.id.button10);
        q9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_ten);
                q10_b();
            }
        });
    }
    void q10_b() {
        q10_btn = findViewById(R.id.button11);
        q10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_eleven);
                q11_b();
            }
        });
    }
    void q11_b() {
        q11_btn = findViewById(R.id.button12);
        q11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.question_twelve);
                q12_b();
            }
        });
    }
    void q12_b() {
        q12_btn = findViewById(R.id.button13);
        q12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.finish_survey);
                f_b();
            }
        });
    }
    void  f_b(){
        f_btn = findViewById(R.id.button14);
        f_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        w_b();
    }
}
