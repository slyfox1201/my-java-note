package chapter2.test23;

public class PublicClass {
    // 不设置static的话，静态内部类不能引用以下变量
    static private String username;
    static private String password;

    static class PrivateClass {
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }

        @Override
        public String toString() {
            return "PrivateClass{" +
                    "age='" + age + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PublicClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

