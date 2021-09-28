package com.devsuperior.dslearnbds.entities.enums;

public enum DeliverStatus {

    PENDING(1, "Pending"), ACCEPTED(2, "Accepted"), REJECTED(3, "Rejected");

    private int code;
    private String description;

    DeliverStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static DeliverStatus toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (DeliverStatus type : DeliverStatus.values()) {
            if (code.equals(type.getCode())) {
                return type;
            }
        }
        throw new IllegalArgumentException("[Application] >>> Invalid type code: " + code);
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
