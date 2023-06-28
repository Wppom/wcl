import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptDemo {
    public static void main(String[] args) {
        String password = "123456";
        // 创建密码加密的对象
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String newPassword = passwordEncoder.encode(password);
        System.out.println("加密后的密码为：" + newPassword);

        boolean matches = passwordEncoder.matches(password, newPassword);
        System.out.println("两个密码一致:" + matches);

    }


}
