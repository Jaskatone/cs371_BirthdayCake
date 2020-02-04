package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* The controller links the view and model files
 *  -Uses listener methods to detect events
 */
public class CakeController implements View.OnClickListener{
    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cv){
        cakeView = cv;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v){
        Log.d("blowout_button", "hit button");

        cakeModel.candle_lit = false;
        cakeView.invalidate();
    }


    public void onClick(CompoundButton cb){
        if(onCheckedChangeListener(cb, true)){

        }
        Log.d("candle_switch", "hit switch");
        cakeView.invalidate();
    }
}
