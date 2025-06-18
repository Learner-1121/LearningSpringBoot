package com.yamsaika.learnspringboot.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {
    public void setAsDate(String date) throws IllegalArgumentException
    {
        setValue(new Date(date));
    }
}
