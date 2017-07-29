package riviasoftware.viewmodelgoogleio17;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends LifecycleActivity {

    @BindView(R.id.number)
    protected TextView clickCountText;


    private ClickCounterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LoggingClickCounterViewModelFactory factory =
                new LoggingClickCounterViewModelFactory(new ClickLoggingInterceptor());

        viewModel = ViewModelProviders.of(this, factory).get(LoggingClickCounterViewModel.class);
        displayClickCount(viewModel.getCount());

    }


    @OnClick(R.id.increment)
    public void increment(View button){
        viewModel.setCount(viewModel.getCount() + 1);
        displayClickCount(viewModel.getCount());
    }

    private void displayClickCount(int clickCount) {
        clickCountText.setText(String.valueOf(clickCount));
    }
}
