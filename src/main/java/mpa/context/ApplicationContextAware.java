package mpa.context;

import org.springframework.context.ApplicationContext;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ApplicationContextAware {

    private final ApplicationContext applicationContext;


    public ApplicationContextAware(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    public <T> List<T> getBeansOf(Class<T> typeClass) {
        Map<String, T> beansOfType = applicationContext.getBeansOfType(typeClass);

        if (CollectionUtils.isEmpty(beansOfType)) {
            return Collections.emptyList();
        }
        return new ArrayList<>(beansOfType.values());
    }
}
