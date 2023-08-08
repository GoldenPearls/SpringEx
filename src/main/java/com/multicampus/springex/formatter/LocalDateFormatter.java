package com.multicampus.springex.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateFormatter implements Formatter<LocalDate> {

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {

        return LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    // format이라는 외부 처리 빈 생성 => servlet-context.xml에서 빈 연결
    @Override
    public String print(LocalDate object, Locale locale) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(object);
    }
}
