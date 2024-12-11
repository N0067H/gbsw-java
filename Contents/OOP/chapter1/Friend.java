package chapter1;

public class Friend {

    private String name;
    private String phone;
    private String nick;
    private String code;
    private int age;

    public Friend(String name, String phone, String nick, String code, int age) {
        this.name = name;
        this.phone = phone;
        this.nick = nick;
        this.code = code;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
