package practicaParcial2.Calls;

/**
 * Created by arimi on 09-Nov-16.
 */
public class PhoneNumber {
    private Integer countryId;
    private Integer areaId;
    private Integer number;

    public PhoneNumber(Integer countryId, Integer areaId, Integer number) {
        this.countryId = countryId;
        this.areaId = areaId;
        this.number = number;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public Integer getNumber() {
        return number;
    }
}
