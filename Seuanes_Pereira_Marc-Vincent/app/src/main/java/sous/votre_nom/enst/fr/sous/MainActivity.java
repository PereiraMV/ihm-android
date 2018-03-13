package sous.votre_nom.enst.fr.sous;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convert(View sender) {
        EditText editText=(EditText) findViewById(R.id.edit_euros);
        EditText editText2=(EditText) findViewById(R.id.edit_taux_echange);
        EditText editText3=(EditText) findViewById(R.id.edit_resultat);

        if ((!(editText.getText().toString().equals("") )) && (!(editText2.getText().toString().equals("")))) {
            Float a = Float.parseFloat(editText.getText().toString()) * Float.parseFloat(editText2.getText().toString());
            editText3.setText(Float.toString(a));
        }
    }




    public void newWindow(View sender){
        EditText editText3=(EditText) findViewById(R.id.edit_resultat);
    Intent intent=new Intent(this, Activity.class);
    startActivityForResult(intent,1);



    }



    protected void onActivityResult(int requestCode, int resultCode, Intent retour) {
        EditText editText2=(EditText) findViewById(R.id.edit_taux_echange);
        EditText editText3=(EditText) findViewById(R.id.edit_resultat);
        if (resultCode == RESULT_OK && requestCode == 1) {
            Bundle extras = retour.getExtras();
            editText2.setText(extras.getString("convert") );
            editText3.setText("");
        }
    }







}