package mpa.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.persistence.MybatisRepository;

import java.util.List;

@RequiredArgsConstructor
public class RuntimeRepositoryScanner implements RepositoryScanner {

    private final AuditApplicationContextAware contextAware;


    @Override
    public void scan() {
        
    }

}