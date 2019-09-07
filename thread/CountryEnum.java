package thread;



/**
 * @Author: Pandy
 * @Version 1.0
 */
public enum CountryEnum {
    ONE(1,"春"),
    TWO(2,"夏"),
    THREE(3,"秋"),
    FORE(4,"冬");


    private Integer retCode;

    private String retMessage;

    public Integer getRetCode() {
        return retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    CountryEnum(Integer retCode, String retMessage){
        this.retCode = retCode;
        this.retMessage = retMessage;
    }
    public static CountryEnum forEach_CountryEnum(int index){
        CountryEnum[] values = CountryEnum.values();
        for (CountryEnum value : values) {
            if (index == value.getRetCode()){
                return value;
            }
        }
        return null;
    }
}
