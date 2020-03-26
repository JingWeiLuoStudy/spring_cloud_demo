package com.itcast.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{UserConfiguration.class.getName()};
    }
}
