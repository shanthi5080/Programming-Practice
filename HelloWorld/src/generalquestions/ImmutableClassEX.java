package generalquestions;


public final class ImmutableClassEX {

    private final String name;
    private final String mobile;

    public ImmutableClassEX(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    
}

}
