package com.mysema.query.collections.impl;

import org.junit.Test;

import com.mysema.query.animal.QCat;


public class ConstructorTest {
    
    @Test
    public void test(){
        QCat.project(QCat.cat.name, QCat.cat.id).getJavaConstructor();
    }

}
