public class User {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20){
           throw new IllegalNameLengthException("Ошибка. Имя человека не может быть " +
                    "больше 20 символов. Вы задали " + name);
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
