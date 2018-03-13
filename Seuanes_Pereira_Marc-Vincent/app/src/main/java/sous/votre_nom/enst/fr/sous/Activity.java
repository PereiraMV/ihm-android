package sous.votre_nom.enst.fr.sous;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by andro0494 on 06/03/18.
 */

public class Activity extends AppCompatActivity {

    public String data = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void finish() {
        // Prepare data intent
        Intent retour = new Intent();

        if (this.data.equals("1.23")) {
            retour.putExtra("convert", data);
        } else {
            retour.putExtra("convert", data);
        }


        setResult(RESULT_OK, retour);

        super.finish();
    }

    public void chooseconverter(View sender) {

        boolean checked = ((RadioButton) sender).isChecked();
        if (sender.getId() == R.id.radio_dollars) {
            if (checked) {
                this.data = "1.23";
            }
        } else {
            if (checked) {
                this.data = "131.565";
            }
        }

    }

    public void goback(View sender) {
        this.finish();
    }
}





