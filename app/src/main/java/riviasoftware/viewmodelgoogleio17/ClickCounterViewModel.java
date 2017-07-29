package riviasoftware.viewmodelgoogleio17;

import android.arch.lifecycle.ViewModel;

/**
 * Created by sergiolizanamontero on 29/7/17.
 */

public class ClickCounterViewModel extends ViewModel {

   private int count = 0;


    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }


}
