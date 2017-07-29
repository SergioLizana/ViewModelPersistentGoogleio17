package riviasoftware.viewmodelgoogleio17;

/**
 * Created by sergiolizanamontero on 29/7/17.
 */

public class LoggingClickCounterViewModel extends ClickCounterViewModel {
    private final ClickLoggingInterceptor loggingInterceptor;

    public LoggingClickCounterViewModel(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    @Override
    public void setCount(int count) {
        super.setCount(count);
        loggingInterceptor.intercept(count);
    }
}