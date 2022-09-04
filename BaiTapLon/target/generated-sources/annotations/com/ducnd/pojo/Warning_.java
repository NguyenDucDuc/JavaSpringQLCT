package com.ducnd.pojo;

import com.ducnd.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-03T10:51:43")
@StaticMetamodel(Warning.class)
public class Warning_ { 

    public static volatile SingularAttribute<Warning, Integer> id;
    public static volatile SingularAttribute<Warning, User> userId;
    public static volatile SingularAttribute<Warning, String> content;

}