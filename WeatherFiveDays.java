package lesson6.hw6;


public class WeatherFiveDays extends List {


    private java.util.List<com.lesson6.hw6.List> list;
    private City city;

    public WeatherFiveDays() {
        list = null;
    }


    public java.util.List<com.lesson6.hw6.List> getList() {
        return list;
    }

    public void setList(java.util.List<com.lesson6.hw6.List> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}