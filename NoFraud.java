
public class NoFraud{
    public NoFraud(){
    }
    private String username;
    public NoFraud(String username){
        this.username=username;
    }
    public boolean check(){
        System.out.println("checking the authentification for  " + username);

        if (username == null || username.trim().isEmpty()) {
            System.out.println("error! there's no such name");
            return false;
        }
        System.out.println("success! everything is fine for " + username);
        return true;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}