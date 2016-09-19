import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import play.Application;
import play.GlobalSettings;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */
public class Global extends GlobalSettings {

    private Injector injector;

    @Override
    public void onStart(Application application) {
        injector = Guice.createInjector();
    }

    @Override
    public <T> T getControllerInstance(Class<T> aClass) throws Exception {
        return injector.getInstance(aClass);
    }
}