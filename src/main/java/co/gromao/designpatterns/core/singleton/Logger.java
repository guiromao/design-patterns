package co.gromao.designpatterns.core.singleton;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Logger implements Cloneable, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static volatile Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Logger.class) {
                if (Objects.isNull(instance)) {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

}
