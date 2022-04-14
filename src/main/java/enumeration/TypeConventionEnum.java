package main.java.enumeration;

public enum TypeConventionEnum {
    UNIVERSITY("Universitaire"),
    INDUSTRY("Industrielle"),
    NATIONAL_INDUSTRY("Industrielle Nationnale");

    private final String value;

    TypeConventionEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public String getCode() {
        return this.name();
    }

    public static TypeConventionEnum decodeType(String code) {
        for (TypeConventionEnum typeConventionEnum : TypeConventionEnum.values()) {
            if (typeConventionEnum.getCode().equals(code)) {
                return typeConventionEnum;
            }
        }
        throw new UnsupportedOperationException("can not find the type of convention");
    }
}
