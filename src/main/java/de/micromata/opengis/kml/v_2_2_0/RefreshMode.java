
package de.micromata.opengis.kml.v_2_2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * RefreshMode
 * <p>
 * onChange, onInterval, onExpire 
 * </p>
 * 
 * See Also: 
 * See {@code <Link>}
 * 
 * 
 * 
 */
@XmlType(name = "refreshModeEnumType")
@XmlEnum
public enum RefreshMode {

    @XmlEnumValue("onChange")
    ON_CHANGE("onChange"),
    @XmlEnumValue("onInterval")
    ON_INTERVAL("onInterval"),
    @XmlEnumValue("onExpire")
    ON_EXPIRE("onExpire");
    private final String value;

    RefreshMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefreshMode fromValue(String v) {
        for (RefreshMode c: RefreshMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
