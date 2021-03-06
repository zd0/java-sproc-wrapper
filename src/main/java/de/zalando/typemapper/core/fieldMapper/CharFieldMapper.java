package de.zalando.typemapper.core.fieldMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharFieldMapper implements FieldMapper {

    private static final Logger LOG = LoggerFactory.getLogger(CharFieldMapper.class);

    @Override
    public Object mapField(final String string, final Class clazz) {
        if (string == null) {
            return null;
        }

        if (string.length() == 1) {
            return string.charAt(0);
        } else {
            LOG.error("Could not convert {} to char.", string);
        }

        return null;
    }

}
