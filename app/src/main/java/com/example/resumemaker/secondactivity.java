package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    TextView f_name,d_of_birth,gender_,nt,marital,language_kn,hobbie,place_,se_name,e_id,addres,c_objective,pr_skill,w_ex,academic_qu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_secondactivity );


        f_name=findViewById( R.id.fathername );
        d_of_birth=findViewById( R.id.birthdate );
        gender_=findViewById( R.id.gender );
        nt=findViewById( R.id.nat );
        marital=findViewById( R.id.marital );
        language_kn=findViewById( R.id.language );
        hobbie=findViewById( R.id.hobbies );
        place_=findViewById( R.id.place );
        se_name=findViewById( R.id.selfname );
        e_id=findViewById( R.id.emailid );
        addres=findViewById( R.id.addres );
        c_objective=findViewById( R.id.careerobj );
        pr_skill=findViewById( R.id.prskill );
        w_ex=findViewById( R.id.workex );
        academic_qu=findViewById( R.id.aq );


                String fathername=getIntent().getStringExtra( "father_name" );
                String birthdate=getIntent().getStringExtra( "birthdate" );
                String gender=getIntent().getStringExtra( "gender" );
                String natio=getIntent().getStringExtra( "nationality" );
                String marital_s=getIntent().getStringExtra( "marital_status" );
                String language=getIntent().getStringExtra( "language_knowns" );
                String hobbies=getIntent().getStringExtra( "hobbies" );
                String place=getIntent().getStringExtra( "place" );
                String s_name=getIntent().getStringExtra( "selfname" );
                String email_id=getIntent().getStringExtra( "email_id" );
                String address=getIntent().getStringExtra( "addres" );
                String c_obj=getIntent().getStringExtra( "carrer_object" );
                String p_skill=getIntent().getStringExtra( "professional skill" );
                String work_ex=getIntent().getStringExtra( "work_experiance" );
                String academic_q=getIntent().getStringExtra( "academic_Qualification" );



                f_name.setText( ""+fathername );
                d_of_birth.setText( ""+birthdate );
                gender_.setText( ""+gender );
                nt.setText( ""+natio );
                marital.setText( ""+marital_s );
                language_kn.setText( ""+language );
                hobbie.setText( ""+hobbies );
                place_.setText( ""+place );
                se_name.setText( ""+s_name );
                e_id.setText( ""+email_id );
                addres.setText( ""+address );
                c_objective.setText( ""+c_obj );
                pr_skill.setText( ""+p_skill );
                w_ex.setText( ""+work_ex );
                academic_qu.setText( ""+academic_q );




    }
}