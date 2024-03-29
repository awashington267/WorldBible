package Project.service.converter;

import org.springframework.core.convert.converter.Converter;
import hibernate.DateUtils;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        return DateUtils.parseWebDate(s);
    }
}