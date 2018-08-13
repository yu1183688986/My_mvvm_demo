package mvp.com.model.bean;
/**
 * @date on 16:36 2018/8/13
 * @author yuyong
 * @Email yu1183688986@163.com
 * @describe POJO类User
 */
public class User {
    private String userName;
    private String password;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.password = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }
}
